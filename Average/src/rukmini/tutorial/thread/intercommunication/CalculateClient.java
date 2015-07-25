package rukmini.tutorial.thread.intercommunication;

import lambdaExpression.Add;
import lambdaExpression.Calculate;
import lambdaExpression.Multiply;

public class CalculateClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculate calc = new Add();
System.out.println(calc.calc(12, 3));

calc = new Multiply();
System.out.println(calc.calc(12, 3));

calc = (a,b) -> a/b;
System.out.println(calc.calc(12, 3));

	}

}
