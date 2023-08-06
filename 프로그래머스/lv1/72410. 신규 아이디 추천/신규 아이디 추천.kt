import java.util.*

class Solution {
    fun solution(newId: String): String {
        var id = newId

        id = id.lowercase(Locale.getDefault())
        
        id = id.replace(Regex("[^a-z0-9-_.]"), "")
        
        id = id.replace(Regex("[.]{2,}"), ".")
        
        id = id.removePrefix(".").removeSuffix(".")
        
        if (id.isEmpty()) id = "a"
        
        if (id.length >= 16) {
            id = id.substring(0, 15)
            id = id.removeSuffix(".")
        }
        
        while (id.length <= 2) {
            id += id.last()
        }

        return id
    }

}