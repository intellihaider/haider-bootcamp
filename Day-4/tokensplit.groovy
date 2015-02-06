String s = "this string needs to be split" 
println s.tokenize(" ") 
println s.tokenize() 
println s.tokenize(/\s/)
println s.split(" ") 
println s.split(/\s/)  
println s.split()
   


String sa = "are.you.trying.to.split.me.mister?" 
println sa.tokenize(".") 
println sa.split(".") 
