package messanger;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public final class TextWriterThread implements Runnable {
	//variables
	private BufferedWriter bw;
	private Socket socket;
	private String message;
	private BufferedReader keyboard;
	
	
	//constructor creates Output Channel between Server and Client
	public TextWriterThread(Socket socket) {
		this.socket = socket;
		keyboard = new BufferedReader(new InputStreamReader(System.in));
	}
	
	
	
	
	//methods
	private void write() throws IOException {
		this.message = keyboard.readLine();
		bw.write(this.message);
		
	}
	
	
	
	
	
	
	
	// thread that reads Input Channel
	public void run() {
		try {
			
			this.bw = new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream()));
			
			System.out.println("Now I can Write!");
			
			while(true) {
				this.write();
			}
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println("Run Writer");
		}
	}
}
