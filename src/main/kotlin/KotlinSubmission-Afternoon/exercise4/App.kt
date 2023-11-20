package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        println("Ini adalah kalkulator penjumlahan 2 bilangan, silahkan input nilai a & b:")
        print("Nilai a: ")
        var a: String? = readLine()
        print("Nilai b: ")
        var c: String? = readLine()
        var b: Int = a?.toInt() ?: 0
        var d: Int = c?.toInt() ?: 0
        println("$b + $d = ${b+d}")
    }
    catch (E:Exception){
        println("anda menginput selain angka")
    }
}
