package com.String;

public class SpecialCharacter {

public static void main(String[] args) {

String s1 ="abc xyz $amar1243_chouhan@gmail.com#";

int whitespace=0;

int count = 0;

int alpha=0;

int specialchar=0;

char ch;


for(int i=0; i<s1.length();i++) {
	
	ch = s1.charAt(i);
	
	if(Character.isAlphabetic(ch))
     {
		
		alpha++;
		
	}
	else if(Character.isDigit(ch))
	{	
		
		
		
	      count++;		
	}
	else if(Character.isWhitespace(ch)) {
	


	whitespace ++;
}else  {
	
specialchar++;	
	
}
	
}	
	
System.out.println("number of special characters are :" + specialchar );
System.out.println("number of digits  are :" + count );
System.out.println("number of alphabets  are :" +alpha  );
System.out.println("number of whitespaces in the string is : " + whitespace);

}
}
