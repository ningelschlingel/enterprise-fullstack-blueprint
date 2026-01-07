package io.ningelschlingel.blueprint_api.user.core.application.deleteuser;

import io.ningelschlingel.blueprint_api.user.core.application.deleteuser.failure.DeleteUserFailure;
import io.ningelschlingel.blueprint_api.user.core.domain.UserId;
import io.ningelschlingel.blueprint_api.user.infrastructure.persistence.JpaUserRepository;
import io.vavr.control.Either;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeleteUserByIdUseCase {

    private final JpaUserRepository jpaRepository;

    public Either<DeleteUserFailure, Void> execute(UserId id){
        jpaRepository.deleteById(id);
        return Either.right(null);
    }
    
}
