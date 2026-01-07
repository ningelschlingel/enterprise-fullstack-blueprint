package io.ningelschlingel.blueprint_api.user.core.application.createuser.failure;

import io.ningelschlingel.blueprint_api.user.core.domain.UserFailure;

public sealed interface CreateUserFailure extends UserFailure permits UserExistsAlready, UserDataInvalid {}
