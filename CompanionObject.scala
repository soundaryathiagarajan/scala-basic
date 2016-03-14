package com{
	package yali{
		package scala{
			case class Point(x:Double=0.0,y:Double=0.0)
			class Point1(x:Double=0.0,y:Double=0.0)
			object App{
				def main(args:Array[String])={
					val p = new Point
					val p1 = Point(2.0,0.0) // Companion object
					val p2 = new Point(2.0,0.0)	
					val p11 = new Point1(2.0,0.0)
					val p12 = new Point1(2.0,0.0)	
					if(p1 == p2) print("equal") else print("not equal")
					println
					if(p11 == p12) print("equal") else print("not equal")
				}
			}
		}
	}
}
