public class q9 {
public static void main(String[] args) {
int[] v = new int[100];
int quantidade = 0;
int numero = 0;
while (quantidade < 100) {
if (numero % 7 != 0 || numero % 10 == 7) {
v[quantidade] = numero;
quantidade++;
}
numero++;
}
for (int valor : v) {
System.out.print(valor + " ");
}
}
}