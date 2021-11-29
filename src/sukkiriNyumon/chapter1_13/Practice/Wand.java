package sukkiriNyumon.chapter1_13.Practice;

public class Wand {
	String name;
	double power;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖に設定する名前が異常です。（3文字以上）");
		}
		this.name = name;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		if (power <= 0.5 || power >= 100) {
			throw new IllegalArgumentException("杖の力の値は0.5~100までで指定してください");
		}
		this.power = power;
		
	}
}
