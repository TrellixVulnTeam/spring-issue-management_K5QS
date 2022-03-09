package com.basis.issuemanagement.service;

import com.basis.issuemanagement.dto.ProjectDto;
import com.basis.issuemanagement.entity.Project;
import com.basis.issuemanagement.exceptions.ProjectNotFoundError;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id) throws ProjectNotFoundError;

    ProjectDto getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);

    ProjectDto update(Long id, ProjectDto project);
}
