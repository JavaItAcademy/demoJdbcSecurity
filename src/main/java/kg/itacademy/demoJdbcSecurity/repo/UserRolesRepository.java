package kg.itacademy.demoJdbcSecurity.repo;

import kg.itacademy.demoJdbcSecurity.entity.User;
import kg.itacademy.demoJdbcSecurity.entity.UserRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {
}
