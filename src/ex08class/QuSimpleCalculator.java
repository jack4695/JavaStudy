package ex08class;

//기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
//아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
//init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.


class CalculatorEx {
	
	// 연산 수행 횟수를 저장하는 변수
    int addcount;
    int mincount;
    int mulcount;
    int divcount;

    public void init() {
        // count를 0으로 초기화하는 메서드
    	int addcount=0;
        int mincount=0;
        int mulcount=0;
        int divcount=0;
    }

    public double add(int a, int b) {
        // 덧셈 수행 후 count 증가
    	addcount++;
    	return (a+b);
    }

    public double min(double a, double b) {
        // 뺄셈 수행 후 count 증가
    	mincount++;
    	return (a-b);
    }

    public double mul(double a, double b) {
        // 곱셈 수행 후 count 증가
    	mulcount++;
    	return (a*b);
    }

    public double div(double a, double b) {
        // 나눗셈 수행 후 count 증가
    	divcount++;
    	return (a/b);
    }

    public void showOpCount() {
        // 연산이 총 몇 번 수행되었는지 출력
    	System.out.println("덧셈횟수 : "+addcount);
    	System.out.println("뺄셈횟수 : "+mincount);
    	System.out.println("곱셈횟수 : "+mulcount);
    	System.out.println("나눗셈횟수 : "+divcount);
    }
}

public class QuSimpleCalculator {
	
	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		
		cal.init(); //생성자가 아니라, 메서드에서 초기화한다.
		
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}


}
