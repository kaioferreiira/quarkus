package curso.projeto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
  private Long id;

  @NotEmpty(message = "CAMPO VAZIO")
  private String nome;

  private String sobreNome;

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

  public String getSobreNome() {
    return sobreNome;
  }

  public void setSobreNome(String sobreNome) {
    this.sobreNome = sobreNome;
  }

}
