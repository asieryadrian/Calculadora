import java.util.Scanner;

/**
 * 
 */

/**
 * @author usuario
 *
 */
public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		int opc,num1 = 0,num2 = 0,result;
		System.out.println("Introduce dos numeros por favor:");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		
		System.out.println("Selecciona una opci�n por favor:");
		
		
		System.out.println("OPCIONES:");
		System.out.println("Opci�n 1 = Suma");
		System.out.println("Opci�n 2 = Resta");
		System.out.println("Opci�n 3 = Multiplicaci�n");
		System.out.println("Opci�n 4 = Divisi�n");
		opc = teclado.nextInt();
		
		if (opc == 1) {
			
		}
		if (opc == 2) {
			result = num1 - num2;
			System.out.println(result);
		}
		if (opc == 3) {
			
		}
		if (opc == 4) {
			
		}
		
	}

}
