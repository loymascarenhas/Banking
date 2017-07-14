
public class Acc1_Abstract extends AbstractFactory{

	@Override
	public void storeData(Data data) {
		// TODO Auto-generated method stub
		new storeData1(data);
	}

	@Override
	public void displayIncorrectID(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectID1(data);
	}

	@Override
	public void displayEnterPin(Data data) {
		// TODO Auto-generated method stub
		new displayEnterPin1(data);
	}

	@Override
	public void displayMenu(Data data) {
		// TODO Auto-generated method stub
		new displayMenu1(data);
	}

	@Override
	public void displayIncorrectPin(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectPin1(data);
	}

	@Override
	public void displayTooManyAttempts(Data data) {
		// TODO Auto-generated method stub
		new displayTooManyAttempts1(data);
	}

	@Override
	public void displayBalanceBelowMin(Data data) {
		// TODO Auto-generated method stub
		new displayBalanceBelowMin1(data);
	}

	@Override
	public void displayBalance(Data data) {
		// TODO Auto-generated method stub
		new displayBalance1(data);
	}

	@Override
	public void makeWithdrawal(Data data) {
		// TODO Auto-generated method stub
		new makeWithdrawal1(data);
	}

	@Override
	public void chargePanelty(Data data) {
		// TODO Auto-generated method stub
		new chargePanelty1(data);
	}

	@Override
	public void makeDeposit(Data data) {
		// TODO Auto-generated method stub
		new makeDeposit1(data);
	}

	@Override
	public void displayIncorrectLock(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectLock1(data);
	}

	@Override
	public void displayIncorrectUnlock(Data data) {
		// TODO Auto-generated method stub
		new displayIncorrectUnlock1(data);
	}

}
