package source.domain.factory;

/**
 * <h2>オブジェクト製造工場.</h2>
 * <pre>
 * オブジェクトのインスタンスを生成する.
 * </pre>
 * @author Noriyuki-Shimizu
 *
 * @param <E> Object
 */
public abstract class Factory<E> {

	public final E create() {
		return createObj();
	}
	
	protected abstract E createObj();
	
}
