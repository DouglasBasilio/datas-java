package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendar {

	public static void main(String[] args) {

		// somando uma unidade de tempo
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		
		// inicio a instância do Calendar
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d); // calendário com a data instânciada dentro dele
		cal.add(Calendar.HOUR_OF_DAY, 4); // adicionar 4 horas no dia
		cal.add(Calendar.DAY_OF_MONTH, 3); // adicionar 3 dias no mês
		
		// atualizar a variável com a nova data
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		System.out.println("----------------");
		
		// obtendo uma unidade de tempo
		
		Date d1 = Date.from(Instant.parse("2020-12-30T10:35:26Z"));
		System.out.println(sdf.format(d1));
		
		Calendar cal1 = Calendar.getInstance();
		
		cal1.setTime(d1);
		int minutes = cal1.get(Calendar.MINUTE);
		
		int month = 1 + cal1.get(Calendar.MONTH); 
		// no Calendar o mês começa com 0, por isso somo + 1
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
