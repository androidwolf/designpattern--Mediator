package Mediator;

public class ColleagueB implements Colleague {

	ConcreteMediator cm;
	String name;
	
	public ColleagueB(ConcreteMediator cm) {
		this.cm = cm;
		cm.registerColleagueB(this);
	}

	@Override
	public void giveMess(String[] mess) {
		cm.deliverMess(this, mess);
	}

	@Override
	public void receiverMess(String mess) {
		System.out.println(name + "�յ�����Ϣ");
		System.out.println("\t" + mess);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
