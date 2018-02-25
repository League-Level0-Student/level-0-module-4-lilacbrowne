import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String testscore = JOptionPane.showInputDialog("What is your test score?");
double t 	= Double.parseDouble(testscore);
if(t>100 ) {
	JOptionPane.showMessageDialog(null, "WOW! A++!"); 
} else if (97 <= t && t <= 100) {
	JOptionPane.showMessageDialog(null, "A+! Awesome!");
} else if (93 <= t && t < 97 ) {
	JOptionPane.showMessageDialog(null, "You should be proud! That's a great score!");
} else if (90 <= t && t < 93) {
	JOptionPane.showMessageDialog(null, "Good job! That's a great score :) !");
} else if (87 <= t && t < 90) {
	JOptionPane.showMessageDialog(null, "B+ is great if you're happy with it!");
} else if (83 <= t && t < 87) {
	JOptionPane.showMessageDialog(null, "Solid score!");
} else if (80 <= t && t < 83) {
	JOptionPane.showMessageDialog(null, "You still can improve, but this is a great start!");
} else if (77 <= t && t < 80) {
	JOptionPane.showMessageDialog(null, "You can learn from your mistakes and get a great score!");
} else if (73 <= t && t < 77) {
	JOptionPane.showMessageDialog(null, "Hey, your score is average! That's not that bad!");
} else if (70 <= t && t < 73) {
	JOptionPane.showConfirmDialog(null, "Oh no...! Are there test corrections?");
} else if ( 67 <= t && t < 70) {
	JOptionPane.showMessageDialog(null, "One bad test won't hurt you THAT much... right?");
} else if (63 <= t && t < 67) {
	JOptionPane.showMessageDialog(null, "Hmmmm. It was probably just a bad day.");
} else if (60 <= t && t < 63) {
	JOptionPane.showMessageDialog(null, "At least it's not an F!");
} else {
	JOptionPane.showMessageDialog(null, "ERROR. Cannot comprehened score. Better luck next time.");
}


} 
}
