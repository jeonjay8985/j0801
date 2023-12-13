package j0801;
class Member{
	private int id;                                //속성지정
	private String name;
	private String password;
	Member() {                                     //매개변수가 없는 생성자 만들기
		                                           //호출받은애가 갈데가 없음!
	}
	Member(int id, String name, String password) { //매개변수가 있는 생성자 만들기
		this.id=id;                                //this가 붙으면 클래스 자기 자신의 이름
		this.name=name;
		this.password=password;
	}
	
	Member(int id, String name) {                //매서드 오버로딩, Member로 이름 다 같지만 (매개변수)형식이 다를 수 있음! 다형성
		this.id=id;
		this.name=name;
		//password="7878";                      //매개변수 지정 안했지만 이런식으로 적어서 넘겨줄 수도 있음!
	}
	
	
	void print() {
		System.out.printf("회원번호: %d, 회원이름: %s, 비밀번호: %s\n", id, name, password);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

public class MemberExam {

	public static void main(String[] args) {
		// 클래스 실습
		
		Member mem1 = new Member();
		mem1.setId(2023001);                               //넘겨주는것은 set!
		mem1.setName("홍길동");
		mem1.setPassword("1234");
		mem1.print();
		
		Member mem2 = new Member();
		mem2.setId(2023002);
		mem2.setName("이순신");
		mem2.setPassword("3232");
		mem2.print();
		
		Member mem3 = new Member(2023003, "홍길순", "4321"); //생성자의 매개변수를 넘겨줌
		mem3.print();
		
		Member mem4 = new Member(2023004, "유관순");
		mem4.setPassword("7777");                    //넘겨주는 패스워드 없으면 null이 찍힘
		mem4.print();
		
	}

}
