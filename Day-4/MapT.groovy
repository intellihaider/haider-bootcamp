Map m= ["Haider":24,"Vijay":21,"Dina":25,"Lucky":2,"Amit":23,]
Map b= ["Hurry":"abc","Haider":"cde"]

println "$m"

m.each{
	println it
}

m.collect{

	println it
}

Map c=m+b

println c

println c.class

println c.getClass()

Map d = ['1' : 2, '2' : 3, '3' : 4, '2':5] 

println d['2']

Map u= ['Computing' : ['Computing' : 600, 'Information Systems' : 300], 'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 'Management' : ['Management' : 800] ] 

println u.size()

println u['Computing'].size()

println u['Engineering']['Civil']