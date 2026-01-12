import java.util.Set;
import models.Node;
import sets.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dayanna Chacha");
        Sets setsClase = new Sets();
        
        System.out.println("\nHashSet:");
        Set<String> hashSet = setsClase.construirHashSet();
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("A"));
        
        System.out.println("\nLinkedHashSet:");
        Set<String> LinkedHashSet = setsClase.construirLinkedHashSet();
        System.out.println(LinkedHashSet);

        System.out.println("\nTreeSet:");
        Set<String> treeSet = setsClase.construirTreeSet();
        System.out.println(treeSet);

        /*String a1 = "A";
        String a2 = "A";
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.equals(a2));
        System.out.println(a1==a2);

        Node<String> n1 = new Node<>("A");
        Node<String> n2 = new Node<>("A");
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n1.hashCode() == n2.hashCode());*/
    }
}
