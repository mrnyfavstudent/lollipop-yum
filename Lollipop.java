import ecs100.*; //import lib
import java.awt.Color; // use differenct colours
/**
 * class demojstration to draw a ,lillkipop for our foirst gui
 *
 * @author (millie)
 * @version (v1)
 */
public class Lollipop
{
    // instance variables
    private static final double XPOS = 300.0; //horizontal centre of lollipop
    private static final double YPOS = 180.0; //vertical centre of lollipop
    private static final double STICK = 200.0; //lenght of of lollipop stick
    private static final double SIZE = 80.0; //size of lollipop
       

    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop()
    {
        // initialise instance variables
        UI.initialise();
        UI.addButton("Draw", this::drawLollipops);   // call the draw lollipop method
        UI.addButton("Quit", UI::quit);
    }
    /**
     * draw a lillipop
     */
    public void doDrawLollipop(double x, double y, double size, double stick) {
        // declare varibles
        double left = x - size/2; // left most postiio of lolipop
        double top = y - size/2; // top most position of lollipop 
        double bottom = y + stick; // bottom most position of lollipop
       
        // draw the stick
        UI.setColor(Color.black);
        UI.setLineWidth(size/8.0); // stick 1/8th size of lollipop 
        UI.drawLine(x, y, x, bottom);
       
        // droaw the lollopop
        UI.setLineWidth(1.0);
        UI.setColor(Color.red);
        UI.fillOval(left, top, SIZE, SIZE);
        
    }
    
    /**
     * calls the draw lollipop eiht diff paremeters
     */
    public void drawLollipops(){
        this.doDrawLollipop(300, 180, 80, 200);
        this.doDrawLollipop(200, 100, 110, 300);
    }
   
}
