class Point3D(val x: Int, val y: Int, val z: Int) {
  def +(p: Point3D): Point3D = {
    new Point3D(x + p.x, y + p.y, z + p.z)
  }
  override def toString(): String = "(" + x + ", " + y + ", " + z + ")"
}
