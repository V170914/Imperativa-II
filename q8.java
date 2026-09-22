import java.util.Scanner;
public class q8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] a = new int[10];
int[] b = new int[10];
int[] c = new int[20];
for (int i = 0; i < 10; i++) {
a[i] = sc.nextInt();
}
for (int i = 0; i < 10; i++) {
b[i] = sc.nextInt();
}
for (int i = 0; i < 20; i++) {
if (i % 2 == 0) {
c[i] = a[i / 2];
} else {
c[i] = b[i / 2];
}
}
for (int valor : c) {
System.out.print(valor + " ");
}
sc.close();
}
}
