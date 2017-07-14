
public class makeWithdrawal2 extends makeWithdrawal{

	public makeWithdrawal2(Data data) {
		// TODO Auto-generated constructor stub
		float total = data.getFbal();
		data.setFbal(total);
		System.out.println(total);
	}
}
