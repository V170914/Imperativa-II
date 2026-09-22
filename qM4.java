import java.util.Scanner;
public class qM4 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[4][4];
int maior = Integer.MIN_VALUE;
int linhaMaior = 0;
int colunaMaior = 0;
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
m[i][j] = sc.nextInt();
if (m[i][j] > maior) {
maior = m[i][j];
linhaMaior = i;
colunaMaior = j;
}
}
}
System.out.println("Matriz:");
for (int[] linha : m) {
for (int valor : linha) {
System.out.print(valor + " ");
}
System.out.println();
}
System.out.println("Maior valor = " + maior);
System.out.println("Linha = " + linhaMaior);
System.out.println("Coluna = " + colunaMaior);
sc.close();
}
}