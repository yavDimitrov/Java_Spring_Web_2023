package bg.softUni.mobilele.services.role;

import bg.softUni.mobilele.domain.dtoS.view.UserRoleViewDto;
import bg.softUni.mobilele.services.init.DataBaseInitService;

import java.util.List;

public interface UserRoleService extends DataBaseInitService {
     List<UserRoleViewDto> getAll();

}