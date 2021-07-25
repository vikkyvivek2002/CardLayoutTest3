Nimport java.awt.*;
import java.awt.event.*;
public class CardLayoutTest implements ActionListener {
     
    Frame frame=new Frame("cardlayout");
    Panel panel1, panel2, panel3, cardPane;
    CardLayout card;
public CardLayoutTest() {
frame = new Frame("CardLayout Test");
frame.setSize(280, 200);
panel1 = new Panel();
panel1.setBackground(Color.RED);
Button button1 = new Button("Click me to change panel");
button1.setBackground(Color.white);
button1.addActionListener(this);
panel1.add(button1);
panel2 = new Panel();        
panel2.setBackground(Color.magenta);
 Button button2 = new Button("Click me to change panel");
button2.setBackground(Color.yellow);
        button2.addActionListener(this);
        panel2.add(button2);
panel3 = new Panel();
panel3.setBackground(Color.GREEN);
Button button3 = new Button("Click me to change panel");
button3.setBackground(Color.blue);
button3.addActionListener(this);
panel3.add(button3);
        cardPane = new Panel();
        card = new CardLayout();
        cardPane.setLayout(card);
        cardPane.add(panel1);
        cardPane.add(panel2);
        cardPane.add(panel3);
        frame.add(cardPane);
        frame.setVisible(true);
// window closing code
}
        public void actionPerformed(ActionEvent e) {
        card.next(cardPane);
    }
    public static void main(String args[]) {
        CardLayoutTest test = new CardLayoutTest();
    }
}


        
