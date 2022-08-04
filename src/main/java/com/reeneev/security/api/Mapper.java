package com.reeneev.security.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.reeneev.security.dto.UserDTO;
import com.reeneev.security.dto.UserCreationDTO;
import com.reeneev.security.model.Role;
import com.reeneev.security.model.User;

import static java.util.stream.Collectors.toList;

@Component
public class Mapper {
    public UserDTO toDto(User user) {
        String name = user.getName();
        List<String> roles = user
                .getRoles()
                .stream()
                .map(Role::getName)
                .collect(toList());

        return new UserDTO(name, roles);
    }

    public User toUser(UserCreationDTO userDTO) {
        return new User(userDTO.getName(), userDTO.getPassword(), new ArrayList<>());
    }
}
