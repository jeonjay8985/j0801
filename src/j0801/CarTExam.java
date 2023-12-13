package j0801;
class CarT {
	
	private String name;           
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double mileage;
	
	CarT() {                                                                    
	}
	            
	CarT(String name,String number,int width,int height,int length,double x,double y,double tankage,double fuel,double mileage) { 
		this.name=name;                               
		this.number=number;
		this.width=width;
		this.height=height;
		this.length=length;
		this.x=x;
		this.y=y;
		this.tankage=tankage;
		this.fuel=fuel;
		this.mileage=mileage;
	}
	
	void print() {
		System.out.printf(" 이름: %s\n 번호: %s\n 전폭: %d mm \n 전고: %d mm \n 전장: %d mm \n 탱크: %.2f 리터\n 연비: %.2fkm/ 리터\n"
				           ,name ,number ,width ,height ,length ,tankage ,mileage);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getTankage() {
		return tankage;
	}

	public void setTankage(double tankage) {
		this.tankage = tankage;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

}

public class CarTExam {

	public static void main(String[] args) {
		// 실습05
		
		 CarT car1=new CarT(); 
		  
		 car1.setName("k3");                             
		 car1.setNumber("서울999-99");
		 car1.setWidth(1660);
		 car1.setHeight(1500);
		 car1.setLength(3640);
		 car1.setTankage(40.0);
		 car1.setMileage(12.0);
		 car1.print();
		
		 System.out.println();
		 
		 CarT car2=new CarT(); 
		  
		 car2.setName("k5");                             
		 car2.setNumber("서울999-98");
		 car2.setWidth(1660);
		 car2.setHeight(1525);
		 car2.setLength(3695);
		 car2.setTankage(41.0);
		 car2.setMileage(12.0);
		 car2.print();
		 
		 
	}

}
