import java.util.*;

public class TokenRing{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);//Scanner Object
		
		System.out.print("Enter Number Of Nodes You Want In The Ring : ");
		int n = sc.nextInt();
		
		System.out.println("Ring Formed Is As Below: ");
		for(int i=0; i<n; i++){
			System.out.print(i + " ");
		}
		
		System.out.println("0");//How nodes ring form it will shown 
		
		int choice = 0;
		
		do{
			System.out.print("Enter Sender : ");
			int sender = sc.nextInt();
			
			System.out.print("Enter Receiver : ");
			int receiver = sc.nextInt();
			
			System.out.print("Enter Data To Send : ");
			int data = sc.nextInt();
			
			System.out.print("Token Passing : ");
			
			int token=0;

			//token passing loop jab tak sender nhi milta tab tak token will be incremented
			for(int i=token; i<sender; i++){
				System.out.print(" " + i + "->");
			}
			
			System.out.println(" " + sender);
			System.out.println("Sender: " + sender + " Sending The Data: " + data);
			
			for(int i=sender; i!=receiver; i = (i+1)%n){
				System.out.println("Data: " + data + " Forwarded By: " + i);
			}

			System.out.println("Receiver: " + receiver + " Received The Data: " + data + "\n");
			
			token = sender;
			
			System.out.print("Do You Want To Send Data Again? If YES Enter 1, If NO Enter 0: ");
			choice = sc.nextInt();
		}while(choice == 1);			
	}
}
/*
n=10
(i+1)%10
 
 i=8
 9%10=9
*/