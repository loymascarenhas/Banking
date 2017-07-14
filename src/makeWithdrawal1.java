
public class makeWithdrawal1 extends makeWithdrawal{

	public makeWithdrawal1(Data data) {
		// TODO Auto-generated constructor stub
		float total = data.getFbal();
		data.setFbal(total);
		System.out.println(total);
	}
}
