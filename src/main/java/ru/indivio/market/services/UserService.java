package ru.indivio.market.services;

import ru.indivio.market.entities.SystemUser;
import ru.indivio.market.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
    void save(SystemUser systemUser);
}
