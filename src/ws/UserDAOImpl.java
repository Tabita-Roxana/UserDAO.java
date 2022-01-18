package ws;

import model.DAO;

import javax.jws.WebService;

@WebService(endpointInterface = "ws.UserDAO")

public class UserDAOImpl implements UserDAO
{
  private DAO users;


  @Override public void createUser(int id, String email, String password)
  {
    if(users ==null)
    {
      users = new DAO();
    }
      users.createUser(id, email, password);
  }

  @Override public boolean validateUser(int id)
  {
    return users.validateUser(id);
  }

  @Override public void changePassword(int id, String password)
  {
    users.changePassword(id,password);
  }

  @Override public void deleteUser(int id)
  {
    users.deleteUser(id);
  }
}
