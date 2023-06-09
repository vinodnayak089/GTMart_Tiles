package com.gtmarttiles.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtmarttiles.command.Tiles;
import com.gtmarttiles.dao.TilesRepo;
import com.gtmarttiles.entity.TilesEntity;

@Service("tilesService")
public class TilesServiceImpl implements TilesService {

	@Autowired
	private TilesRepo tilesRepo;
	
	@Transactional
	@Override
	public String add(Tiles tiles) throws Exception{
		TilesEntity entity= new TilesEntity();
		entity.setBoxSize(tiles.getBoxSize());
		entity.setDesignNo(tiles.getDesignNo());
		entity.setL(tiles.getL());
		entity.setHl(tiles.getHl());
		entity.setD(tiles.getD());
		entity.setF(tiles.getF());
		entity.setPrize(tiles.getPrize());
		return tilesRepo.add(entity);
	}

	@Override
	public Tiles searchtiles(String designNo) {
		Tiles tiles=new Tiles();
		 TilesEntity tilesEntity=tilesRepo.searchtiles(designNo);
		 if(tilesEntity==null) {
			 tiles=null;
		 }
		 else {
			 tiles.setBoxSize(tilesEntity.getBoxSize());
			 tiles.setDesignNo(tilesEntity.getDesignNo());
			 tiles.setL(tilesEntity.getL());
			 tiles.setHl(tilesEntity.getHl());
			 tiles.setD(tilesEntity.getD());
			 tiles.setF(tilesEntity.getF());
			 tiles.setPrize(tilesEntity.getPrize());
		 }
		 return tiles;
				
	}

	@Override
	public String update(Tiles tiles) {
		TilesEntity entity= new TilesEntity();
		entity.setBoxSize(tiles.getBoxSize());
		entity.setDesignNo(tiles.getDesignNo());
		entity.setL(tiles.getL());
		entity.setHl(tiles.getHl());
		entity.setD(tiles.getD());
		entity.setF(tiles.getF());
		entity.setPrize(tiles.getPrize());
		return tilesRepo.update(entity);
	}

	@Transactional
	@Override
	public String delete(String designNo) {
		String status= tilesRepo.delete(designNo);
		return status;
	}

}
