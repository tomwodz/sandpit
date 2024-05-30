package overloading

class Point(var x:Int, var y: Int) {
    operator fun plus(p: Point): Point{
        println("log plus")
        return Point(this.x + p.x, this.y + p.y)
    }

    operator fun compareTo(p: Point): Int {
        println("log compareTo")
        if (p.x != this.x) {
            return this.x - p.x
        } else {
            return this.y - p.y
        }
    }

    infix fun run(p: Point): Point {
        println("log run")
        return p
    }
}
