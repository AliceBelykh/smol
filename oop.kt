fun main(){
    var students = mutableListOf<Student>();
    students.add(Student("Alisa", "Belykh", "isip-01", 5.0))
    students.add(Student("Daria", "Derkach", "isip-01", 5.0))
    students.add(Student("Anastasia", "Smirnova", "isip-01", 5.0))
    students.add(Student("Grigoriy", "Kotov", "ssa-01", 4.3))
    students.add(Aspirant("Nadezhda", "Polovneva", "isip-01", 5.0, "Houses"))
    students.add(Aspirant("Denis", "Titov", "isip-01", 4.8, "Nets"))
    for(student in students){
        println("${student.firstName} ${student.lastName} ${student.getScholarship()}")
    }
}

open class Student(
    var firstName: String, 
    var lastName: String, 
    var group: String, 
    var averageMark: Double = 0.0
    ) {
    open fun getScholarship(): Double {
        return if (averageMark == 5.0) 2000.0 else 1900.0
    }
}

class Aspirant(
    firstName: String, 
    lastName: String, 
    group: String, 
    averageMark: Double, 
    var study: String
    ) : Student(firstName, lastName, group, averageMark) {
    override fun getScholarship(): Double {
        return if (averageMark == 5.0) 2500.0 else 2200.0
    }
}