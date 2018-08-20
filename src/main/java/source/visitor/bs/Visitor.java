package source.visitor.bs;

import source.visitor.ConcreteAcceptorA;

public abstract class Visitor {

	public abstract <T> void visit(ConcreteAcceptorA<T> acceptorA);

}
