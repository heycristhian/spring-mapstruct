package br.com.heycristhian.springmapstruct.controller;

import br.com.heycristhian.springmapstruct.dto.request.UserRequest;
import br.com.heycristhian.springmapstruct.dto.response.UserResponse;
import br.com.heycristhian.springmapstruct.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<UserResponse> getUser(@RequestBody UserRequest userRequest) {
        var response = userService.getUser(userRequest);

        return ResponseEntity.ok(response);
    }
}
