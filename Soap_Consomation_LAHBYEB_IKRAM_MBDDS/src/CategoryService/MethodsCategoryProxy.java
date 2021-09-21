package CategoryService;

public class MethodsCategoryProxy implements CategoryService.MethodsCategory {
  private String _endpoint = null;
  private CategoryService.MethodsCategory methodsCategory = null;
  
  public MethodsCategoryProxy() {
    _initMethodsCategoryProxy();
  }
  
  public MethodsCategoryProxy(String endpoint) {
    _endpoint = endpoint;
    _initMethodsCategoryProxy();
  }
  
  private void _initMethodsCategoryProxy() {
    try {
      methodsCategory = (new CategoryService.MethodsCategoryServiceLocator()).getMethodsCategoryPort();
      if (methodsCategory != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)methodsCategory)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)methodsCategory)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (methodsCategory != null)
      ((javax.xml.rpc.Stub)methodsCategory)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public CategoryService.MethodsCategory getMethodsCategory() {
    if (methodsCategory == null)
      _initMethodsCategoryProxy();
    return methodsCategory;
  }
  
  public void addCategory(java.lang.String name, java.lang.String image, java.lang.String desc) throws java.rmi.RemoteException{
    if (methodsCategory == null)
      _initMethodsCategoryProxy();
    methodsCategory.addCategory(name, image, desc);
  }
  
  public CategoryService.Category[] getAllCategory() throws java.rmi.RemoteException{
    if (methodsCategory == null)
      _initMethodsCategoryProxy();
    return methodsCategory.getAllCategory();
  }
  
  public java.lang.String getCategoryName(int id) throws java.rmi.RemoteException{
    if (methodsCategory == null)
      _initMethodsCategoryProxy();
    return methodsCategory.getCategoryName(id);
  }
  
  public void deleteCategory(int id) throws java.rmi.RemoteException{
    if (methodsCategory == null)
      _initMethodsCategoryProxy();
    methodsCategory.deleteCategory(id);
  }
  
  public void updateCategory(int id, java.lang.String name) throws java.rmi.RemoteException{
    if (methodsCategory == null)
      _initMethodsCategoryProxy();
    methodsCategory.updateCategory(id, name);
  }
  
  public CategoryService.Category getCategory(int id) throws java.rmi.RemoteException{
    if (methodsCategory == null)
      _initMethodsCategoryProxy();
    return methodsCategory.getCategory(id);
  }
  
  
}