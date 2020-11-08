# bigdata-flink-project

## Team members names
- Prasanna Kumar
- Yugandhar
- Gangadhar
- Abhiteja
- Jack Beaver

<img src="FlinkGroup.PNG"/><br>

## Prasannakumar
### Demonstartion Skill:
* Apache Flink Application on Fibonacci series
### Prerequisites:
* Apache Flink Installed (2.12 or 2.11)
* Java Installed (Java8 or Java11)
* IntelliJ IDE installed
* NetCat Installated: [https://nmap.org/download.html](https://nmap.org/download.html)
### Procedure and Commands:
* After successful installation of Intellij IDE, open and create a maven project with ```mvn archetype groupid: org.apache.flink and artifactid: flink-quickstart-java``` and give your flink project groupid, artifactid and package details.
* Create the main java file under the package structure of the project created above and the source code is available here: 
* Checking/Adding dependencies/external jars: flink-java, flink-streaming-java, flink-clients_, log4j-api, log4j-slf4j-impl, log4j-core
* Build the application, open the Local Terminal in IntelliJ IDE and command to run: ```ncat -lk 9000```, which means it is listening on port 9000. 
* Run the main class file and after that, enter a number to generate fibonacci series in the terminal opened in before step and you can see the series generated in java console.

### Refernces:
* [https://www.tutorialdocs.com/article/first-flink-app.html](https://www.tutorialdocs.com/article/first-flink-app.html)
* [https://nmap.org/download.html](https://nmap.org/download.html)

## Yugandhar
### Demonstartion Skill:
* WordCount Apache Flink Application
### Prerequisites:
* Apache Flink Installation (newer version)
* Java Installation (java 8 or java 11)
* IntelliJ IDE
* Net cat Installation Line: [https://nmap.org/download.html](https://nmap.org/download.html)
### Process and Commands:
* Please refer the repo for source code Link: [SocketWindowWordCount.java](SocketWindowWordCount.java)
* **Maven Dependencies:** In order to run the Flink Application we need to import the Flink dependencies into the Maven Project
* pom.xml file - [click here](pom.xml) for dependencies file
* **IntelliJ:** It is IDE for development, Where we can run the .java code and see the respective wordcount output in a terminal

* **Commands to run:** <br/> 
To run the Net cat, ``` ncat -l 9000 ``` command must be used, where '-l' stands for listening at port 9000

### Refernces:
* [https://github.com/apache/flink/edit/master/flink-examples/flink-examples-streaming/src/main/java/org/apache/flink/streaming/examples/socket/SocketWindowWordCount.java](https://github.com/apache/flink/edit/master/flink-examples/flink-examples-streaming/src/main/java/org/apache/flink/streaming/examples/socket/SocketWindowWordCount.java)
* [https://nmap.org/download.html](https://nmap.org/download.html)
* [https://github.com/wuchong/my-flink-project](https://github.com/wuchong/my-flink-project)
* [https://www.tutorialdocs.com/article/first-flink-app.html](https://www.tutorialdocs.com/article/first-flink-app.html)
<br>

## Gangadhar
- I would like to demonstrate on Introduction to Flink, downloading, configuring and verifying the installation on windows  <br>

## Abhiteja
- I would like to demonstrate on Flink Application - Factorial <br>

## Jack
- I would like to demonstrate on Flink Application - First Elements of a Dataset
