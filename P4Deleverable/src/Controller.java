/*
 * Class:		CS225-01DB
 * Author: 		Logan White
 * Created: 	3/22/2023
 * Modified:	
 * 
 * Purpose:	controlls the program and manages all of the flow pieces and user values. 
 * 
 * Methods: 	+runProgram(): void 
 *				+generateUI(): void 
 *				+getFlowValues(): void 
 *				+UpdateUI(): void 
 *
 * Attributes: 	-NodePiece: NodeManager[]
 */

import java.util.Scanner;


public class Controller{

	//gamma is assumed to be 1.4 as this is the value for air
	private NodeManager[] NodePiece = new NodeManager[4];


	public void runProgram() {

		Scanner scanner;

		double BackPressure;
		double mach;
		double pressure;
		double temp;
		double T0;
		double Heat;
		double MuF;
		double length;
		double R;
		double gamma;
		double NozzleType;

		double Area1;
		double Area2;


		int TotalNodes;
		TotalNodes =1;

		NodePiece = new NodeManager[TotalNodes];

		Area1 = 1;
		Area2 = 4;
		BackPressure = 1.041;
		gamma = 1.4;
		R = 273;
		mach = 1;
		pressure=15; 
		Heat =4.46*Math.pow(10, 5);
		MuF = 0.005;
		length = 30;

		temp = 300;


		NodePiece[0] = new HeatTube( mach, Area1,  Area2,  pressure,  BackPressure,  temp,  Heat,  gamma,  R,  "Diverging Nozzle" );
		System.out.println("Mach After Nozzle:  " + NodePiece[0].getMach(1));





	}

	public void generateUI() {

	}

	public void getFlowValues() {

	}


	public void UpdateUI() {

	}






}