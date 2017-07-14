import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Account2 {
	private MDA mda = null;
	private Data data=null;
	BufferedReader br = null;
	
	public void service()
	{
		try{
			data=new Data();
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Open account\n");
			System.out.println("Enter user id: ");
			String y=br.readLine();
			System.out.println("Enter account pin: ");
			String p=br.readLine();
			System.out.println("Enter balance:");
			String a = br.readLine();
			mda=new MDA();
			OPEN(Integer.parseInt(p), Integer.parseInt(y), Integer.parseInt(a));
			System.out.println("Account opened\n");

			System.out.println("Account Login");
			System.out.println("Enter user id:");
			int s=Integer.parseInt(br.readLine());
			LOGIN(s);

			String ch=null,x;

			while (true)
			{
				System.out.println("Enter operation:\n1:Deposit 2:Withdraw 3:Balance Inquiry 4:Suspend 5:Activate 6:Logout 7:Close");
				ch=br.readLine();

				switch (ch)
				{
				case "1": 
					System.out.println("Enter deposit amount");
					int d=Integer.parseInt(br.readLine());
					System.out.print("Balance: ");
					DEPOSIT(d);
					break;
				case "2": 
					System.out.println("Enter withdrawal amount");
					int w=Integer.parseInt(br.readLine());
					System.out.print("Balance: ");
					WITHDRAW(w);
					break;
				case "3":
					System.out.println("Balance:");
					BALANCE();
					break;
				case "4": 
					System.out.println("Enter pin to suspend account");
					x=br.readLine();
					lock(x);
					break;
				case "5": 
					System.out.println("Enter pin to activate account");
					x=br.readLine();
					unlock(x);
					break;
				case "6": 
					LOGOUT();
					break;
				case "7": 
					close();
					break;
				default: 
					System.out.println("incorrect choice");
				}
			}
		}catch(Exception e){}
	}

	private void close() {
		// TODO Auto-generated method stub
		System.out.println("Exiting system");
		System.exit(0);
	}

	private void OPEN(int p, int y, int a){
		data.setSpin(String.valueOf(p));
		data.setSid(String.valueOf(y));
		data.setFbal(a);
		data.setAcc(1);
		mda.Open(data);
	}
	private void PIN(int x) throws IOException{
		if(mda.Pin(String.valueOf(x))){
			System.out.println("Login Unsuccessful. Try again");
			System.out.println("Enter pin");
			int p=Integer.parseInt(br.readLine());
			PIN(p);
		}
	}
	private void DEPOSIT(int d){
		System.out.println(mda.Deposit(d));
	}
	private void WITHDRAW(float w){
		System.out.println(mda.Withdraw(w));
	}
	private void BALANCE(){
		System.out.println(mda.Balance());
	}
	private void LOGIN(int y) throws IOException{
		if(mda.Login(String.valueOf(y))){
			int a=Integer.parseInt(br.readLine());
			PIN(a);
		}
		else{
			System.exit(0);
		}
	}
	private void LOGOUT() throws IOException{
		if(mda.Logout()){
			System.out.println("Logout successful");
			System.out.println("Account Login");
			System.out.println("Enter user id:");
			int y=Integer.parseInt(br.readLine());
			LOGIN(y);
		}
	}
	private void lock(String x){
		if(mda.Lock(x)){
			System.out.println("Successfully Locked");
		}
		else{
			System.out.println("Incorrect pin to lock");
		}
	}
	private void unlock(String x){
		if(mda.Lock(x)){
			System.out.println("Successfully Unlocked");
		}
		else{
			System.out.println("Incorrect pin to unlock");
		}
	}
}
