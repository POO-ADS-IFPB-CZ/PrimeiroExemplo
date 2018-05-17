package com.ifpb.primeiroexemplo.view;

import com.ifpb.primeiroexemplo.model.Pessoa;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("111.111.111-01",
                "123456", "João",
                LocalDate.of(1990, Month.FEBRUARY, 28));

        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("dd/MM/yyyy");

        System.out.println(pessoa.getNascimento()
                .format(formatter));


    }

}
