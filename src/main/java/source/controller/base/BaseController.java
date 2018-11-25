package source.controller.base;

public abstract class BaseController extends BaseCommonController{

	/**
	 * 各画面における初期処理.
	 * @return 各画面の初期表示
	 */
	public abstract String initPage();

}
