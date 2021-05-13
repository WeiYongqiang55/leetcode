/*
 * @lc app=leetcode.cn id=211 lang=java
 *
 * [211] 添加与搜索单词 - 数据结构设计
 *
 * https://leetcode-cn.com/problems/add-and-search-word-data-structure-design/description/
 *
 * algorithms
 * Medium (42.04%)
 * Likes:    87
 * Dislikes: 0
 * Total Accepted:    6.9K
 * Total Submissions: 16.3K
 * Testcase Example:  '["WordDictionary","addWord","addWord","addWord","search","search","search","search"]\n' +
  '[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]'
 *
 * 设计一个支持以下两种操作的数据结构：
 * 
 * void addWord(word)
 * bool search(word)
 * 
 * 
 * search(word) 可以搜索文字或正则表达式字符串，字符串只包含字母 . 或 a-z 。 . 可以表示任何一个字母。
 * 
 * 示例:
 * 
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * 
 * 
 * 说明:
 * 
 * 你可以假设所有单词都是由小写字母 a-z 组成的。
 * 
 */

// @lc code=start
class TrieNode {

    // R links to node children
    private TrieNode[] links;

    private final int R = 26;

    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }

    public boolean containsKey(char ch) {
        return links[ch -'a'] != null;
    }
    public TrieNode get(char ch) {
        return links[ch -'a'];
    }
    public void put(char ch, TrieNode node) {
        links[ch -'a'] = node;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}
class Trie {

    private TrieNode root;//根节点
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char curChar = word.charAt(i);
            if(!node.containsKey(curChar)){
                node.put(curChar,new TrieNode());
            }
            node = node.get(curChar);

        }
        node.setEnd();
    }
    
    public TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char curChar = word.charAt(i);
            if(node.containsKey(curChar)){
                node = node.get(curChar);
            }else{
                return null;
            }
        }
        return node;
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        //判断是不是一个单词结束了，如果结束了，说明当前路径是一个单词，如果没有结束，说明没有这个单词
        return node!=null && node.isEnd();
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);

        return node!=null;
    }

    /** Returns
     * 支持正则表达式的搜索
    */
    public boolean searchMatch(String word){
        return searchDfs(root,word);
    }
    /** 
     * 
     * 递归搜索，支持正则表达式
    */
    public static boolean searchDfs(TrieNode Node,String word){
        
        
        if(word.length()==0){
            if(Node.isEnd()){
                return true;
            }else{
                return false;
            }
        }
        if(word.charAt(0)!='.' && !Node.containsKey(word.charAt(0))){
            return false;
        }
        if(word.charAt(0)=='.'){
            boolean flag = false;
            for(int i=0;i<26;i++){
                if(Node.containsKey((char)('a'+i)) && searchDfs(Node.get((char)('a'+i)),word.substring(1))){
                    flag=true;
                    break;
                }
            }
            return flag;
        }else{
            return searchDfs(Node.get(word.charAt(0)),word.substring(1));
        }
    }

    
    
}

class WordDictionary {

    private Trie root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Trie();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        root.insert(word);
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return root.searchMatch(word);
    }
    public static void main(String[] args) {
        // Your WordDictionary object will be instantiated and called as such:
        WordDictionary obj = new WordDictionary();
        obj.addWord("at");
        obj.addWord("and");
        obj.addWord("an");
        obj.addWord("add");
        obj.addWord("a");
        boolean param_2 = obj.search(".");
        System.out.println(param_2);
    }
}



 
// @lc code=end

