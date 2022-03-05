package com.basis.issuemanagement.repo;

import com.basis.issuemanagement.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
