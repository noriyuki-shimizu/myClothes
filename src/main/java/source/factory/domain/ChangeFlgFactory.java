package source.factory.domain;

import source.domain.flg.bsFlg.ChangeFlg;

public abstract class ChangeFlgFactory<T> {

	public final ChangeFlg<T> create(Boolean flg) {
		return createObj(flg);
	}
	
	protected abstract ChangeFlg<T> createObj(Boolean flg);
	
}
