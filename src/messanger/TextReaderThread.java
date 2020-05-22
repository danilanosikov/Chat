package messanger;

import java.io.*;

public final class TextReaderThread implements Runnable {
	//variables
	private BufferedReader br;
	private Client client;
	private String response;
	
	
	//constructor creates Input Channel between Server and Client
	public TextReaderThread(Client client) {
		this.set_client(client);
		
		try {
			this.br = new BufferedReader(new InputStreamReader(this.client.get_socket().getInputStream()));
			Thread thread = new Thread(this);
			thread.start();
		}
		
		catch(IOException ioe) {
			System.out.println("Something went wrong in ReaderThread Constructor...");
		}
	}
	
	
	//methods
	private void read() throws IOException {
		this.response = br.readLine();
		System.out.println(client.get_username() + ": " + this.response);
	}
	
	
	
	//setters
	private void set_client(Client client) {
		this.client = client;
	}
	
	
	
	
	// thread that reads Input Channel
	public void run() {
		try {
			
			while(true) {
				this.read();
			}
			
		}
		catch(IOException ioe) {
			
		}
	}
}
