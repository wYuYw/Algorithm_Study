# Dynamic Programming
# Greedy 알고리즘과 같이 최적화 문제를 해결하는 알고리즘

# 먼저 입력 크기가 작은 부분 문제들을 모두 해결한 후에 그 해들을 이용하여 보다 큰 크기의 부분 문제들을 해결
# 최종적으로 원ㄹ 주어진 입력의 문제를 해결

# DP 활용 피보나치 수열 구하기
def fibo(n):
  f = [0,1]
  
  for i in range(2, n+1):
    f.append(f[i-1]+f[i-2])
    
  return f[n]

# DP의 구현 방식
# 1.recursive 방식
# 재귀적 구조는 내부에 시스템 호출 스택을 사용하는 overhead가 발생할 수 있음
# 2.iterative 방식
# Memoization을 재귀적 구조에 사용하는 것보다 반복적 구조로 DP를 구현한 것이 성능 면에서 보다 효율적
