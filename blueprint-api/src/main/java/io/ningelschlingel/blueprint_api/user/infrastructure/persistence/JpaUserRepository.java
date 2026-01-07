package io.ningelschlingel.blueprint_api.user.infrastructure.persistence;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import io.ningelschlingel.blueprint_api.user.core.domain.User;
import io.ningelschlingel.blueprint_api.user.core.domain.UserId;
import io.ningelschlingel.blueprint_api.user.core.port.out.UserRepository;

@Repository
public class JpaUserRepository implements UserRepository {

    SpringDataUserRepository springDataUserRepository;

    @Override
    public User save(User user) {
        UserEntity entity = UserJpaMapper.fromDomain(user);
        UserEntity saved = springDataUserRepository.save(entity);
        return UserJpaMapper.toDomain(saved);
    }

    @Override
    public Optional<User> findById(UserId id) {
        return springDataUserRepository.findById(id.value()).map(UserJpaMapper::toDomain);
    }

    @Override
    public void deleteById(UserId id) {
        springDataUserRepository.deleteById(id.value());
    }
    
}
