import java.util.Scanner;
public class q12 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[10];
int preenchidos = 0;
while (preenchidos < 10) {
int numero = sc.nextInt();
boolean repetido = false;
for (int i = 0; i < preenchidos; i++) {
if (v[i] == numero) {
repetido = true;
break;
}
}
if (repetido) {
System.out.println("Número já digitado. Digite outro:");
} else {
v[preenchidos] = numero;
preenchidos++;
}
}
System.out.println("Vetor final:");
for (int valor : v) {
System.out.print(valor + " ");
}
sc.close();
}
}