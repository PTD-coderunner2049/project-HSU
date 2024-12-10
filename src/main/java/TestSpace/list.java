package TestSpace;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        // Original list of objects
        List<MyObject> originalList = new ArrayList<>();
        originalList.add(new MyObject("A"));
        originalList.add(new MyObject("B"));
        originalList.add(new MyObject("C"));

        // New list to reference the original objects
        List<MyObject> newList = new ArrayList<>();

        // Add references to the original objects to the new list
        newList.addAll(originalList);

        // Modify an object in the original list
        originalList.get(0).setContent("X");

        // Print the new list (will reflect the change in the original list)
        for (MyObject obj : newList) {
            System.out.println(obj.getContent());
        }
    }

    static class MyObject {
        private String content;

        public MyObject(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}