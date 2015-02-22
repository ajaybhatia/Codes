/* 
 * File:   matrix.cpp
 * Author: ajay
 *
 * Created on 22 February, 2015, 2:36 PM
 */

#ifndef MATRIX_CPP
#define MATRIX_CPP

#include "matrix.h"

Matrix::Matrix(int _rows, int _cols) {
    rows = _rows;
    cols = _cols;
    
    m = new double*[rows];
    for (int i = 0; i < rows; i++)
        m[i] = new double[cols];
}

Matrix::Matrix(const Matrix &T) {
    rows = T.rows;
    cols = T.cols;
    
    for (int i = 0; i < T.rows; i++)
        for (int j = 0; j < T.cols; j++)
            m[i][j] = T.m[i][j];
}


Matrix::~Matrix() {
    for (int i = 0; i < rows; i++)
        delete m[i];
    
    delete m;
}

Matrix operator+(const Matrix &A, const Matrix &B) {
    Matrix T(A.rows, A.cols);

    for (int i = 0; i < A.rows; i++)
        for (int j = 0; j < A.cols; j++)
            T.m[i][j] = A.m[i][j] + B.m[i][j];
    
    return T;
}

Matrix operator-(const Matrix &A, const Matrix &B) {
    Matrix T(A.rows, A.cols);

    for (int i = 0; i < A.rows; i++)
        for (int j = 0; j < A.cols; j++)
            T.m[i][j] = A.m[i][j] - B.m[i][j];
    
    return T;
}

Matrix operator*(const Matrix &A, const Matrix &B) {
    Matrix T(A.rows, B.cols);

    for (int i = 0; i < A.rows; i++) {
        for (int j = 0; j < B.cols; j++) {
            T.m[i][j] = 0;
            for (int k = 0; k < A.cols; k++) {
                T.m[i][j] += A.m[i][k] * B.m[k][j];
            }
        }
    }
    
    return T;
}

Matrix operator*(const Matrix &M, int val) {
    Matrix T(M.rows, M.cols);
    
    for (int i = 0; i < M.rows; i++)
        for (int j = 0; j < M.cols; j++)
            T.m[i][j] = M.m[i][j] * val;
    
    return T;
}

Matrix operator*(int val, const Matrix &M) {
    return (M * val);
}

Matrix operator/(const Matrix &A, const Matrix &B) {
    Matrix T(A.rows, A.cols);

    for (int i = 0; i < A.rows; i++) {
        for (int j = 0; j < A.cols; j++) {
            T.m[i][j] = A.m[i][j] / B.m[i][j];
        }
    }
    
    return T;
}

Matrix operator/(const Matrix &M, int val) {
    Matrix T(M.rows, M.cols);
    
    for (int i = 0; i < M.rows; i++)
        for (int j = 0; j < M.cols; j++)
            T.m[i][j] = M.m[i][j] / val;
    
    return T;
}

istream& operator>>(istream &in, const Matrix &M) {
    for (int i = 0; i < M.rows; i++)
        for (int j = 0; j < M.cols; j++)
            in >> M.m[i][j];
    
    return in;
}

ostream& operator<<(ostream &out, const Matrix &M) {
    for (int i = 0; i < M.rows; i++) {
        for (int j = 0; j < M.cols; j++)
            out << M.m[i][j] << " ";
        
        out << endl;
    }
    
    return out;
}

#endif