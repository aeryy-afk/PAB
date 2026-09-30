object AppConfig {
    const val MAX_COURSES = 5
}

data class Course(
    val code: String, val name: String, val status: CourseStatus){
    	companion object {
        	const val PREFIX = "PAB"
    	}
	}

enum class CourseStatus {
    ACTIVE, COMPLETED
}

fun MutableList<Course>.addCourse(course: Course): Boolean {
	if (size >= AppConfig.MAX_COURSES) {
        return false
    }

    if (!course.code.startsWith(Course.PREFIX)) {
        return false
    }

    add(course)
    return true
}

fun Course.displayInfo(): String = "$code - $name - $status"

fun main() {
	 val courses = mutableListOf<Course>()

    println(
        courses.addCourse(
            Course("PAB001", "Mobile App Development", CourseStatus.ACTIVE)
        )
    )

    println(
        courses.addCourse(
            Course("PAB002", "Kotlin Programming", CourseStatus.ACTIVE)
        )
    )

    println(
        courses.addCourse(
            Course("PAB003", "Database", CourseStatus.ACTIVE)
        )
    )

    println(
        courses.addCourse(
            Course("PAB004", "Android Development", CourseStatus.COMPLETED)
        )
    )

    println(
        courses.addCourse(
            Course("PAWB05", "Software Engineering", CourseStatus.COMPLETED)
        )
    )

    println(
        courses.addCourse(
            Course("PAB06", "Artificial Intelligence", CourseStatus.ACTIVE)
        )
    )
    
    println(
        courses.addCourse(
            Course("PAB07", "Machine Learning", CourseStatus.ACTIVE)
        )
    )
    
    for (Course in courses) {println(Course.displayInfo())}
}
