package sukkiriNyumon.chapter1_05;

public class Practice04 {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("三角形の面積を求めます。底辺を入力してください");
		double bottom = new java.util.Scanner(System.in).nextInt();
		System.out.println("高さを入力してください");
		double height = new java.util.Scanner(System.in).nextInt();
		System.out.println("三角形の面積は" + calcTriangleArea(bottom, height) + "cm2");
		
		System.out.println("円の面積を求めます。円の半径を入力してください");
		double radius = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("円の面積は" + calcCircleArea(radius) + "cm2");
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom * height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
}
