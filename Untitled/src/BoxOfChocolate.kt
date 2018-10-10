import java.util.*
class BoxOfChocolateR <Chocolate> (private val buffer: ArrayList<Chocolate>) {
    fun pickOne(): Chocolate? {
        if (buffer.size > 0) {
            return buffer.removeAt(Random().nextInt(buffer.size))
        }

        return null
    }
}


