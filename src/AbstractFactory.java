
public abstract class AbstractFactory {
	
	public abstract void storeData(Data data);
	public abstract void displayIncorrectID(Data data);
	public abstract void displayEnterPin(Data data);
	public abstract void displayMenu(Data data);
	public abstract void displayIncorrectPin(Data data);
	public abstract void displayTooManyAttempts(Data data);
	public abstract void displayBalanceBelowMin(Data data);
	public abstract void displayBalance(Data data);
	public abstract void makeWithdrawal(Data data);
	public abstract void chargePanelty(Data data);
	public abstract void makeDeposit(Data data);
	public abstract void displayIncorrectLock(Data data);
	public abstract void displayIncorrectUnlock(Data data);
}