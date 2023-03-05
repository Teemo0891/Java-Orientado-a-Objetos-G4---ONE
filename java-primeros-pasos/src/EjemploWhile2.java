
public class EjemploWhile2 {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;

		while (contador <= 10) {
			total = total + contador;
			// System.out.println(contador);

			contador += 1;
		}
		System.out.println(total);
	}
}
