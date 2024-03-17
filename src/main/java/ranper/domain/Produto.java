package ranper.domain;

import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUTO_SEQ")
    @SequenceGenerator(name = "ID", sequenceName = "PRODUTO_SEQ", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", nullable = false, unique = true)
    private String nome;
    @Column(name = "VALOR", nullable = false, unique = true)
    private Long valor;

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

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }
}
