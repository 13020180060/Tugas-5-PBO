public class itaMasita {
public static void main(String[] args) {
try{
   int data=61/0;
   System.out.println("Hasil : "+data);
}catch(Exception e){
   System.out.println("ERROR");
}finally{
        System.out.println("Akhir Program");
}
}
}