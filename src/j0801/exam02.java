package j0801;

class Car{
	String color;
	int speed;
    int cnt;
	static private int count = 0;    //private 붙여주면 set, get 가지고 와야
	                                 //간접접근방식
	                                 //static private int count=0;
	
	Car() {
	   cnt++;
	   count++;	
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Car.count = count;
	}
}

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1 = new Car();
		System.out.println("cnt : " +myCar1.cnt);
		System.out.println("현재 생산된 자동차 숫자 : "+myCar1.getCount());   //.count<private 없을 때, 직접접근> ->.getCount()<private 생성 후>
		
		Car myCar2 = new Car();
		System.out.println("cnt : " +myCar2.cnt);
		System.out.println("현재 생산된 자동차 숫자 : "+myCar2.getCount());
		
		Car myCar3 = new Car();
		System.out.println("cnt : " +myCar3.cnt);                        //cnt는 계속해서 초기화 0->1, 0->1, 0->1
		System.out.println("현재 생산된 자동차 숫자 : "+myCar3.getCount());   //count는 최초 한번만 초기화 0->1->2->3
   }
}
