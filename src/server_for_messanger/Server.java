package server_for_messanger;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import messanger.Client;


public class Server {
	
	//variables
	private int port;
	private ServerSocket server_socket;
	private Socket socket;
	private Client client;
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			Server server = new Server(0);
		}
		catch(IOException ioe) {
			
		}
	}
	
	
	
	
	
	
	//Constructor
	public Server(int port)throws IOException {
		this.set_port(this.port);
		
		
		Thread thread = new Thread(new ClientAccepter(this));
		thread.start();
	}
	
	
	
	
	
	
	//methods
	public void connect() throws IOException {
		this.set_server_socket(new ServerSocket(this.get_port()));
		this.set_socket(this.get_server_socket().accept());
	}
	
	
	
	
	
	
	
	//AUTOGEN setters and getters
		//Server Socket
	public ServerSocket get_server_socket() {
		return server_socket;
	}
	
	public void set_server_socket(ServerSocket server_socket) {
		this.server_socket = server_socket;
	}
	
	
	
	
	
		//PORT
	public int get_port() {
		return port;
	}
	
	public void set_port(int port) {
		this.port = port;
	}

	
	
	

		// Socket
	public void set_socket(Socket socket) {
		this.socket = socket;
	}
	
	public Socket get_socket() {
		return this.socket;
	}






	public Client get_client() {
		return client;
	}
	
	public void set_client(Client client) {
		this.client = client;
	}
}
