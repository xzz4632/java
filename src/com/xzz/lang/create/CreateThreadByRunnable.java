package com.xzz.lang.create;

/**
 * ͨ��ʵ��Runnable�ӿڴ����߳�
 * @date 2019��10��26�� ����9:04:36
 */
public class CreateThreadByRunnable implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println(System.currentTimeMillis()/1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Thread(new CreateThreadByRunnable()).start();
	}

}
