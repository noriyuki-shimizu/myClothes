package source.domain.flg;

import source.domain.flg.bsFlg.ChangeFlg;

/**
 * 削除フラグを変換するクラス.
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
	
	public ChangeDelFlg(String delFlgStr) {
		super(delFlgStr);
	}
	
	@Override
	public String changeFlgBoolToStr() {
		if(this.flgBool == null) {
			throw new NullPointerException();
		}
		
		return (this.flgBool) ? delFlgStat.DEL_MSG : delFlgStat.NON_DEL_MSG;
	}
	
	@Override
	public Boolean changeFlgStrToBool() {
		if(this.flgStr == null) {
			throw new NullPointerException();
		}
		
		return (this.flgStr.equals(delFlgStat.DEL_MSG)) ? true : false;
	}

}
