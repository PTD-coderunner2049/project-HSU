package Functions;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public abstract class TextFunction {
	public static void addDateInputClamper(JTextField textField, int min, int max, int digitSize) {
		textField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			// -----------------------------------------
			public void insertUpdate(DocumentEvent e) {
				clampingInput(e, textField, min, max, digitSize);
			}

			public void removeUpdate(DocumentEvent e) {
				clampingInput(e, textField, min, max, digitSize);
			}

			public void changedUpdate(DocumentEvent e) {
			}

			// -----------------------------------------
			private void clampingInput(DocumentEvent e, JTextField textField, int min, int max, int digitSize) {
				if (textField.getText().length() > digitSize) { // Allow only 2 digits for hour
					javax.swing.SwingUtilities.invokeLater(() -> textField.setText(
							textField.getText().substring(0, digitSize)));
				}
				try {
					if (!textField.getText().isEmpty()) {
						int i = Integer.parseInt(textField.getText());
						if (i < min) {// Validating
							javax.swing.SwingUtilities.invokeLater(() -> textField.setText(Integer.toString(min)));
						} else if (i > max) {
							javax.swing.SwingUtilities.invokeLater(() -> textField.setText(Integer.toString(max)));
						} // edit text while the updating event is happening in thread is ilegal, so I
					} // queue it for after.
				} catch (NumberFormatException ex) {
					javax.swing.SwingUtilities.invokeLater(() -> textField.setText(""));
					// Clear non-numeric input. how? I aint know :)))
				}
			}
		});
	}

	public static int calculateMaxDay(JTextField month, JTextField year) {
		// turn out the resetall text() take responsible for setting reqted month, and I
		// have it run before this so it was causeing exception. fixed at commit 103.
		switch (Integer.parseInt(month.getText())) {
			case 2:
				int iYear = Integer.parseInt(year.getText());
				return (iYear % 4 == 0 && (iYear % 100 != 0 || iYear % 400 == 0)) ? 29 : 28;
			case 4, 6, 9, 11:
				return 30;
			default:
				return 31;
		}
	}

	public static void addDateInputClamper(JTextField textField, int min, JTextField month, JTextField year,
			int digitSize) {
		textField.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			// -----------------------------------------
			public void insertUpdate(DocumentEvent e) {
				clampingInput(e, textField, min, month, year, digitSize);
			}

			public void removeUpdate(DocumentEvent e) {
				clampingInput(e, textField, min, month, year, digitSize);
			}

			public void changedUpdate(DocumentEvent e) {
			}

			// -----------------------------------------
			private void clampingInput(DocumentEvent e, JTextField textField, int min, JTextField month,
					JTextField year, int digitSize) {
				if (textField.getText().length() > digitSize) { // Allow only 2 digits for hour
					javax.swing.SwingUtilities.invokeLater(() -> textField.setText(
							textField.getText().substring(0, digitSize)));
				}
				int max = calculateMaxDay(month, year);
				try {
					if (!textField.getText().isEmpty()) {
						int i = Integer.parseInt(textField.getText());
						if (i < min) {// Validating
							javax.swing.SwingUtilities.invokeLater(() -> textField.setText(Integer.toString(min)));
						} else if (i > max) {
							javax.swing.SwingUtilities.invokeLater(() -> textField.setText(Integer.toString(max)));
						} // edit text while the updating event is happening in thread is ilegal, so I
					} // queue it for after.
				} catch (NumberFormatException ex) {
					javax.swing.SwingUtilities.invokeLater(() -> textField.setText(""));
					// Clear non-numeric input. how? I aint know :)))
				}
			}
		});
	}

}
