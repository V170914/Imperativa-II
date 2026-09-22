import java.util.Scanner;
public class q3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] v = new int[10];
for (int i = 0; i < v.length; i++) {
v[i] = sc.nextInt();
}
System.out.println("Valores pares:");
for (int valor : v) {
if (valor % 2 == 0) {
System.out.println(valor);
}
}
sc.close();

}
}
