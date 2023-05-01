class Notes() : CummonClass() { // класс для выполнения операций с Заметками
    var listOfNotes: MutableMap<String, String> = mutableMapOf()
    override fun create() {
        println("Придумайте имя заметки:")
        var name = userInput.getInput()
        println("Напишите заметку")
        var note = userInput.getInput()
        listOfNotes.put(name, note)
        println("Заметка $name успешно создана")
    }
    override fun printTitleOfMap() {
        println("Список ваших заметок:")
    }
    override fun collectAllKeysOfMap(): MutableSet<String> {
        return listOfNotes.keys
    }
    override fun printMenuOfMap() {
        println("0 - Создать заметку\n1 - Показать содержимое заметки\n2 - Возврат в предыдущее меню")
    }
    override fun printRequestForRequerdMap() {
        println("Введите имя заметки: ")
    }
    override fun checkKeyMatchesOfMap(name: String): Boolean {
        return listOfNotes.containsKey(name)
    }
    override fun nextDo(name: String) {
        println(listOfNotes.getValue(name))
    }
}