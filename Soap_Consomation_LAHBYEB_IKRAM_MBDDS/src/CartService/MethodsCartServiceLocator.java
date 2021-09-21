/**
 * MethodsCartServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CartService;

public class MethodsCartServiceLocator extends org.apache.axis.client.Service implements CartService.MethodsCartService {

    public MethodsCartServiceLocator() {
    }


    public MethodsCartServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MethodsCartServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MethodsCartPort
    private java.lang.String MethodsCartPort_address = "http://localhost:2001/CartService/MethodsCart";

    public java.lang.String getMethodsCartPortAddress() {
        return MethodsCartPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MethodsCartPortWSDDServiceName = "MethodsCartPort";

    public java.lang.String getMethodsCartPortWSDDServiceName() {
        return MethodsCartPortWSDDServiceName;
    }

    public void setMethodsCartPortWSDDServiceName(java.lang.String name) {
        MethodsCartPortWSDDServiceName = name;
    }

    public CartService.MethodsCart getMethodsCartPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MethodsCartPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMethodsCartPort(endpoint);
    }

    public CartService.MethodsCart getMethodsCartPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CartService.MethodsCartPortBindingStub _stub = new CartService.MethodsCartPortBindingStub(portAddress, this);
            _stub.setPortName(getMethodsCartPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMethodsCartPortEndpointAddress(java.lang.String address) {
        MethodsCartPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CartService.MethodsCart.class.isAssignableFrom(serviceEndpointInterface)) {
                CartService.MethodsCartPortBindingStub _stub = new CartService.MethodsCartPortBindingStub(new java.net.URL(MethodsCartPort_address), this);
                _stub.setPortName(getMethodsCartPortWSDDServiceName());
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
        if ("MethodsCartPort".equals(inputPortName)) {
            return getMethodsCartPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://CartService/", "MethodsCartService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://CartService/", "MethodsCartPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MethodsCartPort".equals(portName)) {
            setMethodsCartPortEndpointAddress(address);
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
