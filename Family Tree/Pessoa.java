import java.util.ArrayList;

public class Pessoa {


    // variaveis

    String nome;
    int idade;
    ArrayList<Pessoa> filhos;
    Pessoa conjuge;

    // get e setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public ArrayList<Pessoa> getFilhos() {
        return filhos;
    }
    public void setFilhos(ArrayList<Pessoa> filhos) {
        this.filhos = filhos;
    }
    public Pessoa getConjuge() {
        return conjuge;
    }
    public void setConjuge(Pessoa conjuge) {
        this.conjuge = conjuge;
    }

    // metodos

    public void addFilho(Pessoa p) {
        filhos.add(p);
    }

    public void addConjuge(Pessoa p) {
        this.conjuge = p;
    }

    public Pessoa(String nome, int idade){
        this.filhos = new ArrayList<Pessoa>();
        this.nome = nome;
        this.idade = idade;
    }

}