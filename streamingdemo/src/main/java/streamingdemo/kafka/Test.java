package streamingdemo.kafka;

public class Test {
	public static void main(String args[]){
		KafkaOutChannel.writeToKafka("FDDDFD", "MyTopic");
	}
}
