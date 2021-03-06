package com.shoes.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoes.runningshoes.service.RunningShoesService;
import com.shoes.vo.ApplicationResponseVO;
import com.shoes.vo.UpdateRunningShoeVO;

@RestController
@RequestMapping("/s5")
public class ShoesInventoryController {
	
	@Autowired
	private RunningShoesService runningShoesService;
	
	@DeleteMapping("/admin/runningShoeInventory/{id}")
	public ApplicationResponseVO removeRunningShoe(@PathVariable int id) {
		ApplicationResponseVO applicationResponseVO = new ApplicationResponseVO();
		runningShoesService.delete(id);
		applicationResponseVO.setMessage("You have successfully remove the shoe from the running shoe inventory.");
		applicationResponseVO.setStatus("success");
		return applicationResponseVO;
	}
	 
	@PutMapping("/admin/editrunningshoe")
	public ApplicationResponseVO editRunningShoe(@RequestBody UpdateRunningShoeVO updateRunningShoeVO) {
		ApplicationResponseVO applicationResponseVO = new ApplicationResponseVO();
		runningShoesService.updateRunningShoe(updateRunningShoeVO);
		applicationResponseVO.setMessage("You have successfully updated color and price of the shoe.");
		applicationResponseVO.setStatus("success");
		return applicationResponseVO;
	}
	
}
