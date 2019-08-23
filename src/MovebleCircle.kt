class MovebleCircle : Movablepoint(){
    var radiu=0
    var cente= Movablepoint()

    fun getRadius():Int{
        return radiu
    }
    fun setRadius(radiu: Int){
        this.radiu=radiu
    }
    fun getCenter(): Movablepoint{
        return cente
    }
    fun setCenter(cente:Movablepoint){
        this.cente=cente
    }


    override fun moveUp() {
        super.moveUp()
        println(radiu)
    }

    override fun moveDown() {
        super.moveDown()
        println(radiu)
    }

    override fun moveLeft() {
        super.moveLeft()
        println(radiu)
    }

    override fun moveRight() {
        super.moveRight()
        println(radiu)
    }

    override fun toString(): String {
        return super.toString()+"radius"+radiu
    }
}