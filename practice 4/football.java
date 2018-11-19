import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class football{

    public static void main(String args[]) {
        int milanScore = 0;

        JButton milan = new JButton("AC Milan");
        milan.setBounds(100, 100, 200, 100);

        JButton madrid = new JButton("Real Madrid");
        madrid.setBounds(500, 100, 200, 100);
        int madridScore = 0;

        JLabel score = new JLabel("Result: " + milanScore + " X " + madridScore);
        score.setBounds(365, 200, 100, 50);

        String lastScorer = "N/A";
        JLabel scorer = new JLabel("Last Scorer: " + lastScorer);
        scorer.setBounds(355, 235, 100, 50);

        String winnerInfo = "DRAW";
        JLabel winner = new JLabel("Winner: " + winnerInfo);
        winner.setBounds(360, 270, 100, 50);

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
