package mop

String msg = "Hello"
println(msg)

String.metaClass.shout = { ->
    delegate.toUpperCase()
}

println(msg.shout())

String.metaClass = null

String.metaClass.invokeMethod = {
    String name, args ->
        println("ha")
}

println(msg.shout())
println(msg.ff())

3.times {
    println Math.random()
}

Math.metaClass.static.random = { ->
    return 0.5
}

3.times {
    println Math.random()
}