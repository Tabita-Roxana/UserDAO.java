package model;

import java.util.ArrayList;
import java.util.List;

public class DAO
{
  private List<User> users;

  public DAO()
  {
    users =  new ArrayList<>();
  }

  public void createUser(int id, String email, String password)
  {

    users.add(new User(id, email,password));
  }

  public boolean validateUser(int id)
  {
    for (int i = 0; i < users.size(); i++)
    {
      if(users.get(i).getId()==(id))
      {
        return true;
      }
    }
    return false;
  }

  public void changePassword(int id, String password)
  {
    for (int i = 0; i < users.size(); i++)
    {
      if(users.get(i).getId()== id)
      {
        users.get(i).setPassword(password);
      }
    }
  }

  public void deleteUser(int id)
  {
    for (int i = 0; i < users.size(); i++)
    {
      if(users.get(i).getId()== id)
      {
        users.remove(users.get(i));
      }
    }
  }

  @Override public String toString()
  {
    return "DAO{" + "users=" + users + '}';
  }
}
