
public class output{
	protected static Data store = null;
	private Acc1_Abstract acc1 = new Acc1_Abstract();
	private Acc2_Abstract acc2 = new Acc2_Abstract();
	
 	public boolean Login(String y){
		if(store.getSid().equals(y)){
	 		if(store.getAcc() == 1)
	 			acc1.displayEnterPin(store);
	 		else
	 			acc2.displayEnterPin(store);
	 		return true;
		}
		else{
			return IncorrectLogin();
		}
	}

	public boolean IncorrectLogin() {
		// TODO Auto-generated method stub
		if(store.getAcc() == 1)
 			acc1.displayIncorrectID(store);
 		else
 			acc2.displayIncorrectID(store);
		return false;
	}

	public void Open(Data store) {
		// TODO Auto-generated method stub
		if(store.getAcc() == 1)
 			acc1.storeData(store);
 		else
 			acc2.storeData(store);
		this.store = store;
	}

	public boolean CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		if(store.getFbal()>store.getMin()){
			if(store.getAcc() == 1)
	 			acc1.displayMenu(store);
	 		else
	 			acc2.displayMenu(store);
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		if(store.getFbal()<store.getMin()){
			if(store.getAcc() == 1)
	 			acc1.displayMenu(store);
	 		else
	 			acc2.displayMenu(store);
			return true;
		}
		else{
			return false;
		}
	}

	public boolean IncorrectPin(int attempts) {
		// TODO Auto-generated method stub
		if(store.getAcc() == 1)
 			acc1.displayIncorrectPin(store);
 		else
 			acc2.displayIncorrectPin(store);
		if(store.getMaxAttempts() == attempts){
			if(store.getAcc() == 1)
	 			acc1.displayTooManyAttempts(store);
	 		else
	 			acc2.displayTooManyAttempts(store);
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
		if(store.getAcc() == 1)
 			acc1.displayIncorrectLock(store);
 		else
 			acc2.displayIncorrectLock(store);
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
		if(store.getAcc() == 1)
 			acc1.displayIncorrectUnlock(store);
 		else
 			acc2.displayIncorrectUnlock(store);
		return false;
	}

	public boolean Logout() {
		// TODO Auto-generated method stub
		return true;
	}

	public float Deposit(float d) {
		if(store.getAcc() == 1)
 			acc1.makeDeposit(store);
 		else
 			acc2.makeDeposit(store);
		float total = store.getFbal()+d;
		store.setFbal(total);
		return total;
	}

	public float Balance() {
		// TODO Auto-generated method stub
		if(store.getAcc() == 1)
 			acc1.displayBalance(store);
 		else
 			acc2.displayBalance(store);
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
		if(store.getAcc() == 1)
 			acc1.displayBalanceBelowMin(store);
 		else
 			acc2.displayBalanceBelowMin(store);
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
		if(store.getAcc() == 1)
 			acc1.makeWithdrawal(store);
 		else
 			acc2.makeWithdrawal(store);
		float total = store.getFbal()-w;
		store.setFbal(total);
		return total;
	}
}