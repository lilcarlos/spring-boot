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
@Table(name = "tb_product")

public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codProduto;

    @NotNull
    @Column(name = "ds_produto")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "cd_category")
    private Category category;

    @NotNull
    @Column(name = "vl_produto")
    private BigDecimal vlProduto;


}
