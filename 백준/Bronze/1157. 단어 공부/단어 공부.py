line = input().upper()
unique = list(set(line))

cnt = []

for x in unique:
  cnt.append(line.count(x))

if cnt.count(max(cnt)) > 1:
  print("?")
else:
  index = cnt.index(max(cnt))
  print(unique[index])
