package source.visitor;

import source.visitor.bs.Accept;
import source.visitor.bs.Visitor;

public class ConcreteAcceptorA<T> extends Accept {

	private String name = "ConcreteAcceptorA";
    public String getName() {
        return name;
    }
    
    
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
