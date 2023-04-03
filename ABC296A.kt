//ABC296A - Alternately

fun main() {
    val N = readLine()!!.toInt()
    val S = readLine()!!
    var ans = "Yes"

    for (i in 0..N-2) {
        if (S[i] == S[i+1]) {
            ans = "No"
        }
    }
    println(ans)
}
