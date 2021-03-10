package exercicio04;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {

		int i = 0;

		while (i < 20) {
			System.out.println("Valor i: " + i);
			i++;
		}
		
		System.out.println("--------------------------------");
		
		int k = 0;
		do {
			System.out.println("Valor k: " + k);
			k ++;
		} while (k < 20);

		
		
		System.out.println("---------------------------------");
		
		
		for (int j =0; j <20; j++) {
			System.out.println("Valor j: " + j);
		}
		
	}

}