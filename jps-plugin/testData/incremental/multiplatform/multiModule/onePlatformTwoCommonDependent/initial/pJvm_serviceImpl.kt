//
// DON'T EDIT! This file is GENERATED by `MppJpsIncTestsGenerator` (runs by generateTests)
// from `incremental/multiplatform/multiModule/onePlatformTwoCommonDependent/dependencies.txt`
//

actual fun c2_platformDependentC2(): String = "pJvm"
fun pJvm_platformOnly() = "pJvm"

fun pJvmTest() {
  c2_platformIndependentC2()
  c2_platformDependentC2()
  pJvm_platformOnly()
  JavaClass().doStuff()
}
