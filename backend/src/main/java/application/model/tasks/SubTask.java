package application.model.tasks;

import application.Commons;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = Commons.SUBTASKS)
public class SubTask implements Completable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private boolean isFinished;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = Commons.TASK_ID, nullable = false)
    private Task mainTask;

    public SubTask() {
    }

    public SubTask(Long id, String name, String description, Task mainTask) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mainTask = mainTask;
        this.isFinished = false;
    }

    public SubTask(Long id, String name, Task mainTask) {
        this(id, name, "no description", mainTask);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMainTask(Task mainTask) {
        this.mainTask = mainTask;
    }

    @Override
    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public void setFinished() {
        isFinished = true;
    }

    @Override
    public void setUnfinished() {
        isFinished = false;
    }

    public Task getMainTask() {
        return mainTask;
    }
}
