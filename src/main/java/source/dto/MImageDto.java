package source.dto;

import java.sql.Date;

public class MImageDto {

	/**	画像ID */
	private Long imageId;
	
	/**	画像パス */
	private String imagePass;
	
	/**	データ追加日 */
	private Date insertDate;

	public Long getImageId() {
		return imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	public String getImagePass() {
		return imagePass;
	}

	public void setImagePass(String imagePass) {
		this.imagePass = imagePass;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	
}
