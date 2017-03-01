package server_client;

import java.io.*;
import java.net.*;

public class Server_2_testServer {
	
	static ServerSocket serverSocket;
	static Socket socket;
	static DataOutputStream out;
	
	static DataInputStream in;
	
	public static void main(String[] args) throws IOException{
		
		System.out.println("Starting server...");
		serverSocket = new ServerSocket(7777);
		System.out.println("Server started....");
		
		socket = serverSocket.accept();
		System.out.println("Connection from:" + socket.getInetAddress());
		out = new DataOutputStream(socket.getOutputStream());
		
		out.writeUTF("This is a test of java sockets.");
		System.out.println("Data has been sent.");
		
		System.out.println("waiting for message from client...");
		String test = in.readUTF();
		System.out.println("message from client:" + test);
		
	}

}
