package io.ningelschlingel.blueprint_api.user.core.port.out;

import java.util.Optional;

import io.ningelschlingel.blueprint_api.user.core.domain.User;
import io.ningelschlingel.blueprint_api.user.core.domain.UserId;

public interface UserRepository {

    User save(User user);
    Optional<User> findById(UserId id);
    void deleteById(UserId id);
    
}
