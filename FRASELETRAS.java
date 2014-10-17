//MISMA LINEA!!
/**
 * paquetes importados MODIFICACION!!!OOO.
* */
import java.util.Scanner;

// COMENTARIO PROJECTE 1
/**
 * paquetes importados.
 **/
import java.util.ArrayList;
/**
 * @author raquel .
 *
 */
public class FRASELETRAS {
/**
 * @param args
 */
public static void main(final String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		ArrayList<Character> letras = new ArrayList<Character>();
		String frase = lector.nextLine();
		letras.add(frase.charAt(0));
		boolean encontrada;
		for (int i = 1; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			encontrada = false;
			for (int j = 0; j < letras.size(); j++) {
				if (letra == letras.get(j)) {
					encontrada = true;
				}
			}
			if (encontrada != true) {
				letras.add(letra);
			}
		}
		int [] repeticiones = new int[letras.size()];
		for (int i = 0; i < letras.size(); i++) {
			for (int j = 0; j < frase.length(); j++) {
				if (letras.get(i) == frase.charAt(j)) {
					repeticiones[i]++;
				}
			}
System.out.println("La letra " + letras.get(i)
+ " sale " + repeticiones[i] + " veces.");
			}
	}
}

