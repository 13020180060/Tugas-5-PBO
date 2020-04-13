import java.util.Scanner;

public class penjumlahan{
public static void main(String[]args){

Scanner data=new Scanner(System.in);
int n,hasil=0;
System.out.print("Masukkan banyak data =  ");
n=data.nextInt();

System.out.print("Masukkan nilai=");
for(int a=0;a<n;a++){
hasil=hasil + data.nextInt();
}
System.out.println("Jumlah array nilai "+hasil);
}
}