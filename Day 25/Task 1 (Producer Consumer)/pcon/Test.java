package pcon;

public class Test {

	public static void main(String[] args) {
		Common c =new Common();
		Producer ps = new Producer(c);
		Consumer cs = new Consumer(c);
		ps.start();
		cs.start();
	}
}
