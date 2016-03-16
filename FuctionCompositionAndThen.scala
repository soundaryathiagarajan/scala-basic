def f(s: String) = "Welcome "+s
def g(s: String) = s + "raj"
def fg = f _ compose g _

/*Executing g _ and return this result to the f _ */

Console.println(fg("Ranjith"))

def fAndTheng = f _ andThen g _

fAndTheng("Ranjith")