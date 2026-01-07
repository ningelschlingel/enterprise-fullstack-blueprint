package io.ningelschlingel.blueprint_api.user.core.application.createuser;

import io.ningelschlingel.blueprint_api.user.core.application.createuser.failure.CreateUserFailure;
import io.ningelschlingel.blueprint_api.user.core.domain.User;
import io.ningelschlingel.blueprint_api.user.core.domain.UserId;
import io.ningelschlingel.blueprint_api.user.core.port.out.UserRepository;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateUserUseCase {

    private final UserRepository userRepository;
    
    public Either<CreateUserFailure, User> execute(CreateUserCommand command){
        userRepository.deleteById(new UserId());
        return null;

    }

}
