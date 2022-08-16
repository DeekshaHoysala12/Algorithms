import java.util.Arrays;
import java.util.Scanner;
public class ShellSort {
static int array[]=new int[100];
void shellSort(int n) {
for (int interval = n / 2; interval > 0; interval /= 2) {
for (int i = interval; i < n; i += 1) {
int temp = array[i];
int j;
for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
array[j] = array[j - interval];
}
array[j] = temp;
}
}

}
public static void main(String args[]) {
System.out.println("Enter the number of elements ");
Scanner scan=new Scanner(System.in);
int size = scan.nextInt();
System.out.println("Enter the array elements ");
for(int i=0;i<size;i++) {
array[i]=scan.nextInt();
}
ShellSort ss = new ShellSort();
ss.shellSort(size);
System.out.println("Sorted Array in Ascending Order: ");
for(int j=0;j<size;j++) {
System.out.print(array[j]+" ");
}
}
}
