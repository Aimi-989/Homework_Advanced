package Generics.Task_3;




public class Person implements Comparable<Person>{
        private int maxHeight;

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Person (int maxHeight){
            this.maxHeight = maxHeight;
        }

    @Override
    public int compareTo(Person otherPerson){
        return this.maxHeight - otherPerson.maxHeight;
    }

    @Override
    public String toString(){
        return "Height: " + this.maxHeight;
    }
}



