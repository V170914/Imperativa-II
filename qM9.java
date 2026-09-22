import java.util.Random;
public class qM9 {
public static void main(String[] args) {
Random random = new Random();
int[][] cartela = new int[5][5];
int quantidade = 0;
while (quantidade < 25) {
int numero = random.nextInt(100);
boolean repetido = false;
for (int i = 0; i < 5; i++) {
for (int j = 0; j < 5; j++) {
if (cartela[i][j] == numero && (i * 5 + j) < quantidade) {
repetido = true;
}
}
}
if (!repetido) {
cartela[quantidade / 5][quantidade % 5] = numero;
quantidade++;
}
}
for (int[] linha : cartela) {
for (int valor : linha) {
System.out.printf("%2d ", valor);
}
System.out.println();
}
}
}