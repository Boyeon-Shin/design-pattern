package ch02.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }
    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        //프레임 속성을 설정함
        frame.add(button);  // 버튼 추가
        frame.setSize(300, 200);  // 창 크기 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 닫기 버튼 설정
        frame.setVisible(true);  // 창 보이기
    }

    class AngelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지 마! 아마 후회할 걸?");
        }
    }


    class DevilListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷");
        }
    }
}
