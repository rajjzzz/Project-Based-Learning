clear
clc
maxit = 50; % maximum number of iterations
tol = 0.0001;
eps = 100;  % initialize epsilon, any value OK as long as greater than the tolerance
f = @(x) -0.9*x^2 + 1.7*x + 2.5;   % define function
fderiv = @(x) -1.8*x+1.7;   % define derivative of f
x(1) = 5; % initial guess
i = 0;
while eps > tol && i <= maxit 
    i = i+1;
    x(i+1) = x(i) -f(x(i))/fderiv(x(i));
    eps = abs((x(i+1)-x(i))/x(i+1));
end
if eps > tol 
    disp('Maximum number or iterations reached, cannot find any root')
else
    fprintf('For x0 = %1.2f, one root is %1.2f. \rThe number of iterations is %1.0f.\r',x(1),x(i),i)
end

discriminant = 1.7^2-4*(-0.9)*2.5;
rootcalc1 = (-1.7+sqrt(discriminant))/2/(-0.9);
rootcalc2 = (-1.7-sqrt(discriminant))/2/(-0.9);
fprintf('\rThe first calculated root is %1.2f \r',rootcalc1)
fprintf('\rThe second calculated root is %1.2f \r',rootcalc2)