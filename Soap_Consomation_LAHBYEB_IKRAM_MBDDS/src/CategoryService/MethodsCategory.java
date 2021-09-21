/**
 * MethodsCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CategoryService;

public interface MethodsCategory extends java.rmi.Remote {
    public void addCategory(java.lang.String name, java.lang.String image, java.lang.String desc) throws java.rmi.RemoteException;
    public CategoryService.Category[] getAllCategory() throws java.rmi.RemoteException;
    public java.lang.String getCategoryName(int id) throws java.rmi.RemoteException;
    public void deleteCategory(int id) throws java.rmi.RemoteException;
    public void updateCategory(int id, java.lang.String name) throws java.rmi.RemoteException;
    public CategoryService.Category getCategory(int id) throws java.rmi.RemoteException;
}
