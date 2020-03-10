package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_order_item")

public class OrderItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @NotNull
    @Column(name = "vl_produto")
    private BigDecimal vlProduto;

    @NotNull
    @Column(name = "vl_frete")
    private BigDecimal vlFrete;


    @NotNull
    @Column(name = "quantidade")
    private Integer quantidade;

    @NotNull
    @Column(name = "cod_produto")
    private Integer codProduto;

    @ManyToOne
    @JoinColumn(name = "order")
    private Order pedido;

}
