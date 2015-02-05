
def dir = new File("/usr/ig/Desktop")

dir.eachFileRecurse (FileType.FILES) { file ->
  file.eachLine {
    println line
}

}

def dir = new File("/usr/ig/Desktop/b.txt")
  file.eachLine {
  	if(it%2!=0){
    println line
}
}