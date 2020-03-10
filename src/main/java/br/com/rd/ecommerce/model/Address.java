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
@Table(name = "tb_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private Integer id_address;

    @NotNull
    @Column(name = "address" , length = 100)
    private String address;

    @NotNull
    @Column(name = "number_address" , length = 6)
    private String number;

    @NotNull
    @Column(name = "cep_address", length = 8)
    private String cep ;

    @NotNull
    @Column(name = "city_address", length = 80)
    private String city;

    @NotNull
    @Column(name = "state_address", length = 2)
    private String state;
}
