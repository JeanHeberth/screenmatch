package br.com.screenmatch;

public class Produto {

   private String nome;
   private Long codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Produto { " +
                "nome='" + this.getNome() + '\'' +
                ", codigo=" + this.getCodigo() +
                '}';
    }
}
