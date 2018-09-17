package source.factory;

import java.util.HashMap;

import source.entity.MBrandEntity;
import source.factory.bsFactory.Factory;

/**
 * MBrandDto製造クラス.
 * @author Noriyuki-Shimizu
 *
 */
public class MBrandFactory extends Factory<Integer, MBrandEntity> {

	public MBrandFactory() {
		this.pool = new HashMap<Integer, MBrandEntity>();
	}
	
	protected MBrandEntity createObj(Integer ownerId) {
		MBrandEntity mBrandDto = this.pool.get(ownerId);
		if(mBrandDto == null) {
			mBrandDto = new MBrandEntity(ownerId);
			this.pool.put(ownerId, mBrandDto);
		}
		return mBrandDto;
	}
	
}
