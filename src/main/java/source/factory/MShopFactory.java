package source.factory;

import java.util.HashMap;

import source.dto.MShopDto;
import source.factory.bsFactory.Factory;

public class MShopFactory extends Factory<Integer, MShopDto> {

	public MShopFactory() {
		this.pool = new HashMap<Integer, MShopDto>();
	}
	
	protected MShopDto createObj(Integer ownerId) {
		MShopDto mShopDto = this.pool.get(ownerId);
		if(mShopDto == null) {
			mShopDto = new MShopDto(ownerId);
			this.pool.put(ownerId, mShopDto);
		}
		return mShopDto;
	}
	
}
