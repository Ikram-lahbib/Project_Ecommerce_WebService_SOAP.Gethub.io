/**
 * MethodsCart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CartService;

public interface MethodsCart extends java.rmi.Remote {
    public void addCartObj(CartService.User u, CartService.Book b) throws java.rmi.RemoteException;
    public CartService.Book getBook(int id_book) throws java.rmi.RemoteException;
    public void addCart(int id_user, java.lang.String image_book, java.lang.String name_book, double price_book) throws java.rmi.RemoteException;
    public CartService.Cart[] getCartByUser(int id_user) throws java.rmi.RemoteException;
    public void deleteFromCart(int id_cart) throws java.rmi.RemoteException;
    public CartService.User getUser(int id_user) throws java.rmi.RemoteException;
}
