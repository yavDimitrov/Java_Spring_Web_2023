package bg.softUni.mobilele.services.role;

import bg.softUni.mobilele.repositories.UserRoleRepository;
import bg.softUni.mobilele.services.init.DataBaseInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService, DataBaseInitService {

    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.userRoleRepository.count() > 0;
    }
}

