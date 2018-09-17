package source.logic;

import source.entity.MBrandEntity;
import source.entity.MGenreEntity;
import source.entity.MShopEntity;
import source.entity.MyClothesEntity;
import source.logic.bsLogic.ChangeFlg;

/**
 * 削除フラグを変換するクラス.
 * @author Noriyuki-Shimizu
 *
 */
public class ChangeDelFlg extends ChangeFlg{
	
	/**	本クラスのインスタンス変数 */
	public static ChangeFlg singleton = new ChangeDelFlg();

	/**シングルトンパターン
	 * @return ChangeFlg
	 */
	public static ChangeFlg getInstance() {
		return singleton;
	}
	
	/**Boolean値から、Stringへ変換する.
	 * @param Boolean delFlg
	 * @return String(真：削除済み, 偽：未削除)
	 */
	public String convertDelFlgFromStr(Boolean delFlg) {
		return (delFlg) ? "削除済み" : "未削除";
	}

	@Override
	public String changeFlgOfMBrandDto(MBrandEntity mBrandEntity) {
		return convertDelFlgFromStr(mBrandEntity.getDeleteFlg());
	}

	@Override
	public String changeFlgOfMGenreDto(MGenreEntity mGenreEntity) {
		return convertDelFlgFromStr(mGenreEntity.getDeleteFlg());
	}

	@Override
	public String changeFlgOfMShopDto(MShopEntity mShopEntity) {
		return convertDelFlgFromStr(mShopEntity.getDeleteFlg());
	}

	@Override
	public String changeFlgOfMyClothesDto(MyClothesEntity bsMyClothesEntity) {
		return convertDelFlgFromStr(bsMyClothesEntity.getDeleteFlg());
	}

}
