package it.danieltrosko.gastro.mapper;

import it.danieltrosko.gastro.dto.UserDTO;
import it.danieltrosko.gastro.model.entities.User;

public class UserMapper {


    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());
        user.setFirstName(userDTO.getFirstName());
        user.setSecondName(userDTO.getSecondName());
        user.setBalance(userDTO.getBalance());
        return user;
    }

    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setSecondName(user.getSecondName());
        userDTO.setBalance(user.getBalance());
        return userDTO;
    }
}
