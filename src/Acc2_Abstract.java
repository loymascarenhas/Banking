
public class Acc2_Abstract extends AbstractFactory{

	@Override
	public void storeData(Data data) {
		// TODO Auto-generated method stub
		new storeData2(data);
	}

	@Override
	public void displayIncorrectID(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectID2(data);
	}

	@Override
	public void displayEnterPin(Data data) {
		// TODO Auto-generated method stub
		new displayEnterPin2(data);
	}

	@Override
	public void displayMenu(Data data) {
		// TODO Auto-generated method stub
		new displayMenu2(data);
	}

	@Override
	public void displayIncorrectPin(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectPin2(data);
	}

	@Override
	public void displayTooManyAttempts(Data data) {
		// TODO Auto-generated method stub
		new displayTooManyAttempts2(data);
	}

	@Override
	public void displayBalanceBelowMin(Data data) {
		// TODO Auto-generated method stub
		new displayBalanceBelowMin2(data);
	}

	@Override
	public void displayBalance(Data data) {
		// TODO Auto-generated method stub
		new displayBalance2(data);
	}

	@Override
	public void makeWithdrawal(Data data) {
		// TODO Auto-generated method stub
		new makeWithdrawal2(data);
	}

	@Override
	public void chargePanelty(Data data) {
		// TODO Auto-generated method stub
		new chargePanelty2(data);
	}

	@Override
	public void makeDeposit(Data data) {
		// TODO Auto-generated method stub
		new makeDeposit2(data);
	}

	@Override
	public void displayIncorrectLock(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectLock2(data);
	}

	@Override
	public void displayIncorrectUnlock(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectUnlock2(data);
	}

}
