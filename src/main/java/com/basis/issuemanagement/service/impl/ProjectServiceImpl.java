package com.basis.issuemanagement.service.impl;

import com.basis.issuemanagement.dto.ProjectDto;
import com.basis.issuemanagement.entity.Project;
import com.basis.issuemanagement.exceptions.ProjectNotFoundError;
import com.basis.issuemanagement.repository.ProjectRepository;
import com.basis.issuemanagement.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository, ModelMapper modelMapper) {
        this.projectRepository = projectRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Project save(Project project) {

        if (project.getProjectCode() == null) {
            throw new IllegalArgumentException("Project code cannot be null!");
        }

        return projectRepository.save(project);
    }

    @Override
    public ProjectDto getById(Long id) throws ProjectNotFoundError {
        Project p = projectRepository.findById(id).orElseThrow(() ->{return new ProjectNotFoundError("Id :" + id);});
        return modelMapper.map(p, ProjectDto.class);

    }

    @Override
    public List<Project> getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return projectRepository.findAll(pageable);
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
