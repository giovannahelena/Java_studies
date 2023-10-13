public class Beach2 {
	public static void main(String[] args) {
		boolean	isItSunny;
		boolean	isItWeekend;
		boolean	letsGoToTheBeach;
		String	result;

		isItSunny = true;
		isItWeekend = true;
		letsGoToTheBeach = isItSunny && isItWeekend;
		result = letsGoToTheBeach ? "Let's go to the beach! :D" : "Not going to the beach today.";
		System.out.println(result);
	}
}