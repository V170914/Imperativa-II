import java.util.Scanner;
public class qM14 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
for (int aluno = 0; aluno < n; aluno++) {
String nome = sc.nextLine();
int faltas = 0;
StringBuilder dias = new StringBuilder();
for (int dia = 1; dia <= 30; dia++) {
String presenca = sc.nextLine();
if (presenca.equals("F")) {
faltas++;
dias.append(dia).append(" ");
}
}
if (faltas > 10) {
System.out.println(nome + " - dias: " + dias);
}
}
sc.close();
}
}