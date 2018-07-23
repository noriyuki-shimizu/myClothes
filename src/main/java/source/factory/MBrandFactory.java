package source.factory;

import java.util.HashMap;

import source.dto.MBrandDto;
import source.factory.bsFactory.Factory;

/**
 * MBrandDto製造クラス.
 * @author Noriyuki-Shimizu
 *
 */
public class MBrandFactory extends Factory<Integer, MBrandDto> {

	public MBrandFactory() {
		this.pool = new HashMap<Integer, MBrandDto>();
	}
	
	protected MBrandDto createObj(Integer ownerId) {
		MBrandDto mBrandDto = this.pool.get(ownerId);
		if(mBrandDto == null) {
			mBrandDto = new MBrandDto(ownerId);
			this.pool.put(ownerId, mBrandDto);
		}
		return mBrandDto;
	}
	
}
