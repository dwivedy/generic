package com.example.model;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GetArticle {

	
	public ArrayList getArticles() {
		ArrayList allArticles = null;
		try {
			InputStream input = new URL("http://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=ae52c8fb987d44ada7f842ad13b11150").openStream();
		
			
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Object> jsonMap = mapper.readValue(input, Map.class);
			
//			for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
//				if (entry.getKey() == "status"  && entry.getValue() =="OK" ) {
//					
//					System.out.println(jsonMap);
//				}

			
			   
//			}
			
			String ok = "OK";
			
			System.out.println(jsonMap.get("status").equals("OK"));
			
			if(jsonMap.get("status").equals("OK")) {
				
				 allArticles = (ArrayList)jsonMap.get("results");
				
				
//				for (Object o: allArticles) {
//					
//					 lnk = (LinkedHashMap)o;
//					
//					
//					
//				}
				
				
				
				 
			}
			
			 
			 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Map<String, String> map = new Gson().fromJson(new InputStreamReader(input, "UTF-8"), new TypeToken<Map<String, String>>(){}.getType());
//			
		
		return allArticles;
			
		
		
		
	}
	
	
}// class
