import java.awt.*;

public class DOvalModel extends DShapeModel
{


    DOvalModel(int x, int y, int height, int width, Color c) {
        super(x, y, height, width, c);
    }

    DOvalModel(int x, int y, Dimension d, Color c) {
        super(x, y, d, c);
    }

    DOvalModel(Point p, int height, int width, Color c) {
        super(p, height, width, c);
    }

    DOvalModel(Point p, Dimension d, Color c) {
        super(p, d, c);
    }
}
