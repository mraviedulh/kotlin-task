package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile(status:Boolean) {
    val nama_depan = "Muhammad Raviedul"
    val nama_belakang = "Huda"
    val umur = 23
    val result = if (status) "single" else "tidak"
    println("nama saya $nama_depan $nama_belakang, saya berumur $umur dan saya masih $result")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val result:Any = println("$groupId $groupMember $session")
    return result
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val members:List<Any> = listOf("Raihanah Luthfiyah Rosanti",
    "Fatah Muhamad Fikrudin",
    "sultan alif",
    "Hasany Ibrohim",
    "Titin ",
    "Andi sarippudin",
    "Muhammad Andra Fahreza ",
    "Tri Saputra. S",
    "Rikza Akmal Habibi",
    "aizal irawan",
    "Muhammad Raviedul Huda")
    return listOf(members[10])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Maul", "Kak Joy")
    val countOfGroup = arrayOf<String>("Raihanah Luthfiyah Rosanti",
        "Fatah Muhamad Fikrudin",
        "sultan alif",
        "Hasany Ibrohim",
        "Titin ",
        "Andi sarippudin",
        "Muhammad Andra Fahreza ",
        "Tri Saputra. S",
        "Rikza Akmal Habibi",
        "aizal irawan",
        "Muhammad Raviedul Huda")
    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile(true)

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Ha Heng", listOf(
        "Raihanah Luthfiyah Rosanti",
        "Fatah Muhamad Fikrudin",
        "sultan alif",
        "Hasany Ibrohim",
        "Titin ",
        "Andi sarippudin",
        "Muhammad Andra Fahreza ",
        "Tri Saputra. S",
        "Rikza Akmal Habibi",
        "aizal irawan",
        "Muhammad Raviedul Huda"
    ), "Afternoon")

}