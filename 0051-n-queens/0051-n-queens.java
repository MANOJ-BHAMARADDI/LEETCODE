class Solution {
    public static void nqueen(int n,char[][] arr, List<List<String>> lt,List<String> list,int row){
        if(row==n){
            lt.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n;i++) {
            if(isValid(arr,row,i)){
                arr[row][i]='Q';
                String ref="";
                for(int p=0;p<n;p++){
                    if(p!=i) ref+='.';
                    else ref+='Q';
                }
                list.add(ref);
                nqueen(n,arr,lt,list,row+1);
                list.remove(list.size()-1);
                arr[row][i]='.';

            }
        }

    }
    public static boolean isValid(char[][] arr,int row,int column){
        for(int i=row;i>=0;i--){
            if(arr[i][column]=='Q') return false;

        }
        for(int i=row,j=column;i>=0&&j<arr[0].length;i--,j++){
            if(arr[i][j]=='Q') return false;
        }
        for(int i=row,j=column;i>=0&&j>=0;i--,j--){
            if(arr[i][j]=='Q') return false;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> lt=new ArrayList<>();
        List<String> list=new ArrayList<>();
        char[][] arr=new char[n][n];
        nqueen(n,arr,lt,list,0);
        return lt;
        
    }
}