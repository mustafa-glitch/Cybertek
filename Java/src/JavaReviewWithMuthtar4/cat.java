package JavaReviewWithMuthtar4;

public class cat {

	public String name;
	public int age;
	public String breed;
	public String color;
	public String size;
	
	
	
	
	
	public void catinfo(String name,int age, int size,String breed) {
		color=color;
		size=size;
		breed=breed;
		name=color;
	}
	public void eats (String food) {
		
		
		
		System.out.println(name+"is eating+"+food);
		

	}
	
	public void drinks(String drink) {
		
		System.out.println(name+"is drinking"+drink);
		
	}
	public void sleeps() {
		System.out.println(name+"is sleeping");
		
	}

	@Override
	public String toString() {
		return "cat [name=" + name + ", age=" + age + ", breed=" + breed + ", color=" + color + ", size=" + size + "]";
	}
}
