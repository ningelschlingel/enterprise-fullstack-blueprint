```
user/
 ├─ core/
 │  ├─ application/
 │  │  ├─ createuser/
 │  │  │   ├─ CreateUserUseCase.java
 │  │  │   ├─ CreateUserCommand.java
 │  │  │   └─ failure/
 │  │  │      ├─ CreateUserFailure.java
 │  │  │      ├─ UserDataInvalid.java
 │  │  │      └─ UserExistsAlready.javas
 │  │  ├─ finduser/
 │  │  │   ├─ FindUserByIdUseCase.java
 │  │  │   ├─ FindUserByIdCommand.java
 │  │  │   └─ failure/
 │  │  │      ├─ FindUserFailure.java
 │  │  │      └─ UserNotFound.java
 │  │  └─ deleteuser/
 │  │      ├─ DeleteUserByIdUseCase.java
 │  │      ├─ DeleteUserByIdCommand.java
 │  │      └─ failure/
 │  │         ├─ DeleteUserFailure.java
 │  │         └─ DeleteUserNotAllowed.java
 │  ├─ domain/
 │  │  ├─ User.java
 │  │  ├─ UserId.java
 │  │  ├─ UserStatus.java
 │  │  ├─ UserRole.java
 │  │  └─ UserFailure.java
 │  └─ port/
 │     └─ out/
 │        └─ UserRepository.java
 │
 └─ infrastructure/
    ├─ config/
    │  └─ UserConfiguration.java
    ├─ web/
    │  ├─ createuser
    │  │  ├─ CreateUserHttpMapper.java
    │  │  ├─ CreateUserRequest.java
    │  │  └─ CreateUserResponse.java    
    │  ├─ finduser
    │  │  ├─ FindUserHttpMapper.java
    │  │  ├─ FindUserRequest.java
    │  │  └─ FindUserResponse.java
    │  ├─ deleteuser
    │  │  ├─ DeleteUserHttpMapper.java
    │  │  ├─ DeleteUserRequest.java
    │  │  └─ DeleteUserResponse.java
    │  └─ UserController.java
    │
    └─ persistence/
       └─ jpa/
          ├─ JpaUserRepository.java
          ├─ SpringDataUserRepository.java
          ├─ UserEntity.java
          └─ UserJpaMapper.java

```