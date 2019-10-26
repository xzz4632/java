package com.xzz.lang.create;

/**
 * 通过实现Runnable接口创建线程
 * @date 2019年10月26日 上午9:04:36
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
