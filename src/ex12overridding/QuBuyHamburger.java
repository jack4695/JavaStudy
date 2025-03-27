package ex12overridding;

//햄버거를 추상화한 클래스와
//기본가격, 세트가격을 추상화한 클래스를 정의하여
//햄버거를 주문시 기본가격 혹은 세트가격으로 출력할수 있도록 프로그램을 구현하시오. 
//조건은 다음과 같다.

class Burger {
	//멤버변수
	/* 버거명, 가격, 패티, 소스, 야체을 표현 */
	String name;
	int price;
	String patty;
	String source;
	String veget;
	//인자생성자
	public Burger(String name, int price, String patty, String source, String veget) {
		this.name = name;
		this.price = price;
		this.patty = patty;
		this.source = source;
		this.veget = veget;
	}
	//getter : price만 필요
	public int getPrice() {
	    return price;
	}
	//햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력*/
	public void showBurgerInfo() {
		System.out.println(name);
		System.out.println("가격 : "+ price);
		System.out.printf("식재료 : %s + %s + %s", patty, source, veget);
	}
}
//햄버거의 기본가격 추상화 
class HamburgerPrice {
	//멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	//인자생성자
	public HamburgerPrice(Burger burger) {
		this.burger = burger;
	}
	//기본가격계산
	public int calculate() {
	    return burger.getPrice() + COKE + POTATO;  //<<<- 이 부분 버거.겟프라이스부분 이해 안감.
	}
	//햄버거와 결제금액 출력
	public void showPrice() {
	    // 햄버거 정보 출력
	    burger.showBurgerInfo();
	    System.out.println();
	    // 총 가격 출력
	    System.out.println("결제 금액: " + calculate());
	    System.out.println("===============================");
	}

}
//세트가격을 추상화(기본가격을 상속)
class SetPrice extends HamburgerPrice {

	//인자생성자
	public SetPrice(Burger burger) {
		super(burger);
	}	
	
	//세트가격계산(오버라이딩)
	@Override
	public int calculate() {
		return super.calculate() - 500;
	}
	
	//햄버거와 세트결제금액 출력(오버라이딩)
	@Override
	public void showPrice() {
	    burger.showBurgerInfo();
	    System.out.println();
	    System.out.println("세트 결제 금액: " + calculate());
	    System.out.println("===============================");
	}
}

public class QuBuyHamburger {

	public static void main(String[] args) {
		
		//치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		//치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");
		
		//치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1); 
		price1.showPrice();	// 4500원	
		
		//치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2); 
		price2.showPrice();	// 5000원
	}
}

