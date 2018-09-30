package source.dto;

import java.sql.Timestamp;

import source.dto.bsDto.BaseDto;

public class MShopDto extends BaseDto {

	/**	ショップマスタ　主キー */
	@SuppressWarnings("unused")
	private Integer shopId;
	
	/**	ショップCD */
	@SuppressWarnings("unused")
	private String shopCd;
	
	/**	ショップ名 */
	@SuppressWarnings("unused")
	private String shopName;
	
	/**	郵便CD */
	@SuppressWarnings("unused")
	private String postalCd;
	
	/**	住所 */
	@SuppressWarnings("unused")
	private String address;
	
	/**	店URL */
	@SuppressWarnings("unused")
	private String shopUrl;
	
	/**	データ追加日時 */
	@SuppressWarnings("unused")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@SuppressWarnings("unused")
	private Timestamp updateDate;
	
	/**	削除フラグ */
	@SuppressWarnings("unused")
	private Boolean deleteFlg;

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public void setShopCd(String shopCd) {
		this.shopCd = shopCd;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
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
	
}
