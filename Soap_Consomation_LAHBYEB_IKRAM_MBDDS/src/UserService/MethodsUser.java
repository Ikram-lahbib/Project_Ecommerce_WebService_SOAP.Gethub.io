/**
 * MethodsUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package UserService;

public interface MethodsUser extends java.rmi.Remote {
    public void addUser(UserService.User u) throws java.rmi.RemoteException;
    public UserService.User authUser(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException;
    public UserService.User getUser(int id) throws java.rmi.RemoteException;
}
