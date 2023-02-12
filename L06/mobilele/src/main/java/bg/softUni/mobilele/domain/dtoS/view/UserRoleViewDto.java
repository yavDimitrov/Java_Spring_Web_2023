package bg.softUni.mobilele.domain.dtoS.view;

import bg.softUni.mobilele.domain.enums.Role;

public class UserRoleViewDto {

    private Role role;

    public Role getRole() {
        return role;
    }

    public UserRoleViewDto setRole(Role role) {
        this.role = role;
        return this;
    }
}
