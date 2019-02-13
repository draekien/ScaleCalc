import javax.swing.*;
import java.awt.*;

public class GuiApp {
    public void guiApp() {
        JFrame guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Example GUI");
        guiFrame.setSize(300,250);

        guiFrame.setLocationRelativeTo(null);

        String[] scaleOptions = {"Centimeter", "Metre", "Inches", "Feet", "Milligrams", "Grams",
                                    "Kilograms", "Ounces", "Pounds"};

        final JPanel comboPanel = new JPanel();
        JLabel comboLbl = new JLabel("Input:");
        JComboBox input = new JComboBox(scaleOptions);
        comboPanel.add(comboLbl);
        comboPanel.add(input);

        guiFrame.add(comboPanel, BorderLayout.NORTH);

        guiFrame.setVisible(true);
    }
}
