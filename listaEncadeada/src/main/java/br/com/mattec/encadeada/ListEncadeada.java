package br.com.mattec.encadeada;

public class ListEncadeada<T> {

    No<T> referenciaDeEntrada;

    public  ListEncadeada(){
        this.referenciaDeEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaDeEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaDeEntrada;
        for(int i=0;i<this.size()-1;i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public  T get(int index){
        return getNo(index).getConteudo();
    }

    private  No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaDeEntrada;
        No<T> noRetorno = null;
        for(int i = 0;i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaDeEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();

    }


    public  int size(){
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaDeEntrada;
        while (true){
            if(referenciaAuxiliar != null){
                tamanhoLista++;
                if(referenciaAuxiliar.getProximoNo() != null){
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;

    }
    private void validaIndice(int index){
        if(index >= size()){
            int utlinoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " +
                    + index + "Esta lista somente vai atgé o índice "+ utlinoIndice + ".");
        }
    }

    public boolean isEmpty(){
        return referenciaDeEntrada == null ? true: false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaDeEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno +=  "No{conteudo=" + noAuxiliar.getConteudo() + "}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
