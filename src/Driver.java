/***************************************************************************  
*This is to certify that this project is my own work, based on my personal efforts in studying and 
*applying  the  concepts  learned.    I  have  constructed  the  functions  and  their  respective 
*algorithms and corresponding code by myself.  The program was run, tested, and debugged 
*by my own efforts.  I further certify that I have not copied in part or whole or otherwise 
*plagiarized the work of other students and/or persons. 
*                                                   <Renee Althea F. Khan>,  DLSU 
*ID# <12275905>  
**************************************************************************/

public class Driver {

	
	public static void main(String args[])
	{
		MainMenuFrame view = new MainMenuFrame();
		Model model = new Model();
		
		Controller controller = new Controller(view, model);
		
		controller.displayProjectInfo();
		
	}

}
