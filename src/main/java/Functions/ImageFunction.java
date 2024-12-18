package Functions;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public abstract class ImageFunction {

    public static ImageIcon scaleImage(JLabel label, ImageIcon icon) {
        int labelWidth = label.getWidth();
        int labelHeight = label.getHeight();

        // Lấy ảnh từ ImageIcon
        Image img = icon.getImage();

        // Thay đổi kích thước của hình ảnh để vừa với kích thước của JLabel
        Image scaledImg = img.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

        // Đặt ImageIcon đã thay đổi kích thước vào JLabel
        ImageIcon scaledIcon = new ImageIcon(scaledImg);
        return scaledIcon;
    }
}
