/* 
 * File:   main.cpp
 * Author: ajay
 *
 * Created on 22 February, 2015, 2:36 PM
 */

#include "matrix.h"
#include <iostream>

/*
 * 
 */
int main(int argc, char** argv) {
    Matrix A(2, 2);
    Matrix B(2, 2);
    
    cin >> A;
    cin >> B;
    
    cout << (B / A);
    
    return 0;
}

