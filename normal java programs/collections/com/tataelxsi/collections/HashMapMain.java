package com.tataelxsi.collections;

import java.util.HashMap;
import java.util.logging.Logger;

public class HashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getLogger(HashMapMain.class.getName());
		HashMap<String,Integer> sampleHashMap =new HashMap<String,Integer>();
		sampleHashMap.put("Nellai Exp",2000);
		sampleHashMap.put("Kovai Exp",2100);
		sampleHashMap.put("Madhurai Exp",2200);
		sampleHashMap.put("Thrichy Exp",1600);
//		
		logger.info("\n"+sampleHashMap);
//		
//		//cant have duplicate keys
		sampleHashMap.put("Nellai Exp",1300);
		logger.info("\n"+sampleHashMap);
//		
//		//copy all elements to another map
		HashMap<String,Integer> sampleHashMap2 =new HashMap<String,Integer>();
		sampleHashMap2.putAll(sampleHashMap);
		sampleHashMap2.put("Chennai Exp",1200);
		logger.info("\n"+sampleHashMap2);
//		
//		//hashmap func
		logger.info("\n"+sampleHashMap2.get("Chennai Exp"));;
		logger.info("\n"+sampleHashMap2.containsKey("Nellai Exp"));
		logger.info("\n"+sampleHashMap2.containsValue(2000));
//		//hashmap remove
		logger.info("\n"+sampleHashMap2.remove("Chennai Exp"));
		logger.info("\n"+sampleHashMap2);
//		
//		//clear
		sampleHashMap2.clear();
		logger.info("\n"+sampleHashMap2.isEmpty());
		//replace 
		sampleHashMap.replace("Kovai Exp", 1400);
		logger.info("\n"+sampleHashMap);
		//key values
		logger.info("\n"+sampleHashMap.keySet());
		//Values
		logger.info("\n"+sampleHashMap.values());
	}
}

