package dev.j2d6.tm1.ui.data

data class TM1State(
    val teacherList : List<Teacher>? = null,
    val searchedTeacherName : String? = null,
    val selectedTeacher : Teacher? = Teacher(20,"Dimbiniaina Jordany", 110),
    val selectedTeacherId : Int? = null
)
