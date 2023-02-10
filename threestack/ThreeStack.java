package threestack;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;


public class ThreeStack{

    public LinkedList<String>FILO1;    
    public LinkedList<String>FILO2; 
    public LinkedList<String>FILO3;
    public String result;
   


    public ThreeStack(){
        this.FILO1 = new LinkedList<String>();
        this.FILO2 = new LinkedList<String>();
        this.FILO3 = new LinkedList<String>();
        
    }


      /**
      add at first position the element to the  FILO with id FILO 
      @param FILO int the id of the FILO to remove from
      @param element Stirng  the element to add in the FILO 
    
     */

    public void push(int FILO,String element){
      
      switch(FILO){
        case 1:
            this.FILO1.addFirst(element);
        break;
        case 2:
            this.FILO2.addFirst(element);
        break;
        case 3:
            this.FILO3.addFirst(element);
        break;
        default:
        throw new IllegalArgumentException();
      }




    }
    /**
        removes the last element from the given FILO
      @param FILO int the id of the FILO to remove from
      @return the removed element
    
     */
    


    public String pop(int FILO){
         
        
        switch(FILO){
                case 1:
                try{
                this.result= this.FILO1.remove();
                }
                catch(NoSuchElementException e){
                    this.result=null;
                    System.out.println("NoSuchElementException ");

                }
                break;
                case 2:
                try{
                this.result= this.FILO2.remove();
                }
                catch(NoSuchElementException e){
                    this.result=null;
                    System.out.println("NoSuchElementException ");

                }
                break;
                case 3:
                 try{
                this.result= this.FILO3.remove();
                }
                catch(NoSuchElementException e){
                    this.result=null;
                    System.out.println("NoSuchElementException ");

                }
                break;
                default:
                throw new IllegalArgumentException("this FILO doesn't exist");

      }

    
      return this.result;
 





    }



    public static void main(String[] args)  throws Exception {
        ThreeStack threeStack=new ThreeStack();
        threeStack . push( 1 , " {nom :  objet1 } " );
        threeStack . push( 1 , " {nom :  objet2 } " );
        threeStack . push( 2 , " {nom :  objet3 } " );
        threeStack . push( 2 , " {nom :  objet4  } " );
        threeStack . push( 2 , " {nom :  objet5  } " );
        threeStack . push( 3 , " {nom :  objet6  } " );
        threeStack . push( 3 , " {nom :  objet7  } " );

        System.out.println(threeStack . pop( 2 )); // affiche {name:"object5"}
        System.out.println(threeStack . pop( 2 )); // affiche {name:"object4"}
        System.out.println(threeStack . pop( 1 )); // affiche {name:"object2"}
        System.out.println(threeStack . pop( 1 )); // affiche {name:"object1"}
        System.out.println(threeStack . pop( 3 )); // affiche {name:"object7"}
        System.out.println(threeStack . pop( 1 )); // lance une exception    
        System.out.println(threeStack . pop( 4 )); // lance une exception
 




























    
}
}