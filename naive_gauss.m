function X = naive_gauss(A,b)
%Function which returns solution of the system [A][X]=[b]
[n,m]=size(A);
if n==m 
    if length(A)==length(b)
        if det(A)~=0
            a = [A b];
            n = length(b);
            %forward elimination
            for k = 1:n-1
                for j = k+1:n
                    a(j,k:n+1)= a(j,k:n+1)-a(j,k)/a(k,k)*a(k,k:n+1);
                end
            end
            X=zeros(n,1);
            X(n)=(a(n,n+1))/(a(n,n));
            %backward substitution
            for k = n-1:-1:1
                    X(k)= (a(k,n+1)-(a(k,k+1:n)*X(k+1:n)))/a(k,k);
            end
        else
            error ("Matrix [A] is a singular matrix.");
        end
    else
        error ("Matrix dimension mismatch.");
    end
else
    error ("Matrix [A] is not a square matrix.");
end

