package j0801;
class Human{
	private String name;                                //속성지정
	private int height;
	private int weight;
	Human() {                                     //매개변수가 없는 생성자 만들기
		                                           //호출받은애가 갈데가 없음!
	}
	Human(String name, int height, int weight) { //매개변수가 있는 생성자 만들기
		this.name=name;                                //this가 붙으면 클래스 자기 자신의 이름
		this.height=height;
		this.weight=weight;
	}
	void print() {
		System.out.printf(" 이름: %s\n 신장: %d cm \n 체중: %d kg \n", name, height, weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	}


public class HumanExam {

	public static void main(String[] args) {
		// 실습03
		
		Human mem1 = new Human();
		mem1.setName("길동");                               //넘겨주는것은 set!
		mem1.setHeight(170);
		mem1.setWeight(60);
		mem1.print();
		
		System.out.println();
		
		Human mem2 = new Human();
		mem1.setName("철수");                               //넘겨주는것은 set!
		mem1.setHeight(166);
		mem1.setWeight(72);
		mem1.print();

	}

}
