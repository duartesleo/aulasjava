package com.mycompany.aprendendojava;

import java.util.Arrays;
import java.util.Scanner;

public class Aprendendojava {

    public static String[] cadastroUser() {
        Scanner t = new Scanner(System.in);
        String dados[] = new String[3];
        int op = 0;

        System.out.println("Informe o nome completo:");
        dados[0] = t.nextLine();
        System.out.println("Seu celular:");
        dados[1] = t.nextLine();
        while (op != 1) {
            System.out.println("Informe seu cpf");
            dados[2] = t.nextLine();

            if (dados[2].length() == 11) {
                op = 1;
            } else {
                System.out.println("Infomre um cpf valido, informe um cpf valido");
            }

        }

        return dados;
    }

    public static int verificadoPosicao(String[] nomes) {

        for (int i = 0; i < nomes.length; i++) {

            if (nomes[i] == null) {
                return i;
            }
        }

        return 15;
    }

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);
        String nome[] = new String[10];
        float valor[] = new float[10];
        String cel[] = new String[10];
        String cpf[] = new String[10];
        int op = 0, posicao = 0;
        String dados[] = new String[2];

        while (op != 5) {

            System.out.println("Escolha uma das opção:");
            System.out.println("1 - Cadastrar um novo usuario");
            op = t.nextInt();

            switch (op) {
                case 1 -> {

                    posicao = verificadoPosicao(nome);
                    if (posicao == 15) {
                        System.out.println("Informamos que não temos mais vagas para novos cadastros...");
                    } else {
                        dados = cadastroUser();
                        nome[posicao] = dados[0];
                        cel[posicao] = dados[1];
                        cpf[posicao] = dados[2];
                        valor[posicao] = 0;
                        System.out.println("Nova conta criada com sucesso");
                        System.out.println("Nome: " + nome[posicao]);
                        System.out.println("Celular: " + cel[posicao]);
                        System.out.println("CPF: " + cpf[posicao]);
                        System.out.println("saldo: " + valor[posicao]);
                    }
                    break;
                }
                case 2 -> {
                }
                case 3 -> {
                }

                case 4 -> {
                }
            }
        }
    }
}
