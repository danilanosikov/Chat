package messanger;

import java.io.IOException;
import java.util.Scanner;

public final class Messanger {
	
	static Client client;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username = s.next();
		String server_ip = s.next();
		try {
			if(username != "") {
				client = new Client(server_ip, username);
			}
			else {
				client = new Client(server_ip);
			}
			new TextReaderThread(client);
		}
		
		catch(IOException ioe) {
			System.out.println("disconnected");
		}
	}

}
