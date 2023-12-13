package j0801;

class HumanTester {
	
	private String name;                               
	private int height;
	private int weight;
	
	HumanTester() {                                                                    
	}
	            
	HumanTester(String name, int height, int weight) { 
		this.name=name;                               
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

	void upWeight(int value) {
		weight=weight+value;
	}
	void downWeight(int value) {
		weight=weight-value;
	}
}
  public class HumanTesterExam {

	public static void main(String[] args) {
		// 실습04
		
		  HumanTester mem1=new HumanTester(); 
		  
		  mem1.setName("길동");                             
		  mem1.setHeight(170);
		  mem1.setWeight(60);
		  mem1.upWeight(3);
		  mem1.print();
		  
		  System.out.println();
		  
		  mem1.setName("철수");                             
		  mem1.setHeight(166);
		  mem1.setWeight(72);
		  mem1.downWeight(5);
		  mem1.print();

	}
 }

