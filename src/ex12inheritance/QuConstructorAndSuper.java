package ex12inheritance;

//상속관계에 놓여있는 클래스의 생성자 정의 및 호출방식을 기본으로
//다음 클래스의 적절한 생성자를 삽입해보자.
//그리고 이의 확인을 위한 main 메소드도 적절히 정의해보자.

class Car
{
   	int gasoline;
   	
   	public Car(int gas) {
		gasoline = gas;
	}
}
class HybridCar extends Car
{
   	int electric;
   	
   	public HybridCar(int ga, int hy) {
		super(ga);
		electric = hy;
	}
}
class HybridWaterCar extends HybridCar
{
       	int water;
 
       	public HybridWaterCar(int g, int e, int w) {
    		super(g, e);
    		water = w;
    	}
       	
       	public void showNowGauge()
       	{
         	System.out.println("남은가솔린:"+gasoline);
         	System.out.println("남은전기량:"+electric);
         	System.out.println("남은워터량:"+water);
       	}
}
public class QuConstructorAndSuper {

	public static void main(String[] args) {
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
}

