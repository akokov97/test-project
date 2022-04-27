package springbootapp.service;

import springbootapp.model.Role;
import springbootapp.model.User;
import springbootapp.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepositoryImpl userRepositoryImpl;

    @Override
    public void createUser(String firstName, String lastName, Byte age, String email, String password, String role) {
        userRepositoryImpl.save(firstName, lastName, age, email, password, role);
    }

    @Override
    public void editUser(Long id, String firstName, String lastName, Byte age, String email, String password, String role) {
    }

    @Override
    public void deleteUser(Long id) {
        userRepositoryImpl.delete(id);
    }

    @Override
    public void editUser(Long id) {

        userRepositoryImpl.save(id);
    }

    @Override
    public User getUser(Long id) {
        return userRepositoryImpl.getUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepositoryImpl.getAllUsers();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepositoryImpl.getUserByEmail(email);
    }

    @Override
    public Role getRoleByName(String name) {
        return userRepositoryImpl.getRoleByName(name);
    }
}
