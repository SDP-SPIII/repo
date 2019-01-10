package examples

String.metaClass.americanise = {
    matcher = (delegate =~ /ise/)
    matcher.replaceAll('ize')
}

println('finalise'.americanise())