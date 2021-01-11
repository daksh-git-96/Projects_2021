package com.shoes.runningshoes.service;

import java.util.List;

import com.shoes.vo.RunningShoesVO;

public interface RunningShoesService {

	public void saveNewRunningShoe(RunningShoesVO runningShoesVO);

	public List<RunningShoesVO> findAll();

}
