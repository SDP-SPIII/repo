package mop

Integer.metaClass.static.answer = { -> 42 }

assert Integer.answer() == 42