import javax.swing.*;

/**
 * Creates a jswing gui for inputting the parameters for world generation
 * Created by dillonenge on 3/3/17.
 */
public class GUI {
    public static void main(String[] args){
        JFrame jf = new JFrame("GUI");
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField text = new JTextField("Number of cities");
        JTextField text2 = new JTextField("Max Population");
        JTextField text3 = new JTextField("Min Population");
        JButton add =  new JButton("add");
        add.addActionListener(e ->
                Methods.createWorld(Integer.parseInt(text.getText()),Integer.parseInt(text2.getText()),Integer.parseInt(text3.getText())));
        JPanel allPanels = new JPanel();
        allPanels.setLayout(new BoxLayout(allPanels, BoxLayout.Y_AXIS));
        allPanels.add(text);
        allPanels.add(add);
        allPanels.add(text2);
        allPanels.add(text3);
        allPanels.add(add);
        jf.add(allPanels);
        jf.pack();

    }

}
