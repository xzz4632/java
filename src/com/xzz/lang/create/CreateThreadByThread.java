package com.xzz.lang.create;

/**
 * ͨ���̳�Thread�ഴ���߳�
 * @date 2019��10��26�� ����9:00:00
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
