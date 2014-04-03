/*
 * casestudy1.cpp
 * 
 * Copyright 2014 Ajay Bhatia <ajay@dumb-box>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

#include <iostream>

using namespace std;

class Student
{
	private:
		char *name;
		int roll_no;
		float *sub_marks;
		
	public:
		Student() { }
		
		Student(char *name, int roll_no, float sub_marks[], int size)
		{
			this->name = name;
			this->roll_no = roll_no;
			
			this->sub_marks = new float[size];
			
			for (int i = 0; i < size; i++)
				this->sub_marks[i] = sub_marks[i];
		}
		
		friend ostream& operator <<(ostream&, Student&);	
};

ostream& operator <<(ostream &out, Student &s)
{
	out << s.roll_no << " " << s.name << endl;
} 

int main(int argc, char **argv)
{
	int num;
	
	cout << "No. of students: ";
	cin >> num;
	
	Student *students;
	
	for (int i = 0; i < num; i++)
	{
		
		cout << "Enter name of student " << (i + 1) << ": ";
		char name[50];
		cin >> name;
		
		cout << "Enter roll no. of student " << (i + 1) << ": ";
		int roll_no;
		cin >> roll_no;
		
		cout << "Enter number of subjects for student " << (i + 1) << ": ";
		int no;
		cin >> no;
		
		float marks[no];
		for (int j = 0; j < no; j++)
			cin >> marks[j];
		
		students = new Student[no];
		students[i] = Student(name, roll_no, marks, no);
		std::fflush(cout);
	}
	
	for (int i = 0; i < num; i++)
		cout << students[i] << endl;
		
	return 0;
}
