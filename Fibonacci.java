
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
public class Fibonacci {
    public static void main(String[] args) throws Exception {
        // Create the execution environment.
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // Get the input data by connecting the socket. Here it is connected to the local port 9000. If the port 9000 has been already occupied, change to another port.
        DataStream<String> text = env.socketTextStream("localhost", 9000, "\n");
        // Parse the data, and group, windowing and aggregate it by word.
        //int n=10;
        int n=10;
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        text.print().setParallelism(1);
        env.execute("Fibonacci Series");
    }
}