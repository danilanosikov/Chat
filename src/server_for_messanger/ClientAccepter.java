package server_for_messanger;

import java.io.IOException;
import messanger.Client;
import messanger.TextReaderThread;

public class ClientAccepter implements Runnable{
	
	//variables
	private Server server;
	
	
	// Constructor
	public ClientAccepter(Server server) {
		this.set_server(server);
	}
	
	
	

	
	
	//getters and setters
	public Server get_server() {
		return server;
	}

	public void set_server(Server server) {
		this.server = server;
	}
	
	
	
	
	
	
	
	
	public void run() {
		
		try {
			this.server.connect();
			TextReaderThread text_reader_thread = new TextReaderThread(this.get_server());
		}
		catch(IOException ioe) {
			
		}
	}
}
