import javax.swing.JOptionPane;

public class WSQ08 {
	
	public long lowerbound,
	   upperbound,
	   lychrel,
	   nonlychrel,
	   palindrome;
	
	public WSQ08(long a,long b){
		this.lowerbound=a;
		this.upperbound=b;
		this.lychrel=0;
		this.nonlychrel=0;
		this.palindrome=0;
	}
	
	public void getLych(long number){
		long x = number;
		long iterations = 0;
		while (iterations <= 30){
			long reversex = reverse(x);
			if (x == reversex){
				System.out.println("The number " + number + " became a palindrome after: " + iterations + " iterations.");
				if (iterations == 0){
					this.palindrome += 1;
				}
				this.nonlychrel += 1;
				break;
			}
			else if (iterations == 30){
				System.out.println("The number " + number + " didn't become a palindrome after 30 iterations, so it is a Lychrel number.");
				this.lychrel += 1;
				break;
			}
			else {
				x = x + reversex;
				iterations +=1;
			}
		}
	}
	
	public long reverse(long number){
		long reversingN = number;
		long reversed = 0;
		while (reversingN != 0){
			reversed = reversed * 10 + reversingN % 10;
			reversingN = reversingN / 10;
		}
		return reversed;
	}
	
	public void orderingLych(){
		for(long step = this.lowerbound; step <= this.upperbound; step += 1){
			this.getLych(step);
		}
	System.out.println("The range from " + this.lowerbound + " to " + this.upperbound);
	System.out.println("The number of natural palindromes is: " + this.palindrome); 
	System.out.println("The number of Lychrel numbers is: " + this.lychrel);
	System.out.println("The number of non-Lychrel numbers is: " + this.nonlychrel);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstinput = JOptionPane.showInputDialog("Give me a number");
		long numero1 = Long.parseLong(firstinput);
		String secondinput = JOptionPane.showInputDialog("Give me another number");
		long numero2 = Long.parseLong(secondinput);
		WSQ08 a = new WSQ08(numero1,numero2);
		a.orderingLych();

	}

}
