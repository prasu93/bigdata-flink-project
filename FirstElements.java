import java.io.*;
import java.util.*;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FirstElements {
    
    public static void main(String[] args) throws Exception {
        // Creates an execution environment
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // Gets the input data by connecting to the socket. In this example it is connected to the local port 9000. If the port 9000 is being used, change the port number.
        DataStream<String> text = env.socketTextStream("localhost", 9000, "\n");

        //Reads a CSV file to be used to for returning elements
        ArrayList<String> original = new ArrayList<>(Arrays.asList("Jack", "Chiefs", "Royals", "Mizzou", "Beaver", "Big Data", "NWMSU", "KC", "USA"));
        List<String> output = original.subList(0,4);

        //Print Statement
        System.out.println(output);

        text.print().setParallelism(1);
        env.execute("FirstElements");

    }

}
