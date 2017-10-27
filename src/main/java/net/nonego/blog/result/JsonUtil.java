package net.nonego.blog.result;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonUtil {
//	private static final Gson gson = new Gson();
	private static final Gson gson = new GsonBuilder()  
			  .setDateFormat("yyyy-MM-dd HH:mm:ss")  
			  .create();
	
	public static String format(Object src) {
		return gson.toJson(src);
	}
}
