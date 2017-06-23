package com.github.caryyu.elasticsearch.plugin.synonym.analysis;

import com.bellszhu.elasticsearch.plugin.synonym.analysis.RemoteSynonymFile;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.junit.Test;

public class RemoteSynonymFileTest {
    @Test
    public void testReloadSynonymMap(){
        String location = "http://localhost:8888/synonym/";
        RemoteSynonymFile remoteSynonymFile = new RemoteSynonymFile(null,new StandardAnalyzer(),
                false,null,location);
        remoteSynonymFile.reloadSynonymMap();
    }
}