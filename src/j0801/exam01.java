package j0801;

class Cat{
	String breed;
	String color;
	int age;
	
	void eat() {
		System.out.println("먹이를 먹다");
	}
	
	void scratch() {
		System.out.println("발톱으로 할퀴다");
	}
	
	void meow() {
		System.out.println("야옹하고 울다");
	}
	
	void print() {    //클래스 안에 메소드 하나 만듦!
		System.out.printf("품종은 %s이고, 색상은 %s이며, 나이는 %d살입니다\n", breed, color, age);
	}
	
}
public class exam01 {

	public static void main(String[] args) {
		// 클래스 사용 방법
		
		Cat cat1 = new Cat();    //틀:Cat, 객체:cat1
		cat1.breed = "페르시안 고양이"; 
		cat1.color= "흰색";
		cat1.age = 5;
		cat1.scratch();
		cat1.print();
		
		Cat cat2 = new Cat();
		cat2.breed = "스핑크스"; 
		cat2.color = "검은색";
		cat2.age = 4;
		cat2.meow();
		cat2.print();
		

	}

}
