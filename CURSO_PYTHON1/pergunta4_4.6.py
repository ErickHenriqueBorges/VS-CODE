d1 = {'Adão Smith': 'A', 'Judy Paxton': 'B+'}
d2 = {'Mary Louis': 'A', 'Patrick White': 'C'}
d3={}
d3.update(d1)
d3.update(d2)
for item in (d1, d2):
    print(d3)
 
