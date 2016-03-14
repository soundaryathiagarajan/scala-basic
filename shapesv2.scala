package shapesv2 {
	class Point(val x: Double, val y: Double)
	abstract class Shape() {
		def draw(f: String => Unit): Unit = f(s"draw: ${this.toString}")
	}
	case class Circle(center: Point, radius: Double) extends Shape

	case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape

	case class Triangle(point1: Point, point2: Point, point3: Point) extends Shape
}
