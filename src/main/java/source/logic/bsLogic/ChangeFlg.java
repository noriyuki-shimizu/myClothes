package source.logic.bsLogic;

import source.dto.MyClothesDto;
import source.dto.MBrandDto;
import source.dto.MGenreDto;
import source.dto.MShopDto;

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
	public abstract String changeFlgOfMBrandDto(MBrandDto mBrandDto);
	
	/**ジャンルDtoでのフラグ系変数を変換する.
	 * @param mGenreDto
	 * @return 変換された文字列
	 */
	public abstract String changeFlgOfMGenreDto(MGenreDto mGenreDto);
	
	/**お店Dtoでのフラグ系変数を変換する.
	 * @param mShopDto
	 * @return 変換された文字列
	 */
	public abstract String changeFlgOfMShopDto(MShopDto mShopDto);
	
	/**私の服Dtoでのフラグ系変数を変換する.
	 * @param myClothesDto
	 * @return String 変換された文字列
	 */
	public abstract String changeFlgOfMyClothesDto(MyClothesDto bsMyClothesDto);

}
