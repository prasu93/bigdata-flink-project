import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.util.Collector;
public class SocketWindowWordCount {
    public static void main(String[] args) throws Exception {
        // Create the execution environment.
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // Get the input data by connecting the socket. Here it is connected to the local port 9000. If the port 9000 has been already occupied, change to another port.
        DataStream<String> text = env.socketTextStream("localhost", 9000, "\n");
        // Parse the data, and group, windowing and aggregate it by word.
        DataStream<Tuple2<String, Integer>> windowCounts = text
                .flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {
                    @Override
                    public void flatMap(String value, Collector<Tuple2<String, Integer>> out) {
                        for (String word : value.split("\\s")) {
                            out.collect(Tuple2.of(word, 1));
                        }
                    }
                })
                .keyBy(0)
                .timeWindow(Time.seconds(5))
                .sum(1);
        // Print the results to the console, note that here it uses the single-threaded printing instead of multi-threading
        windowCounts.print().setParallelism(1);
        env.execute("Socket Window WordCount");
    }
}