import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Account1 {
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
			float a=Float.parseFloat(br.readLine());
			mda=new MDA();
			open(p, y, a);
			System.out.println("Account opened\n");

			System.out.println("Account Login");
			System.out.println("Enter user id:");
			y=br.readLine();
			login(y);

			String ch=null,x;

			while (true)
			{
				System.out.println("Enter operation:\n1:Deposit 2:Withdraw 3:Balance Inquiry 4:Lock 5:Unlock 6:Logout");
				ch=br.readLine();

				switch (ch)
				{
				case "1": 
					System.out.println("Enter deposit amount");
					float d=Float.parseFloat(br.readLine());
					System.out.print("Balance: ");
					deposit(d);
					break;
				case "2": 
					System.out.println("Enter withdrawal amount");
					float w=Float.parseFloat(br.readLine());
					System.out.print("Balance: ");
					withdraw(w);
					break;
				case "3":
					System.out.println("Balance:");
					balance();
					break;
				case "4": 
					System.out.println("Enter pin to lock account");
					x=br.readLine();
					lock(x);
					break;
				case "5": 
					System.out.println("Enter pin to unlock account");
					x=br.readLine();
					unlock(x);
					break;
				case "6": 
					logout();
					break;
				default: 
					System.out.println("incorrect choice");
				}
			}
		}catch(Exception e){}
	}

	private void open(String p, String y, float a){
		data.setSpin(p);
		data.setSid(y);
		data.setFbal(a);
		data.setAcc(1);
		mda.Open(data);
	}
	private void pin (String x) throws IOException{
		if(!mda.Pin(x)){
			System.out.println("Login Unsuccessful. Try again");
			System.out.println("Enter pin");
			x=br.readLine();
			pin(x);
		}
	}
	private void deposit(float d){
		System.out.println(mda.Deposit(d));
	}
	private void withdraw (float w){
		System.out.println(mda.Withdraw(w));
	}
	private void balance(){
		System.out.println(mda.Balance());
	}
	private void login(String y) throws IOException{
		if(mda.Login(y)){
			String x=br.readLine();
			pin(x);
		}
		else{
			System.exit(0);
		}
	}
	private void logout() throws IOException{
		if(mda.Logout()){
			System.out.println("Logout successful");
			System.out.println("Account Login");
			System.out.println("Enter user id:");
			String y=br.readLine();
			login(y);
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
