u = input ('Upper bound?');
l = input ('Lower bound?');
v = input ('Speed?');
t = input ('Time?');
m = input ('Mass?');
sc = input ('Stopping criteria?');
y = @(x,m,t,v)sqrt(9.81*m./x).*tanh(t*sqrt((9.81*x)/m))-v;

if y(l,m,t,v)*y(u,m,t,v)>=0
    disp('cannot do bracketing and bisection');
else
    if y(l,m,t,v)<0
        x1 = l;
        x2 = u;
    else
        x1 = u;
        x2 = l;
    end
    x3 = l;
    h = 1;
    
    while(abs(y(x3,m,t,v))>sc)
        x3 = ((x1*y(x2,m,t,v)-x2*y(x1,m,t,v))/(y(x2,m,t,v)-y(x1,m,t,v)));
        h = h+1;
        
        if y(x3,m,t,v)<0
            x1=x3;
        else
            x2=x3;
        end
    end
end

dragcoeff = x3;
dragcoeff