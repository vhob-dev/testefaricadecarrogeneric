//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

   static class GenericEntry<T,E>{
       private T data;

       private E codigo;

       public GenericEntry(T data, E codigo) {
           this.data = data;
           this.codigo = codigo;
       }
       public T getData(){
           return this.data;
       }
       public E getCodigo(){
           return this.codigo;
       }
   }
}