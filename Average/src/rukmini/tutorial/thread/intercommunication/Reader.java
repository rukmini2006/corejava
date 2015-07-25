package rukmini.tutorial.thread.intercommunication;

public class Reader  extends Thread{
	Calculator calc;
	String name;
	public Reader(Calculator calc,String name){
		this.calc = calc;
		this.name = name;
		
	}

	@Override
	public void run() {
		System.out.println(name+"Waiting for the calculation to be completed  ");
		synchronized(calc){
			
			try {
				calc.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(" Final Result is "+name +calc.sum);
	}
}
