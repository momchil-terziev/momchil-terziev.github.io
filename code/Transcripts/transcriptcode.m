a = readlines('note1.txt');
a(1:12) =[];
k = 1;
for i = 1:6:length(a)
    b(k) = a(i);
    k = k+1;
end
ff = fopen('note10.txt','w');
fprintf(ff,'%s \n',b);
