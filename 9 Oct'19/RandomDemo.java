class RandomDemo extends Thread{

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++){
			RandomDemo obj = new RandomDemo();
			obj.setName(Integer.toString(i));
			obj.start();
		}
	}

	@Override
	public void run(){
		System.out.print(Thread.currentThread().getName() + " ");
	}
}