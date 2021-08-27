package triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		int a, b, c;
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a primeira medida: ");
		a = leitor.nextInt();

		System.out.print("Digite a segunda medida: ");
		b = leitor.nextInt();

		System.out.print("Digite a terceira medida: ");
		c = leitor.nextInt();

		leitor.close();

		if (a + b < c && c + b < a && c + a < b) {
			System.out.println("Não é um triângulo");
		} else if (a == b && a == c && b == c) {
			System.out.println("É um triângulo equilátero");
		} else if (a != b && a != c && c != b) {
			System.out.println("É um triângulo escaleno");
		} else {
			System.out.println("É um triângulo isósceles");

		}

	}
}