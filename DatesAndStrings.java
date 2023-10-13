import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DatesAndStrings {
			public static void main(String[] args) {
				// Hello, {name}. Today is {day-of-week}. HAVE A NICE DAY! 

				String name = "Helena";
				LocalDate today = LocalDate.now();
				Locale spanish = new Locale.Builder().setLanguage("es").setRegion("AR").build();
				System.out.println("Hello, " + name + ". Today is a " + today.getDayOfWeek().getDisplayName(TextStyle.FULL, spanish)
				+ ".");
			}
}