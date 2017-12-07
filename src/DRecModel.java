import java.awt.*;

public class DRecModel extends DShapeModel
{
    DRecModel(int x, int y, int height, int width, Color c)
    {
        super(x, y, height, width, c);
    }

    DRecModel(int x, int y, Dimension d, Color c)
    {
        super(x, y, d, c);
    }

    DRecModel(Point p, int height, int width, Color c)
    {
        super(p, height, width, c);
    }

    DRecModel(Point p, Dimension d, Color c)
    {
        super(p, d, c);
    }
}
