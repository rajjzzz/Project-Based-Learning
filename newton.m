function[sol,iter] = newton(f,x0)
maxiter = 50; 
tol = 0.001; 
eps = 1; 
xold = x0; 
i = 0; 
delta = 0.1
while eps > tol && i <= maxiter
    i = i+1; % increase the number of iterations
    Ja = JacobianFD(f,xold,delta); % calculate the Jacobian at {xi} (i.e. xold)
    xnew = xold -inv(Ja)*feval(f,xold); % calculate {xi+1} (i.e. xnew)
    eps = max(abs((xnew-xold)./xnew)); % determine the updated epsilon% eps = max(abs(feval(@f,xnew))); % alternative to determine epsilon% (advantage is that no risk of division by zero).
    xold = xnew;
end
if eps > tol
    disp('Maxium number of iterations reached, cannot find solution')
    disp('Change the initial guesses')
    sol = [];
    iter = maxiter;
else
    sol = xnew;
    iter = i;
end
