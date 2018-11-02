package source.domain.factory.flg.bs;

import source.domain.flg.bsFlg.ChangeFlg;

public abstract class ChangeFlgFactory<T> {

	public final ChangeFlg create(T flg) {
		return createObj(flg);
	}
	
	protected abstract ChangeFlg createObj(T flg);
	
}
