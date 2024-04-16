import java.awt.*;

public class h3_Label {
    public static void main(String[] args) {
        Frame f = new Frame("here we give title of frame");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);

        Label lb = new Label("First label");
        lb.setBounds(50,50,200,50);
        Label lbUserName = new Label("Enter User Name ");
        lbUserName.setBounds(50,100,200,50);
        Label lbPassword = new Label("Enter Password");
        lbPassword.setBounds(50,150,200,50);

        f.add(lb);
        f.add(lbUserName);
        f.add(lbPassword);
    }
}

//label = it is used to label any thing
