//Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated
// sequence of one or more dictionary words.
//
//Note that the same word in the dictionary may be reused multiple times in the segmentation.

class Solution3 {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        var newString = s
        for (word in wordDict){
            if ( newString.contains(word) )
                newString = newString.removePrefix(word)
            else{
                return false
            }
        }
        return true

    }
}