package coreJava1;
class SqureFrame{
	int side1;
	int side2;
	int side3;
	int side4;
	public SqureFrame(int s1, int s2,int s3,int s4) {
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
		this.side4=s4;
	}
	public String isSqure() {
		if(side1==side2 && side1==side3 && side1==side4) {
			return "Square";
		}
		return "Not Square";
		
	}
}
class Rectangle{
	int side1;
	int side2;
	int side3;
	int side4;
	public Rectangle(int s1, int s2,int s3,int s4) {
		this.side1=s1;
		this.side2=s2;
		this.side3=s3;
		this.side4=s4;
	}
	public String  isRectangle() {
		if(side1==side3 && side1!=side2 && side2==side4) {
			return "Rectangle";
		}
		return "Not Rectangle";
	}
	
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SqureFrame f1=new SqureFrame(10,10,10,10);
		System.out.println(f1.isSqure());
		System.out.println("Sides are"+" "+ f1.side1+" "+f1.side2+" "+f1.side3+" "+f1.side4);
		Rectangle f2=new Rectangle(10,20,10,20);
		System.out.println(f2.isRectangle());
		System.out.println("Sides are"+ " "+f2.side1+" "+f2.side2+" "+f2.side3+" "+f2.side4);

	}

}
