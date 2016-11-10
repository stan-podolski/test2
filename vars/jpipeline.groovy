def call(name) {
  node{
    echo "Hello, ${name} !!!"
    echo getLine(); 
  }
   @NonCPS
  def getLine(){
   def utils = new foo.bar.Jpipe(this);
    return utils.test
  }
}
