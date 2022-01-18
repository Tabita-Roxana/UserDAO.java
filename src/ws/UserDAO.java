package ws;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)

public interface UserDAO
{
  @WebMethod void createUser(int id, String email, String password);
  @WebMethod boolean validateUser(int id);
  @WebMethod void changePassword(int id, String password);
  @WebMethod void deleteUser(int id);
}
