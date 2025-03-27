package ex08class;

//밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의해보자.
//init메소드를 통해 밑변과 높이를 초기화한다.
//그리고 밑변과 높이를 변경시킬수 있는 메소드와
//삼각형의 넓이를 계산해서 반환하는 메소드도 함께 정의해보자.

class Triangle {       //   <<-여기서 public이면 왜 오류인지 질문하기.
	int a;
	int b;
	
	public void init(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setBottom(int a) {
		this.a = a;
	}
	
	public void setHeight(int b) {
		this.b = b;
	}
	
	public double getArea() {
		return (a*b)/2;
	}
}

public class QuTriangle {

	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}


}
