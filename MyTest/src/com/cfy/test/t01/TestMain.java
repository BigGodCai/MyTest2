package com.cfy.test.t01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) throws Exception {
		//jdoianodnfckldsan
		//哦ijoifcsjoifcjsofjsdlk  
		InputStream resource = TestMain.class.getResourceAsStream("/Apple.txt");
		InputStreamReader isr = new InputStreamReader(resource);
		BufferedReader br = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		String line = null;
		while((line = br.readLine()) != null){
			sb.append(line).append("\r\n");
		}
		br.close();
		isr.close();
		resource.close();
		System.out.println(sb);
		String[] split = sb.toString().split("\r\n");
		Map<String, Apple> map = new IdentityHashMap<String, Apple>();
		for (int i = 0; i < split.length; i++) {
			if(split[i].contains("|")){
				String[] appleTxt = split[i].split("\\|");
				Apple apple = new Apple();
				apple.setCustomerCode(appleTxt[0]);
				apple.setCustomerName(appleTxt[1]);
				apple.setCount(Integer.valueOf(appleTxt[2]));
				map.put(apple.getCustomerCode(), apple);
			}
		}
		//遍历map
		System.out.println("map:");
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(map.get(string).toString());
		}
	}
}
