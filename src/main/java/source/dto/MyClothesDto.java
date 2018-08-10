package source.dto;

import source.dto.bsDto.BsMyClothesDto;

/**
 * 服マスタDto.
 * @author Noriyuki-Shimizu
 *
 */
public class MyClothesDto extends BsMyClothesDto{
	
	public MyClothesDto(Long myClothesId) {
		super(myClothesId);
	}

	/**	ブランドマスタDto */
	private MBrandDto mBrandDto;
	
	/**	ジャンルマスタDto */
	private MGenreDto mGenreDto;
	
	/**	お店Dto */
	private MShopDto mShopDto;

	public MBrandDto getmBrandDto() {
		return mBrandDto;
	}
	
	public void setmBrandDto(MBrandDto mBrandDto) {
		this.mBrandDto = mBrandDto;
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
	
}
