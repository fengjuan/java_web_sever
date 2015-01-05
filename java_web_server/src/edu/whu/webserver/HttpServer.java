//package edu.whu.webserver;
//
//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class HttpServer {
//	
//	public static void main(String args[]) {
//		int port = 8080;
//		ServerSocket server_socket = null;
//		try {
//			// 监听服务器端口，等待连接请求
//			server_socket = new ServerSocket(port);
//			System.out.println("httpServer running on port "
//					+ server_socket.getLocalPort());
//			// 显示启动信息
//			while (true) {
//				Socket socket = server_socket.accept();
//				System.out.println("New connection accepted "
//						+ socket.getInetAddress() + ":" + socket.getPort());
//				// 创建分线程
//				try {
//					HttpRequestHandler request = new HttpRequestHandler(socket);
//					Thread thread = new Thread(request);
//					// 启动线程
//					thread.start();
//				} catch (Exception e) {
//					System.out.println(e);
//				}
//			}
//		} catch (IOException e) {
//			System.out.println(e);
//		} finally {
//			
//			try {
//				if(server_socket != null) {
//					server_socket.close();
//					server_socket = null;
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//	}
//}
//
