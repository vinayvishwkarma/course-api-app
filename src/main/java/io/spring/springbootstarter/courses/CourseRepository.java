package io.spring.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, String>{

	
	//getTopics()
	//getTopic(String id)
	//deleteTopic(String id)
	//updateTopic(Topic t)
	
	
	public List<Course> findByTopicId(String topicId);
	
}
