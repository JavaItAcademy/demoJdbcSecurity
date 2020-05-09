package kg.itacademy.demoJdbcSecurity.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "sec_user_roles")
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "role_name", unique = true)
    String roleName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
