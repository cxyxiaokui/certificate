package cn.zhuoqianmingyue;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
	
	  public static java.util.Date getCurrentDate(){
		  return new java.util.Date(System.currentTimeMillis());
	  }
	  
	  public static String DateToString(Date date) {
		  	if(date == null){
		  		return "";
		  	}
		  	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		  	return sdf.format(date);
	 }
}
