package com.incture.interview.Program.Strings;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		//replace(char oldChar,  char newChar)
		String s = "Hemmo Wormd";
		s = s.replace('m', 'l');
		System.out.println("After Replacing m with l :");
		System.out.println(s);
		
		//replaceAll(String regex, String replacement)
		String s1 = "Hello journaldev, Hello pankaj";
		s1 = s1.replaceAll("Hello", "Hi");
		System.out.println("After Replacing Hello with Hi:");
		System.out.println(s1);
		
		//replaceFirst(String regex, String replacement) 
		String s2 = "Hello guys, Hello world";
		s2 = s2.replaceFirst("Hello", "Hi");
		System.out.println("After Replacing :");
		System.out.println(s2);

	}

}