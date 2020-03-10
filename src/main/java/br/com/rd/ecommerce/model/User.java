package br.com.rd.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id_user;

    @NotNull
    @Column(name = "email_user" , length = 100)
    private String email;

    @NotNull
    @Column(name = "name_user")
    private String fullName;

    @NotNull
    @Column(name = "password_user", length = 45)
    private String password;

    @NotNull
    @Column(name = "cpf_user", length = 11)
    private String cpf;

    @NotNull
    @Column(name = "birthday_user")
    private Date birthDay;
}
