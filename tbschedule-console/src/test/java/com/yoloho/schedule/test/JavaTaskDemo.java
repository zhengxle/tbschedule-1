package com.yoloho.schedule.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yoloho.schedule.interfaces.IStrategyTask;

public class JavaTaskDemo implements IStrategyTask, Runnable {
	protected static transient Logger log = LoggerFactory.getLogger(JavaTaskDemo.class);


    private String parameter;
    private boolean stop = false;
	public void initialTaskParameter(String strategyName,String taskParameter) {
		parameter = taskParameter;
		new Thread(this).start();
	}

	@Override
	public void stop(String strategyName) throws Exception {
		this.stop = true;
	}

	@Override
	public void run() {
		while(stop == false){
			log.error("执行任务："  + this.parameter);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
