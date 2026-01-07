package io.ningelschlingel.blueprint_api.user.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.ningelschlingel.blueprint_api.user.core.application.createuser.CreateUserUseCase;
import io.ningelschlingel.blueprint_api.user.core.application.deleteuser.DeleteUserByIdUseCase;
import io.ningelschlingel.blueprint_api.user.core.application.finduser.FindUserByIdUseCase;
import io.ningelschlingel.blueprint_api.user.infrastructure.persistence.JpaUserRepository;

@Configuration
public class UserConfiguration {

    private final JpaUserRepository jpaUserRepository;

    public UserConfiguration(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Bean
    public CreateUserUseCase createUserUseCase() {
        return new CreateUserUseCase(jpaUserRepository);
    }

    @Bean
    public FindUserByIdUseCase findUserByIdUseCase() {
        return new FindUserByIdUseCase(jpaUserRepository);
    }

    @Bean
    public DeleteUserByIdUseCase deleteUserUseCase() {
        return new DeleteUserByIdUseCase(jpaUserRepository);
    }
}
