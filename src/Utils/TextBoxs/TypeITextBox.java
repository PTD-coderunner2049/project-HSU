package Utils.TextBoxs;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class TypeITextBox extends JTextField implements FocusListener {
    String preText;
    public static int width = 200;
    public static int height = 35;
    public static String fontStyle = "Comic Sans MS";// ?Congenial Black

    public TypeITextBox(int x, int y, String preText) {
        setBounds(x, y, width, height);
        setText(preText);
        // setFocusable(false);
        setFont(new Font(fontStyle, Font.ITALIC, 16));
        setBackground(new Color(255, 230, 230));
        this.preText = preText;
        addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (getText().equals(preText)) {
            setText("");
        }
    }

    public void focusLost(FocusEvent e) {
        if (getText().isEmpty()) {
            setText(preText);
        }
    }
}