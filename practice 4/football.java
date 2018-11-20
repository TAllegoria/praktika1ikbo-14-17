import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;

public class football{

    static int milanScore = 0;
    static int madridScore = 0;

    public static String compare(int mln, int mdr) {
        if (mln > mdr) return "Winner: AC Milan";
        if (mln < mdr) return "Winner: Real Madrid";
        if (mln == mdr) return "Winner: DRAW";
        return null;
    }

    public static void main(String args[]) {

        JLabel score = new JLabel("Result: " + milanScore + " X " + madridScore);
        score.setBounds(365, 200, 100, 50);

        JLabel scorer = new JLabel("Last Scorer: N/A");
        scorer.setBounds(355, 235, 150, 50);

        JLabel winner = new JLabel("Winner: DRAW");
        winner.setBounds(360, 270, 150, 50);

        class milanListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                scorer.setText("Last Scorer: AC Milan");
                winner.setText(compare(milanScore, madridScore));
            }
        }

        class madridListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                score.setText("Result: " + milanScore + " X " + madridScore);
                scorer.setText("Last Scorer: Real Madrid");
                winner.setText(compare(milanScore, madridScore));
            }
        }

        JButton milan = new JButton("AC Milan");
        milan.setBounds(110, 100, 200, 100);
        milan.addActionListener(new milanListener());

        JButton madrid = new JButton("Real Madrid");
        madrid.setBounds(490, 100, 200, 100);
        madrid.addActionListener(new madridListener());

        JFrame frame = new JFrame("Football");
        frame.setLayout(null);
        frame.add(milan);
        frame.add(madrid);
        frame.add(score);
        frame.add(scorer);
        frame.add(winner);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}