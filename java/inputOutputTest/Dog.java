package inputOutputTest;

import java.io.Serializable;

/**
 * when class dog is serialized then all the class that are reachable from the dog class is automatically  
 *becomes serialized and we can read  the value of rat  from the dog class object but only at one condition    
 *along with the dog class all the classes must implements serializable interface otherwise we will get a 
 *runtime  exception that is notserializable for each class. 
 * dog contain the obj of cat and cat contains the obj of rat and rat class contains a vlaue so all these classes
 * are reachable for the dog class and we can called that representation as a object graph
 * 
 */
public class Dog implements Serializable {

	Cat c = new Cat();

}

class Cat  implements Serializable
{

	Rat r = new Rat();
}

class Rat  implements Serializable
{

	int i = 20;

}