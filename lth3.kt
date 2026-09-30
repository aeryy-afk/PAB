fun main(){
    val skills = mutableSetOf("Kotlin", "Java")
    skills.add("Python")
    skills.add("Kotlin")
    
    println("jumlah skil:  ${skills.size}")
    
	println("Apakah Swift ada? ${"Swift" in skills}")
    println("Apakah Python ada? ${"Python" in skills}")
}

// kenapa waktu nambah kotlin data tidak bertambah?
// karena Set hanya menyimpan elemen yang unik. 
// Jika nilai yang sama dimasukkan lebih dari sekali, Set tetap menyimpannya satu kali.
