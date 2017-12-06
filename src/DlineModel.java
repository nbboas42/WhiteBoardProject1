import java.awt.*;

public class DlineModel extends DShapeModel{
    DlineModel(int x, int y, int height, int width, Color c) {
        super(x, y, height, width, c);
    }

    DlineModel(int x, int y, Dimension d, Color c) {
        super(x, y, d, c);
    }

    DlineModel(Point p, int height, int width, Color c) {
        super(p, height, width, c);
    }

    DlineModel(Point p, Dimension d, Color c) {
        super(p, d, c);
    }
}
