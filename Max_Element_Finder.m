clc
clear
%ask user for matrix input 
A = input('Enter a matrix: '); 
%finding matrix dimension
[m,n] = size(A); %m = # of rows, n = # of columns
Max = 0;%Max is the max element in each row
M = 0;%M is the max element in the whole matrix 
for i = 1:m
    Max = A(i,1);
    column = 1;
    for j = 2:n
        if Max < A(i,j)
            Max = A(i,j);
            column = j;
        end
    end
    if M < Max
        M = Max;
        row = i;
    end
end

fprintf('The largest element in the matrix you entered is %d which is in row %d and column %d. \n',M,row,column);