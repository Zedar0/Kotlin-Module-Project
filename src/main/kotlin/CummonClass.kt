abstract class CummonClass { //общий Класс для методов Архивов и Заметок
    var userInput = UserInput()
    fun showMenu() { // функция вывода меню и обработки запросов
        while (true) {
            printTitleOfMap()
            collectAllKeysOfMap().forEach { String -> println("$String") }
            printMenuOfMap()
            when (userInput.getInput()) {
                "0" -> create()
                "1" -> showContent()
                "2" -> return
                else -> showError()
            }
        }
    }
    fun showContent() {  // фунцкия отображения содержимого Архива или Заметки
        while (true) {
            if (collectAllKeysOfMap().size > 0) {
                printRequestForRequerdMap()
                val userInputKey = userInput.getInput()
                if (checkKeyMatchesOfMap(userInputKey)) {
                    nextDo(userInputKey)
                    return
                } else {
                    showError()
                }
            } else {
                println("К сожалению, здесь пока пусто.")
                return
            }
        }
    }
    fun showError() { // функция отображения сообщения об ошибке при неккоректном вводе
        println("Некорректный ввод")
    }
    abstract fun printTitleOfMap() // функция отображения заголовка для Архивов или Заметок
    abstract fun collectAllKeysOfMap(): MutableSet<String> // функция для сбора всех имён Архивов или Заметок
    abstract fun printMenuOfMap() // функция для вывода на экран меню Архивов или Заметок
    abstract fun printRequestForRequerdMap() // функия для вывода на экран запроса о вводе имени Архива или Заметки
    abstract fun checkKeyMatchesOfMap(name: String): Boolean // функция проверки наличия введённого имени Архива или Заметки
    abstract fun create() // функция создания Архива или Заметки
    abstract fun nextDo(key: String) // функция просмотра содержимого Архива или Заметки
}