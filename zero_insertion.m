function y = zero_insertion(x,M,m)

%find length of vector x
n = length(x);

%define same variables to help count 
k=1;
counter = 1;
%for loop to attain modified vector
for i=1:n
    y(k)=x(i);
    k=k+1;
    counter = counter+1;
    if counter == M+1 %help decide if need to add zeros
        y(k:k+m-1)=0;
        k=k+m;
        counter = 1; %to start counting again
    end
end

