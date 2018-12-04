package source.dto.myClothes;

import java.sql.Timestamp;

import source.dto.BaseDto;

public class MGenreDto extends BaseDto {

	/**	ジャンルマスタ　主キー */
	@SuppressWarnings("unused")
	private Integer genreId;
	
	/**	ジャンルCD */
	@SuppressWarnings("unused")
	private String genreCd;
	
	/**	ジャンル名 */
	@SuppressWarnings("unused")
	private String genreName;
	
	/**	データ追加日時 */
	@SuppressWarnings("unused")
	private Timestamp insertDate;
	
	/**	データ更新日時 */
	@SuppressWarnings("unused")
	private Timestamp updateDate;
	
	/**	削除フラグ */
	@SuppressWarnings("unused")
	private Boolean deleteFlg;

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	public void setGenreCd(String genreCd) {
		this.genreCd = genreCd;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
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
