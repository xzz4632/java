package com.xzz.lang.api.thread;

/**
 * Thread类API
 * @date 2019年10月26日 上午9:11:48
 */
public class ThreadApi {

	public static void main(String[] args) {
		MyThread t = new MyThread("myThread");
		// 启动线程
		t.start();
		
		System.out.println("当前线程中活动的线程数" + Thread.activeCount());
	}

}

/**
 * 定义一个线程
 * @date 2019年10月26日 上午9:15:14
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