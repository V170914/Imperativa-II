import java.util.Scanner;
public class q10 {
static boolean contem(int[] vetor, int tamanho, int valor) {
for (int i = 0; i < tamanho; i++) {
if (vetor[i] == valor) return true;
}
return false;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] x = new int[5];
int[] y = new int[5];
for (int i = 0; i < 5; i++) x[i] = sc.nextInt();
for (int i = 0; i < 5; i++) y[i] = sc.nextInt();
System.out.println("a) Soma:");
for (int i = 0; i < 5; i++)
System.out.print((x[i] + y[i]) + " ");
System.out.println("\nb) Produto:");
for (int i = 0; i < 5; i++)
System.out.print((x[i] * y[i]) + " ");
System.out.println("\nc) Diferença (x - y):");
for (int valor : x)
if (!contem(y, 5, valor))
System.out.print(valor + " ");
System.out.println("\nd) Interseção:");
for (int valor : x)
if (contem(y, 5, valor))
System.out.print(valor + " ");
System.out.println("\ne) União:");
for (int valor : x)
System.out.print(valor + " ");
for (int valor : y)
if (!contem(x, 5, valor))
System.out.print(valor + " ");
sc.close();
}
}