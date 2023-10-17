public class Arrays {
	public static void main(String[] args) {
		// for (int i = 0; i <= 4; i++)
		// {
		// 	numbers[i] = i+1;
		// 	System.out.println(numbers[i]);
		// }

		int[] numbers = {10, 20, 3, 35, 21};
		int maior = numbers[0];
		int menor = numbers[0];
		float media = numbers[0];
		int i = 1;

		while(i < numbers.length)
		{
			if (numbers[i] > maior){
				maior = numbers[i];
			}
			i++;
		}
		System.out.println("Maior número do Array: " + maior);

		i = 1;
		while(i < numbers.length)
		{
			if (numbers[i] < menor){
				menor = numbers[i];
			}
			i++;
		}
		System.out.println("Menor número do Array: " + menor);

		i = 1;
		while(i < numbers.length)
		{
				media += numbers[i];
				i++;
		}
		media /= numbers.length;
		System.out.println("Média do Array: " + (float)media);
	}
}