#include<stdio.h>

int main() {
    int cost[10][10], i, j, k, n;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    printf("Enter cost matrix:\n");

    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
            scanf("%d",&cost[i][j]);

    // Distance Vector Logic
    for(k=0;k<n;k++)
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                if(cost[i][j] > cost[i][k] + cost[k][j])
                    cost[i][j] = cost[i][k] + cost[k][j];

    printf("\nRouting Table:\n");

    for(i=0;i<n;i++) {
        for(j=0;j<n;j++)
            printf("%d ", cost[i][j]);
        printf("\n");
    }

    return 0;
}