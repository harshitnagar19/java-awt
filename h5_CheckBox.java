import java.awt.*;
public class h5_CheckBox {
    public static void main(String[] args) {
        Frame f = new Frame("here we give title of frame");
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

        Checkbox cLang = new Checkbox("c lang" ,true); // by giving second parament true , checkbox comes checked in Ui
        cLang.setBounds(30,30,100,50);
       
        Checkbox cppLang = new Checkbox("cppLang" ,true);
        cppLang.setBounds(30,80,100,50);
        
        Checkbox java = new Checkbox("java");
        java.setBounds(30,130,100,50);

        Checkbox javaScript = new Checkbox("javaScript");
        javaScript.setBounds(30,180,100,50);

        Checkbox html = new Checkbox("html");
        html.setBounds(30,220,100,50);

        Checkbox sql = new Checkbox(" sql");
        sql.setBounds(30,270,100,50);

        Checkbox moongo = new Checkbox("moongo");
        moongo.setBounds(30,320,100,50);

        Checkbox node = new Checkbox("node");
        node.setBounds(30,370,100,50);

     
        f.add(cLang);
        f.add(cppLang);
        f.add(java);
        f.add(javaScript);
        f.add(html);
        f.add(sql);
        f.add(moongo);
        f.add(node);
    }
}
