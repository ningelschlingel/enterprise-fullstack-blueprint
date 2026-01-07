package io.ningelschlingel.blueprint_api.user.core.application.deleteuser;

import io.ningelschlingel.blueprint_api.user.core.domain.UserId;

public record DeleteUserByIdCommand(
    UserId id
) {}
