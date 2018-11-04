package source.domain.flg;

import source.domain.flg.bsFlg.ChangeFlg;

/**
 * 削除フラグをBoolean値からString値へ変換するクラス.
 * @author Noriyuki-Shimizu
 *
 */
public class ChangeDelFlg extends ChangeFlg {
	
	private static class delFlgStat {
		
		static final String DEL_MSG = "削除済み";
		
		static final String NON_DEL_MSG = "未削除";
	
	}
	
	public ChangeDelFlg(Boolean delFlg) {
		super(delFlg);
	}
	
	@Override
	public String changeFlg() {
		if(this.isNullOrEmpty()) {
			throw new NullPointerException();
		}
		
		return 	Boolean.valueOf(this.flg) ? delFlgStat.DEL_MSG : delFlgStat.NON_DEL_MSG;
	}
	
	private boolean isNullOrEmpty() {
		return this.flg == null;
	}

}
