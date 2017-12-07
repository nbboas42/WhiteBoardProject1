import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JFrame
{

    private JPanel panelHolder;
    private JPanel topButtonPanel;
    private JPanel bottomPanel;
    private JPanel middleButtonPanel;
    private JLabel addLabel;
    private JButton rectButton;
    private JButton ovalButton;
    private JButton lineButton;
    private JButton textButton;
    private JButton setColorButton;
    private JButton moveToFrontButton;
    private JButton moveToBackButton;
    private JButton removeShapeButton;
    private JTextField textInputField;
    private JComboBox fontComboBox;

    public ControlPanel()
    {
        // this.add(new Button("hello"));
        // this.setPreferredSize(new Dimension(400, 400));
        //this.setBackground(Color.white);
        //this.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        // this.setVisible(true);

        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Control Panel");


        panelHolder = new JPanel();
        panelHolder.setLayout(new GridLayout(3,5));

        topButtonPanel = new JPanel();
        topButtonPanel.setLayout( new FlowLayout(FlowLayout.LEFT) );
        topButtonPanel.setBackground(Color.LIGHT_GRAY);

        middleButtonPanel = new JPanel();
        middleButtonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        middleButtonPanel.setBackground(Color.LIGHT_GRAY);

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.setBackground(Color.LIGHT_GRAY);

        addLabel = new JLabel("Add ");
        rectButton = new JButton("Rect");
        ovalButton = new JButton("Oval");
        lineButton = new JButton("Line");
        textButton = new JButton("Text");
        setColorButton = new JButton("Set Color");
        moveToBackButton = new JButton("Move to Back");
        moveToFrontButton = new JButton("Move to Front");
        removeShapeButton = new JButton("Remove Shape");
        textInputField = new JTextField(10);

        fontComboBox = new JComboBox();

        topButtonPanel.add(addLabel);
        topButtonPanel.add(rectButton);
        topButtonPanel.add(ovalButton);
        topButtonPanel.add(lineButton);
        topButtonPanel.add(textButton);

        middleButtonPanel.add(setColorButton);
        middleButtonPanel.add(textInputField);
        middleButtonPanel.add(fontComboBox);

        bottomPanel.add(moveToFrontButton);
        bottomPanel.add(moveToBackButton);
        bottomPanel.add(removeShapeButton);

        panelHolder.add(topButtonPanel);
        panelHolder.add(middleButtonPanel);
        panelHolder.add(bottomPanel);
        this.add(panelHolder);


        this.setVisible(true);

    }



        /**
        public static void main(String args[])
        {
            new Window();
        }
    }

    class FontComboBox extends JFrame
    {
        private  JComboBox comboBox;

        public FontComboBox() {
            setTitle("Font Combo Box");
            String font[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            comboBox = new JComboBox(font);
            setVisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(0, 0, 350, 300);
        }

        public void createComboBox() {
            Container c = getContentPane();
            c.setLayout(new FlowLayout());
            c.add(comboBox);
        }
    }

         */
}
