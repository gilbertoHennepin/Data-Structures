public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }


    public void addExam(String examDetails) {
        // TODO 2: Implement logic to add an exam to the end of the linked list
        ExamNode newNode = new ExamNode(examDetails);
        if (head == null) {
            head = newNode;
            current = newNode;
        } else {
            ExamNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }

        System.out.println("Exam added: " + examDetails);

    }


    public void viewNextExam() {
        if (current == null) {
            System.out.println("No exams available");
            return;
            // TODO 3: Implement the logic to move to the next exam in the list and displays it
        }
        System.out.println("Exam: " + current.examDetails);

        if (current.next != null) {
            current = current.next;
        } else {
            System.out.println("End of the exam list reached");
            current = null;
        }
    }


    public void viewPreviousExam() {
        if (current == null) {
            System.out.println("No exams available.");
            return;
        }
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Previous exam: " + current.examDetails);
        } else {
            System.out.println("You are already at the first exam.");
            // TODO 4: Implement logic to move to the previous exam in the list and display it
        }
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}


