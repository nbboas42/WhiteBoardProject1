import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawingCanvas extends JPanel implements MouseListener
{
    private ArrayList<DShape> shapeList;
    private DShape selectedShape;
    private int slecetedshapeIndex;

   public DrawingCanvas()
   {
       this.add(new Button("hello"));
       this.setPreferredSize(new Dimension(200, 200));
       this.setBackground(Color.black);
       this.setBorder(BorderFactory.createLineBorder(Color.CYAN));
       this.setVisible(true);

   }



    public int getSlecetedshapeIndex() {
        return slecetedshapeIndex;
    }



    public DShape getSelectedShape() {
        return selectedShape;
    }

    public ArrayList<DShape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<DShape> shapeList) {
        this.shapeList = shapeList;
    }

    public void reDraw()
    {

    }

    private void findShapeAt(Point p)
    {
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
