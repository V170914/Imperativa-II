import java.util.Scanner;
public class qM11 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] alunos = new int[5][4];
int maiorNota = Integer.MIN_VALUE;
int matriculaMaior = 0;
int somaNotas = 0;
for (int i = 0; i < 5; i++) {
alunos[i][0] = sc.nextInt(); // matrícula
alunos[i][1] = sc.nextInt(); // média das provas
alunos[i][2] = sc.nextInt(); // média dos trabalhos
alunos[i][3] = alunos[i][1] + alunos[i][2];
somaNotas += alunos[i][3];
if (alunos[i][3] > maiorNota) {
maiorNota = alunos[i][3];
matriculaMaior = alunos[i][0];
}
}
double mediaFinal = (double) somaNotas / 5;
System.out.println("Matrícula da maior nota: " + matriculaMaior);
System.out.println("Média das notas finais: " + mediaFinal);
sc.close();
}
}