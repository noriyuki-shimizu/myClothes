package source.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import source.entity.MBrandEntity;
import source.entity.MGenreEntity;
import source.entity.MShopEntity;
import source.logic.ChangeDelFlg;
import source.logic.bsLogic.ChangeFlg;

public class MyClothesDto {

	/**	服情報　主キー */
	@SuppressWarnings("unused")
	private Long myClothesId;
	
	/**	ブランドID */
	@SuppressWarnings("unused")
	private Integer brandId;
	
	/**	ジャンルID */
	@SuppressWarnings("unused")
	private Integer genreId;
	
	/**	店ID */
	@SuppressWarnings("unused")
	private Integer shopId;
	
	/**	画像パス */
	@SuppressWarnings("unused")
	private String imagePath;
	
	/**	金額 */
	@SuppressWarnings("unused")
	private BigDecimal price;
	
	/**	購入日 */
	@SuppressWarnings("unused")
	private Timestamp purchaseDate;
	
	/**	詳細 */
	@SuppressWarnings("unused")
	private String details;
	
	/**	データ追加日時 */
	@SuppressWarnings("unused")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@SuppressWarnings("unused")
	private Timestamp updateDate;
	
	/**	論理削除フラグ */
	protected Boolean deleteFlg;
	
	/**	削除フラグ（文字列） テーブルのカラム対象外 */
	@SuppressWarnings("unused")
	private String deleteFlgStr;

	/**	ブランドマスタEntity */
	@SuppressWarnings("unused")
	private MBrandEntity mBrandEntity;
	
	/**	ジャンルマスタEntity */
	@SuppressWarnings("unused")
	private MGenreEntity mGenreEntity;
	
	/**	お店Entity */
	@SuppressWarnings("unused")
	private MShopEntity mShopEntity;

	public void setMyClothesId(Long myClothesId) {
		this.myClothesId = myClothesId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setPurchaseDate(Timestamp purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public void setDeleteFlgStr(String deleteFlgStr) {
		this.deleteFlgStr = deleteFlgStr;
	}

	public void setmBrandEntity(MBrandEntity mBrandEntity) {
		this.mBrandEntity = mBrandEntity;
	}

	public void setmGenreEntity(MGenreEntity mGenreEntity) {
		this.mGenreEntity = mGenreEntity;
	}

	public void setmShopEntity(MShopEntity mShopEntity) {
		this.mShopEntity = mShopEntity;
	}

	/**	削除フラグから、削除済みか未削除を格納する */
	public void setDeleteFlgStr() {
		ChangeFlg changeFlg = ChangeDelFlg.getInstance();
		this.deleteFlgStr = changeFlg.changeFlgOfMyClothesDto(this);
	}
	
}
