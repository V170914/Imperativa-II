public class qM6 {
public static void main(String[] args) {
long[][] a = new long[10][10];
for (int i = 0; i < 10; i++) {
for (int j = 0; j < 10; j++) {
if (i < j) {
a[i][j] = 2L * i + 7L * j - 2;
} else if (i == j) {
a[i][j] = 3L * i * i - 1;
} else {
a[i][j] = 4L * i * i * i - 5L * j * j + 1;
}
System.out.print(a[i][j] + "\t");
}
System.out.println();
}
}
}