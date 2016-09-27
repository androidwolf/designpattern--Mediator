package Mediator;

public class Appication {

	public static void main(String[] args) {
		ConcreteMediator cm = new ConcreteMediator();
		ColleagueA colleagueA = new ColleagueA(cm);
		ColleagueB colleagueB = new ColleagueB(cm);
		ColleagueC colleagueC = new ColleagueC(cm);
		colleagueA.setName("A��");
		colleagueB.setName("B��");
		colleagueC.setName("C��");
		String[] messA = {"Ҫ��黹�������100������", "Ҫ��黹�������20ͷţ"};
		colleagueA.giveMess(messA);
		
		String[] messB = {"Ҫ��黹�������10ֻ����", "Ҫ��黹�������15ƥ��"};
		colleagueB.giveMess(messB);
		
		String[] messC = {"Ҫ��黹�������300��С��", "Ҫ��黹�������50ͷ¿"};
		colleagueC.giveMess(messC);
	}

}
