package com.xzz.lang.api.thread;

/**
 * Thread��API
 * @date 2019��10��26�� ����9:11:48
 */
public class ThreadApi {

	public static void main(String[] args) {
		MyThread t = new MyThread("myThread");
		// �����߳�
		t.start();
		
		System.out.println("��ǰ�߳��л���߳���" + Thread.activeCount());
	}

}

/**
 * ����һ���߳�
 * @date 2019��10��26�� ����9:15:14
 */
class MyThread extends Thread {
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		while(true) {
			System.out.println(System.currentTimeMillis()/1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}