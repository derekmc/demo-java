
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JPanel;


class Demo{
    static final int TICK = 60;
    static final int WARMUP = 400;
    public static void main(String args[]){
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DemoCanvas canvas = new DemoCanvas();
        frame.add(canvas);
        //frame.setLayout(null);

        frame.pack();
        frame.setVisible(true);
        Timer timer = new Timer(TICK, canvas);
        timer.setInitialDelay(WARMUP);
        timer.start();
        //frame.setSize(500, 300);
        System.out.println("Hello, World.");
    }
}

class DemoCanvas extends JPanel implements ActionListener{
    private int x = 30;
    private int size = 400;

    public DemoCanvas(){
        super(true);
        this.setPreferredSize(new Dimension(size, size));
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(x,30,80,60);
    }
    public void actionPerformed(ActionEvent e){
        x = (x + 5)%size;
        this.repaint();
    }
}
