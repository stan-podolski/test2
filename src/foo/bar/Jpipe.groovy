package foo.bar
class Jpipe {
  def test(arg) {
    echo "12345"
    'ls -ltr'.execute()
    return arg+" from JPIPE!"
  }
}
