package br.com.patroclos.secao22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javafx.stage.PopupWindow.AnchorLocation;

//Data

/*



 
 
 * */
public class Programa82 {
	
	public static void main(String[] args) {
		
		
		LocalDate data = LocalDate.now();
		
		System.out.println(data); // Formato ISO (internacional)
		
		LocalDate ano_novo = LocalDate.of(2019, Month.JANUARY, 1);
		
		System.out.println(ano_novo);
		
		int ano = ano_novo.getYear();
		
		System.out.println(ano);
		
		Month mes = ano_novo.getMonth();
		
		int dia = ano_novo.getDayOfYear();
		
		System.out.println("O ano novo será em " + dia + " de " + mes + " de " + ano);
		
		Period periodo = Period.between(data, ano_novo);
		System.out.println(periodo);
		 
		System.out.println("Faltam " + periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias para o ano novo");
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(data.format(formatador));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora); //Formato ISO internacional
		
		DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(agora.format(formatador_horas)); 
		
		LocalTime intervalo = LocalTime.of(9, 30);
		System.out.println(intervalo);
		
		
		
		//Estudar bliblioteca JavaFx Aplicação Desktop
		
		//Estudar SpringBoot...Serviços
		
	}
}
