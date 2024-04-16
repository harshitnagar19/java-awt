
import java.awt.*;
public class h2_Panel {
    public static void main(String[] args) {
        Frame f = new Frame("here we give title of frame");
        f.setSize(400,500);
        f.setVisible(true);
        f.setLayout(null);  

        Panel p = new Panel();
        Panel p1 = new Panel();
        p.setSize(200, 200);
        p.setBackground(Color.yellow);

        p1.setBackground(Color.blue);
        p1.setBounds(200, 0, 200, 200);

      f.add(p);
      f.add(p1);
    }
}

//panel = panel is lke a frame ,
// the difference is that frame have a title where panel does not .
// and frame is like a window , where panel is a container in window

//--------------------------------------------------------------

//we have to add all component in frame (by add() method).
//setBounds() is a method use set position from frame by giving x , y coordiantes , and use to set size of component



