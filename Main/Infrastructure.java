class Infrastructure {
    public Infrastructure() {
        init();
    }

    private Db db;

    public String getAllInfo(int idStudent) {
        for(int i = 0; i<db.students.size(); i++) {
            if(db.students.get(i).getId() == idStudent) {
                Student s = db.students.get(i);

                return String.format("%d %s %s %s %s %s %s",
                        s.getId(),
                        s.getName(),
                        s.getBirthYear(),
                        db.addresses.get(s.getAddress() - 1).getStreetName(),
                        db.statuses.get(s.getStatus() - 1).getStatus(),
                        db.classes.get(s.getClassIndex() - 1).getIndex(),
                        db.phones.get(s.getPhone() - 1).getPhone());
            }
        }
        return "информация отсутствует.";
    }

    public void showBirthYear(String year) {
        System.out.println("Ученики запрашиваемого года рождения:");
        for(int i = 0; i<db.students.size(); i++){
            if(db.students.get(i).getBirthYear().contains(year)){
                System.out.println(getAllInfo(db.students.get(i).getId()));;
            }
        }
    }

    public void showAddress(int addressId) {
        System.out.println("Ученики проживающие по запрашиваемой улице:");
        for(int i = 0; i<db.students.size(); i++){
            if(db.students.get(i).getAddress() == addressId){
                System.out.println(getAllInfo(db.students.get(i).getId()));;
            }
        }
    }

    public void showStatus(int statusId) {
        System.out.println("Ученики запрашиваемой успеваемости:");
        for(int i = 0; i<db.students.size(); i++){
            if(db.students.get(i).getStatus() == statusId){
                System.out.println(getAllInfo(db.students.get(i).getId()));;
            }
        }
    }

    public void showClass(int classId) {
        System.out.println("Ученики запрашиваемого класса:");
        for(int i = 0; i<db.students.size(); i++){
            if(db.students.get(i).getClassIndex() == classId){
                System.out.println(getAllInfo(db.students.get(i).getId()));;
            }
        }
    }

    Db init() {
        db = new Db();

        db.students.add(new Student.StudentBuilder().id(1).name("Буханова Жанна").birthYear("2010").address(1).status(1).classIndex(1).phone(1).build());
        db.students.add(new Student.StudentBuilder().id(2).name( "Волков Никита").birthYear("2006").address(2).status(2).classIndex(4).phone(2).build());
        db.students.add(new Student.StudentBuilder().id(3).name( "Голева Алина").birthYear("2009").address(3).status(3).classIndex(2).phone(3).build());
        db.students.add(new Student.StudentBuilder().id(4).name( "Емельянов Арсений").birthYear("2008").address(4).status(1).classIndex(3).phone(4).build());
        db.students.add(new Student.StudentBuilder().id(5).name( "Казакова Надежда").birthYear("2010").address(5).status(2).classIndex(1).phone(5).build());
        db.students.add(new Student.StudentBuilder().id(6).name( "Морозова Ольга").birthYear("2006").address(6).status(3).classIndex(4).phone(6).build());
        db.students.add(new Student.StudentBuilder().id(7).name( "Неклюдова Мария").birthYear("2009").address(7).status(1).classIndex(2).phone(7).build());
        db.students.add(new Student.StudentBuilder().id(8).name( "Поляков Данил").birthYear("2008").address(8).status(2).classIndex(3).phone(8).build());
        db.students.add(new Student.StudentBuilder().id(9).name( "Сковородская Карина").birthYear("2008").address(9).status(3).classIndex(3).phone(9).build());
        db.students.add(new Student.StudentBuilder().id(10).name( "Тараканов Артём").birthYear("2006").address(10).status(1).classIndex(4).phone(10).build());

        db.addresses.add(new Address(1, "Энергетиков"));
        db.addresses.add(new Address(2, "Ленина"));
        db.addresses.add(new Address(3, "Воровского"));
        db.addresses.add(new Address(4, "Степана Разина"));
        db.addresses.add(new Address(5, "Победы"));
        db.addresses.add(new Address(6, "Аношкина"));
        db.addresses.add(new Address(7, "Чичерина"));
        db.addresses.add(new Address(8, "Молодогвардейцев"));
        db.addresses.add(new Address(9, "Шота Руставели"));
        db.addresses.add(new Address(10, "Гагарина"));
        db.addresses.add(new Address(11, "Дзержинского"));
        db.addresses.add(new Address(12, "Бажова"));
        db.addresses.add(new Address(13, "Кулибина"));
        db.addresses.add(new Address(14, "Сергея Герасимова"));
        db.addresses.add(new Address(15, "Жукова"));

        db.statuses.add(new Status(1, "Отличник"));
        db.statuses.add(new Status(2, "Ударник"));
        db.statuses.add(new Status(3, "Троечник"));
        db.statuses.add(new Status(4, "Двоечник"));

        db.classes.add(new ClassIndex(1, "5А"));
        db.classes.add(new ClassIndex(2, "6А"));
        db.classes.add(new ClassIndex(3, "7Б"));
        db.classes.add(new ClassIndex(4, "9А"));

        db.phones.add(new Phone(1, "89270569009"));
        db.phones.add(new Phone(2, "89271189845"));
        db.phones.add(new Phone(3, "89379797230"));
        db.phones.add(new Phone(4, "89093313065"));
        db.phones.add(new Phone(5, "88005553535"));
        db.phones.add(new Phone(6, "89276222498"));
        db.phones.add(new Phone(7, "89119012450"));
        db.phones.add(new Phone(8, "89678087775"));
        db.phones.add(new Phone(9, "89878209939"));
        db.phones.add(new Phone(10, "89272291788"));

        return db;
    }
}
