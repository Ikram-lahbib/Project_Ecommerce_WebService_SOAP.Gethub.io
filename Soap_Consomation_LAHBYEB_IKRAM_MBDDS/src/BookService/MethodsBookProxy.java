package BookService;

public class MethodsBookProxy implements BookService.MethodsBook {
  private String _endpoint = null;
  private BookService.MethodsBook methodsBook = null;
  
  public MethodsBookProxy() {
    _initMethodsBookProxy();
  }
  
  public MethodsBookProxy(String endpoint) {
    _endpoint = endpoint;
    _initMethodsBookProxy();
  }
  
  private void _initMethodsBookProxy() {
    try {
      methodsBook = (new BookService.MethodsBookServiceLocator()).getMethodsBookPort();
      if (methodsBook != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)methodsBook)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)methodsBook)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (methodsBook != null)
      ((javax.xml.rpc.Stub)methodsBook)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public BookService.MethodsBook getMethodsBook() {
    if (methodsBook == null)
      _initMethodsBookProxy();
    return methodsBook;
  }
  
  public BookService.Book[] getBookByCategory(int id_Category) throws java.rmi.RemoteException{
    if (methodsBook == null)
      _initMethodsBookProxy();
    return methodsBook.getBookByCategory(id_Category);
  }
  
  public BookService.Book[] getBookByDate(java.lang.String date) throws java.rmi.RemoteException{
    if (methodsBook == null)
      _initMethodsBookProxy();
    return methodsBook.getBookByDate(date);
  }
  
  public BookService.Book getBook(int id) throws java.rmi.RemoteException{
    if (methodsBook == null)
      _initMethodsBookProxy();
    return methodsBook.getBook(id);
  }
  
  public void updateBook(int id, BookService.Book b) throws java.rmi.RemoteException{
    if (methodsBook == null)
      _initMethodsBookProxy();
    methodsBook.updateBook(id, b);
  }
  
  public BookService.Book[] getALLBook() throws java.rmi.RemoteException{
    if (methodsBook == null)
      _initMethodsBookProxy();
    return methodsBook.getALLBook();
  }
  
  public void deleteBook(int id) throws java.rmi.RemoteException{
    if (methodsBook == null)
      _initMethodsBookProxy();
    methodsBook.deleteBook(id);
  }
  
  public void addBook(BookService.Book b) throws java.rmi.RemoteException{
    if (methodsBook == null)
      _initMethodsBookProxy();
    methodsBook.addBook(b);
  }
  
  
}