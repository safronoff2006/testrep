package ru.myprojects;

import org.json.simple.JSONObject;

public class App 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
    	
    	JSONObject obj = new JSONObject();
    	
    	obj.put("project", "testproject");
    	obj.put("version", 1);
    	obj.put("message", "Hello World!");
    	
        System.out.println( obj.toJSONString());
        
        
        System.out.println( "---------OK---------");
        System.out.println( "Конец3");
    }
}
