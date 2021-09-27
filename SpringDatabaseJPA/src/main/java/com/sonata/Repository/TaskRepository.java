package com.sonata.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sonata.Model.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task,Long>{
}
