import java.io.BufferedReader;
import java.io.InputStreamReader;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("SELECT ACCOUNT: \n\t 1: ACCOUNT-1 \n\t 2: ACCOUNT-2");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int ch=Integer.parseInt(br.readLine());
			switch (ch)
			{
			case 1: 
				System.out.println("Account 1"); 
				Account1 acc1=new Account1(); 
				acc1.service();
				break;
			case 2: 
				System.out.println("Account 2"); 
				Account2 acc2=new Account2(); 
				//acc2.service();
				break;
			default:
				System.out.println("wrong choice");
			}
		}catch(Exception e){}
	}
}