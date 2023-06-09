package com.gtmarttiles.dao;

import com.gtmarttiles.entity.TilesEntity;

public interface TilesRepo {
	
	public String add(TilesEntity tiles);
	public TilesEntity searchtiles(String designNo);
	public String update(TilesEntity tiles);
	public String delete(String designNo);

}
