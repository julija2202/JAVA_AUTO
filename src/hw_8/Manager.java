package hw_8;

public class Manager extends Employee {
        private int numberPeople;
        public Manager(String name, int age, String people, int salary_day, int numberPeople) {
                super(name, age, people, salary_day);
                this.numberPeople = numberPeople;
        }

        public int getNumberPeople() {
                return numberPeople;
        }

        public void setNumberPeople(int numberPeople) {
                this.numberPeople = numberPeople;
        }

        int getSalary(int days){
                int result = getSalary_day() * days + (int)(getSalary_day()*days*0.01);
                return result;
        }
}
