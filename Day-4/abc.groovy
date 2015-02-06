import groovy.io.*;

def dir = new File("/home/ig/Desktop")

dir.eachFileRecurse (FileType.FILES) { file ->


file.eachLine { line ->
	println line

}

}

def file = new File("/home/ig/Desktop/Haider Documents/FP.groovy")

file.eachLine { it,line ->
	if(it%2){
	println line
}

}
