import java.util.*

fun main(args:Array<String>){
    var scan = Scanner(System.`in`)
    var mova = MovebleCircle()
    var pilihan=0
    var koordinatX=0
    var koordinatY=0
    var xSpeed=0
    var ySpeed=0
    var radius=0
    do{
        println("Pilih menu")
        println("1. Buat Circle")
        println("2. Move up")
        println("3. move down")
        println("4. Move left")
        println("5. Move right")
        println("6. To string ")
        println("exit")
        println("---------------")
        println("pilihan")
        pilihan=scan.nextInt()
        if(pilihan==1){
            println("masukkan kordinat x")
            mova.setXs(scan.nextInt())
            println("masukkan koordinat y")
            mova.setYs(scan.nextInt())
            println("masukkan xSpeed")
            mova.setXspeeds(scan.nextInt())
            println("masukkan ySpeed")
            mova.setYspeed(scan.nextInt())
        }
        if(pilihan==2){
            mova.moveUp()
        }
        if(pilihan==3){
            mova.moveDown()
        }
        if(pilihan==4){
            mova.moveLeft()
        }
        if(pilihan==5){
            mova.moveRight()
        }
        if(pilihan==6){
            println(mova.toString())
        }
        else{
            println("terima kasih")
        }
    }while(pilihan!=7)
}