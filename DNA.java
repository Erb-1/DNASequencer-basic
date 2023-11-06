/*This piece of code will utilise String Methods in order 
 * to search through DNA protein sequences and determine
 * what proteins are present in them.*/
public class DNA {

    
  
  public static void main(String[] args) {

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-


    //DNA used.
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";    
    String dna = dna2;

    //find dna length
    System.out.println(dna.length());
    
    //find start codon: 
    int start = dna.indexOf("ATG");
    System.out.println("Start: " + start);
    //find end codon:
    int end = dna.indexOf("TGA");
    System.out.println("End: " + end);

    //ss there a protein?
    if(start != -1 && end != -1 && (end-start) % 3 == 0){
        String protein = dna.substring(start, end+3);
        System.out.println("Protein: " + protein);
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
    } else{
        System.out.println("No Protein Found");
    }
  }
  
}