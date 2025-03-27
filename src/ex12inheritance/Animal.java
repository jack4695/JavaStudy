package ex12inheritance;

public class Animal {
	
	private String species;
	public int age;
	public String gender;
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	public void showAnimal() {
		System.out.println("동물의 종류: "+species);
		System.out.println("나이: "+age);
		System.out.println("성별: "+gender);
	}

	/*
	getter메서드 
		: private으로 선언된 멤버변수를 클래스 외부로 반환할때 
		사용하는 메서드 */
	public String getSpecies() {
		return species;
	}
	
	
}
