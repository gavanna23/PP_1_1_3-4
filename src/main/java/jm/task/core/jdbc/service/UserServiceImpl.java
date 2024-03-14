package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDaoJDBC.createUsersTable();
        System.out.println("Таблица создана или уже существует");

    }

    public void dropUsersTable() {
        userDaoJDBC.dropUsersTable();
        System.out.println("Таблица удалена");
    }

    public void saveUser(String name, String lastName, byte age){
        userDaoJDBC.saveUser(name, lastName, age);
        System.out.println("User с именем " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id){
        userDaoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers(){
        List<User> users = userDaoJDBC.getAllUsers();
        for (User user : users) {
            System.out.println(user.toString());
        }
        return users;
    }

    public void cleanUsersTable(){
        userDaoJDBC.cleanUsersTable();
        System.out.println("Таблица очищена");
    }
}
