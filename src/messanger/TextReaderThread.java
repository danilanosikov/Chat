package messanger;

import java.io.*;
import server_for_messanger.*;

public final class TextReaderThread implements Runnable {
	//variables
	private BufferedReader br;
	private Client client;
	private String response;
	private Server server;
	
	
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
	
	
	
	public TextReaderThread(Server server) {
		this.set_server(server);
		
		try {
			this.br = new BufferedReader(new InputStreamReader(this.server.get_socket().getInputStream()));
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
	
	private void set_server(Server server) {
		this.server = server;
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
