# java-curl-example
In this code implemented the following curl request to the OKBQA Disambiguator component

curl -G --data-urlencode 'data={"query": "SELECT ?v4 WHERE { ?v4 ?v2 ?v6 ; ?v7 ?v3 . } ", "slots": [{"p": "is", "s": "v7", "o": "<http://lodqa.org/vocabulary/sort_of>"}, {"p": "is", "s": "v3", "o": "rdf:Class"}, {"p": "verbalization", "s": "v3", "o": "rivers"}, 
{"p": "is", "s": "v2", "o": "rdf:Property"}, {"p": "verbalization", "s": "v2", "o": "flow"},
{"p": "is", "s": "v6", "o": "rdf:Resource|rdfs:Literal"}, {"p": "verbalization", "s": "v6", "o": "Seoul"}], 
"score": "1.0", "question": "Which rivers flow through Seoul"}' http://121.254.173.77:2357/agdistis/run
