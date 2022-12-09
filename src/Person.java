class Subdivision {
    private final int id;
    private final String title;

    public Subdivision(String title, int id_)
    {
        this.title = title;
        id = id_;
    }

    public int getId() { return id; }

    public String getTitle() { return title; }

    public static class Person {
        private final String id;
        private final String name;
        private final String gender;
        private final Subdivision subd;
        private final String salary;
        private final String birth_date;


        public Person() {
            id = "";
            name = "";
            gender = "";
            salary = "";
            birth_date = "";
            subd = new Subdivision("", 0);
        }

        Person(String id, String name, String gender, String salary, String birth_date, String title_subd, int id_subd) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.salary = salary;
            this.birth_date = birth_date;
            subd = new Subdivision(title_subd, id_subd);
        }

        @Override
        public String toString() {
            return id + "; " + name + "; " + gender + "; " + salary + "; " + birth_date + "; " + subd.getTitle() + "; " + subd.getId();
        }
    }
}
