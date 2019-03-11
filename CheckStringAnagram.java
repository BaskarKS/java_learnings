package com.string;

public class CheckStringAnagram
{
	public static void main(String[] args)
	{
		CheckStringAnagram obj = new CheckStringAnagram();
		System.out.println(obj.permutation("Baskar", "baskar"));
		System.out.println(obj.permutation("yuva", "Yuva"));
		System.out.println(obj.permutation("baskar", "baskar"));
	}
	public String sort(String str)
	{
		char[] strChars = str.toCharArray();
		java.util.Arrays.sort(strChars);
		return new String(strChars);
	}
	/*
	public boolean permutation(String strOne, String strTwo)
	{
		if(strOne.length() != strTwo.length()) return false;
		String first = sort(strOne);
		String second = sort(strTwo);
		System.out.println(first +"...."+second);
		return first.equals(second);
	}
	*/
	
	public boolean permutation(String first, String second)
	{
		if (first.length() != second.length())
			return false;
		
		int[] letters = new int[256];
		char[] firstCharArray = first.toCharArray();
		for(char ch : firstCharArray)
		{
			letters[ch]++;
		}
		for(int loc = 0; loc < second.length() ; loc++)
		{
			int charVal = (int)second.charAt(loc);
			if(--letters[charVal] < 0)
				return false;
		}
		return true;
	}
}