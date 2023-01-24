def call(){
  sh "gradle init"
  sh "./gradlew build"
  sh "./gradlew test"
  sh "./gradlew publish"
  
}
