package client;

import ws.UserDAO;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;


public class UserDAOClient
{
  public static void main(String[] args) throws Exception
  {
    URL url = new URL("http://localhost:9999/ws/UserDao?wsdl");
    QName qName = new QName("http://ws/","UserDAOImplService");
    Service service = Service.create(url,qName);
    UserDAO userDAO = service.getPort(UserDAO.class);



    userDAO.createUser(1,"vhfkj@gmail.com", "123456");

    System.out.println("Is the user valid?:" + userDAO.validateUser(1));

    userDAO.changePassword(1, "55654654");
    userDAO.deleteUser(1);
    System.out.println("Is the user valid?:" + userDAO.validateUser(1));

  }
}
