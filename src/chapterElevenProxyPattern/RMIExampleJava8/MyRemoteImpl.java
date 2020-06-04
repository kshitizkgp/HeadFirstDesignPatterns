package chapterElevenProxyPattern.RMIExampleJava8;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteImpl implements MyRemote {
  protected MyRemoteImpl() throws RemoteException {}

  @Override
  public String sayHello() throws RemoteException {
    return "Server says Hello!!!";
  }

  public static void main(String[] args) {
    try{
      MyRemote service = new MyRemoteImpl();
//      MyRemote stub = (MyRemote) UnicastRemoteObject.exportObject(service, 9982);
      Registry registry = LocateRegistry.getRegistry();
      registry.bind("HelloServer", service);

      System.err.println("Server Ready...");
    }catch (Exception ex){
      System.err.println("Server exception " + ex.toString());
      ex.printStackTrace();
    }
  }
}
