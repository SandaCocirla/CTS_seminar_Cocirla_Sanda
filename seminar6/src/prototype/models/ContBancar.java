package prototype.models;

import java.util.Map;

public class ContBancar implements IContCloneable {
    private String detinator;
    private Map<String,Integer> documente;
    private int nrFileDosar;

    public ContBancar(String detinator, Map<String, Integer> documente, int nrFileDosar) {
        int sum=0;
        for(ContBancar file: ){
            sum+=
        }
        if(sum==nrFileDosar){
        this.detinator = detinator;
        this.documente = documente;
        this.nrFileDosar = nrFileDosar;
        }
    }



    @Override
    public IContCloneable cloneaza() {
        return null;
    }
}
