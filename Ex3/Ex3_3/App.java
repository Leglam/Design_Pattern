import java.util.List;

public class App {
    public static void main(String[] args) {
        // Init persons
        Person dad = new Person("John");
        Person mom = new Person("Marry");
        Person olderBrother = new Person("Chris");
        Person youngerBrother = new Person("Matt");

        // Init relationships
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(dad, olderBrother);
        relationships.addParentAndChild(dad, youngerBrother);
        relationships.addParentAndChild(mom, olderBrother);
        relationships.addParentAndChild(mom, youngerBrother);
        relationships.addSibling(olderBrother, youngerBrother);

        // Find John relationship (PARENT)
        List<Person> johnRelation = Research.research(relationships, "John", RelationshipStatus.PARENT);
        for (Person child : johnRelation)
            System.out.println("John has a child called " + child.name);
        // Find Marry relationship (PARENT)
        List<Person> marryRelation = Research.research(relationships, "Marry", RelationshipStatus.PARENT);
        for (Person child : marryRelation)
            System.out.println("Marry has a child called " + child.name);
        // Find Chris relationship (CHILD)
        List<Person> chrisRelation = Research.research(relationships, "Chris", RelationshipStatus.CHILD);
        for (Person parent : chrisRelation)
            System.out.println("Chris has a parent called " + parent.name);
        // Find Matt relationship (SIBLING)
        List<Person> MattRelation = Research.research(relationships, "Matt", RelationshipStatus.SIBLING);
        for (Person sibling : MattRelation)
            System.out.println("Matt has a sibling called " + sibling.name);
    }
}
