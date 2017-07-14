
public class outputProcessor{
	protected static Data store = null;
	
	public boolean Login(String y){
		if(store.getSid().equals(y)){
			return true;
		}
		else{
			return IncorrectLogin();
		}
	}

	public boolean IncorrectLogin() {
		// TODO Auto-generated method stub
		return false;
	}

	public void Open(Data store) {
		// TODO Auto-generated method stub
		this.store = store;
	}

	public boolean CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		if(store.getFbal()>store.getMin()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		if(store.getFbal()<store.getMin()){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean IncorrectPin(int attempts) {
		// TODO Auto-generated method stub
		if(store.getMaxAttempts() == attempts){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean Pin(String x) {
		// TODO Auto-generated method stub
		if(store.getSpin().equals(x)){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean Lock(String x) {
		// TODO Auto-generated method stub
		if(store.getSpin().equals(x)){
			return true;
		}
		else{
			return IncorrectLock();
		}
	}

	public boolean IncorrectLock() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean Unlock(String x) {
		// TODO Auto-generated method stub
		if(store.getSpin().equals(x)){
			return true;
		}
		else{
			return IncorrectUnlock();
		}
	}

	public boolean IncorrectUnlock() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean Logout() {
		// TODO Auto-generated method stub
		return true;
	}

	public float Deposit(float d) {
		float total = store.getFbal()+d;
		store.setFbal(total);
		return total;
	}

	public float Balance() {
		// TODO Auto-generated method stub
		return store.getFbal();
	}

	public boolean AboveMinBalance(float total) {
		// TODO Auto-generated method stub
		if(total>store.getMin())
			return true;
		else
			return false;
	}
	public boolean BelowMinBalance(float total) {
		// TODO Auto-generated method stub
		if(total<=store.getMin())
			return false;
		else
			return true;
	}
	public boolean WithdrawBelowMinBalance(float total) {
		// TODO Auto-generated method stub
		if(total<=store.getMin()){
			//penalty
			store.setFbal(total - 10);
			return false;
		}
		else
			return true;
	}

	public float Withdraw(float w) {
		// TODO Auto-generated method stub
		float total = store.getFbal()-w;
		store.setFbal(total);
		return total;
	}
}