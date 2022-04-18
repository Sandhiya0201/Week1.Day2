package week1.day2;

public class Calculator {
public static void main(String[]args) {
	    Calculator KK= new Calculator();
	    KK.MyCalculator();
	    int Add=KK.addThreeNumbers(4,6,3);
	    System.out.println(Add);
	    int Sub=KK.subTwoNumbers(3,5);
	    System.out.println(Sub);
	    double Multiply=KK.multiplyTwoNumbers(7,7);
	    System.out.println(Multiply);
	    float Divide=KK.divideTwoNumbers(5,7);
	    System.out.println(Divide);
	    }
public void MyCalculator() {
}
public int addThreeNumbers(int a, int b, int c) {
	return a+b+c;
}
public int subTwoNumbers(int a, int b) {
	return a-b;
}
public double multiplyTwoNumbers(double a, double b) {
	return a*b;
}
public float divideTwoNumbers(float a, float b) {
	return a/b;
}

}
