package source.entity.myClothes;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * お店マスタDto.
 * @author Noriyuki-Shimizu
 *
 */
@Entity
@Table(name = "m_shop")
public class MShopEntity {

	public MShopEntity() {}
	
	public MShopEntity(Integer shopId) {
		this.shopId = shopId;
	}
	
	/**	ショップマスタ　主キー */
	@Id
	@Column(name = "shop_id")
	private Integer shopId;
	
	/**	ショップCD */
	@Column(name = "shop_cd")
	private String shopCd;
	
	/**	ショップ名 */
	@Column(name = "shop_name")
	private String shopName;
	
	/**	郵便CD */
	@Column(name = "postal_cd")
	private String postalCd;
	
	/**	住所 */
	@Column(name = "address")
	private String address;
	
	/**	店URL */
	@Column(name = "shop_url")
	private String shopUrl;
	
	/**	データ追加日時 */
	@Column(name = "insert_date")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@Column(name = "update_date")
	private Timestamp updateDate;
	
	/**	削除フラグ */
	@Column(name = "delete_flg")
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

	public Timestamp getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Timestamp insertDate) {
		this.insertDate = insertDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
