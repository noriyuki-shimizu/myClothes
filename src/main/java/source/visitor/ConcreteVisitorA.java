package source.visitor;

import source.visitor.bs.Visitor;

public class ConcreteVisitorA extends Visitor{

	@Override
	public <MBrandDto> void visit(ConcreteAcceptorA<MBrandDto> acceptorA) {
		acceptorA.getName();
	}

}
