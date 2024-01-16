abstract class bird {
	public abstract void fly();
  	public abstract void makeSound();
}

class eagle extends bird {
	public void fly() {
		System.out.println("Eagle is flying high in the sky.");
	}
	
	public void makeSound() {	
		System.out.println("eagle makes Screech! Screech! sound");	
	} 
} 

class hawk extends bird {

	public void fly() {
		System.out.println("Hawk is soaring through the air.");
	}
	
	public void makeSound() {
		System.out.println("Hawk makes Caw! Caw! sound"); 
	} 
} 

class birdMain {
	public static void main(String[] args) {
		bird Eagle = new eagle(); 
		bird Hawk = new hawk(); 
		Eagle.fly(); 
		Eagle.makeSound();
		Hawk.fly(); 
		Hawk.makeSound(); 
	}
}
    
