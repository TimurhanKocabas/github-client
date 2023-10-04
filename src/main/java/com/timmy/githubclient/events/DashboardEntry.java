package com.timmy.githubclient.events;

import com.timmy.githubclient.github.RepositoryEvent;

import java.util.List;

public class DashboardEntry {
    private final GithubProject project;

    private final List<RepositoryEvent> events;

    public DashboardEntry(GithubProject project, List<RepositoryEvent> events){
        this.project=project;
        this.events= events;
    }

    public GithubProject getProject(){
        return this.project;
    }

    public List<RepositoryEvent> getEvents(){
        return this.events;
    }

}
