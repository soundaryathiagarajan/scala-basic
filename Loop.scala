//Multiple Loop
/*for(x <- 0 to 2 ; y <- 0 to 2; z <-0 to 2; if x > 1){
	println( x +".."+ y +".."+ z)
}*/

for(i<-0 to 10 if i % 2 == 0)
	 yield{
		print(i)	
}
println
for (i<-0 to 10  if i % 2 == 0 ){
	print(i)			
}
println
for { i<-0 to 10  if(i % 2 == 0)}{
	print(i)			
}

