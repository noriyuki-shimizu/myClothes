package source.mapper;

import java.util.List;

public abstract class BaseMapper<E, D> {
	
	public abstract E mappingToEntity(D d);
	
	public abstract D mappingToDto(E e);
	
	public abstract List<E> mappingToEntityList(List<D> ds);
	
	public abstract List<D> mappingToDtoList(List<E> es);
	
}
