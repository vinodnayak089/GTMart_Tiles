package com.gtmarttiles.service;

import com.gtmarttiles.command.Tiles;

public interface TilesService {
	
	public String add(Tiles tiles) throws Exception;
	public Tiles searchtiles(String designNo);
	public String update(Tiles tiles);
	public String delete(String designNo);

}
