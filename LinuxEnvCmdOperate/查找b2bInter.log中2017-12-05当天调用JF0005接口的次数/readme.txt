#查找b2bInter.log中2017-12-05当天调用JF0005接口的次数#
sed -n '/2017-12-05 17:10:01/,/2017-12-05 22:02:26/p' b2bInter.log > first.txt
grep -c 'JF0005' first.txt
