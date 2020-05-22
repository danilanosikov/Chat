package messanger;

import java.io.*;
import java.net.Socket;

public class Client {
	//variables
	private String server_ip;
	private Socket socket;
	private String username;
	
	
	//Constructors
	public Client(String server_ip) throws IOException {
		
		this.set_server_ip(server_ip);
		this.connect();
		this.set_username("Anon");
		
	}
	
	
	public Client(String server_ip, String username) throws IOException {
		
		this.set_username(username);
		this.set_server_ip(server_ip);
		this.connect();
		
	}
	
	
	
	
	//methods
	public void connect() throws IOException{
		
		set_socket(new Socket(get_server_ip(),0));
	
	}
	
	public void disconnect() throws IOException {
		this.socket.close();
		
	}
	
	
	
	

	//getters AUTO-GEN
	private String get_server_ip() {
		return server_ip;
	}
	
	public Socket get_socket() { //gets socket
		return this.socket;
	}
	
	public String get_username() {
		return this.username;
	}
	
	
	
	
	
	
	
	//setters AUTO-GEN
	private void set_server_ip(String server_ip) {
		this.server_ip = server_ip;
	}
	
	private void set_socket(Socket socket) {
		this.socket = socket;
	}
	
	private void set_username(String username) {
		this.username = username;
	}
}
