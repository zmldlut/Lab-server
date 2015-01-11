package com.zml.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeUtil {
	public static Date getOderTime(int i) {
		Date datetime = new Date();
	    Calendar calendar = new GregorianCalendar(); 
	    calendar.setTime(datetime); 
	    calendar.add(calendar.DATE, i / 3 + 1);//��������������һ��.����������,������ǰ�ƶ� 
	    datetime=calendar.getTime();   //���ʱ���������������һ��Ľ��
	    switch(i) {
	    case 1:
	    case 4:
	    	datetime.setHours(9);
	    	datetime.setMinutes(0);
	    	datetime.setSeconds(0);
	    	break;
	    case 2:
	    case 5:
	    	datetime.setHours(14);
	    	datetime.setMinutes(0);
	    	datetime.setSeconds(0);
	    	break;
	    case 3:
	    case 6:
	    	datetime.setHours(18);
	    	datetime.setMinutes(0);
	    	datetime.setSeconds(0);
	    	break;
	    default:
	    	break;
	    }
		return datetime;
	}
}
