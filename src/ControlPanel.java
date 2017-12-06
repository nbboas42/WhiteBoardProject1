import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel
{

    public ControlPanel() {
        this.add(new Button("hello"));
        this.setPreferredSize(new Dimension(400, 400));
        this.setBackground(Color.white);
        this.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        this.setVisible(true);
    }
}
