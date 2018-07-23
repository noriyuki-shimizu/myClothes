package source.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "m_shop")
public class MShopDto {
	
	public MShopDto(Integer shopId) {
		this.shopId = shopId;
	}
	
	/**	ショップマスタ　主キー */
	@Id
	@Column(name = "shop_id")
	private Integer shopId;
	
	/**	ショップCD */
	@Column(name = "shop_cd", nullable = false, length = 10)
	private String shopCd;
	
	/**	ショップ名 */
	@Column(name = "shop_name", nullable = false, length = 30)
	private String shopName;
	
	/**	郵便CD */
	@Column(name = "postal_cd", length = 10)
	private String postalCd;
	
	/**	住所 */
	@Column(name = "address", length = 40)
	private String address;
	
	/**	店URL */
	@Column(name = "shop_url", length = 100)
	private String shopUrl;
	
	/**	データ追加日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_date")
	private Date insertDate;
	
	/**	データ更新日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Date updateDate;
	
	/**	削除フラグ */
	@Column(name = "delete_flg", nullable = false)
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

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
