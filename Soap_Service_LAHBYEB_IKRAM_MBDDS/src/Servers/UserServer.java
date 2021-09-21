package Servers;

import javax.xml.ws.Endpoint;

import UserService.MethodsUser;

public class UserServer {
	public static void main(String[] args){
		try {
		Endpoint.publish("http://localhost:2000/UserService/MethodsUser", new MethodsUser());
		System.out.println("Fait...");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		}
}
