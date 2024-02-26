# 1
# 7
# 19
# 37
# 61

# 증가폭 6, 12, 18, 24

n = int(input())

start = 1
gap = 6
count = 1

while True:
  if start < n:
    start +=gap
    gap+=6
    count+=1
  else:
    break

print(count)
