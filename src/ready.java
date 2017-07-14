
public class ready extends State {

	@Override
	public boolean Lock(String x) {
		// TODO Auto-generated method stub
		return output.Lock(x);
	}

	@Override
	public boolean IncorrectLock() {
		// TODO Auto-generated method stub
		return output.IncorrectLock();
	}

	@Override
	public float Deposit(float d) {
		// TODO Auto-generated method stub
		return output.Deposit(d);
	}

	@Override
	public float Balance() {
		// TODO Auto-generated method stub
		return output.Balance();
	}

	@Override
	public float Withdraw(float w) {
		// TODO Auto-generated method stub
		return output.Withdraw(w);
	}

	@Override
	public boolean Logout() {
		// TODO Auto-generated method stub
		return output.Logout();
	}


}
