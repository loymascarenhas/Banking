
public class State{
	public output output = new output();
	
	public boolean Login(String y){
		return false;}

	public boolean IncorrectLogin(){
		return false;}

	public void Open(Data store){}

	public boolean CorrectPinAboveMin(){
		return false;}
	
	public boolean CorrectPinBelowMin(){
		return false;}

	public boolean IncorrectPin(int attempts){
		return false;}

	public boolean Pin(String x){
		return false;}

	public boolean Lock(String x){
		return false;}

	public boolean IncorrectLock(){
		return false;}
	
	public boolean Unlock(String x){
		return false;}

	public boolean IncorrectUnlock(){
		return false;}

	public boolean Logout(){
		return false;}

	public float Deposit(float d){
		return d;}

	public float Balance(){
		return 0;}

	public boolean AboveMinBalance(float total){
		return false;}
	
	public boolean BelowMinBalance(float total){
		return false;}
	
	public boolean WithdrawBelowMinBalance(float total){
		return false;}

	public float Withdraw(float w){
		return w;}
}