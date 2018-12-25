package source.factory.domain.flg;

import source.domain.flg.ChangeDelFlg;
import source.factory.domain.ChangeFlgFactory;

public class ChangeDelFlgFactory extends ChangeFlgFactory<String> {

	@Override
	protected ChangeDelFlg createObj(Boolean flg) {
		return new ChangeDelFlg(flg);
	}

}
