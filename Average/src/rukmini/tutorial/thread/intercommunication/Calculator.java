package rukmini.tutorial.thread.intercommunication;

public class Calculator  extends Thread{
	public int sum;
@Override
public void run() {
	synchronized(this){
		for(int i=0;i<5;i++)
			sum = sum+i;
	}
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	notifyAll();
}
}
