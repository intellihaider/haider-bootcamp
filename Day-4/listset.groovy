List ls =[1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5]

Set s = ls

println s

List li=[]

ls.each{a->
	if(li.find{it==a}){
	}
	else{
	li.push(a)
	}

}

println li


List la=[11, 12, 13, 14]
List lb=[13, 14, 15]

println la-lb

if(la.size()>(la-lb).size){
	println "Has common element"
}

List lc = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ] 
 
 lc.each{
 	println it.getClass();
 }

println lc.get(6).get(9)

List ld = [14,12, 11,10, 16, 15,12, 10, 99, 90, 14, 16, 35] ;
Set sa=ld;
println sa.sort()

