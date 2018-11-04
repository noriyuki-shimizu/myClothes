package source.domain.factory.flg.bs;

import source.domain.flg.bsFlg.ChangeFlg;

public abstract class ChangeFlgFactory {

	public final ChangeFlg create(Boolean flg) {
		return createObj(flg);
	}
	
	protected abstract ChangeFlg createObj(Boolean flg);
	
}
