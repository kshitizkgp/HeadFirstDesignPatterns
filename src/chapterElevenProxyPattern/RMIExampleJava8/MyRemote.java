package chapterElevenProxyPattern.RMIExampleJava8;

import java.rmi.*;

public interface MyRemote extends Remote {
  String sayHello() throws RemoteException;
}
