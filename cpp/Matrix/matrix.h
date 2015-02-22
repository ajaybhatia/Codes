/* 
 * File:   matrix.h
 * Author: ajay
 *
 * Created on 22 February, 2015, 2:40 PM
 */

#ifndef MATRIX_H
#define MATRIX_H

#include <iostream>

using namespace std;

class Matrix {
    double **m;
    int rows;
    int cols;
    
public:
    Matrix(int _rows = 2, int _cols = 2);
    Matrix(const Matrix&);
    ~Matrix();
    
    friend Matrix operator*(const Matrix&, int);
    friend Matrix operator*(int, const Matrix&);
    friend Matrix operator/(const Matrix&, int);
    
    friend Matrix operator+(const Matrix&, const Matrix&);
    friend Matrix operator-(const Matrix&, const Matrix&);
    friend Matrix operator*(const Matrix&, const Matrix&);
    friend Matrix operator/(const Matrix&, const Matrix&);
    
    friend istream& operator>>(istream &, const Matrix&);
    friend ostream& operator<<(ostream &, const Matrix&);
};

#endif	/* MATRIX_H */

