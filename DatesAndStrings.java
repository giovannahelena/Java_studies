import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DatesAndStrings {
			public static void main(String[] args) {
				// Hello, {name}. Today is {day-of-week}. HAVE A NICE DAY! 
				// Locale english = new Locale.Builder().setLanguage("en").setRegion("UK").build();

				String name = "Helena";
				String message = "have a great day!";
				LocalDate today = LocalDate.now();
				LocalDateTime now = LocalDateTime.now();
				if (now.getHour() >= 4 && now.getHour() < 12)
				message = "have a nice day!";
				else if (now.getHour() >= 12 && now.getHour() < 19)
				message = "good afternoon!";
				else if (now.getHour() >= 19 && now.getHour() < 23)
				message = "good evening!";
				else if (now.getHour() >= 23 && now.getHour() < 4)
				message = "good night.";
				System.out.printf("Hello, %s. Today is a %s. %s%n", name, today.getDayOfWeek(), message.toUpperCase());
			}
}