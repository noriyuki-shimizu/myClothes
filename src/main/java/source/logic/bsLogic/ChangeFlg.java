package source.logic.bsLogic;

/**
 * 各Dtoにおけるフラグを変換する抽象クラス.
 * @author Noriyuki-Shimizu
 *
 */
public abstract class ChangeFlg {
	
	protected Boolean flgBool;
	
	protected String flgStr;
	
	public ChangeFlg(Boolean flgBool) {
		this.flgBool = flgBool;
	}
	
	public ChangeFlg(String flgStr) {
		this.flgStr = flgStr;
	}
	
	/**
	 * フラグを真偽値から文字列へ変換する.
	 * 必ず、コンストラクタで真偽値を設定してください.
	 * @return 変換された文字列
	 */
	public abstract String changeFlgBoolToStr();
	
	/**
	 * フラグを文字列から真偽値へ変換する.
	 * 必ず、コンストラクタで文字列を設定してください.
	 * @return 変換された真偽値
	 */
	public abstract Boolean changeFlgStrToBool();
	
}
