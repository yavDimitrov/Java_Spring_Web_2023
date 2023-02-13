package bg.softUni.mobilele.services.init;

import bg.softUni.mobilele.services.role.UserRoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataBaseInitServiceImpl implements DataBaseInitService{

    private final UserRoleService userRoleService;

    @Autowired
    public DataBaseInitServiceImpl(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @PostConstruct
    public void postContruct() {
        dbInit();
    }

    @Override
    public void dbInit() {
        if (isDbInit()) {
            this.userRoleService.dbInit();
        }

    }

    @Override
    public boolean isDbInit() {
        return this.userRoleService.isDbInit();
    }
}
