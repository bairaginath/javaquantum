
public class BitOperator {
	public static void main(String[] args)
	{
		byte x=3;
		byte y=5;
		System.out.println("AND operator:"+(x&y));
		System.out.println("OR operator:"+(x|y));
		System.out.println("XOR operator:"+(x^y));
		System.out.println("NOT operator:"+(~x));
		System.out.println("RiGHT operator:"+(x>>y));
		System.out.println("LEFT operator:"+(x<<y));
		System.out.println("RIGHT FILL operator:"+(x>>>y));
	}

}
