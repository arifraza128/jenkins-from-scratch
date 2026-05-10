try {
    int a = 10 / 0
}
catch(Exception e) {
    println "Error: ${e.message}"
}
finally {
    println "Program completed"
}
