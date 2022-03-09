package com.basis.issuemanagement.exceptions;


public class ProjectNotFoundError extends Exception {
    public ProjectNotFoundError(String error){
        super("Project Not Found Error: " + error);
    }
}
