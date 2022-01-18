#컴퓨터 프로그램을 실행할 때 이전에 계산한 값을 메모리에 저장해서 매번 다시 계산하지 않도록 하여 전체적인 실행속도를 빠르게 하는 기술
#DP(동적계획법)의 핵심이 되는 기술

#eg. 피보나치 수열에서 함수 중복 호출을 방지

#기존의 피보나치 수열 (재귀)
def fibo(n):
  if n<2:
    return n
  else:
    return fibo(n-1)+fibo(n-2)


#Memoization 활용 피보나치 수열
#피보나치 수를 구하는 알고리즘에서 fibo(n)의 값을 계산하자마자 저장하면 실행시간을 줄일 수 있음

#함수 정의
def fibo(n):
  global memo
  if n>=2 and len(memo)<=n:
    memo.append(fibo(n-1)+fibo(n-2))
  return memo[n]
#memo 초기화
memo = [0, 1]
