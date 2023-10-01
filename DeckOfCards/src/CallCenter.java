import java.util.List;

public class CallCenter {
    public class CallHandler {
        /* 3 levels of different employees: respondents, managers, directors*/
        private final int LEVELS = 3;

        /* suppose we have 10 respondents, 4 managers, and 2 directors */
        private final int NUM_RESPONDENTS = 10;
        private final int NUM_MANAGERS = 4;
        private final int NUM_DIRECTORS = 2;

        /* List of employees, by Level*/
        List<List<Employee>> employeeLevels;

        /* Queues for each call's rank */
        List<List<Call>> callQueues;

        public CallHandler() {

        }

        public Employee getHandlerForCall(Call call) {
            
        }
    }
}
