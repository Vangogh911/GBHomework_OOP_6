class Student {
    private int id;
    private int address;
    private String name;
    private String birthYear;
    private int status;
    private int classIndex;
    private int phone;

    public Student(StudentBuilder studentBuilder) {

        if (studentBuilder == null) {
            throw new IllegalArgumentException("Неверная инициализация студента.");
        }
        if (studentBuilder.id <= 0) {
            throw new IllegalArgumentException("Неверный идентификатор студента.");
        }
        if (studentBuilder.name == null || studentBuilder.name.trim().isEmpty()) {
            throw new IllegalArgumentException("Неверное имя студента.");
        }
        this.id = studentBuilder.id;
        this.address = studentBuilder.address;
        this.name = studentBuilder.name;
        this.birthYear = studentBuilder.birthYear;
        this.status = studentBuilder.status;
        this.classIndex = studentBuilder.classIndex;
        this.phone = studentBuilder.phone;
    }

    public int getId() {
        return id;
    }

    public int getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public int getStatus() {
        return status;
    }

    public int getClassIndex() {
        return classIndex;
    }

    public int getPhone() {
        return phone;
    }

    public static class StudentBuilder {
        private int id;
        private int address;
        private String name;
        private String birthYear;
        private int status;
        private int classIndex;
        private int phone;

        public StudentBuilder() {
            super();
        }

        public StudentBuilder id(int id) {
            this.id = id;
            return this;
        }

        public StudentBuilder address(int address) {
            this.address = address;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder birthYear(String birthYear) {
            this.birthYear = birthYear;
            return this;
        }

        public StudentBuilder status(int status) {
            this.status = status;
            return this;
        }

        public StudentBuilder classIndex(int classIndex) {
            this.classIndex = classIndex;
            return this;
        }

        public StudentBuilder phone(int phone) {
            this.phone = phone;
            return this;
        }

        public Student build() {
            Student stud = null;
            if (validateStudent()) {
                stud = new Student(this);
            } else {
                System.out.println("Объявлено недостаточное количество аргументов.");
            }
            return stud;
        }

        private boolean validateStudent() {
            return (id > 0 && name != null && !name.trim().isEmpty());
        }
    }
}