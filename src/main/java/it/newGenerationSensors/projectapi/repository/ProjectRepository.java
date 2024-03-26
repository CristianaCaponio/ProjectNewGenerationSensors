package it.newGenerationSensors.projectapi.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import it.newGenerationSensors.projectapi.entity.ProjectEntity;

public interface ProjectRepository extends MongoRepository<ProjectEntity,String>{
	
	public List <ProjectEntity> findByRawAddress_Town (String town);
	
	public List <ProjectEntity> findByRawAddress_TownLike (String townLike);
}
