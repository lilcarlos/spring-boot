package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_order")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_order;

    @NotNull
    @Column(name = "dt_order")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtOrder;

    @NotNull
    @Column(name = " id_cliente")
    private Integer idCliente;

    @NotNull
    @Column(name = "vl_pedido")
    private BigDecimal vlPedido;

    @NotNull
    @Column(name = "vl_frete")
    private BigDecimal vlFrete;

    @NotNull
    @Column(name = "ds_forma_pgto")
    private String dsFormaPagto;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;


}
