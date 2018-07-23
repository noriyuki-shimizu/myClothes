package source.dto;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "my_clothes")
public class MyClothesDto {
	
	public MyClothesDto(Long myClothesId) {
		this.myClothesId = myClothesId;
	}
	
	/**	服情報　主キー */
	@Id
	@Column(name = "my_clothes_id")
	private Long myClothesId;
	
	/**	ブランド名 */
	@Column(name = "brand_name", nullable = false)
	private String brandName;
	
	/**	ジャンルマスタ */
	private MGenreDto mGenreDto;
	
	/**	店マスタ */
	private MShopDto mShopDto;
	
	/**	画像パス */
	@Column(name = "image_path", nullable = false)
	private String imagePath;
	
	/**	金額 */
	@Column(name = "price")
	private BigDecimal price;
	
	/**	購入日 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "purchase_date")
	private Date purchaseDate;
	
	/**	詳細 */
	@Column(name = "details")
	private String details;
	
	/**	データ追加日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "insert_date")
	private Date insertDate;
	
	/**	データ更新日時 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date")
	private Date updateDate;
	
	/**	論理削除フラグ */
	@Column(name = "delete_flg", nullable = false)
	private Boolean deleteFlg;

	public Long getMyClothesId() {
		return myClothesId;
	}

	public void setMyClothesId(Long myClothesId) {
		this.myClothesId = myClothesId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public MGenreDto getmGenreDto() {
		return mGenreDto;
	}

	public void setmGenreDto(MGenreDto mGenreDto) {
		this.mGenreDto = mGenreDto;
	}

	public MShopDto getmShopDto() {
		return mShopDto;
	}

	public void setmShopDto(MShopDto mShopDto) {
		this.mShopDto = mShopDto;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
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
