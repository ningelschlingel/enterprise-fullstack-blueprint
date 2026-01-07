package io.ningelschlingel.blueprint_api.user.core.application.deleteuser.failure;

import io.ningelschlingel.blueprint_api.user.core.domain.UserFailure;

public sealed interface DeleteUserFailure extends UserFailure permits DeleteUserNotAllowed {}
