package com.feedbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("Examlist")
public class FeedExam {
	List <String> branches;
	Map <String, Integer> records;

	
	public FeedExam() {
		records = new  HashMap<String, Integer>();
		records.put("IT",200);
		records.put("CSE",250);
		records.put("ECE",100);
		branches = new ArrayList<String>();
		branches.add("IT");
		branches.add("CSE");
		branches.add("ECE");
	}

	public List<String> getBranches() {
		return branches;
	}

	public void setBranches(List<String> branches) {
		this.branches = branches;
	}

	public Map<String, Integer> getRecords() {
		return records;
	}

	public void setRecords(Map<String, Integer> records) {
		this.records = records;
	}
	
	
}
