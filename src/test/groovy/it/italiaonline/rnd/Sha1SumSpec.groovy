package it.italiaonline.rnd

import spock.lang.Specification

/**
 * This Spock specification was auto generated by 'gigawatt'
 * @author gsus
 * @date 10-03-2017 12.22
 */
class Sha1SumSpec extends Specification {
	def "someSha1SumMethod returns true"() {
		setup:
			Sha1Sum lib = new Sha1Sum()
		when:
			Boolean result = lib.someSha1SumMethod()
		then:
			result == true
	}
}
