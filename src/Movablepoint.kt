open class Movablepoint : Mavable {
    override fun moveUp() {
        println("Move up with speed"+ySpeed)
        y=y+ySpeed
    }

    override fun moveDown() {
        println("Move down with speed"+ySpeed)
        y=y-ySpeed
    }

    override fun moveLeft() {
        println("move left with speed "+xSpeed)
        x=x+xSpeed
    }

    override fun moveRight() {
        println("move right with speed"+xSpeed)
        x=x-xSpeed
    }

    var x= 0
        var y=0
        var xSpeed=0
        var ySpeed=0
    constructor(){

    }
    fun getXs () : Int {
        return x
    }
    fun setXs (x : Int){
        this.x=x
    }
    fun getYs () : Int{
        return y
    }
    fun setYs(y: Int){
        this.y=y
    }
    fun getXspeeds():Int{
        return xSpeed
    }
    fun setXspeeds(xSpeed:Int){
        this.xSpeed=xSpeed
    }
    fun getYspeeds():Int{
        return ySpeed
    }
    fun setYspeed(ySpeed:Int){
        this.ySpeed=ySpeed
    }

    override fun toString(): String {
        return "x=$x, y=$y, xSpeed=$xSpeed, ySpeed=$ySpeed"
    }

    constructor(x :Int, y:Int, xSpeed:Int, ySpeed:Int){
        this.x=x
        this.y=y
        this.xSpeed=xSpeed
        this.ySpeed=ySpeed
    }


}