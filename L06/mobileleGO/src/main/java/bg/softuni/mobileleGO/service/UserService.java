package bg.softuni.mobileleGO.service;

import bg.softuni.mobileleGO.model.dto.UserLoginDTO;
import bg.softuni.mobileleGO.model.entity.UserEntity;
import bg.softuni.mobileleGO.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    public boolean login(UserLoginDTO loginDTO) {
        Optional <UserEntity> userOpt = userRepository.findByEmail(loginDTO.getUsername());

        if(userOpt.isEmpty()){
            LOGGER.info("User with name [{}] not found.", loginDTO.getUsername());
            return false;
        }

        return userOpt.get().getPassword().equals(loginDTO.getPassword());
    }
}
