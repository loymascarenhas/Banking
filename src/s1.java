
public class s1 extends State {

	@Override
	public boolean AboveMinBalance(float total) {
		// TODO Auto-generated method stub
		return output.AboveMinBalance(total);
	}

	@Override
	public boolean BelowMinBalance(float total) {
		// TODO Auto-generated method stub
		return output.BelowMinBalance(total);
	}

	@Override
	public boolean WithdrawBelowMinBalance(float total) {
		// TODO Auto-generated method stub
		return output.WithdrawBelowMinBalance(total);
	}
}
