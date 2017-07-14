
public class checkpin extends State {
	
	@Override
	public boolean CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		return output.CorrectPinAboveMin();
	}

	@Override
	public boolean CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		return output.CorrectPinBelowMin();
	}

	@Override
	public boolean IncorrectPin(int attempts) {
		// TODO Auto-generated method stub
		return output.IncorrectPin(attempts);
	}

	@Override
	public boolean Pin(String x) {
		// TODO Auto-generated method stub
		return output.Pin(x);
	}
}
