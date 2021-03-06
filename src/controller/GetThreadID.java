package controller;

public class GetThreadID extends Thread {
	
	private int id;

	public GetThreadID (int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("IdThread: "+id);
	}
}
