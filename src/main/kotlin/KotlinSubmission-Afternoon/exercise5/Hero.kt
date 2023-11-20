package id.infinitelearning.KotlinSubmission.exercise5
class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan(jumlah: Int=1) {
        checkHealth()
        println("$name sedang berjalan $jumlah x")
        health -= (1 * jumlah)
    }
    fun lari(jumlah: Int=1) {
        checkHealth()
        println("$name sedang berlari $jumlah x")
        health -= (2 * jumlah)
    }
    fun makan(jumlah: Int=1) {
        checkHealth()
        println("$name sedang makan $jumlah x")
        health += (2 * jumlah)
    }
    fun minum(jumlah: Int=1) {
        checkHealth()
        println("$name sedang minum $jumlah x")
        health += (2 * jumlah)
    }
    fun lompat(jumlah: Int=1) {
        checkHealth()
        println("$name sedang melompat $jumlah x")
        health -= (2 * jumlah)
    }
    fun duduk(jumlah: Int=1) {
        checkHealth()
        println("$name sedang duduk $jumlah x")
        health += (1 * jumlah)
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    
}

