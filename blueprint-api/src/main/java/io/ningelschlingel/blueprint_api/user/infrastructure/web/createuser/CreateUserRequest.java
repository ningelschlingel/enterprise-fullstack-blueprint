package io.ningelschlingel.blueprint_api.user.infrastructure.web.createuser;

public record CreateUserRequest(
    String email,
    String fullName
) {}
