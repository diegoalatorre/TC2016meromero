//WSQ06
import javax.swing.JOptionPane;

public class GCD {
	
	public static void result(int A, int B){
		int result;
		if(A>B){
			result = B;
		}
		else
			result=B;
		while((A%result)!=0 || (B % result)!= 0){
			result--;
		}
		System.out.println("The GCD of "+A+" and "+B+" is: "+result);
	}

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Give me a number: ");
		int firstnum = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Give me another one: ");
		int secondnum = Integer.parseInt(num2);
		result(firstnum,secondnum);
	}

}

