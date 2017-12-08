import javax.swing.*;
import java.awt.*;

public class WhiteBoard extends JFrame
{
    final static boolean shouldWeightX = true;
    final static boolean shouldFill = true;
    final static boolean RIGHT_TO_LEFT = false;

    Controller controller = new Controller();



    public static void main(String args[])
    {
        WhiteBoard program = new WhiteBoard();
        program.Initialize();

    }


    public void Initialize()
    {
        this.setTitle("WhiteBoard");
        //this.setSize(new Dimension(900, 450));  // setSize(), not setPreferredSize()
        //this.setSize(500, 500);
        this.setLayout(new GridBagLayout() );

        GridBagConstraints gbc = new GridBagConstraints();
        if(shouldFill)
        {
            gbc.fill = GridBagConstraints.HORIZONTAL;
        }

        ControlPanel controlpanel = new ControlPanel(controller);
        if(shouldWeightX)
        {
            gbc.weightx = 0.5;
        }
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.ipady = 200;
        gbc.anchor = GridBagConstraints.PAGE_START;
        this.add(controlpanel, gbc);


        DrawingCanvas drawingcanvas = new DrawingCanvas();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 200;
        gbc.ipadx = 200;
        gbc.weightx = 0.5;
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(drawingcanvas, gbc);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();

        addComponentsToPane(this.getContentPane());

        //this.setResizable(false);
        this.setVisible(true);
    }

    public static void addComponentsToPane( Container pane )
    {
        if( RIGHT_TO_LEFT)
        {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
    }

}
