---

---

```
cd 'C:\Users\mterz\Downloads'
a = readlines('Modified_AutoTranscript_NM529_NM835 ShipX tutorial_1.vtt'); % get the transcript
a(1:12) =[]; %remove the first 12 lines
% k = 1;
b = a(1:6:end); % Keep every sixth line
% for i = 1:6:length(a)
%     b(k) = a(i);
%     k = k+1;
% end
ff = fopen('note10.txt','w');
fprintf(ff,'%s \n',b);
```
