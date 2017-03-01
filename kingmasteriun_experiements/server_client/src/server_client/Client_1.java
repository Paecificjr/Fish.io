package server_client;

import java.net.*;
import java.io.*;


public class Client_1 {
	
	static Socket socket;
	static DataInputStream in;
	static DataOutputStream out;
	
	public static void main(String[] args)throws Exception{
		
		System.out.println("Connecting...");
		socket = new Socket("192.168.56.1", 7777);  /// change localhost to my ip address; want to communicate with my socket (server's socket(?))
		System.out.println("Connection Successful");
		
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		
		
		System.out.println("Recieving Information....");
		String test = in.readUTF();
		System.out.println("Message from server:" + test);
		
		out.writeUTF("this is a a test of sending data from client to server");
		System.out.println("Message to server sent");
	}

}
