package endpoint;

import javax.xml.ws.Endpoint;
import ws.UserDAOImpl;


public class UserDAOPublisher
{
  public static void main(String[] args)
  {
    Endpoint.publish("http://localhost:9999/ws/UserDao", new UserDAOImpl());
  }
}
