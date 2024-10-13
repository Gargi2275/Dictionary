//TITLE:DICTIONARY USING DOUBLY LINKED LIST
//ENROLLMENT NO:22002170410020
// ROLL NO:21
//SUBJECT:Data Structure Using Java
import java.util.*;


class Dictionary
{
  class Node{
  String word;
    String definition;
    Node Next;
     Node Pre;
    Node(String word,String definition){
        this.word=word;
        this.definition=definition;
         Next=null;
        Pre=null;
    }
  }

Node First=null;
// Adds words at first
void Add_word_atFirst(String word,String definition)
{
  Node newNode=new Node(word,definition);
  if(First==null)
  {
    First=newNode;
  }
  else{
    newNode.Next=First;
    First.Pre=newNode;
    First=newNode;
  }
}   
//adds word at last
void Add_word_atLast(String word,String definition)
{
 Node newNode=new Node(word,definition);
 Node temp=First;
 if(First == null) //checking if LinkedList is empty or not//
 {
     newNode.Pre=null; //In this case new node n's prev shall be null//
     First=newNode; //and the first now shall point to the new node n//
 
 }
 else //otherwise//
{
while(temp.Next!=null) //until we get the temp = null this loop will run//
     {
         temp=temp.Next;
     }
     newNode.Pre=temp; //New node n's prev should be equal temp//
     temp.Next=newNode; //And temp's next shall be equal to new node n//
}
  }
   

//delete words from last
void Deleteword_atLast()
{
  if (First == null) {
    System.out.println("List is empty");
} else if (First.Next == null) {
    First = null;
} else {
    Node temp = First;
    while (temp.Next.Next != null) {
        temp = temp.Next;
    }
    temp.Next = null;
}
}   

//wnter the word and it will give its meaning in output
   String search_Name(String search_word) {
        if (First == null) {
            return "Dictionary is empty."; // Return a message if the dictionary is empty
        }

        Node temp=First;

        while (temp!= null) {
            if (temp.word.equalsIgnoreCase(search_word)) {
                // Found the word by name, return its definition
                return temp.definition;
            }

            temp=temp.Next;
        }

        return "Word not found in the dictionary."; // Return a message if the word is not found
    }

   


void display()
{
  Node temp=First;
do{
System.out.println(temp.word+":"+temp.definition);
temp=temp.Next;
}while(temp!=null);
}

//update the definition of given word
void updateWord(String targetWord, String newDefinition) {
  Node temp=First;
        while (temp != null) {
            if (temp.word.equalsIgnoreCase(targetWord)) {
                temp.definition = newDefinition;
                System.out.println("Word updated successfully.");
            }
          
            temp =temp.Next;
          }
        if(First.word!=targetWord || First.definition!=newDefinition){
      System.out.println("not found");
        }
      
      }

      

    
    //delete the given word
  void deleteValue(String new_word) 
  {
          if (First == null) {
              return; 
          }
  
          Node temp=First;
  
          while (temp != null) {
              if (temp.word.equalsIgnoreCase(new_word)) {
                
                  if (temp.Pre != null) {
                      temp.Pre.Next = temp.Next;
                  } else {
                      
                    First=temp.Next;
                  }
  
                  if (temp.Next!= null) {
                      temp.Next.Pre = temp.Pre;
                  } else {
                  
                      temp.Next = temp.Pre;
                  }
  
                  System.out.println("Deleted word: " + temp.word);
                  return; 
              }
  
             temp=temp.Next;
          }
  
          System.out.println("Word not found in the dictionary.");
        }
  
//sort the dictionary
void sort_dictionary()
{
  Node temp=First;
  if (temp== null || temp.Next==null) {
    System.out.println("Dictionary is empty or contains only one word.");
}


while (temp != null) {
    Node sort_temp = temp.Next;

    while (sort_temp != null) {
        if (temp.word.compareToIgnoreCase(sort_temp.word) > 0) {
            // Swap the words
            String tempWord = temp.word;
            temp.word = sort_temp.word;
            sort_temp.word = tempWord;

            // Swap the definitions as well
            String tempDefinition = temp.definition;
            temp.definition = temp.definition;
            temp.definition = tempDefinition;
        }

        sort_temp = sort_temp.Next;
    }

    temp =temp.Next;
}

System.out.println("Dictionary is already sorted.");
}

}

class Run_Dictionary
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
       Dictionary l1=new Dictionary();
       l1.Add_word_atFirst("Unprecedented", "Never done or known before.");
        l1.Add_word_atFirst("Voracious", "Wanting or devouring great quantities of food.");
        l1.Add_word_atLast("Unrelenting", "Not yielding in strength, severity, or determination.");
        l1.Add_word_atLast("Unravel", "Undo (twisted, knitted, or woven threads).");
        l1.Add_word_atLast("Wrangle", "Have a long, complicated dispute or argument.");
        l1.Add_word_atLast("Xenophobia", "Dislike of or prejudice against people from other countries.");
        l1.Add_word_atLast("Yield", "Produce or provide (a natural, agricultural, or industrial product).");
        l1.Add_word_atLast("Yearn", "Have an intense feeling of longing for something.");
        l1.Add_word_atLast("Zany", "Amusingly unconventional and idiosyncratic.");
        l1.Add_word_atLast("Zeal", "Great energy or enthusiasm in pursuit of a cause or an objective.");
        l1.Add_word_atLast("Zenith", "The time at which something is most powerful or successful.");
        l1.Add_word_atLast("Cacophony ","A harsh, discordant mixture of sounds.");
        l1.Add_word_atLast("Cacophony ","A harsh, discordant mixture of sounds.");
        l1.Add_word_atLast("Candid ","Honest and straightforward in speech or behavior.");
        l1.Add_word_atLast("Capacious ","Having a lot of space inside; roomy.");
        l1.Add_word_atLast("Capitulate ","To surrender or give in to an opponent's terms.");
        l1.Add_word_atLast("Carnivorous ","Feeding on flesh or meat.");
        l1.Add_word_atLast("Catalyst ","A substance that speeds up a chemical reaction without being consumed in the process.");
        l1.Add_word_atLast("Cautious ","Showing care and consideration in avoiding potential risks or problems.");
        l1.Add_word_atLast("Celestial ","Relating to the sky or the heavens; divine or celestial bodies like stars and planets.");
        l1.Add_word_atLast("Censure ","Strong criticism or disapproval.");
        l1.Add_word_atLast("Chronic ","Persisting over a long period of time or characterized by a long duration.");
        l1.Add_word_atLast("Circumspect ","Cautious and watchful; considering all possible consequences before acting.");
        l1.Add_word_atLast("Clandestine ","Done in secrecy or concealed to hide motives.");
        l1.Add_word_atLast("Coalesce ","To come together to form a single mass or whole; to blend or merge.");
        l1.Add_word_atLast("Cognitive ","Relating to mental processes such as perception, memory, and reasoning.");
        l1.Add_word_atLast("Collaborate ","To work together on a project or task, often implying cooperation and joint effort.");
        l1.Add_word_atLast("Comprehensive ","Covering or including a wide range; thorough and complete.");
        l1.Add_word_atLast("Concur ","To agree or share an opinion.");
        l1.Add_word_atLast("Confluence ","The act of flowing together; a meeting or merging of things.");
        l1.Add_word_atLast("Congenial ","Pleasant and friendly; having a compatible or agreeable nature.");
        l1.Add_word_atLast("Conscientious ","Showing great care, diligence, and attention to detail.");
        l1.Add_word_atLast("Contemplate ","To think deeply and carefully about something.");
        l1.Add_word_atLast("Contrite ","Feeling regret and sorrow for one's sins or mistakes; remorseful.");
        l1.Add_word_atLast("Conundrum ","A confusing and difficult problem or question.");
        l1.Add_word_atLast("Diligent ","Showing careful and persistent effort; hardworking and thorough.");
        l1.Add_word_atLast("Diverse ","Composed of different elements, varied in type or character.");
        l1.Add_word_atLast("Dynamics ","The forces or properties that stimulate growth, development, or change within a system.");
        l1.Add_word_atLast("Dystopia ","An imagined place or state where everything is unpleasant, undesirable, or oppressive.");
        l1.Add_word_atLast("Delectable ","Extremely pleasing to the senses, especially taste and smell; delicious.");
        l1.Add_word_atLast("Defenestration ","The act of throwing someone out of a window, historically associated with political incidents.");
        l1.Add_word_atLast("Demure ","Reserved, modest, and shy in a way that reflects a sense of proper behavior.");
        l1.Add_word_atLast("Dichotomy ","A division or contrast between two things that are represented as being entirely different.");
        l1.Add_word_atLast("Didactic ","Intended to teach or instruct, often in a moralizing or pedantic manner.");
        l1.Add_word_atLast("Diffident ","Lacking self-confidence, shy, and hesitant due to a lack of self-assurance.");
        l1.Add_word_atLast("Diligence ","Careful and persistent effort, often in completing tasks or achieving goals.");
        l1.Add_word_atLast("Disparate ","Essentially different or distinct; not comparable due to significant differences.");
        l1.Add_word_atLast("Dogmatic ","Expressing strong and unwavering beliefs or opinions, often without sufficient evidence.");
        l1.Add_word_atLast("Dormant ","In a state of rest or inactivity, but capable of becoming active at a later time.");
        l1.Add_word_atLast("Dwindle ","To gradually become smaller, weaker, or less in number.");
        l1.Add_word_atLast("Dynamic ","Characterized by change, energy, or motion; constantly evolving or active.");
        l1.Add_word_atLast("Dysfunctional ","Not operating normally or properly; impaired in function.");
        l1.Add_word_atLast("Dystrophy ","A disorder that results in the wasting away or degeneration of body tissues or organs.");
        l1.Add_word_atLast("Decipher ","To interpret or convert coded or unclear information into understandable form.");
        l1.Add_word_atLast("Deference ","Respectful submission to the opinion, wishes, or judgment of another person.");
        l1.Add_word_atFirst("Eloquent ","Fluent and persuasive in speech or writing; expressing ideas in a compelling and articulate manner.");
 
  System.out.println("WELCOME TO THE DICTIONARY");
 
        while(true){
            System.out.println("1. Add a new word from first");
            System.out.println("2. Add a new word from last");
            System.out.println("3. update defination");
             System.out.println("4. delete a new word from last");
             System.out.println("5. Delete a word");
            System.out.println("6 .sort dictionary");
               System.out.println("7. Search a definition");
               System.out.println("8. Display all words");
            System.out.println("9. Exit");
             System.out.println("What would you like to do?");
             int choice=sc.nextInt();
           sc.nextLine();
      
            switch(choice){
            case 1:
            System.out.println("Enter word:");
                    String word = sc.nextLine();
                    System.out.println("Enter definition: ");
                  String definition= sc.nextLine();
                   l1.Add_word_atFirst(word, definition);
                 //  sc.next();
                   System.out.println(word+":"+definition+" "+ " added successfully.");
                    break;

                    case 2:
            System.out.println("Enter word:");
                    String word_last = sc.nextLine();
                    System.out.println("Enter definition: ");
                  String definition_last= sc.nextLine();
                   l1.Add_word_atLast(word_last, definition_last);
                   System.out.println(word_last+" "+definition_last+" "+ " added successfully.");
                   System.out.println();
                    break;

                    case 3:
                    System.out.println("enter the word you want to update:");
                    String targetWord=sc.nextLine();
                    System.out.println("enter the definition you want to update:");
                    String newDefinition=sc.nextLine();
                    l1.updateWord(targetWord,newDefinition);
                    break;


                         case 4:
                         l1.Deleteword_atLast();
                         break;

                         case 5:
                         System.out.println(" the word you want to delete:");
                         String word_delete=sc.nextLine();
                         l1.deleteValue(word_delete);
                       
                         break;

                         case 6:
                         l1.sort_dictionary();
                         System.out.println("the dictionary is sorted");
                         
                         break;

                      
                     case 7:
                        System.out.print("Enter the word to search: ");
                    String searchWord = sc.nextLine();
                    String definition_searched= l1.search_Name(searchWord);
                    System.out.println("Definition: " + definition_searched);
                    break;


                         case 8:
                         l1.display();
                         break;


                         case 9: {
                    System.out.println("****THANK YOU****");
                    System.exit(0);
                }
                
          }
    }
}
}