class Solution {
    public String[] createGrid(int m, int n) {       
        char[][] mat = new char[m][n];
        for(int i=0;i<n;i++)
        {
            mat[0][i]='.';
        }

        for(int i=0;i<m;i++)
        {
            mat[i][n-1]='.';
        }

        for(int i=1;i<m;i++)
        {
            for(int j=0;j<n-1;j++)
                mat[i][j]='#';
        }
        
        String s[] = new String[m];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                s[i]=new String(mat[i]);
            }
        
        return s;
    }
}