package messanger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private static BufferedReader keyboard;

	public static void main(String[] args) throws IOException {
		
		
		try {
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Server IPv4: ");
			String ip = keyboard.readLine();
			System.out.println("IPv4: " + ip);
			
			
			System.out.println("Enter port: ");
			int port = Integer.parseInt(keyboard.readLine());
			System.out.println("Port: " + port);
			
			
			Socket socket = new Socket(ip, port);
			System.out.println("Socket Created!");
			
			
			new Thread(new TextReaderThread(socket)).start();
			new Thread(new TextWriterThread(socket)).start();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Client");
		}
		
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		String i = keyboard.readLine();
	}
}
