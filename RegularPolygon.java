class RegularPolygon{
    private int numOfSides;
    private double lengthofSide;
    private double xCoordinate;
    private double yCoordinate;
    private double Area;
    private double Perimeter;

    public RegularPolygon(){ //No argument constructor
    }

    public RegularPolygon (int somenumOfSides, double somelengthOfSide) {
                numOfSides = somenumOfSides;
                lengthofSide = somelengthOfSide;
    }

    public int getnumOfSides() {
        return numOfSides;
    }

    public void setnumOfSides(int newnumOfSides){
        numOfSides = newnumOfSides;
    }

    public double getlengthOfSide() {
        return lengthofSide;
    }

    public void setlengthOfSide(double newlengthOfSide){
        lengthofSide = newlengthOfSide;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double newxCoordinate){
        xCoordinate = newxCoordinate;
    }
    public double getyCoordinate() {
        return xCoordinate;
    }

    public void setyCoordinate(double newyCoordinate){
        yCoordinate = newyCoordinate;
    }
    public double getPerimeter(){
	        Perimeter = numOfSides * lengthofSide;
	}
	public double getArea(){
	        Area = (lengthofSide * lengthofSide);
	}
	}//end class RegularPolygon

public class HW4_Program2{
	public static void main(String[] args) {

		Account acct1 = new Account(1122, 20000);

		acct1.setAnnualInterestRate(4.5);//set interest rate
		System.out.println("Your account identification number is ID " + acct1.getID());
		System.out.println("The monthly interest rate for your account is: " + acct1.getMonthlyInterestRate()+ "%");
		System.out.println("The starting balance of your account is: " + "$" + acct1.getBalance()+ "0");
		System.out.println("The monthly interest acrued by your account is: " + "$" + acct1.getMonthlyInterest() + "0");
		System.out.println(" ");

		acct1.withdraw(2500);//set withdraw amt

		System.out.println("You have chosen to withdraw " + "$2500");
		System.out.println("The balance of your account after withdrawing is: " + "$" + acct1.getBalance()+ "0");
		System.out.println("The monthly interest acrued by your account is: " + "$" + acct1.getMonthlyInterest());
		System.out.println(" ");

		acct1.deposit(3000);//set deposit amt

		System.out.println("You have chosen to deposit " + "$3000");
		System.out.println("The monthly interest acrued by your account is: " + "$" + acct1.getMonthlyInterest());
		System.out.println("The ending balance of your account is: " + "$" + acct1.getBalance()+ "0");
		System.out.println(" ");

}//end main
}//end class HW4_Program1

