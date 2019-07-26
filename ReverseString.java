package main;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] word = {'A', 'n', 'i', 'm', 'a', 'l', 'i', 'a'};
		rev(word);
		
		//helper(0, word);
		
		System.out.println(word);
		
	}
	
	public static void rev (char[] word) {
		
		helper(0, word);
		
		System.out.println(word);
	}
	
	public static void helper(int index, char[] word) {
		
		if ( index >= word.length / 2) {
			return;
		}
		
		char front = word[index];
		char back = word[word.length - index - 1];
		
		//System.out.println(front);
		//System.out.println(back);
		
		word[index] = back;
		word[word.length - index - 1] = front;
		
		helper(index + 1, word);
		
	}

}
