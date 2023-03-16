fun main(args: Array<String>) {
    var x:Int
    val y:Int

    x = 20
    x = 30
    println(x)

    y = 40
    println(y)
    // Calculating SI of a loan borrowed
    var principle = 100000
    var rate = 2.5
    var time = 5
    var interest = (principle * rate * time) / 100.0
    println("Your interest is $interest")

    // Calculating the volume of a cylinder
    var pie =3.142
    var radius = 20
    var height = 5
    var volume = (pie * radius * radius * height)
    println("The volume is $volume")
}