# 12.5 / 100
# def solution(citations):
#     answer = 0
#     citations.sort()
#     MAX = 0
#     for i in range(len(citations)):
#         if citations[i] <= len(citations)-i:
#             MAX = citations[i]
#     answer = MAX
#     return answer

# def solution(citations):
#     citations.sort()
    
#     for i in range(len(citations)):
#         if citations[i] >= len(citations)-i:
#             return len(citations)-i
#     return 0

def solution(citations):
    citations.sort()
    n = len(citations)
    count = 0
    for i in range(n):
        if citations[i] >= n-i:
            count+=1
    return count