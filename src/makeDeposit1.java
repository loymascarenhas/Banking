
public class makeDeposit1 extends makeDeposit{

	public makeDeposit1(Data data) {
		// TODO Auto-generated constructor stub
		float total = data.getFbal();
		data.setFbal(total);
		System.out.println(total);
	}

}
