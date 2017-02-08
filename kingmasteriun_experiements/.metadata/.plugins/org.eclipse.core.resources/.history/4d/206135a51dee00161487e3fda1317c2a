package server_client;

import java.io.*;
import java.net.*;

public class Server {
	
	static ServerSocket serverSocket;
	static Socket socket;
	static DataOutputStream out;
	
	public static void main(String[] args) throws IOException{
		
		serverSocket = new ServerSocket(7777);
		socket = serverSocket.accept();
		out = new DataOutputStream(socket.getOutputStream());
		out.writeUTF("This is a test of java sockets.");
	}

}
