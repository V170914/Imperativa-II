import java.util.Scanner;
public class qM12 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double[][] a = new double[2][2];
double[][] b = new double[2][2];
for (int i = 0; i < 2; i++)
for (int j = 0; j < 2; j++)
a[i][j] = sc.nextDouble();
for (int i = 0; i < 2; i++)
for (int j = 0; j < 2; j++)
b[i][j] = sc.nextDouble();
int opcao = sc.nextInt();
switch (opcao) {
case 1 -> imprimir(somar(a, b));
case 2 -> imprimir(subtrair(a, b));
case 3 -> {
double constante = sc.nextDouble();
for (int i = 0; i < 2; i++) {
for (int j = 0; j < 2; j++) {
a[i][j] += constante;
b[i][j] += constante;
}
}
System.out.println("Matriz A após adicionar a constante:");
imprimir(a);
System.out.println("Matriz B após adicionar a constante:");
imprimir(b);
}
case 4 -> {
System.out.println("Matriz A:");
imprimir(a);
System.out.println("Matriz B:");
imprimir(b);
}
default -> System.out.println("Opção inválida.");
}
sc.close();
}
static double[][] somar(double[][] a, double[][] b) {
double[][] r = new double[2][2];
for (int i = 0; i < 2; i++)
for (int j = 0; j < 2; j++)
r[i][j] = a[i][j] + b[i][j];
return r;
}
static double[][] subtrair(double[][] a, double[][] b) {
double[][] r = new double[2][2];
for (int i = 0; i < 2; i++)
for (int j = 0; j < 2; j++)
r[i][j] = a[i][j] - b[i][j];
return r;
}
static void imprimir(double[][] m) {
for (double[] linha : m) {
for (double valor : linha) {
System.out.print(valor + " ");
}
System.out.println();
}
}
}