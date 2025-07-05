package com.ragheb.shop.service.user;

import com.ragheb.shop.dto.UserDto;
import com.ragheb.shop.model.User;
import com.ragheb.shop.request.CreateUserRequest;
import com.ragheb.shop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
