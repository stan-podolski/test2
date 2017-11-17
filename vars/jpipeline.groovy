def call(name) {
  node{
    echo "Hello, ${name} !!!"
    echo getLine("hi-hi"); 
    echo "foo"
  }
}

def runn(){
  echo "ruuuuuuun"
}

  def getLine(arg){
   def utils = new foo.bar.Jpipe();
    utils.run(this);
    return utils.test(arg);
  }
