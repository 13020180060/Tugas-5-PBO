import java.util.*;

public class Masyta{ 
public static void main(String args[]){ 
Vector<String> vec = new Vector<String>(); 
vec.add("Ita"); 
vec.add("Masita"); 
vec.add("Nurdin"); 

vec.insertElementAt("Program",0); 
vec.insertElementAt("Berorientasi",2); 
vec.insertElementAt("Objek",3);

Enumeration a = vec.elements(); 
while (a.hasMoreElements())
System.out.print(a.nextElement()+" "); 
System.out.println();
vec.remove("Berorientasi"); 
for(int i = 0; i < vec.size(); ++i) 
	System.out.print(vec.elementAt(i) + " "); 
	System.out.println();
	System.out.println(vec.contains("Masita")? "\nada":"\ntidak ada"); 
	System.out.println(vec.toString()); 
	System.out.println(vec.isEmpty()? "Kosong":"Tidak Kosong");
}
}