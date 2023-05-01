class Archives() : CummonClass() { // класс для выполнения операций с Архивами
    var listOfArchives: MutableMap<String, Notes> = mutableMapOf()
    override fun create() {
        println("Придумайте имя архива:")
        var userInputKey = userInput.getInput()
        listOfArchives.put(userInputKey, Notes())
        println("Архив $userInputKey успешно создан.")
    }
    override fun printTitleOfMap() {
        println("Список Ваших Архивов:")
    }
    override fun collectAllKeysOfMap(): MutableSet<String> {
        return listOfArchives.keys
    }
    override fun printMenuOfMap() {
        println("0 - Создать архив\n1 - Показать содержимое архива\n2 - Выход из программы")
    }
    override fun printRequestForRequerdMap() {
        println("Введите имя архива: ")
    }
    override fun checkKeyMatchesOfMap(name: String): Boolean {
        return listOfArchives.containsKey(name)
    }
    override fun nextDo(key: String) {
        listOfArchives.getValue(key).showMenu()
    }
}