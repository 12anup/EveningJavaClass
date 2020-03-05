public class GenericsClassExample<T> {

    private T t;

    public T getValue(){
        return this.t;
    }

    public void setValue(T t1){
        this.t=t1;
    }

    public static void main(String args[]){
        GenericsClassExample<String> type = new GenericsClassExample<>();
        type.setValue("Ram");
        System.out.println(type.getValue());//valid

        GenericsClassExample type1 = new GenericsClassExample(); //raw type
        type1.setValue("Shyam"); //valid
        type1.setValue(22);
        type1.setValue('c');
//        type1.setValue(type.hashCode());
        System.out.println(type1.getValue());
    }
}
