package com.automation.ui.repository;

import com.automation.ui.models.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends BaseRepository<Project> {

}
