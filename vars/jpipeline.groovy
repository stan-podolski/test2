def call(name) {
  node{
     echo "Hello, ${name} !!!"
  }
def utils = new foo.bar.Jpipe(this)
node {
  utils.test()
}
}
