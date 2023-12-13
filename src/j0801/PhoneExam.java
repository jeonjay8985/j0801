package j0801;

class Phone{
	private String phone;                                //속성지정
	private String name;
	private String address;
	Phone() {                                     //매개변수가 없는 생성자 만들기
        //호출받은애가 갈데가 없음!
    }
    Phone(String phone, String name, String address) { //매개변수가 있는 생성자 만들기
    this.phone=phone;                                //this가 붙으면 클래스 자기 자신의 이름
    this.name=name;
    this.address=address;
  }
    void print() {
		System.out.printf("전화: %s, 이름: %s, 주소: %s\n", phone, name, address);
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
    

}
public class PhoneExam {

	public static void main(String[] args) {
		/* 클래스 실습
		   클래스 이름: Phone
		   클래스 속성: 1. phone: String
		             2. name: String
                     3. address : String
		             
		   5명의 인스턴스를 생성하여 출력
           ex) 1.전화: 010-1111-1111 이름: 홍길동 주소: 부산시 부산진구 양정동
               2.
               3.
               4.
               5.
       */
		
		Phone mem1 = new Phone();
		mem1.setPhone("010-1111-1111");                               //넘겨주는것은 set!"
		mem1.setName("홍길동");
		mem1.setAddress("서울");
		mem1.print();
		
		Phone mem2 = new Phone();
		mem2.setPhone("010-2222-2222");
		mem2.setName("이순신");
		mem2.setAddress("부산");
		mem2.print();
		
		Phone mem3 = new Phone("010-3333-3333", "홍길순", "경주"); //생성자의 매개변수를 넘겨줌
		mem3.print();
		
		Phone mem4 = new Phone("010-4444-4444", "유관순", "울산");
		mem4.print();
		
		Phone mem5 = new Phone("010-5555-5555", "가나다", "대구");
		mem5.print();
	}
  
}
