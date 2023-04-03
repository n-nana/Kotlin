fun main() {

    for (i in 0..7) {
        val S = readLine()!!
        for (j in 0..7) {
            if (S[j] == '*') {
                print((j+97).toChar()) //数値から文字に変換
                print(8-i)
            }
        }
    }
}
