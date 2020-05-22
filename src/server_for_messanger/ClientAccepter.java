package server_for_messanger;

public class ClientAccepter implements Runnable{
	private Server server;
	
	
	// Constructor
	public ClientAccepter(Server server) {
		
	}
	
	//methods
	private void accept_client() {
		//TODO
	}
	
	
	//getters and setters
	public Server get_server() {
		return server;
	}

	public void set_server(Server server) {
		this.server = server;
	}
	
	
	public void run() {
		//TODO this code have to accept clients
	}
}
