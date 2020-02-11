package com.first.maven_first;

public class Calculator1 {
		
		double a,b,c;
		char operator;
		Calculator1(double a,double b, char op)
		{
			this.a = a;
			this.b = b;
			this.operator = op;
		}
		private double add(double a,double b)
		{
			return a+b;
		}
		private double sub(double a,double b)
		{
			return a-b;
		}
		private double mult(double a,double b)
		{
			return a*b;
		}
		private double div(double a,double b)
		{
			return a/b;
		}
		public double calculate()
		{
			switch(operator)
			{
				case '+':
					c = add(a,b);
					break;
				case '-':
					c = sub(a,b);
					break;
				case '*':
					c = mult(a,b);
					break;
				case '/':
					c = div(a,b);
					break;
					// operator doesn't match any case constant (+, -, *, /)
				default:
					System.out.printf("Error! operator is not correct");
					//return 0;
			}
			System.out.printf("%.1f %c %.1f = %.1f\n", a, operator, b, c);
			return 0;
		}

	}
