package source.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class MyClothesDto {
	
	public MyClothesDto(Long myClothesId) {
		this.myClothesId = myClothesId;
	}
	
	/**	服情報　主キー */
	private Long myClothesId;
	
	/**	ブランド名 */
	private String brandName;
	
	/**	ジャンルマスタ */
	private MGenreDto mGenreDto;
	
	/**	店マスタ */
	private MShopDto mShopDto;
	
	/**	画像マスタ */
	private MImageDto mImageDto;
	
	/**	金額 */
	private BigDecimal price;
	
	/**	購入日 */
	private Date purchaseDate;
	
	/**	詳細 */
	private String details;
	
	/**	削除フラグ */
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

	public MImageDto getmImageDto() {
		return mImageDto;
	}

	public void setmImageDto(MImageDto mImageDto) {
		this.mImageDto = mImageDto;
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

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
