package io.ningelschlingel.blueprint_api.user.core.application.createuser;

import io.ningelschlingel.blueprint_api.user.core.domain.UserId;

public record CreateUserCommand(
    UserId id,
    String email,
    String fullName
) {}

