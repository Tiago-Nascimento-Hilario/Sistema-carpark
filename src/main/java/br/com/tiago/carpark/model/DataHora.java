package br.com.tiago.carpark.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DataHora {


    public static void main(String[] args) {
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);

        DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String dataFormatada = data.format(agora);

        System.out.println(dataFormatada);
        
    }
}
