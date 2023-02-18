package com.plantplaces;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.plantplaces.service.ISpecimenService;

import com.plantplaces.dto.PlantDTO;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class SpecimenServiceTest {
	
	@Autowired
	ISpecimenService specimenService;
	List<PlantDTO> plants;
	
	@Test
	public void fetchPlants_validateNoResultsForJunkData() {
		givenUserIsLoggedInToMyPlantDiary();
		whenTheUserSearchesForJunk();
		thenMyPlantDiaryReturnsZeroResults();
	}

	private void givenUserIsLoggedInToMyPlantDiary() {
		
	}

	private void whenTheUserSearchesForJunk() {
		 plants = specimenService.fetchPlants("kajsdj;luaopuidfjo;aj;sd");
	}

	private void thenMyPlantDiaryReturnsZeroResults() {
		assertEquals("Number of plants returned", 0, plants.size());
	}

}
