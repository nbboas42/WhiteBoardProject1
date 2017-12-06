import javax.swing.*;
import java.awt.*;

public class WhiteBoard extends JFrame
{
    Controller controller = new Controller();
    ControlPanel controlpanel = new ControlPanel();
    DrawingCanvas drawingcanvas = new DrawingCanvas();

    public static void main(String args[])
    {
        WhiteBoard program = new WhiteBoard();
        program.Initialize();

    }

    public void Initialize()
    {
        this.setTitle("WhiteBoard");
        this.setPreferredSize(new Dimension(800, 400));
        this.setLayout(new FlowLayout());
        this.add(controlpanel, BorderLayout.WEST);
        this.add(drawingcanvas,BorderLayout.CENTER);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

    }

}
