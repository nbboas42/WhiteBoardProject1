import java.awt.*;

public class DTextModel extends DShapeModel
{
    DTextModel(int x, int y, int height, int width, Color c) {
        super(x, y, height, width, c);
    }

    DTextModel(int x, int y, Dimension d, Color c) {
        super(x, y, d, c);
    }

    DTextModel(Point p, int height, int width, Color c) {
        super(p, height, width, c);
    }

    DTextModel(Point p, Dimension d, Color c) {
        super(p, d, c);
    }
}
