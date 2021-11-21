package edu.ufl.cise.plpfa21.assignment1;

import edu.ufl.cise.plpfa21.assignment2.IPLPParser;
import edu.ufl.cise.plpfa21.assignment3.ast.ASTVisitor;
import edu.ufl.cise.plpfa21.assignment4.TypeCheckVisitor;
import edu.ufl.cise.plpfa21.assignment2.IPLPParser;
import edu.ufl.cise.plpfa21.assignment2.Parser;
import edu.ufl.cise.plpfa21.assignment5.StarterCodeGenVisitor;


public class CompilerComponentFactory {

	public static IPLPParser getParser(String input) {
	   	 //Implement this in Assignment 2
	   	 //Your parser will create a lexer.
		IPLPLexer inputLexer = getLexer(input);
		Parser outputParser = null;
		try {
			outputParser = new Parser(inputLexer);
		} catch (LexicalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return outputParser;
		}

	
	public static IPLPLexer getLexer(String input) {
		Lexer result;
		result = new Lexer(input);
		return result;
	}

	public static ASTVisitor getTypeCheckVisitor() {
		// Replace this with whatever is needed for your compiler
		return new TypeCheckVisitor();
	}
	
	public static ASTVisitor getCodeGenVisitor(String className, String packageName, String sourceFileName) {
		//Replace this with whatever is needed for your compiler
		return new StarterCodeGenVisitor(className,packageName, sourceFileName);
	}
	

}
