package com.shoes.runningshoes.service;

import java.util.List;

import com.shoes.vo.RunningShoesVO;
import com.shoes.vo.UpdateRunningShoeVO;

public interface RunningShoesService {

	public void saveNewRunningShoe(RunningShoesVO runningShoesVO);

	public List<RunningShoesVO> findAll();

	public void delete(int id);

	void updateRunningShoe(UpdateRunningShoeVO runningShoeVO);

}
