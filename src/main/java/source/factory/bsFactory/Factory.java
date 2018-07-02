package source.factory.bsFactory;

import java.util.Map;

/**
 * オブジェクト製造工場.
 * @author Noriyuki-Shimizu
 *
 * @param <T> Flyweight_key
 * @param <E> Dto_Object
 */
public abstract class Factory<T, E> {

	protected Map<T, E> pool;
	
	public final E create(T ownerId) {
		return createObj(ownerId);
	}
	
	protected abstract E createObj(T ownerId);
	
}
