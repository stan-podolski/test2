package foo.bar
class Jpipe {
  def steps
  Jpipe(steps) {this.steps = steps}
  def test(args) {
    echo "${args.name}"
  }
}
