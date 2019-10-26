package com.xzz.lang.create;

/**
 * 通过继承Thread类创建线程
 * @date 2019年10月26日 上午9:00:00
 */
public class CreateThreadByThread extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println(System.currentTimeMillis()/1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		CreateThreadByThread thread = new CreateThreadByThread();
		thread.start();
	}
}
