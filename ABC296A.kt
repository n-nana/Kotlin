fun main() {
//標準入力
//    val N = readLine()!!.toInt()
//    val S = readLine()!!
//    val (N,M) = readLine()!!.split(" ").map{ it.toInt() }
//    val A = (0 until M).map{readLine()!!.toInt()}
//    val R:  List<Int> = A.reversed(); //reverse

//配列初期化
//    val res = BooleanArray(mx) {false}
//    val cell = Array(T+3) { IntArray(3) {0}}
//    val dp = Array(N+3) { BooleanArray(mx+3) {false}}

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
