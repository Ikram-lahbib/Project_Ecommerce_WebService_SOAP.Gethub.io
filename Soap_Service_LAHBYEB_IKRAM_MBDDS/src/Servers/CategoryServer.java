package Servers;

import javax.xml.ws.Endpoint;

import CategoryService.MethodsCategory;



public class CategoryServer {
	public static void main(String[] args){
		try {
		Endpoint.publish("http://localhost:1998/CategoryService/MethodsCategory", new MethodsCategory());
		System.out.println("Fait...");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		}
}
