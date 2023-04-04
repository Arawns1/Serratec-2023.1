package Contas;

public class teste implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread(new teste());
		t.start();
	}

	@Override
	public void run() {
		System.out.println("thread is running...");
		
	}

}
