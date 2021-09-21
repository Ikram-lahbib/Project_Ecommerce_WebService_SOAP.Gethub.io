package CartService;

public class MethodsCartProxy implements CartService.MethodsCart {
  private String _endpoint = null;
  private CartService.MethodsCart methodsCart = null;
  
  public MethodsCartProxy() {
    _initMethodsCartProxy();
  }
  
  public MethodsCartProxy(String endpoint) {
    _endpoint = endpoint;
    _initMethodsCartProxy();
  }
  
  private void _initMethodsCartProxy() {
    try {
      methodsCart = (new CartService.MethodsCartServiceLocator()).getMethodsCartPort();
      if (methodsCart != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)methodsCart)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)methodsCart)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (methodsCart != null)
      ((javax.xml.rpc.Stub)methodsCart)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public CartService.MethodsCart getMethodsCart() {
    if (methodsCart == null)
      _initMethodsCartProxy();
    return methodsCart;
  }
  
  public void addCartObj(CartService.User u, CartService.Book b) throws java.rmi.RemoteException{
    if (methodsCart == null)
      _initMethodsCartProxy();
    methodsCart.addCartObj(u, b);
  }
  
  public CartService.Book getBook(int id_book) throws java.rmi.RemoteException{
    if (methodsCart == null)
      _initMethodsCartProxy();
    return methodsCart.getBook(id_book);
  }
  
  public void addCart(int id_user, java.lang.String image_book, java.lang.String name_book, double price_book) throws java.rmi.RemoteException{
    if (methodsCart == null)
      _initMethodsCartProxy();
    methodsCart.addCart(id_user, image_book, name_book, price_book);
  }
  
  public CartService.Cart[] getCartByUser(int id_user) throws java.rmi.RemoteException{
    if (methodsCart == null)
      _initMethodsCartProxy();
    return methodsCart.getCartByUser(id_user);
  }
  
  public void deleteFromCart(int id_cart) throws java.rmi.RemoteException{
    if (methodsCart == null)
      _initMethodsCartProxy();
    methodsCart.deleteFromCart(id_cart);
  }
  
  public CartService.User getUser(int id_user) throws java.rmi.RemoteException{
    if (methodsCart == null)
      _initMethodsCartProxy();
    return methodsCart.getUser(id_user);
  }
  
  
}