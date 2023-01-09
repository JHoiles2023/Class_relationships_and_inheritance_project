public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Task laundry = new Task("Laundry");
        System.out.println(laundry);
    }

    static class Task implements Priority {
        private String taskNames = "";
        private int priorityLevel;


        public Task (String inTaskNames) {
            taskNames = inTaskNames;
        }
        public void setTaskNames(String inTaskNames){
            taskNames = inTaskNames;
        }
        public String getTaskNames(){
            return taskNames;
        }
        public String toString(){
            String myString = "Your task is " + taskNames;
            return myString;
        }
    }
    interface Priority
    {
        public void setPriority(int priority);
        public int getPriority();
    }
}