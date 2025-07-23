package project5;
import java.util.*;
public class project1{

	public static void main(String[] args) {
		int Balance=5000;
		
		for(int i=1;i<=4;i++){
			System.out.println("Enter 1 for Withdraw");
			System.out.println("Enter 2 for Deposit");
			System.out.println("Enter 3 for Check Balance");
			System.out.println("Enter 4 for EXIT");
			System.out.println("Choose the operation: ");
			Scanner Enter=new Scanner(System.in);
			int enter=Enter.nextInt();
			i=enter;
			if(enter==1){
				System.out.println("Enter the money to be withdrawn");
				Scanner W=new Scanner(System.in);
				int w=W.nextInt();
				if(w>Balance){
					System.out.println("Not Suffecient Balance!");
				}else if(w<Balance){
					System.out.println("collect your money");
					Balance=(Balance-w);
				}
			}else if(enter==2){
				System.out.println("Enter money to be deposited");
				Scanner D=new Scanner(System.in);
				int d=D.nextInt();
				Balance=(Balance+d);
				System.out.println("Your money has been deposited successfully");
			}
			else if(enter==3){
				System.out.println("Your Balance "+Balance);
			}
			else if(enter==4){
				System.out.println("");
			}
		}

        }
		}
