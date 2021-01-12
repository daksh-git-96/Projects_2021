package com.shoes.runningshoes.service;

import java.util.ArrayList;
import java.util.List;

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
		//runningShoesEntity.setAdmin(runningShoesVO.getAdminVO());
		BeanUtils.copyProperties(runningShoesVO, runningShoesEntity);
		runningShoesRepository.save(runningShoesEntity);
	}
	
	@Override
	public List<RunningShoesVO> findAll() {
		List<RunningShoes> listOfShoesEntity = runningShoesRepository.findAll();
		List<RunningShoesVO> listOfShoesVO = new ArrayList<RunningShoesVO>();
		for(RunningShoes runningShoesEntity : listOfShoesEntity) {
			RunningShoesVO runningShoesVO = new RunningShoesVO();
			BeanUtils.copyProperties(runningShoesEntity, runningShoesVO);
			listOfShoesVO.add(runningShoesVO);
		}
		return listOfShoesVO;
	}

	@Override
	public void delete(int id) {
		runningShoesRepository.deleteById(id);
	}
	
}
