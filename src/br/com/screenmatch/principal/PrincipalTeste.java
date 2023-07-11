package br.com.screenmatch.principal;

import java.time.Duration;

public class PrincipalTeste {
    public static void main(String[] args) {

        System.out.println(Duration.ofMinutes(5380).toHours());
        System.out.println(5380 % 60);
        System.out.println(Duration.ofMinutes(5380).toString());
//        System.out.println(Duration.ofMinutes(5380).get(TemporalUnit.));


        var segundos = Duration.ofMinutes(65).toSeconds();
        var horas = Duration.ofSeconds(segundos).toHours();
        var minutos = Duration.ofSeconds(segundos).toMinutes() % 60;
        var teste = minutos % 60;
        System.out.println("##############");
        System.out.println(horas + " : " + minutos + " : " + segundos);
        System.out.println(teste);

        segundos = Duration.ofSeconds(65).toSecondsPart();
        minutos = Duration.ofSeconds(segundos).toMinutes();
//        segundos = minutos / 60;
        System.out.println(segundos+ " : " +minutos);


        var minutosTotal = Duration.ofMinutes(5385);
        var Horas = minutosTotal.toHours();
        var Minutos = minutosTotal.toMinutesPart();
        var Segundos = minutosTotal.toSecondsPart();

        System.out.println(Horas+  " : " +Minutos+ " : " +Segundos);

//        Estudar Localtime como formatar os campos.

    }
}
