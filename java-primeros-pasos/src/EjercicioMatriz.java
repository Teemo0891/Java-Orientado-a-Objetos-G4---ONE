import java.util.concurrent.ConcurrentHashMap;

public class EjercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int fila = 0; fila <=10; fila++) {
			for(int columna = 0; columna < fila; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
