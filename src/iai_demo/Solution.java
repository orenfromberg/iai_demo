package iai_demo;

import java.io.FileNotFoundException;

public class Solution {

	public static void main(String[] args) {		
		String fileName = "resources/iai_data.txt";
		
		IaiTextData source = new IaiTextData(fileName);
		
		String content = null;
		try {
			content = source.getData();
		} catch (FileNotFoundException | NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println(content);
		
		return;
	}

}
