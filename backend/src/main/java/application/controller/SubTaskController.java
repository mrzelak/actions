package application.controller;

/* moi */
import org.springframework.http.MediaType;

import application.model.tasks.SubTask;
import application.service.SubTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
class SubTaskController {
    @Autowired
    private SubTaskService subTaskService;

    /* moi */
    @PostMapping(path = "/subtask/{task_id}",
                  consumes = MediaType.APPLICATION_JSON_VALUE)
    public SubTask addSubTask(@RequestBody SubTask subTask, @PathVariable Long task_id) {
        subTaskService.addSubTask(task_id, subTask);
	return subTask;
    }


    @PutMapping("/subtask/{id}/check")
    SubTask setSubTaskFinishedValue(@PathVariable Long id) {
        return subTaskService.setSubTaskFinished(id, true);
    }

    @PutMapping("/subtask/{id}/uncheck")
    SubTask setSubTaskUnfinishedValue(@PathVariable Long id) {
        return subTaskService.setSubTaskFinished(id, false);
    }
}
