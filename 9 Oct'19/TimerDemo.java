class TimerDemo extends Thread{

	public static void main(String[] args) {
		TimerDemo thObj = new TimerDemo();
		thObj.start();
	}

	@Override
	public void run(){
		try
		{
			for(int i = 0; i < 1000; i++){
			System.out.print("\r" + i);
			Thread.sleep(1000);
			}
		}
		catch(InterruptedException ex){
			System.out.println(ex);
		}	
	}
}