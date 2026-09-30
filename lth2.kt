enum class CourseStatus{ACTIVE, COMPLETE, DROPPED}
data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun describe(status: CourseStatus): String = when (status) {
CourseStatus.ACTIVE -> "Currently studying"
CourseStatus.COMPLETE -> "Completed studies"
CourseStatus.DROPPED -> "Not currently studying"
}

fun main(){
    val courses = mutableListOf<Course>(
        Course("101", "PABW", CourseStatus.COMPLETE),
        Course("102", "PGIM", CourseStatus.ACTIVE),
        Course("103", "MEDIS", CourseStatus.ACTIVE),
    )
    courses.add(Course("104", "PAB", CourseStatus.DROPPED))
    courses.removeAt(2)

    for (Course in courses) {
        println("${Course.code}: ${describe(Course.status)}")
    }
	
}
