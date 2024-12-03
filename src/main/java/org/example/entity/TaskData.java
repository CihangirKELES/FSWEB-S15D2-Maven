package org.example.entity;

import java.util.Set;
public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTask;
    private Set<Task> unassignedTasks;

    public Set<Task> getTasks(String name) {
        switch (name) {
            case "ann":
                return this.annsTasks;
            case "bob":
                return this.bobsTasks;
            case "carol":
                return this.carolsTask;
            case "all":
                return getUnion(bobsTasks, annsTasks, carolsTask);
        }
    }
    public Set<Task> getUnion(Set<Task> bobsTasks, Set<Task> annsTasks, Set<Task> carolsTask) {
        return null;
    }

}
