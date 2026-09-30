fun main() {
    val scores = mutableMapOf<Int, Int>()
    
    scores[241] = 50
    scores[242] = 80
    scores[243] = 75
    
	scores[243] = 79
    
    scores.remove(241)

    for ((nim, score) in scores) {
    	println("NIM: $nim Nilai: $score")
    }

    println("NIM: 245 Nilai: ${scores[245]}")
}
