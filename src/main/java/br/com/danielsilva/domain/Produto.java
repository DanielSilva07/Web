package br.com.danielsilva.domain;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator ="produto_sq")
    private Long id;

    @Column(name = "NOME" , length = 50 , nullable = false )
    private String nome;

    @Column(name = "CODIGO" , length = 10 , nullable = false , unique = true)
    private String codigo;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
