def call(name) {
  node{
    echo "Hello, ${name} !!!"
    echo getLine(); 
  }
}

  def getLine(){
   def utils = new foo.bar.Jpipe();
    return utils.test
  }
