package foo.bar
class Jpipe {
  def test(arg) {
    'ls -ltr'.execute()
    return arg+" from JPIPE!"
  }
}
