def call(name) {
  node{
    echo "Hello, ${name} !!!"
    echo getLine("hi-hi"); 
  }
}

  def getLine(arg){
   def utils = new foo.bar.Jpipe();
    return utils.test(arg);
  }
