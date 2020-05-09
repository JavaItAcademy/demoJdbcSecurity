package kg.itacademy.demoJdbcSecurity.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "sec_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotNull
    @Column(name = "login", unique = true)
    String login;

    @NotNull
    @Column(name = "password")
    String password;

    @NotNull
    @Column(name = "is_active")
    int isActive;
}
