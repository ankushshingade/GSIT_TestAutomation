package UnderstandingInheritance;

// Parent class
class Device{
	
	String brand;
	
	Device(String brand){
		this.brand = brand;
	}
	
	void powerON() {
		System.out.println(brand+" device is powering ON.");
	}
}

// Interface1
interface Camera{
	void takePhoto();
	void recordVideo();
}

// Interface2
interface MusicPlayer{
	void playMusic();
	void stopMusic();
}

// Child class, implementing 2 interfaces
class SmartPhone extends Device implements Camera, MusicPlayer{
	
	SmartPhone(String brand) {
		super(brand);
	}
	
// MusicPlayer methods	
	@Override
	public void playMusic() {
		System.out.println("Start playing music.");
		
	}
	@Override
	public void stopMusic() {
		System.out.println("Stop playing music.");
		
	}
	
// Camera methods	
	@Override
	public void takePhoto() {
		System.out.println("Take a photo.");
		
	}
	@Override
	public void recordVideo() {
		System.out.println("Record a video.");
		
	}	
}

public class HybrideInheritance {

	public static void main(String[] args) {
		
		SmartPhone S1 = new SmartPhone("Motorola");
		
		S1.powerON();		// Device method
		S1.playMusic();		// Interface MusicPlayer method implemented
		S1.takePhoto();		// Interface Camera method implemented
		S1.recordVideo();	// Interface Camera method implemented
		S1.stopMusic();		// Interface MusicPlayer method implemented
	}

}
