package Funcionario;

public class Funcionario {

       private String nome;
       private int idade;
       private String cargo;
       private String situacao;

    public Funcionario() {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
    }

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void demitirFuncionario() {
            this.situacao = "INATIVO!";
            System.out.println("Parabens você foi promovido a cliente!");
    }

    public void trocarCargo() {
            this.cargo = "Professor Pleno";
            System.out.println("Parabéns você foi promovido!!");
    }

    public void pagarSalario() {
        if (this.situacao.equalsIgnoreCase("ativo")) {
            System.out.println("Seu salario será depositado.");
        } else {
            System.out.println("Você não trabalha mais na empresa.");
        }
    }

    public void aniversario() {
        this.idade += 1;
        System.out.println("Parabens pelo seu aniversário!");
    }

}

