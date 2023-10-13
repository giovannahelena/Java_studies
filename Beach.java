public class Beach {
	public static void main(String[] args) {
		boolean	isItSunny;
		boolean	isItWeekend;
		boolean	letsGoToTheBeach;

		isItSunny = false;
		isItWeekend = true;
		letsGoToTheBeach = isItSunny && isItWeekend;

		if(letsGoToTheBeach)
			System.out.println("Let's go to the beach! :D");
		else
			System.out.println("Not going to the beach today.");
	}
}