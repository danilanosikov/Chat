package messanger;

import java.io.*;
import java.net.ServerSocket;
import java.util.Scanner;


public class Server {
	
	//variables
	private int port;
	private ServerSocket server_socket;
	private static BufferedReader keyboard;
	
	
	
	
	//Constructor
	public Server(int port) throws IOException {
		this.port = port;
		this.server_socket = new ServerSocket(this.port);
	}
	
	
	
	
	public static void main(String[] args) {
		try {
			
		System.out.println("Write port: ");
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		int port = Integer.parseInt(keyboard.readLine());
		
		System.out.println("Port: " + port);
		Server server = new Server(port);
		System.out.println("Server created!");
		
		new Thread(new ClientHandler(server.server_socket)).start();
		System.out.println("Client handler thread started!");
		
		}
		
		
		
		catch(IOException ioe) {
			System.out.println("Serv");
		}
	}
}
