package com.xl.timer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimerTask;

/**
 * @author 作者:xl
 * @data   创建时间:2017-6-14
 * @description 使用定时任务实现按时吃饭
 * @version 1.0
 */

public class EatTimerTask extends TimerTask{
	
	//吃饭时间
	private static List<Integer> eatTimes;
	/*静态初始化*/
	static{
		initEatTimes();
	}
	/*初始化吃饭时间*/
	private static void initEatTimes(){
		eatTimes = new ArrayList<Integer>();
		eatTimes.add(9);
		eatTimes.add(15);
		eatTimes.add(18);
	}
	/*执行*/
	@Override
	public void run() {
		Calendar calendar = Calendar.getInstance();
		System.out.println("检查是否到了饭点");
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if (eatTimes.contains(hour)){
			System.out.println("饿了，该吃饭了.....");
		}
	}

}

