package jrJava.arrayCopy;

public class ArrayCopy {

	public static void main(String[] args) {

		//int[] a = {3, 2, 5, 1, 8, 11, 7};
		//int[] b = duplicate(a);
		
		Ball[] balls = {new Ball(1, 5), new Ball(3, 2), new Ball(6, 5), new Ball(3, 5)};
		Ball[] ball2 = duplicate(balls);


	public static int[] duplicate(int[] data){
		int[] copy = new int[data.length];
		for(int i=0; i<data.length; i++) copy[i] = data[i];
		return copy;
	}
	
	
	public static Ball[] duplicate(Ball[] data){
		Ball[] copy = new Ball[data.length];
		for(int i=0; i<data.length; i++) copy[i] = data[i];
		return copy;
	}

}
