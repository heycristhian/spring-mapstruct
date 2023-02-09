package br.com.heycristhian.springmapstruct.service;

import br.com.heycristhian.springmapstruct.dto.request.UserRequest;
import br.com.heycristhian.springmapstruct.dto.response.UserResponse;
import br.com.heycristhian.springmapstruct.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse getUser(UserRequest userRequest) {
        return UserMapper.INSTANCE.toUserResponse(userRequest);
    }
}
