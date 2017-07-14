
public class makeDeposit2 extends makeDeposit{

	public makeDeposit2(Data data) {
		// TODO Auto-generated constructor stub
		float total = data.getFbal();
		data.setFbal(total);
		System.out.println(total);
	}
}
