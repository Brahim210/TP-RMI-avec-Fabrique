import java.rmi.*;
public interface ReverseInterface extends Remote{

public  String reverseString(String str) throws RemoteException;

}