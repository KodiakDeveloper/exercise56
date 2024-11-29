package bookExercises;

import javax.swing.JOptionPane;

public class Ex56 {

	public static void main(String[] args) {

		Double[][] grades = new Double[10][3];

		int line = 10, column = 3;

		Double sum = 0.0, arithmeticMean, userInput;

		String userAnswer;

		do {

			for (int i = 0; i < line; i++) {

				for (int j = 0; j < column; j++) {

					userInput = Double.parseDouble(JOptionPane.showInputDialog(null, "Line: " + i + "\nColumn: " + j));

					grades[i][j] = userInput;

					sum += grades[i][j];

				}

				arithmeticMean = sum / column;

				JOptionPane.showMessageDialog(null,
						i + 1 + "° Student" + "\nArithmetic Mean: " + Math.round(arithmeticMean));

				if (arithmeticMean <= 5) {

					JOptionPane.showMessageDialog(null, i + 1 + "° Student" + "\nFailed!!");
				}

				else {
					JOptionPane.showMessageDialog(null, i + 1 + "° Student" + "\nPassed!!");

				}

				sum = 0.0;
			}

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue?? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));
	}

}
