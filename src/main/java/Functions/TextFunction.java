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


}
