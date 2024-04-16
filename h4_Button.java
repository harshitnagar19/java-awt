import java.awt.*;

public class h4_Button {
    public static void main(String[] args) {
        Frame f = new Frame("button example");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        Button btn = new Button("click here");
        btn.setBounds(50, 50, 70, 30);
        f.add(btn);

    }
    
}
