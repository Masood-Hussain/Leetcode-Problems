class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return n
        a, b = 1, 2
        for _ in range(3, n + 1):
            a, b = b, a + b

        return b


if __name__ == "__main__":
    solution = Solution()
    print(solution.climbStairs(2)) 
    print(solution.climbStairs(3))  
    print(solution.climbStairs(4))  
