package learneverything.learning_service.database.repositories;

import learneverything.learning_service.database.entities.LessonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<LessonEntity,Integer> {

}
