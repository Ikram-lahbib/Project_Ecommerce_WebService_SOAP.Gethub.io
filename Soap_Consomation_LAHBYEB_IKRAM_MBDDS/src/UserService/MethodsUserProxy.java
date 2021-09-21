package UserService;

public class MethodsUserProxy implements UserService.MethodsUser {
  private String _endpoint = null;
  private UserService.MethodsUser methodsUser = null;
  
  public MethodsUserProxy() {
    _initMethodsUserProxy();
  }
  
  public MethodsUserProxy(String endpoint) {
    _endpoint = endpoint;
    _initMethodsUserProxy();
  }
  
  private void _initMethodsUserProxy() {
    try {
      methodsUser = (new UserService.MethodsUserServiceLocator()).getMethodsUserPort();
      if (methodsUser != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)methodsUser)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)methodsUser)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (methodsUser != null)
      ((javax.xml.rpc.Stub)methodsUser)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public UserService.MethodsUser getMethodsUser() {
    if (methodsUser == null)
      _initMethodsUserProxy();
    return methodsUser;
  }
  
  public void addUser(UserService.User u) throws java.rmi.RemoteException{
    if (methodsUser == null)
      _initMethodsUserProxy();
    methodsUser.addUser(u);
  }
  
  public UserService.User authUser(java.lang.String login, java.lang.String password) throws java.rmi.RemoteException{
    if (methodsUser == null)
      _initMethodsUserProxy();
    return methodsUser.authUser(login, password);
  }
  
  public UserService.User getUser(int id) throws java.rmi.RemoteException{
    if (methodsUser == null)
      _initMethodsUserProxy();
    return methodsUser.getUser(id);
  }
  
  
}