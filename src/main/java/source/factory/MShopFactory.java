package source.factory;

import java.util.HashMap;

import source.entity.MShopEntity;
import source.factory.bsFactory.Factory;

public class MShopFactory extends Factory<Integer, MShopEntity> {

	public MShopFactory() {
		this.pool = new HashMap<Integer, MShopEntity>();
	}
	
	protected MShopEntity createObj(Integer ownerId) {
		MShopEntity mShopDto = this.pool.get(ownerId);
		if(mShopDto == null) {
			mShopDto = new MShopEntity(ownerId);
			this.pool.put(ownerId, mShopDto);
		}
		return mShopDto;
	}
	
}
