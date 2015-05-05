import java.net.InetAddress;
import java.net.UnknownHostException;


public class GetComputerName {

	public static void main(String[] args) throws UnknownHostException {
		String computerName=InetAddress.getLocalHost().getHostName();
		System.out.println(computerName);

	}

}
