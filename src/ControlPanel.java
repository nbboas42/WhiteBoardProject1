import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ControlPanel extends JPanel
{

    private JPanel panelHolder;
    private JPanel topButtonPanel;
    private JPanel bottomPanel;
    private JPanel middleButtonPanel;
    private JPanel tablePanel;

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

    public ControlPanel(Controller c)
    {
        // this.add(new Button("hello"));
        // this.setPreferredSize(new Dimension(400, 400));
        //this.setBackground(Color.white);
        //this.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        // this.setVisible(true);

       // this.setSize(600, 300);


        /**
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

        tablePanel = new JPanel();
        tablePanel.setLayout(new FlowLayout(FlowLayout.TRAILING));
        tablePanel.setBackground(Color.YELLOW);
        tablePanel.setSize(600, 300);

         */

        GridBagConstraints gbc = new GridBagConstraints();

        panelHolder = new JPanel( new GridBagLayout() );
        topButtonPanel = new JPanel( new GridBagLayout());
        middleButtonPanel = new JPanel( new GridBagLayout());
        bottomPanel = new JPanel( new GridBagLayout() );
        tablePanel = new JPanel(new GridBagLayout() );

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

        // declare JComboBox and an array for Fonts
        String fontArray[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        JComboBox fonts = new JComboBox(fontArray);


        topButtonPanel.add(addLabel);
        topButtonPanel.add(rectButton);
        topButtonPanel.add(ovalButton);
        topButtonPanel.add(lineButton);
        topButtonPanel.add(textButton);

        middleButtonPanel.add(setColorButton);
        middleButtonPanel.add(textInputField);
        middleButtonPanel.add(fonts);

        bottomPanel.add(moveToFrontButton);
        bottomPanel.add(moveToBackButton);
        bottomPanel.add(removeShapeButton);

        // declare JTable and an array for columns
        String [] columns = {"X", "Y", "Width", "Height"};
        String[][] data = {{"X-coord", "Y-coord", "10", "10"},
                {"X-coord", "Y-coord", "20", "20"}, {"X-coord", "Y-coord", "10", "10"},
                {"X-coord", "Y-coord", "10", "10"}};

        JTable table = new JTable(data, columns);
        table.setPreferredScrollableViewportSize( new Dimension(450, 100));
        table.setFillsViewportHeight(true);
        JScrollPane jps = new JScrollPane(table);
        tablePanel.add(jps);

        JTableHeader tHeader = table.getTableHeader();
        tHeader.setBackground(Color.LIGHT_GRAY);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(5,0,0,0);
        panelHolder.add(topButtonPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10,0,0,0);
        panelHolder.add(middleButtonPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(20,0,0,0);
        panelHolder.add(bottomPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.insets = new Insets(20,0,0,0);
        panelHolder.add(tablePanel, gbc);

        this.add(panelHolder);
        this.setVisible(true);
    }


        /**
        public static void main(String args[])
        {
            new Window();
        }
    }
         */
}



/**
class Table extends JPanel
{
    //uper(new GridLayout(1,0));

    String[] colNames = {"X", "Y", "Width", "Height"};
}

*/