
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
public class Factorial {
    public static void main(String[] args) throws Exception {
        // Create the execution environment.
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // Get the input data by connecting the socket. Here it is connected to the local port 9000. If the port 9000 has been already occupied, change to another port.
        DataStream<String> text = env.socketTextStream("localhost", 9000, "\n");
        int number = 3;
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
        text.print().setParallelism(1);
        env.execute("Factorial");
    }
}