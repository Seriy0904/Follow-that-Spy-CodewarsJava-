import java.util.Arrays;

public class FollowthatSpy {
    public static String findRoutes(String[][] routes) {
        int[] arr_start=new int[2];
        for (int i=0;i<routes.length;i++){
            for (int y=0;y<routes[i].length;y++){
                int repeat=-1;
                for (int z=0;z<routes.length;z++) {
                    for (int f=0;f<routes[z].length;f++)
                        if(routes[i][y]==routes[z][f])repeat+=1;}
                if(repeat==0&&y==0){arr_start[0]=i;arr_start[1]=y;}
            }}
        int[] num=new int[2];
        String[] arr_finish=new String[routes.length+1];
        for(int x=0;x<routes.length-1;x++){
            for(int i=0;i<routes.length;i++){
                for (int y=0;y<routes[i].length;y++){
                    if(routes[arr_start[0]][arr_start[1]+1]==routes[i][y]&&arr_start[0]!=i){ num[0]=i;num[1]=y;
                    if(routes[num[0]][num[1]]==routes[i][y]&&num[0]!=i&&num[1]!=y){arr_start[0]=i;arr_start[1]=y; }arr_finish[x]=routes[arr_start[0]][arr_start[1]];}}}
        arr_start[0]=num[0];arr_start[1]=num[1];}
        arr_finish[routes.length-1]=routes[arr_start[0]][arr_start[1]];
        arr_finish[routes.length]=routes[arr_start[0]][arr_start[1]+1];
        return String.join(", ", arr_finish);
    }
    public static void main(String[] args) {
        System.out.println(findRoutes(new String[][]{{"Chicago", "Winnipeg"}, {"Halifax", "Montreal"}, {"Montreal", "Toronto"}, {"Toronto", "Chicago"}, {"Winnipeg", "Seattle"}}));
    }
}
