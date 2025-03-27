package ex12inheritance;

//다음 Point클래스를 이용하여 다음 문제를 해결하시오.
//해당 문제는 상속(Inheritance)을 통해 구현하는것이 아니라 구성(Composition)관계를 이용하여 해결한다.
//Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자.
//그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.

class Point {
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	Point center;      //<<----Point 클래스 타입의 변수 center
	int radian;//반지름
	
	public Circle(int x, int y, int r) {
		this.center = new Point(x, y);  //<<----Point 클래스 타입의 변수 center에 새로운 객체 생성
		this.radian = r;
	}
	
	public void showCircleInfo() {
 		System.out.println("반지름: "+radian);
 		center.showPointInfo();  // 중심 좌표 출력
	}
	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	 public Ring(int x1, int y1, int r1, int x2, int y2, int r2) {
	        // 안쪽 원과 바깥쪽 원 초기화
		 this.innerCircle = new Circle(x1,y1,r1); //객체생성
		 this.outerCircle = new Circle(x2,y2,r2); //객체생성
	    }
	
	public void showRingInfo() {
		 System.out.println("안쪽 원의 정보 :");
        innerCircle.showCircleInfo();
        System.out.println("바깥쪽 원의 정보 :");
        outerCircle.showCircleInfo();
 		
	}
}

public class QuRingMake {
	    public static void main(String[] args) {
	        Ring c = new Ring(1,1,3,2,2,9);
	        c.showRingInfo();
	    }
	}

