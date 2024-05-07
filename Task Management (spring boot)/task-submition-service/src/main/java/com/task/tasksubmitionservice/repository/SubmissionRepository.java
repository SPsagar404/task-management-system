package com.task.tasksubmitionservice.repository;

import com.task.tasksubmitionservice.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubmissionRepository extends JpaRepository<Submission,Long> {
    List<Submission> findByTaskId(Long taskId);
}
