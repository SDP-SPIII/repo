@SuppressWarnings("module")
module ch15.sec06 {
  requires java.xml;
  opens com.horstmann.places to java.xml.bind;
}
