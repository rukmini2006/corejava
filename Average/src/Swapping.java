
public class Swapping {

	static void swap(int i,int j){
		int temp=i;
		i=j;
		j=temp;
		System.out.println("After swapping  i = "+i + "  j = "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=3;
int j=4;
System.out.println("before swapping i= " +i  +   "   j  =" +j);
swap(i,j);
	}

}
