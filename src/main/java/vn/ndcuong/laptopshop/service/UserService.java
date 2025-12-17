package vn.ndcuong.laptopshop.service;

import org.springframework.stereotype.Service;

import vn.ndcuong.laptopshop.domain.User;
import vn.ndcuong.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String hanleHello() {
        return "Nguyen Dang Cuong JSP";
    }

    public void handleSaveUser(User user) {
        this.userRepository.save(user);
    }
}
