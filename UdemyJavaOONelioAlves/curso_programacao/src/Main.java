import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.println("Ol� Mundo!!");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("O valor de 'y' �: "+ y);
		System.out.println("O valor de 'x' �: "+ x);
		
		System.out.printf("O valor de 'x' �: %.2f%n",x);
		System.out.printf("O valor de 'x' �: %.4f%n",x);
		
	
		Locale.setDefault(Locale.US);
		System.out.printf("O valor de 'x' �: %.2f%n",x);
		System.out.printf("O valor de 'x' �: %.4f%n",x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		
	}
}
