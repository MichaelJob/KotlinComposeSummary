interface Playable {
    
    fun play()   //to be implemented in class using this interface
    
    var loudness: Int   //additional variable via interface
    
    fun funInterface() {
        //fun implemented here (default implementation)
    }

}


class Song(val name: String, val id: Int): Playable {

    override var loudness = 42

    override fun play() { }
    
}