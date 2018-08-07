#停止所有容器，检测容器数量，如果当前运行容器数量=1，停止掉mysql
function check
{
	command=`docker ps -q | wc -l`
	command_result=$command
	return ${command_result}
}

function main
{
    sleep 30
	while :
	do
		check
		if ([ $? -eq 1 ]) then
			docker stop "mysql-4"
			echo complete stop mysql-4!
			break
		else
			sleep 3
		fi	
	done
}

#调用主函数
main

