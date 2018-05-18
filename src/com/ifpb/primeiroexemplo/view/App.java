package com.ifpb.primeiroexemplo.view;

import com.ifpb.primeiroexemplo.model.Endereco;
import com.ifpb.primeiroexemplo.model.Pessoa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("dd/MM/yyyy");

        System.out.println("Informe o CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe o RG:");
        String rg = scanner.nextLine();

        System.out.println("Informe a data de nascimento:");
        String data = scanner.nextLine();
        LocalDate nascimento = LocalDate.parse(data, formatter);

        System.out.println("Informe a rua: ");
        String rua = scanner.nextLine();

        System.out.println("Informe a cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("Informe o número: ");
        int numero = scanner.nextInt();

        Pessoa pessoa = new Pessoa(cpf, rg, nome, nascimento,
                new Endereco(rua,cidade,numero));

    }

}
