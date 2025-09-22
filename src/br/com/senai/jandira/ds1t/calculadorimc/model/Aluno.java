package br.com.senai.jandira.ds1t.calculadorimc.model;

import java.util.Scanner;

public class Aluno {
    String nomeDoAluno;
    double altura;
    double peso;
    double resultadoImc;
    String classificacao;

    public void receberDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("digite a altura do " + nomeDoAluno + "(m): ");
        altura = leitor.nextDouble();

        System.out.print("Digite o peso(kg): ");
        peso = leitor.nextDouble();
    }

    public void calcularImc(){
        double alturaAoQuadrado = altura * altura;

        resultadoImc = peso / alturaAoQuadrado;
    }

    public void classificarImc(){
        if (resultadoImc <= 18.5){
            classificacao = "abaixo do peso!";
        } else if (resultadoImc <= 24.9) {
            classificacao = "com o peso ideial! :)";
        } else if (resultadoImc <= 29.9){
            classificacao = "levemente acima do peso";
        } else if (resultadoImc <= 34.9) {
            classificacao = "besidade grau I";
        } else if (resultadoImc <= 39.9){
            classificacao = "Obesidade grau II (severa)";
        } else if (resultadoImc >= 40) {
            classificacao = "obesidade grau III (mórbida)";
        }
    }

    public void exibirResultados(){
        System.out.println(nomeDoAluno + "Seu imc é: " + resultadoImc);
        System.out.println("você está: " + classificacao);
    }
}
