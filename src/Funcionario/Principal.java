package Funcionario;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Antonio");
        funcionario1.setIdade(33);
        funcionario1.setCargo("estagiário");
        funcionario1.setSituacao("Ativo");

        Funcionario funcionario2  = new Funcionario();

        funcionario2.setNome("Renato");
        funcionario2.setIdade(18);
        funcionario2.setCargo("professor");
        funcionario2.setSituacao("Ativo");

        Funcionario funcionario3  = new Funcionario();

        funcionario3.setNome("Tatiana");
        funcionario3.setIdade(30);
        funcionario3.setCargo("Patroa");
        funcionario3.setSituacao("Ativo");

        Funcionario funcionario4  = new Funcionario();

        funcionario4.setNome("Rubens");
        funcionario4.setIdade(45);
        funcionario4.setCargo("Gerente");
        funcionario4.setSituacao("Ativo");

        /*
        - Você deve instanciar 4 funcionários
        - demitir o funcionário 1
        - promover o funcionário 2
        - "aniversariar" o funcionário 3
        - pagar salário do funcionário 4
        */

        funcionario1.demitirFuncionario();
        JOptionPane.showMessageDialog(null, "Olá " + funcionario1.getNome() + ", você tem uma nova situação na empresa: " + funcionario1.getSituacao());

        funcionario2.trocarCargo();
        JOptionPane.showMessageDialog(null,"Parabens " + funcionario2.getNome() + " você foi promovido para: " + funcionario2.getCargo());

        funcionario3.aniversario();
        JOptionPane.showMessageDialog(null,"Parabens " + funcionario3.getNome() + "! Você esta fazendo " + funcionario3.getIdade() + " anos!");

        funcionario4.pagarSalario();
        JOptionPane.showMessageDialog(null,funcionario4.getNome() + " seu salário será depositado.");


    }
}
