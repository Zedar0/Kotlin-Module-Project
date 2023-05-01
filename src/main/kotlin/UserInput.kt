import java.util.Scanner
class UserInput { // класс для получения пользовательских значений
    val Input = Scanner(System.`in`)
    fun getInput(): String {
        return Input.nextLine()
    }
}