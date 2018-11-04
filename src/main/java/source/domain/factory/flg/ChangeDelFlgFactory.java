package source.domain.factory.flg;

import source.domain.factory.flg.bs.ChangeFlgFactory;
import source.domain.flg.ChangeDelFlg;

public class ChangeDelFlgFactory extends ChangeFlgFactory {

	@Override
	protected ChangeDelFlg createObj(Boolean flg) {
		return new ChangeDelFlg(flg);
	}

}
