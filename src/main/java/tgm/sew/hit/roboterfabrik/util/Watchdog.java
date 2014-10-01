package tgm.sew.hit.roboterfabrik.util;

import tgm.sew.hit.roboterfabrik.mitarbeiter.Mitarbeiter;

public class Watchdog implements Runnable {

	private int zeit;
	private Mitarbeiter[] threads;
	
	public Watchdog(int zeit, Mitarbeiter[] threads){
		this.zeit =zeit;
		this.threads = threads;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(zeit);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threads[1].setGo(false);
	}

	public int getZeit(){
		return this.zeit;
	}
	
	public Mitarbeiter[] getThreads(){
		return this.threads;
	}
}
