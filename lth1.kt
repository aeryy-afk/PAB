enum class CourseStatus{ACTIVE, COMPLETE}
data class Course(val code: String, val name: String, val status: CourseStatus)

fun Course.displayInfo(): String = "$code - $name - $status"

fun main(){
    val courses = mutableListOf<Course>(
        Course("101", "PABW", CourseStatus.COMPLETE),
        Course("102", "PGIM", CourseStatus.ACTIVE),
        Course("103", "MEDIS", CourseStatus.ACTIVE),
    )
    courses.add(Course("104", "PAB", CourseStatus.ACTIVE))
    courses.removeAt(2)
    
    for (Course in courses) {println(Course.displayInfo())}
    
    val course = courses[2]
    val (code, name, status) = course
    println()
    println("Code: $code")
    println("Name: $name")
    println("Status: $status")
