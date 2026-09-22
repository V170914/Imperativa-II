import java.util.Random;
public class q8 {
public static void main(String[] args) {
Random random = new Random();
int[][] original = new int[4][4];
int[][] triangular = new int[4][4];
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
original[i][j] = random.nextInt(20) + 1;
triangular[i][j] = original[i][j];
if (j > i) {
triangular[i][j] = 0;
}
}
}
System.out.println("Matriz original:");
imprimir(original);
System.out.println("Matriz triangular inferior:");
imprimir(triangular);
}
static void imprimir(int[][] m) {
for (int[] linha : m) {
for (int valor : linha) {
System.out.print(valor + " ");
}
System.out.println();
}
}
}