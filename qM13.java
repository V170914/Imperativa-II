import java.util.Scanner;
public class q13 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] teatro = new int[10][10];
for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
teatro[i][j] = -1;
}
}
int n = sc.nextInt();
for (int compra = 0; compra < n; compra++) {
int fila = sc.nextInt();
int poltrona = sc.nextInt();
// Entrada usa 1 a 10; o vetor usa índices 0 a 9.
fila--;
poltrona--;
if (teatro[fila][poltrona] == -1) {
teatro[fila][poltrona] = 1;
} else {
System.out.println("Poltrona já foi vendida");
}
}
for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
System.out.print(teatro[i][j] + " ");
}
System.out.println();
}
sc.close();
}
}