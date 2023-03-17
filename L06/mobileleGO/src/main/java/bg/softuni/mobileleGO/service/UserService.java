package bg.softuni.mobileleGO.service;

import bg.softuni.mobileleGO.User.CurrentUser;
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
    private CurrentUser currentUser;

    public UserService(UserRepository userRepository, CurrentUser currentUser){
        this.userRepository = userRepository;
        this.currentUser = currentUser;
    }

    public boolean login(UserLoginDTO loginDTO) {
        Optional <UserEntity> userOpt = userRepository.findByEmail(loginDTO.getUsername());

        if(userOpt.isEmpty()){
            LOGGER.info("User with not found. User name: {} ", loginDTO.getUsername());
            return false;
        }

        boolean success = userOpt.get().getPassword().equals(loginDTO.getPassword());

        if(success) {
            login(userOpt.get());
        } else {
             logout();
        }

        return success;
    }

    private void login(UserEntity userEntity) {
        currentUser.setLoggedIn(true).
                setName(userEntity.getFirstName() + " " + userEntity.getLastName());
    }
        private void logout(){
            currentUser.clear();
        }
}
