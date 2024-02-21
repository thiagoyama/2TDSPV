package br.com.fiap.revisao.view;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DatasTeste {

    public static void main(String[] args) {
        //Obtem a data de hoje
        Calendar hoje = Calendar.getInstance();
        //Aniversario de SP
        Calendar aniversario = new GregorianCalendar(1910, Calendar.JANUARY, 25);
        //Formatador de data
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        //Exibir as datas
        System.out.println(format.format(hoje.getTime()));
        System.out.println(format.format(aniversario.getTime()));

        //Criar datas com a nova API
        //Criar a data 22/02/2002
        
        //Criar a hora 2:22:20

        //Criar a data e hora 22/02/2002 2:22:20

        //Exibir as datas

    }
}
