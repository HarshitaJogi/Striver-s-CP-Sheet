#include<bits/stdc++.h>
using namespace std;
const int N=1e5+10;
vector<long long> g[N];
bool vis[N];
int level[N];

void bfs(long long n,long long m){
	queue<long long> q;
	q.push(n);
	vis[n]=true;


	while(!q.empty()){
		long long cur= q.front();
		q.pop();

		
		if(cur==m) break;
		//iterate over child of current 
		//first child
		if(cur-1 >0 && vis[cur-1]==false){
			q.push(cur-1);
			level[cur-1]=level[cur]+1;
			vis[cur-1]=true;
		}

		if(cur*2 <= 2*(m-1) && vis[cur*2]==false){
			q.push(cur*2);
			level[cur*2]=level[cur]+1;
			vis[cur*2]=true;
		}

		
		
		
	}

}


int main(int argc, char const *argv[])
{
	long long n,m;
	cin>>n>>m;

	bfs(n,m);

	cout<<level[m]<<endl;

	// for(int i=1;i<=10;i++)  cout<<level[i]<<" ";
	// cout<<endl;

	return 0;
}
