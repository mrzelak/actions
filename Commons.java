package application;

public class Commons {
    public final static String TASKS = "TASKS";
    public final static String SUBTASKS = "SUBTASKS";
    public final static String TASK_ID = "task_id";
    public final static String TAGS = "TAGS";
    public final static String ERROR =  
	    "nie znaleziono takiej strony :(\n"    +
            "dostepne strony:\n"                   +
            "  GET /task\n"                        + 
            "  POST /task\n"                       + 
            "  PUT /task/{id}/previous\n"          + 
            "  DELETE /task/{id}/previous\n"       + 
            "  PUT /task/{id}\n"                   + 
            "  PUT /task/{id}/check\n"             + 
            "  PUT /task/{id}/uncheck\n"           + 
            "  DELETE /task/{id}\n"                + 
            "  GET /task/{id}\n"                   + 
            "  GET /task/{startDate}/{endDate}\n"  ;
}
