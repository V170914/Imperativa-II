import java.util.Scanner;
public class q5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[20];
for (int i = 0; i < v.length; i++) {
v[i] = sc.nextInt();
}
System.out.println("Elementos com conteúdo ímpar:");
for (int valor : v) {
if (valor % 2 != 0) {
System.out.print(valor + " ");
}
}
System.out.println("\nElementos das posições pares:");
for (int i = 0; i < v.length; i += 2) {
System.out.print(v[i] + " ");
}
sc.close();
}
}
