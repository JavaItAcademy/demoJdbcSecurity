package kg.itacademy.demoJdbcSecurity.repo;

import kg.itacademy.demoJdbcSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}