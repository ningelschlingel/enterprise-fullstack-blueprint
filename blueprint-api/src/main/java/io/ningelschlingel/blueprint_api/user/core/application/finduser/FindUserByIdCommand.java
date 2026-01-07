package io.ningelschlingel.blueprint_api.user.core.application.finduser;

import io.ningelschlingel.blueprint_api.user.core.domain.UserId;

public record FindUserByIdCommand(
    UserId id
) {}
