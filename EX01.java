package fundamentos;
import java.util.Scanner;
public class EX01 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = numero.nextDouble();
		if (resp > 0)
			System.out.println("O numero e positivo");
		else
			System.out.println("O numero e negativo");
	}

}
