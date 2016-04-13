import forcomp.Anagrams._
object week6{
  val map = Map('a' -> 1,'b' -> 2)
  map.toList

  val abba = List(('a', 2), ('b', 2))
  combinations(abba)
  val sentence = List("i", "love","you")
  val sen2 = List("my")
  val occ = List(('a',1),('y',1))
  val occur = sentenceOccurrences(sentence)
  val map1 = dictionaryByOccurrences withDefaultValue Nil
  map1(occ)
  val list = List[Word]() :: List[Sentence]()
  list.map(y => "hello" :: y)
  sentenceAnagrams(sen2)
}