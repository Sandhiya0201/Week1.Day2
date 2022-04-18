package week1.day2;

public class LearnMethods {
	public static void main(String[]args){
	LearnMethods LM = new LearnMethods();
	LM.carName();
	int RegNumber= LM.getCarRegNumber();
	    System.out.println(RegNumber);
	    String Varient=LM.getCarVarient();
	         System.out.println(Varient);
	         int Multiply=LM.multiplyTwoNumbers(6,4);
	         System.out.println(Multiply);
	}
	
	public void carName() {
		System.out.println("kwid");
	}
	public int getCarRegNumber(){
		int carRegNumber= 4444;
		return carRegNumber;
	}
public String getCarVarient() {
	    return "Fuel";
}
public int multiplyTwoNumbers(int a,int b) {
	    return a*b;
}
}
