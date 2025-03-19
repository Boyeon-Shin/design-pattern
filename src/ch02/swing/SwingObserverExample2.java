package ch02.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample2 {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample2 example = new SwingObserverExample2();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(event -> {
            System.out.println("하지 마! 아마 후회할걸");
        });
        button.addActionListener(event -> {
            System.out.println("그냥 저질러 버력");
        });

        //프레임 속성을 설정함
        frame.add(button);  // 버튼 추가
        frame.setSize(300, 200);  // 창 크기 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 닫기 버튼 설정
        frame.setVisible(true);  // 창 보이기
    }
}
