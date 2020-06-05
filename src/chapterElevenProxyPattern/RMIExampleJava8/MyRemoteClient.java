package chapterElevenProxyPattern.RMIExampleJava8;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {

  public static void main(String[] args) {
    String host = (args.length < 1) ? null : args[0];
    new MyRemoteClient().go(host);
  }

  public void go(String host) {
    try {
/*
      MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
      String s = service.sayHello();
      System.out.println(s);
*/

      Registry registry = LocateRegistry.getRegistry(host, 9981);
      MyRemote stub = (MyRemote) registry.lookup("HelloServer");
      String response = stub.sayHello();
      System.out.println("response: " + response);
    } catch (Exception ex) {
      System.err.println("Client exception: " + ex.toString());
      ex.printStackTrace();
    }
  }
}
