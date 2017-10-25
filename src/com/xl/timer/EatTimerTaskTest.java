package com.xl.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-14
 * @description 
 * @version 1.0
 */

public class EatTimerTaskTest {
	public static void main(String[] args) {
		TimerTask task = new EatTimerTask();
		Calendar calendar = Calendar.getInstance();
		
		Date firstTime = calendar.getTime();
		//间隔一小时
		long period = 1000 * 60 * 60;
		Timer timer = new Timer();
		timer.schedule(task, firstTime, period);
	}
}

