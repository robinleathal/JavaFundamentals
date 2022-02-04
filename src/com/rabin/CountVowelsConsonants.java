package com.rabin;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowels = 0, consonants = 0;
		String str = "There are";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowels++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				//to ignore  space
				consonants++;
			}/*
			else {
				consonants++;
			}
			/*
			char c = str.charAt(i);
			if (c == ' ') {
				continue;
			} else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vowels++;
			} else {
				consonants++;
			}*/
		}
		System.out.println("Number of vowels: " + vowels);  
        System.out.println("Number of consonants: " + consonants);  

	}

}
