package ravi.dao;

import ravi.model.Login;
import ravi.model.User;

public interface UserDao {
void register(User user);
User validateUser(Login login);
}

