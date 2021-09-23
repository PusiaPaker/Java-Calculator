import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Components {


    // STANDARD DIMENSIONS FOR THE BUTTONS
    public static final int LOCATION_X = 60;
    public static final int LOCATION_Y = 60;
    public static final Dimension BUTTON_SIZE = new Dimension(50, 50);
    public static final Dimension MATH_BUTTON_SIZE = new Dimension(70, 35);

    //  LABEL TEXT AND FONT
    public static final Font LABEL_FONT = new Font("Trebuchet MS", Font.PLAIN, 28);
    public static String LABEL_TEXT = "0";

    //  NUM OPERATIONS
    public static String LAST_OPERATION = "";
    public static double numResult = 0f;
    public static double numOne = 0f;


    //  TITLE TEXT
    public static final String TITLE_TEXT = "Calculator";

    //  IMAGE
    public static final ImageIcon ICON = new ImageIcon(Objects.requireNonNull(Window.class.getResource("/img/icon.png")));

    //  WINDOW COLORS
    public static final Color BG_COLOR = new Color(	249, 246, 238);

    //  SCREEN SIZE
    public static final Dimension DISPLAY_SIZE = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
    public static final Dimension SCREEN_SIZE = new Dimension(280, 370);
    public static final int WIDTH = (int) SCREEN_SIZE.getWidth();
    public static final int HEIGHT = (int) SCREEN_SIZE.getHeight();
}
