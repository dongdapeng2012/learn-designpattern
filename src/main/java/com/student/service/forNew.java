package com.student.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;

@Service("forNew")
public class forNew extends BaseServiceImpl {
	public String test(){
		return "forNew";
	}
	
	public void test2(){
		String command="ipconfig -all";  
	    String s="IPv4";  
	    String line = null;  
	    StringBuilder sb = new StringBuilder();  
	    Runtime runtime = Runtime.getRuntime();  
	    try {  
	    Process process = runtime.exec(command);  
	    BufferedReader  bufferedReader = new BufferedReader  
	            (new InputStreamReader(process.getInputStream()));  
	      
	      
	        while ((line = bufferedReader.readLine()) != null) {  
	            sb.append(line + "\n");  
	            if (line.contains(s)) {  
	                System.out.println(line);  
	            }  
	        }  
	    } catch (IOException e) {  
	        // TODO 自动生成的 catch 块  
	        e.printStackTrace();  
	    }  
	} 
}