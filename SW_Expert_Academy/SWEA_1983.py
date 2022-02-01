# 1983. 조교의 성적 매기기

# Solution by wYuYw

T = int(input())

for test_case in range(1, T + 1):
    total_score = []
    N, K = map(int, input().split())
    grade = ['A+', 'A0', 'A-', 'B+', 'B0', 'B-', 'C+', 'C0', 'C-', 'D0']
    for i in range(N):
        mid, fin, asg = map(int, input().split())
        total_score.append(0.35*mid + 0.45*fin + 0.2*asg)
    student_score = total_score[K-1]
    total_score.sort(reverse=True)
    
    ans = grade[total_score.index(student_score) // (N//10)]
    print(f"#{test_case} {ans}")
            
