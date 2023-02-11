package bg.softUni.mobilele.repositories;

import com.example.springbootintrotest.mobilele.domain.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String> {
}
