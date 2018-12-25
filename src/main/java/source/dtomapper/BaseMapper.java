package source.dtomapper;

import java.util.List;

public abstract class BaseMapper<E, D> {
	
	protected boolean _mappingOfRelatedFlg = false;
	
	public abstract E mappingToEntity(D d);
	
	public abstract D mappingToDto(E e);
	
	public abstract List<E> mappingToEntityList(List<D> ds);
	
	public abstract List<D> mappingToDtoList(List<E> es);
	
	public void mappingOfRelatedTables(boolean bool) {
		_mappingOfRelatedFlg = bool;
	}
	
}
