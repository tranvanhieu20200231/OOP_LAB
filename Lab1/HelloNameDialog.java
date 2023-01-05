// Ho va ten: TranVanHieu
// MSSV: 20200231
// 2.2.3 Write, compile the first input dialog Java application
// Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;
public class HelloNameDialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "Hi " + result + "!");
		System.exit(0);
	}
}