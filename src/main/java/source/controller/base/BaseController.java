package source.controller.base;

/**
 * ベースとなるコントローラ.
 * 各コントローラはBaseControllerを継承して用いること
 * ※共通部分のControllerは例外となる
 * @author Noriyuki-Shimizu
 *
 */
public abstract class BaseController extends BaseCommonController{

	/**
	 * 各画面における初期処理.
	 * @return 各画面の初期表示
	 */
	public abstract String initPage();

}
