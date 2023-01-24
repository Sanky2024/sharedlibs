def call(){
  sh "gradle init"
  sh "./gradlew build"
}
