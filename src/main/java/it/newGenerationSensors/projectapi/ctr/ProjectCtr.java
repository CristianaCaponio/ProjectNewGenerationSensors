package it.newGenerationSensors.projectapi.ctr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.newGenerationSensors.projectapi.entity.ProjectEntity;
import it.newGenerationSensors.projectapi.repository.ProjectRepository;

@RestController
@RequestMapping("ProjectCtr")
public class ProjectCtr {
	
	@Autowired
	ProjectRepository projectRep;

//METODO FIND ALL
	@GetMapping("findAllData")
	public List <ProjectEntity> findAllData () {		
			
		return projectRep.findAll();
	}

//METODO FIND BY TOWN
	@GetMapping("findByTown")
	public List <ProjectEntity> findByTown(@RequestParam("town") String town){
		
		return projectRep.findByRawAddress_Town(town);
	}
	
//METODO FIND BY TOWN LIKE
		@GetMapping("findByTownLike")
		public List <ProjectEntity> findByTownLike(@RequestParam("town") String town){
			
			return projectRep.findByRawAddress_TownLike(town);
		}
}
