package source.logic;

import source.dto.MyClothesDto;
import source.dto.MBrandDto;
import source.dto.MGenreDto;
import source.dto.MShopDto;
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
		if(delFlg) {
			return "削除済み";
		} else {
			return "未削除";
		}
	}

	@Override
	public String changeFlgOfMBrandDto(MBrandDto mBrandDto) {
		return convertDelFlgFromStr(mBrandDto.getDeleteFlg());
	}

	@Override
	public String changeFlgOfMGenreDto(MGenreDto mGenreDto) {
		return convertDelFlgFromStr(mGenreDto.getDeleteFlg());
	}

	@Override
	public String changeFlgOfMShopDto(MShopDto mShopDto) {
		return convertDelFlgFromStr(mShopDto.getDeleteFlg());
	}

	@Override
	public String changeFlgOfMyClothesDto(MyClothesDto bsMyClothesDto) {
		return convertDelFlgFromStr(bsMyClothesDto.getDeleteFlg());
	}

}
