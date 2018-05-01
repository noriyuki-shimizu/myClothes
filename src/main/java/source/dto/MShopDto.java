package source.dto;

import java.sql.Date;

public class MShopDto {
	
	/**	ショップマスタ　主キー */
	private Integer shopId;
	
	/**	ショップCD */
	private String shopCd;
	
	/**	ショップ名 */
	private String shopName;
	
	/**	郵便CD */
	private String postalCd;
	
	/**	住所 */
	private String address;
	
	/**	店URL */
	private String shopUrl;
	
	/**	データ追加日 */
	private Date insertDate;
	
	/**	削除フラグ */
	private Boolean deleteFlg;

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopCd() {
		return shopCd;
	}

	public void setShopCd(String shopCd) {
		this.shopCd = shopCd;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getPostalCd() {
		return postalCd;
	}

	public void setPostalCd(String postalCd) {
		this.postalCd = postalCd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopUrl() {
		return shopUrl;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
