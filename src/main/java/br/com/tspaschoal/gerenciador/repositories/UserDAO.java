package br.com.tspaschoal.gerenciador.repositories;

import java.util.ArrayList;
import java.util.List;

import br.com.tspaschoal.gerenciador.models.User;

/**
 * UserDAO
 */
public class UserDAO {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("thiago", "123"));
    }

    public List<User> findAll() {
        return UserDAO.users;
    }

    public User hasUserWithCredentilas(String login, String senha) {
        final var users = findAll();
        final var userFound = users.stream().filter(user -> user.hasCredentials(login, senha)).findFirst().orElse(null);
        return userFound;
    }

}