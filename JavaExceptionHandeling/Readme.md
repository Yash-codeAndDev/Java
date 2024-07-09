# Exception Handeling

* Exception -> Event that distrupts normal flow of Program

* Exception Handling -> Process of responding to unwanted events when computer program runs to prevent abnormal termination of program .

## Process of Exception Handling
* Inside a method if any Exception occurs the method in which it occur is responsible to create Exception Object by including following information : 
    * Name Of Exception
    * Description of Exception
    * Location at which Exception Occurs(Stack Trace)

* After Creating Exception method handover the object to the JVM. JVM checks whether method contains any Exception Handling code or not. If the method does not contain method handeling code then JVM terminates the method abnormally and remove its entry from stack.

* JVM then identifies the caller method and check for Exception Handling code or not. If caller method does not contain handling code then JVM terminates caller method also abnormally and remove its entry from stack. This process is continued until main method and if main method also does not contain handling code then JVM terminates main method abnormally and removes its entry from the stack.

* JVM then handover the responsibility of Exception handling to Default Exception Handler.  

* Default  Exception Handler prints exception information and terminates program abnormally.

