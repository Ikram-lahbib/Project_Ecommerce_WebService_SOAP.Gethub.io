package Servers;

import javax.xml.ws.Endpoint;

import BookService.MethodsBook;

public class BookServer {
	public static void main(String[] args){
		try {
		Endpoint.publish("http://localhost:1999/BookService/MethodsBook", new MethodsBook());
		System.out.println("Fait...");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		}

}
