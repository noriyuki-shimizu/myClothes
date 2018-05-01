package source.dto;

import java.sql.Date;

public class MGenreDto {
	
	/**	ジャンルマスタ　主キー */
	private Integer genreId;
	
	/**	ジャンルCD */
	private String genreCd;
	
	/**	ジャンル名 */
	private String genreName;
	
	/**	データ追加日 */
	private Date insertDate;
	
	/**	削除フラグ */
	private Boolean deleteFlg;

	public Integer getGenreId() {
		return genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public String getGenreCd() {
		return genreCd;
	}

	public void setGenreCd(String genreCd) {
		this.genreCd = genreCd;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
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
