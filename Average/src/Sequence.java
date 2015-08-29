
public class Sequence { 


Sequence(String n) { name = n; } 
String name;
public static void main(String[] args) {
Sequence m1 = new Sequence("guitar");
Sequence m2 = new Sequence("tv"); 
System.out.println(m2.equals(m1));
}
public boolean equals(Object o) {
Sequence m = (Sequence) o;
if(m.name != null)
return true;
return false;
}
}
