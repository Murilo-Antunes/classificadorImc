package br.com.senai.jandira.ds1t.calculadorimc.model;

import java.util.Scanner;

public class Aluno {
    String nomeDoAluno;
    double altura;
    double peso;
    double resultadoImc;
    String classificacao;

    public void receberDados(){
        System.out.println("*********** Iniciando Programa ***********");
        System.out.println("------------------------------------------");

        Scanner leitor = new Scanner(System.in);

        System.out.print("      Digite o nome do(a) aluno(a): ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("      digite a altura de " + nomeDoAluno + "(m): ");
        altura = leitor.nextDouble();

        System.out.print("      Digite o peso(kg): ");
        peso = leitor.nextDouble();

        System.out.println("------------------------------------------");

        calcularImc();
    }

    public void calcularImc(){
        double alturaAoQuadrado = altura * altura;

        resultadoImc = peso / alturaAoQuadrado;

        classificarImc();
    }

    public void classificarImc(){
        if (resultadoImc <= 18.5){
            classificacao = "abaixo do peso!";
        } else if (resultadoImc <= 24.9) {
            classificacao = "com o peso ideial! :)";
        } else if (resultadoImc <= 29.9){
            classificacao = "levemente acima do peso";
        } else if (resultadoImc <= 34.9) {
            classificacao = "com obesidade grau I";
        } else if (resultadoImc <= 39.9){
            classificacao = "com Obesidade grau II (severa)";
        } else if (resultadoImc >= 40) {
            classificacao = "com obesidade grau III (mórbida)";
        }

        exibirResultados();
    }

    public void exibirResultados(){


        String resultadoImcDuasCasas = String.format("%.2f", resultadoImc);

        System.out.println("O imc de " + nomeDoAluno + " é: " + resultadoImcDuasCasas + " IMC");
        System.out.println("Ele(a) está " + classificacao);
    }
}
