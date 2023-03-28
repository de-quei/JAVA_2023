package in11;

public class InterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone Phone = new SmartPhone();
		
		Phone.prntfLogo();
		Phone.sendCall();
		Phone.play();
		System.out.println("3과 5를 더하면 " + Phone.calculator(3, 5));
		Phone.Schedule();
	}

}
