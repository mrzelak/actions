package application.service;

import application.model.tasks.SubTask;
import application.model.tasks.Task;
import application.payroll.SubTaskNotFoundException;
import application.payroll.TaskNotFoundException;
import application.repository.SubTaskRepository;
import application.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubTaskService {
    @Autowired
    private SubTaskRepository subTaskRepository;

    @Autowired
    private TaskRepository taskRepository;

    /* moi */
    public void addSubTask(Long task_id, SubTask subTask) {
	    // moze nie byc w bazie task_id
	    Task task = taskRepository.findById(task_id)
		    	.orElseThrow(() -> new TaskNotFoundException(task_id));
	    task.addSubTask(subTask);
	    subTask.setMainTask(task);
	    subTaskRepository.save(subTask);
    }

    public SubTask setSubTaskFinished(Long id, boolean checked) {
        SubTask subTask = subTaskRepository.findById(id)
                .orElseThrow(() -> new SubTaskNotFoundException(id));
        Task mainTask = taskRepository.findById(subTask.getMainTask().getId())
                .orElseThrow(() -> new TaskNotFoundException(id));
        if (checked) {
            subTask.setFinished();
            checkIfMainTaskCanBeFinished(mainTask);
        } else {
            subTask.setUnfinished();
            mainTask.setUnfinished();
        }
        taskRepository.save(mainTask);
        return subTaskRepository.save(subTask);
    }

    private void checkIfMainTaskCanBeFinished(Task mainTask) {
        for (SubTask subTask : mainTask.getSubTasks()) {
            if (!subTask.isFinished()) {
                return;
            }
        }
        mainTask.setFinished();
    }
}
