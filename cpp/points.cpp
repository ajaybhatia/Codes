/*
 * points.cpp
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
#include <cmath>

using namespace std;

class Point
{
	int x;
	int y;
	
	public:
		Point() { x = y = 0; }
		Point(int val) { x = y = val; }
		Point(int x, int y) { this->x = x; this->y = y; }
		
		float distance(Point);
		friend ostream& operator <<(ostream&, Point);
};

float Point::distance(Point p)
{
	return (sqrt((x * x - p.x * p.x) + (y * y - p.y * p.y)));
}

ostream& operator <<(ostream &out, Point p)
{
	out << "(" << p.x << ", " << p.y << ")";
}

int main(int argc, char **argv)
{
	Point p1(9);
	Point p2(7, 3);
	
	cout << p1 << endl;
	cout << p2 << endl;
	
	cout << p1.distance(p2) << endl;
	
	return 0;
}
