import java.util.Scanner
class UserInput { // ����� ��� ��������� ���������������� ��������
    val Input = Scanner(System.`in`)
    fun getInput(): String {
        return Input.nextLine()
    }
}