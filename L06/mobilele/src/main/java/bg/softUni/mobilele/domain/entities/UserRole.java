package bg.softUni.mobilele.domain.entities;

import bg.softUni.mobilele.domain.enums.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity{
                                    //id – uuid or number.

            @Enumerated(EnumType.STRING)
           private Role role;       // –  enumerated value.

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }

}
