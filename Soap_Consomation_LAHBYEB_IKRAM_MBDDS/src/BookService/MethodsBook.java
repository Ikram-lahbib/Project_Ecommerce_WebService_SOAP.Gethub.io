/**
 * MethodsBook.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package BookService;

public interface MethodsBook extends java.rmi.Remote {
    public BookService.Book[] getBookByCategory(int id_Category) throws java.rmi.RemoteException;
    public BookService.Book[] getBookByDate(java.lang.String date) throws java.rmi.RemoteException;
    public BookService.Book getBook(int id) throws java.rmi.RemoteException;
    public void updateBook(int id, BookService.Book b) throws java.rmi.RemoteException;
    public BookService.Book[] getALLBook() throws java.rmi.RemoteException;
    public void deleteBook(int id) throws java.rmi.RemoteException;
    public void addBook(BookService.Book b) throws java.rmi.RemoteException;
}
