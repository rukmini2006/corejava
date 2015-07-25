package rukmini.tutorial.thread;

//import rukmini.tutorial.classes.Employee;

public class FileWriter implements Runnable{
	
	
	@Override
	//public synchronized void run() {
	public  void  run(){
		synchronized(this){
		for(int i = 0;i <5;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("writing " + i  + Thread.currentThread().getName());
		}
	}

}
}

