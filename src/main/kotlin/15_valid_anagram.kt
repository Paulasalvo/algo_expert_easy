

/**
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all
the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 */

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        var characterList = t.toMutableList()
        var characterWord = s.toMutableList()
        s.forEach {
            if (characterList.contains(it)) {
                characterList.remove(it)
            } else {
                return false
            }
        }

        if (characterList.isEmpty()) {
            return true
        } else {
            return false
        }

    }
}
