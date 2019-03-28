# word-ladder
Developing the shortest path between two words in a "word ladder". In addition, practicing on graphs by using Java programming language.

Given two words, which one is a start word and the other is an end word,
and a dictionary, in a word ladder you have to change one word into another
by shifting only one character at a time. In addition, the new word which
is shifted must be in the dictionary. For example, a word ladder between
"stop" and "fast" is:
stop - soop - loop - loot - lost - last - fast
There are many solutions of the word ladder. One solution is to use graph.
The graph is created by building relation among all words in dictionary.
Nodes and edges represent words and the relationship, respectively. Notice
that the graph is an undirected graph. Figure1 shows a small graph of some
words that solve the STOP to FAST word ladder problem.
