import random
import time

w=["cat","dog","fox"]
n=1
print("[타자게임]Enter")
input()

start=time.time()

q=random.choice(w)
while n<=5:
    print("문제",n)
    print(q)
    x=input()
    if q==x:
        print("통과")
        n=n+1
        q=random.choice(w)
        
    else:
        print("오타! 다시")
        
end = time.time()
et = end - start
et = format(et,"2f")
print("타자시간: ",et, "초")