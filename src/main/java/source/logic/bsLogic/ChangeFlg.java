package source.logic.bsLogic;

import source.entity.MBrandEntity;
import source.entity.MGenreEntity;
import source.entity.MShopEntity;
import source.entity.MyClothesEntity;

/**
 * 各Dtoにおけるフラグを変換する抽象クラス.
 * @author Noriyuki-Shimizu
 *
 */
public abstract class ChangeFlg {
	
	/**ブランドDtoでのフラグ系変数を変換する.
	 * @param mBrandDto
	 * @return 変換された文字列
	 */
	public abstract String changeFlgOfMBrandDto(MBrandEntity mBrandEntity);
	
	/**ジャンルDtoでのフラグ系変数を変換する.
	 * @param mGenreDto
	 * @return 変換された文字列
	 */
	public abstract String changeFlgOfMGenreDto(MGenreEntity mGenreEntity);
	
	/**お店Dtoでのフラグ系変数を変換する.
	 * @param mShopDto
	 * @return 変換された文字列
	 */
	public abstract String changeFlgOfMShopDto(MShopEntity mShopEntity);
	
	/**私の服Dtoでのフラグ系変数を変換する.
	 * @param myClothesDto
	 * @return String 変換された文字列
	 */
	public abstract String changeFlgOfMyClothesDto(MyClothesEntity bsMyClothesEntity);

}
