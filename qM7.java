import java.util.Scanner;
public class q7 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] m = new int[3][3];
int acima = 0;
int abaixo = 0;
int principal = 0;
int secundaria = 0;
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
m[i][j] = sc.nextInt();
if (i < j) acima += m[i][j];
if (i > j) abaixo += m[i][j];
if (i == j) principal += m[i][j];
if (i + j == 2) secundaria += m[i][j];
}
}
System.out.println("Acima da principal = " + acima);
System.out.println("Abaixo da principal = " + abaixo);
System.out.println("Diagonal principal = " + principal);
System.out.println("Diagonal secundária = " + secundaria);
sc.close();
}
}