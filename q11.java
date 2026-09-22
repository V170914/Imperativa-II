import java.util.Scanner;
public class q11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double[] v = new double[10];
double soma = 0;
for (int i = 0; i < 10; i++) {
v[i] = sc.nextDouble();
soma += v[i];
}
double media = soma / 10;
double somaQuadrados = 0;
for (double valor : v) {
somaQuadrados += Math.pow(valor - media, 2);
}
double desvio = Math.sqrt(somaQuadrados / 10);
System.out.println("Média = " + media);
System.out.println("Desvio padrão = " + desvio);
sc.close();
}
}