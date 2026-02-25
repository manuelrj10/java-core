package oops;
interface Camera{
	int megaPixels=100;
	String type="sony";
	void takePhoto();
	
}
interface Music extends Camera{
	int db=50;
	String speaker="bose";
	void playMusic();
	
}
class phone implements Music{
	public void takePhoto() {
		System.out.println("megapixels"+megaPixels);
		System.out.println("camera type"+type);
		System.out.println("ALL set!!!!you are ready to take a photo");
		
	}
	public void playMusic() {
		System.out.println("db"+db);
		System.out.println("speaker type"+speaker);
		System.out.println("ALL set!!!!you are ready to play a music");
		
	}
	
}

public class InterfaceMultple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone p=new phone();
		System.out.println("camera details");
		p.takePhoto();
		System.out.println("speaker  details");
		p.playMusic();
	}

}
