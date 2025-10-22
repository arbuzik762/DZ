fun main() {
    
    print("Количество студентов: ")
    val numberOfStudents = readLine()!!.toInt()

    val studentNames = mutableListOf<String>()
    val studentGrades = mutableListOf<Int>()

    for (i in 1..numberOfStudents) {
        print("Имя студента $i: ")
        val name = readLine()!!
        studentNames.add(name)

        print("Оценка $name: ")
        val grade = readLine()!!.toInt()
        studentGrades.add(grade)
    }

    val excellentStudents = mutableListOf<String>()
    val failingStudents = mutableListOf<String>()

    for (i in 0 until studentNames.size) {
        val currentName = studentNames[i]
        val currentGrade = studentGrades[i]

        if (currentGrade == 5) {
            excellentStudents.add(currentName)
        } else if (currentGrade == 2) {
            failingStudents.add(currentName)
        }
    }

    println("Список отличников:")

    if (excellentStudents.isEmpty()) {
        println("Отличников нет.")
    } else {
        for (studentName in excellentStudents) {
            println(studentName)
        }
    }
    println()

    println("Двоечники:")
    
    if (failingStudents.isEmpty()) {
        println("Двоечников нет.")
    } else {
        for (studentName in failingStudents) {
            println(studentName)
        }
    }
}
