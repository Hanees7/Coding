Given a square matrix of size N*N, print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. 

Example 1:

Input:
N = 3 
mat[][] = {{6, 5, 4},
           {1, 2, 5}
           {7, 9, 7}}
Output: 
29 32
Explanation:
The given matrix is
6 5 4
1 2 5
7 9 7
The elements of upper triangle are
6 5 4
  2 5
    7
Sum of these elements is 6+5+4+2+5+7=29.
The elements of lower triangle are
6
1 2
7 9 7
Sum of these elements is 6+1+2+7+9+7= 32.
Example 2:

Input:
N = 2
mat[][] = {{1, 2},
           {3, 4}}
Output: 
7 8
Explanation:
Upper triangular matrix:
1 2
  4
Sum of these elements are 7.
Lower triangular matrix:
1
3 4
Sum of these elements are 8.

Your Task:
You don't need to read input or print anything. Complete the function sumTriangles() that takes matrix and its size N as input parameters and returns the list of integers containing the sum of upper and lower triangle.

Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(1)

Constraints: 
1 <= N <= 103
1 <= matrix[i][j] <= 106
CODE:

class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int upper_sum = 0;
        int lower_sum = 0;
        int diagonal_sum = 0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i<j){
                    upper_sum+=matrix[i][j];
                }
                else if(i>j){
                    lower_sum+=matrix[i][j];
                }
                else if(i==j){
                    diagonal_sum+= matrix[i][j];
                }
            }
        }
        
        ans.add(upper_sum+diagonal_sum);
        ans.add(lower_sum+diagonal_sum);
        
        return ans;
    }
}
