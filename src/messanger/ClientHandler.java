package messanger;

import java.net.*;
import java.io.*;


public class ClientHandler implements Runnable{
	
	private ServerSocket server_socket;
	
	
	
	public ClientHandler(ServerSocket ss) {
		this.server_socket = ss;
	}
	
	
	
	
	public void run() {
		try {
			while(true) {
				System.out.println("At the beggining of the client's handler run method");
				Socket socket = this.server_socket.accept();
				System.out.println("connected!");
				
				new Thread(new TextReaderThread(socket)).start();
				System.out.println("Started reader thread.");
				new Thread(new TextWriterThread(socket)).start();
				System.out.println("Started writer thread.");
			}
			
		} 
		catch(IOException ioe) {
			System.out.println("Something went wrong in ClientHandler!");
		}
		
		
	}
}
