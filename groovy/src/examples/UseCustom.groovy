package examples

class Custom {}

class CustomMetaClass extends MetaClassImpl {

    CustomMetaClass(MetaClassRegistry registry, Class theClass) {
        super(registry, theClass)
        println "custom meta class is in use"
    }

}

assert new Custom().metaClass =~ /examples.CustomMetaClass/
