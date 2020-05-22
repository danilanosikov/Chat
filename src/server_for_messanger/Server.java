package server_for_messanger;

import java.net.ServerSocket;

public class Server {
	private String ip;
	private int port;
	private ServerSocket server_socket;
	
	public static void main(String[] args) {
		
		
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

	
	
		// IP
	public String get_ip() {
		return ip;
	}

	public void set_ip(String ip) {
		this.ip = ip;
	}

}
