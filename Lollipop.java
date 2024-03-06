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
        UI.addButton("Draw", this::doDrawLollipop);   // call the draw lollipop method
        UI.addButton("Quit", UI::quit);
    }
    /**
     * draw a lillipop
     */
    public void doDrawLollipop() {
        // declare varibles
       
        // draw the stick
        UI.setColor(Color.black);
        UI.setLineWidth(10.0);
        UI.drawLine(XPOS, YPOS, XPOS, YPOS+STICK);
       
        // droaw the lollopop
        UI.setLineWidth(1.0);
        UI.setColor(Color.red);
        UI.fillOval(XPOS-(SIZE/2), YPOS-(SIZE/2), SIZE, SIZE);
    }
   
}
