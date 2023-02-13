package bg.softUni.mobilele.services.role;

import bg.softUni.mobilele.domain.dtoS.view.UserRoleViewDto;
import bg.softUni.mobilele.domain.entities.UserRole;
import bg.softUni.mobilele.domain.enums.Role;
import bg.softUni.mobilele.repositories.UserRoleRepository;
import bg.softUni.mobilele.services.init.DataBaseInitService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserRoleServiceImpl implements UserRoleService{

    private final UserRoleRepository userRoleRepository;
    private final ModelMapper moddelMapper;

    @Autowired
    public UserRoleServiceImpl(UserRoleRepository userRoleRepository, ModelMapper moddelMapper) {

        this.userRoleRepository = userRoleRepository;
        this.moddelMapper = moddelMapper;
        this.dbInit();
    }

    @Override
    public void dbInit() {

        if(!isDbInit()){
            List<UserRole> roles = new ArrayList<>();
            roles.add(new UserRole().setRole(Role.USER));
            roles.add(new UserRole().setRole(Role.ADMIN));

            this.userRoleRepository.saveAllAndFlush(roles);
        }
    }

    @Override
    public boolean isDbInit() {
        return this.userRoleRepository.count() > 0;
    }

    
    public List<UserRoleViewDto> getAll(){
        return this.userRoleRepository.findAll()
                .stream()
                .map(r ->this.moddelMapper.map(r, UserRoleViewDto.class)).collect(Collectors.toList());

    }
}
