function [y] = JacobianFD(f,x,delta)
%Find the Jacobian
a = length(x);

for i = 1:a
    x1=x;
    x1(i)=x(i)+delta*x(i);
    y(:,i) = (f(x1) - f(x))/(delta*(x(i)));
end
end

