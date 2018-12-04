package source.mapper.base;

import java.util.List;

public abstract class BaseMapper<E, D> {
	
	protected E e;
	
	protected D d;
	
	protected List<E> es;
	
	protected List<D> ds;
	
	public abstract E mappingToEntity(D d);
	
	public abstract D mappingToDto(E e);
	
	public abstract List<E> mappingToEntityList(List<D> ds);
	
	public abstract List<D> mappingToDtoList(List<E> es);

}
