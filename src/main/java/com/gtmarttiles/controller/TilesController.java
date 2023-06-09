package com.gtmarttiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gtmarttiles.command.Tiles;
import com.gtmarttiles.service.TilesService;

@Controller
public class TilesController {
	
	@Autowired
	private TilesService tilesService;
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String showWelcome()
	{
		return "welcomeDef";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public ModelAndView showAddTiles()
	{
		return new ModelAndView("addDef","tiles",new Tiles());
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ModelAndView addTiles(Tiles tiles) throws Exception
	{
		String status=tilesService.add(tiles);
		return new ModelAndView("statusDef","status",status);
	}
	
	@RequestMapping(value="/search", method = RequestMethod.GET)
	public ModelAndView showSearchTiles()
	{
		return new ModelAndView("searchDef","tiles",new Tiles());
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.GET)
	public ModelAndView showDeleteTiles()
	{
		return new ModelAndView("deleteDef","tiles",new Tiles());
	}
	
	@RequestMapping(value="/search", method = RequestMethod.POST)
	public ModelAndView searchTiles(Tiles tiles) throws Exception
	{
		Tiles tile=tilesService.searchtiles(tiles.getDesignNo());
		if(tile==null) {
			return new ModelAndView("statusDef","status","Tiles Design Number Does not Existed");
		}
		else {
			return new ModelAndView("tilesDetailsDef","tiles",tile);
		}
	}
	
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public ModelAndView deleteTiles(Tiles tiles) throws Exception
	{
		String status=tilesService.delete(tiles.getDesignNo());
		return new ModelAndView("statusDef","status",status);
	}

}
