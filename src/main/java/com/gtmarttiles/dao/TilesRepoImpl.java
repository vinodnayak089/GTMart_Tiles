package com.gtmarttiles.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gtmarttiles.entity.TilesEntity;

@Repository("tilesRepo")
public class TilesRepoImpl implements TilesRepo {

	@Autowired
	private HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Override
	public String add(TilesEntity tilesEntity) {
		String status = "";
		try {
			TilesEntity tiles = template.get(TilesEntity.class, tilesEntity.getDesignNo());
			if (tiles == null) {
				String designNo = (String) template.save(tilesEntity);
				if (designNo.equals(tilesEntity.getDesignNo())) {
					status = "Tiles Insertion Success";
				} else {
					status = "Tiles Insertion Failed";
				}
			}
			else {
				status = "Tiles Already Existed";
			}
		} catch (Exception e) {

			status = "Tiles Insertion Failed";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public TilesEntity searchtiles(String designNo) {
		TilesEntity tilesEntity = null;
		try {
			tilesEntity= template.get(TilesEntity.class, designNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tilesEntity;
	}

	@Override
	public String update(TilesEntity tiles) {
		String status = "";
		try {
			if (1 == 1) {
				status = "success";
			} else
				status = "failure";
		} catch (Exception e) {
			status = "failure";
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public String delete(String designNo) {
		String status = "";
		try {
			TilesEntity tiles = template.get(TilesEntity.class, designNo);
			if (tiles == null) {
				status = "Tiles Design Number Not Existed";
			}
			else {
				template.delete(tiles);
					status = "Tiles Design Number Deletion Success";

			}
		} catch (Exception e) {

			status = "Tiles Design Number Deletion Failed";
			e.printStackTrace();
		}
		return status;
	}

}
