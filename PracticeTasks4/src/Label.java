import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Label extends JFrame {
    int madridScore = 0, milanScore = 0;
    JButton Milan = new JButton();
    ImageIcon MilanLogo =
            new ImageIcon((new ImageIcon("image/milan_logo.png").getImage()
                    .getScaledInstance(270, 400, Image.SCALE_SMOOTH)));
    JButton Madrid = new JButton();
    ImageIcon MadridLogo =
            new ImageIcon(new ImageIcon("image/madrid_logo.png").getImage()
                    .getScaledInstance(270, 400, Image.SCALE_SMOOTH));
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel lastScore = new JLabel("N/A");
    JLabel winner = new JLabel("Click on the buttons");
    Font fnt = new Font("Helvetica", Font.ITALIC, 38);
    // Метод для обработки информации о победителе
    public void printWinner() {
        if (madridScore > milanScore) {
            winner.setText("Winner: Real Madrid");
        } else if (madridScore < milanScore) {
            winner.setText("Winner: Milan");
        } else {
            winner.setText("DRAW");
        }
    }
    // Метод для обработки полей счета, победителя и последнего забившего
    public void JLabelSettings(JLabel jlabel) {
        jlabel.setHorizontalAlignment(JLabel.CENTER);
        jlabel.setForeground(Color.BLACK);
        jlabel.setFont(fnt);
    }
    // Метод обработки кнопок команд
    public void teamButton(JButton team, String teamName, Color color) {
        team.setText(teamName);
        team.setVerticalTextPosition(JButton.BOTTOM);
        team.setHorizontalTextPosition(JButton.CENTER);
        team.setForeground(color);
        team.setFont(fnt);
    }
    Label() {
        // Параметры окна
        super("Football Score");
        setIconImage(new ImageIcon("image/icon.jpg").getImage());
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(1000, 700));
        Milan.setIcon(MilanLogo);
        Milan.setFocusable(false);
        Milan.setBorderPainted(false);
        Madrid.setIcon(MadridLogo);
        Madrid.setFocusable(false);
        Madrid.setBorderPainted(false);
        // Обработка Milan
        add(Milan, BorderLayout.EAST);
        ActionListener ACMilanListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                result.setText("Result: " + milanScore + " X " + madridScore);
                printWinner();
                lastScore.setText("Last score: AC Milan");
            }
        };
        teamButton(Milan, "AC Milan", Color.BLACK);
        Milan.addActionListener(ACMilanListener);
        // Обработка Madrid
        add(Madrid, BorderLayout.WEST);
        ActionListener RealMadridListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                result.setText("Result: " + milanScore + " X " + madridScore);
                printWinner();
                lastScore.setText("Last score: Real Madrid");
            }
        };
        teamButton(Madrid, "Real Madrid", Color.BLACK);
        Madrid.addActionListener(RealMadridListener);

        add(result, BorderLayout.CENTER);
        JLabelSettings(result);
        add(winner, BorderLayout.NORTH);
        JLabelSettings(winner);
        add(lastScore, BorderLayout.SOUTH);
        JLabelSettings(lastScore);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Label();
    }
}