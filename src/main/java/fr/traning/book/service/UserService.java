package fr.traning.book.service;

import fr.traning.book.repository.RoleRepository;
import fr.traning.book.repository.UserRepository;
import fr.traning.book.repository.entity.Role;
import fr.traning.book.repository.entity.RoleEnum;
import fr.traning.book.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean checkUsernameExist(String username) {
        return userRepository.existsByUsername(username);
    }

    @Transactional
    public User signup(String username, String password) {
        Role roleUser = roleRepository.findByName(RoleEnum.ROLE_USER);
        List<Role> roleList = Arrays.asList(roleUser);

        User u = new User(username, passwordEncoder.encode(password), roleList);
        return userRepository.save(u);
    }
}