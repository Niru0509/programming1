package homework;
import java.util.Scanner;
public class QuadraticEquation1 {
			private int a;
			private int b;
			private int c;
			QuadraticEquation1() {
				a = 0;
				b = 0;
				c = 0;
			}
			QuadraticEquation1(int newA, int newB, int newC) {
				a = newA;
				b = newB;
				c = newC;
			}
			public int getA() {
				return a;
			}

			public int getB() {
				return b;
			}

			public int getC() {
				return c;
			}
			public double getDiscriminant() {
				return (Math.pow(b, 2) - 4 * a * c);
			}

			public double getRoot1() {
				return (((-b) + (Math.sqrt(getDiscriminant())))/ (2 * a));
			}

			public double getRoot2() {
				return (((-b) - (Math.sqrt(getDiscriminant()))) / (2 * a));
			}

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter coefficients a, b, and c in order: ");

				int a = input.nextInt();
				int b = input.nextInt();
				int c = input.nextInt();

				QuadraticEquation1 qua = new QuadraticEquation1(a, b, c);
				if (qua.getDiscriminant() > 0) {
					System.out.println("The roots of the equation are " + qua.getRoot1()
							+ " and " + qua.getRoot2());
				} else {
					System.out.println("The equation has no roots.");
					input.close();
				}
			}}
		