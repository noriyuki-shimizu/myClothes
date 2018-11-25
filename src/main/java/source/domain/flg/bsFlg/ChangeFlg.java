package source.domain.flg.bsFlg;

/**
 * 各Dtoにおけるフラグを変換する抽象クラス.
 * @author Noriyuki-Shimizu
 *
 */
public abstract class ChangeFlg<T> {
	
	protected Boolean flg;
	
	public ChangeFlg(Boolean flg) {
		this.flg = flg;
	}
	
	/**
	 * フラグを変換する.
	 * 必ず、コンストラクタで値を設定してください.
	 * @return 変換されたフラグ
	 */
	public abstract T changeFlg();
	
}
