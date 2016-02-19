import javax.swing.JOptionPane;

public class WSQ07 {
		public static void BM(double a){
		double firstnum = a/2;
		double secondnum = a+1;
		while(firstnum!=secondnum){
			double thirdnum = a / firstnum;
			secondnum = firstnum;
			firstnum= (firstnum+thirdnum)/2;
		}
		System.out.print("The square root is: ");
		System.out.println(firstnum);
	}
	public static void main(String[] args) {
		String firstnum = JOptionPane.showInputDialog("Give me a number");
		double primer = Double.parseDouble(firstnum);
		BM(primer);
	}
}
