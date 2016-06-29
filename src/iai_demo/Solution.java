package iai_demo;

import java.io.FileNotFoundException;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = "resources/iai_data.txt";
		
		IaiTextData source = new IaiTextData(fileName);
		
		String content = null;
		try {
			content = source.getData();
		} catch (FileNotFoundException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(content);
		
		return;
	}

}
