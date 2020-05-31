package messanger;

import java.io.*;
import java.net.*;

public final class TextReaderThread implements Runnable {
	//variables
	private BufferedReader br;
	private Socket socket;
	private String message;
	
	
	
	
	//constructor creates Input Channel between Server and Client
	public TextReaderThread(Socket socket) {
		this.socket = socket;

	}
	
	
	
	
	//methods
	private void read() throws IOException {
		this.message = br.readLine();
		System.out.println(": " + this.message);
		
	}
	
	
	
	
	
	
	
	// thread that reads Input Channel
	public void run() {
		try {
			
			this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			
			System.out.println("Now I can read!");
			
			while(true) {
				this.read();
			}
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Run Reader");
		}
	}
}
