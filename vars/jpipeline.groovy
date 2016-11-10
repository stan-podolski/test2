def call(name) {
  node{
    x=load 'script2.groovy'
    x.call()
  echo "Hello, ${name} !!!"
  }
}
