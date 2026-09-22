import java.util.Scanner;
public class qM1 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[4][4];
int quantidade = 0;
for (int i = 0; i < 4; i++) {
for (int j = 0; j < 4; j++) {
m[i][j] = sc.nextInt();
if (m[i][j] > 10) quantidade++;
}
}
System.out.println("Quantidade maior que 10 = " + quantidade);
sc.close();
}
}