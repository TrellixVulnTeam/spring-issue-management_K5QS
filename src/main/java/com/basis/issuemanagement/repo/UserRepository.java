package com.basis.issuemanagement.repo;

import com.basis.issuemanagement.entity.IssueHistory;
import com.basis.issuemanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
