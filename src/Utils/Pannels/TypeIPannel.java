package Utils.Pannels;

import java.awt.GridLayout;

import javax.swing.JPanel;

//Gridlayout pannel, presetted to call it out and add component later
public class TypeIPannel extends JPanel {

    public TypeIPannel(int rowcount) {
        setLayout(new GridLayout(rowcount, 1));
    }

}
