package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame { // JFrame은 JAVA에서 GUI 기반 프로그램을 만들 때 기본적으로 상속받는 라이브러리입니다.
	
	public DynamicBeat() { // 생성자 생성 (인스턴스 생성 시 실행 됨)
		setTitle("Dynamic Beat"); // 제목 설정
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); // 전체 게임창의 크기를 설정합니다.
		setResizable(false); // 한 번 만들어진 게임창은 사용자가 임의로 변경할 수 없습니다.
		setLocationRelativeTo(null); // 실행 시 게임창을 화면의 정중앙에 띄웁니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 창을 종료하면 프로그램을 종료합니다.
		setVisible(true); // 만든 게임 창이 화면에 출력되도록 설정합니다. (기본 값은 false)
	}
}
