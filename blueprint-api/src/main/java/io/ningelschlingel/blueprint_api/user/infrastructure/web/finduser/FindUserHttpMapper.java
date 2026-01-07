package io.ningelschlingel.blueprint_api.user.infrastructure.web.finduser;

import io.ningelschlingel.blueprint_api.user.core.domain.User;

public class FindUserHttpMapper {

    public static FindUserResponse toResponse(User user) {
        return new FindUserResponse(user.getId().value(), user.getEmail(), user.getFullName());
    }
    
}
