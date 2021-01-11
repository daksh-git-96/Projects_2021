package com.shoes.runningshoes.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoes.entity.RunningShoes;
import com.shoes.repository.RunningShoesRepository;
import com.shoes.vo.RunningShoesVO;

@Service
@Transactional
public class RunnigShoesServiceImpl implements RunningShoesService {
	
	@Autowired
	private RunningShoesRepository runningShoesRepository;
	
	@Override
	public void saveNewRunningShoe(RunningShoesVO runningShoesVO) {
		RunningShoes runningShoesEntity = new RunningShoes();
		BeanUtils.copyProperties(runningShoesVO, runningShoesEntity);
		runningShoesRepository.save(runningShoesEntity);
	}
	
}
