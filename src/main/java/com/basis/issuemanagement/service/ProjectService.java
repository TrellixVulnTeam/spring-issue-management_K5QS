package com.basis.issuemanagement.service;

import com.basis.issuemanagement.dto.ProjectDto;
import com.basis.issuemanagement.entity.Project;
import com.basis.issuemanagement.exceptions.ProjectNotFoundError;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    Project save(Project project);

    ProjectDto getById(Long id) throws ProjectNotFoundError;

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);

}
