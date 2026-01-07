package io.ningelschlingel.blueprint_api.user.core.application.finduser.failure;

import io.ningelschlingel.blueprint_api.user.core.domain.UserFailure;

public sealed interface FindUserFailure extends UserFailure permits UserNotFound {}
