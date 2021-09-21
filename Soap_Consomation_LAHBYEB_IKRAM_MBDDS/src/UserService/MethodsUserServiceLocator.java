/**
 * MethodsUserServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package UserService;

public class MethodsUserServiceLocator extends org.apache.axis.client.Service implements UserService.MethodsUserService {

    public MethodsUserServiceLocator() {
    }


    public MethodsUserServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MethodsUserServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MethodsUserPort
    private java.lang.String MethodsUserPort_address = "http://localhost:2000/UserService/MethodsUser";

    public java.lang.String getMethodsUserPortAddress() {
        return MethodsUserPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MethodsUserPortWSDDServiceName = "MethodsUserPort";

    public java.lang.String getMethodsUserPortWSDDServiceName() {
        return MethodsUserPortWSDDServiceName;
    }

    public void setMethodsUserPortWSDDServiceName(java.lang.String name) {
        MethodsUserPortWSDDServiceName = name;
    }

    public UserService.MethodsUser getMethodsUserPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MethodsUserPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMethodsUserPort(endpoint);
    }

    public UserService.MethodsUser getMethodsUserPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            UserService.MethodsUserPortBindingStub _stub = new UserService.MethodsUserPortBindingStub(portAddress, this);
            _stub.setPortName(getMethodsUserPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMethodsUserPortEndpointAddress(java.lang.String address) {
        MethodsUserPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (UserService.MethodsUser.class.isAssignableFrom(serviceEndpointInterface)) {
                UserService.MethodsUserPortBindingStub _stub = new UserService.MethodsUserPortBindingStub(new java.net.URL(MethodsUserPort_address), this);
                _stub.setPortName(getMethodsUserPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MethodsUserPort".equals(inputPortName)) {
            return getMethodsUserPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://UserService/", "MethodsUserService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://UserService/", "MethodsUserPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MethodsUserPort".equals(portName)) {
            setMethodsUserPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
