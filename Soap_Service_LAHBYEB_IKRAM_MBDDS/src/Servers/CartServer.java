package Servers;

import javax.xml.ws.Endpoint;

import CartService.MethodsCart;

public class CartServer {
	public static void main(String[] args){
		try {
		Endpoint.publish("http://localhost:2001/CartService/MethodsCart", new MethodsCart());
		System.out.println("Fait...");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		}

}
