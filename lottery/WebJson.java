package com.github.susan.lottery.lottery;

import java.util.List;

/**
 * http://www.okooo.com/I/?method=lottery.spinfo.mixspinfo&LotteryType=SportteryNWDL%2CSportteryWDL
 */

/**
 * http://www.okooo.com/I/?method=lottery.match.custom&pid=24&typeid=1&lotteryType=SportterySoccerMix&lotteryNo=2018-06-22%2C2018-06-23%2C2018-06-24%2C2018-06-25%2C2018-06-26&typeId=1&format=json
 */
/**
 * https://apic.itou.com/api/match/selectmore?platform=koudai_mobile&_prt=https&ver=20180101000000&serial_no=6029&bet_id=264193&t=17601&_=1529767683998
 *
 */

/**
 * https://apic.itou.com/api/match/selectlist?platform=koudai_mobile&_prt=https&ver=20180101000000&hide_more=1
 * Created by susan on 2018/6/22.
 */

public class WebJson {
    /**
     * msg : ok
     * data : {"2018-06-22":{"5025":{"serial_no":"5025","match_id":"1000237","match_time":"2018-06-22 23:00:00","bet_time":"2018-06-22 23:00:00","bet_date":"2018-06-22","league_name":"世界杯","host_name_s":"尼日利亚","guest_name_s":"冰岛","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264173","is_single":"1","boundary":"0","odds":{"0":"2.27","1":"3","3":"2.6"}},"SportteryWDL":{"bet_id":"264175","is_single":"0","boundary":"-1","odds":{"0":"1.32","1":"4.15","3":"6.25"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"271","team_name":"尼日利亚","rank":"48","rank_league":"世"},"2":{"team_id":"57","team_name":"冰岛","rank":"22","rank_league":"世"}},"sort":1},"5026":{"serial_no":"5026","match_id":"1000226","match_time":"2018-06-23 02:00:00","bet_time":"2018-06-23 02:00:00","bet_date":"2018-06-22","league_name":"世界杯","host_name_s":"塞尔维亚","guest_name_s":"瑞士","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264178","is_single":"1","boundary":"0","odds":{"0":"2.36","1":"2.87","3":"2.58"}},"SportteryWDL":{"bet_id":"264180","is_single":"0","boundary":"1","odds":{"0":"5.72","1":"3.7","3":"1.4"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"83","team_name":"塞尔维亚","rank":"34","rank_league":"世"},"2":{"team_id":"71","team_name":"瑞士","rank":"6","rank_league":"世"}},"sort":2}},"2018-06-23":{"6101":{"serial_no":"6101","match_id":"1008107","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"岐阜FC","guest_name_s":"雷法山口","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266651","is_single":"0","boundary":"0","odds":{"0":"2.25","1":"3.35","3":"2.4"}},"SportteryWDL":{"bet_id":"266721","is_single":"0","boundary":"1","odds":{"0":"4.75","1":"4.1","3":"1.42"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1815","team_name":"岐阜FC","rank":"8","rank_league":""},"2":{"team_id":"12156","team_name":"雷法山口","rank":"1","rank_league":""}},"sort":1},"6102":{"serial_no":"6102","match_id":"1008115","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"赞岐釜玉海","guest_name_s":"冈山绿雉","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266655","is_single":"0","boundary":"0","odds":{"0":"1.56","1":"3.25","3":"4.8"}},"SportteryWDL":{"bet_id":"266723","is_single":"0","boundary":"1","odds":{"0":"2.93","1":"3.2","3":"1.98"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"12146","team_name":"赞岐釜玉海","rank":"22","rank_league":""},"2":{"team_id":"1998","team_name":"冈山绿雉","rank":"6","rank_league":""}},"sort":2},"6103":{"serial_no":"6103","match_id":"1008101","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"京都不死鸟","guest_name_s":"大宫松鼠","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266659","is_single":"0","boundary":"0","odds":{"0":"1.92","1":"3.12","3":"3.15"}},"SportteryWDL":{"bet_id":"266725","is_single":"0","boundary":"1","odds":{"0":"3.95","1":"3.55","3":"1.6"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"378","team_name":"京都不死鸟","rank":"20","rank_league":""},"2":{"team_id":"1064","team_name":"大宫松鼠","rank":"9","rank_league":""}},"sort":3},"6104":{"serial_no":"6104","match_id":"1008110","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"松本山雅","guest_name_s":"千叶市原","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266663","is_single":"0","boundary":"0","odds":{"0":"3.1","1":"3.35","3":"1.86"}},"SportteryWDL":{"bet_id":"266727","is_single":"0","boundary":"-1","odds":{"0":"1.65","1":"3.7","3":"3.55"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"2730","team_name":"松本山雅","rank":"5","rank_league":""},"2":{"team_id":"409","team_name":"千叶市原","rank":"13","rank_league":""}},"sort":4},"6105":{"serial_no":"6105","match_id":"1008108","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"东京绿茵","guest_name_s":"枥木SC","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266729","is_single":"0","boundary":"-1","odds":{"0":"1.67","1":"3.4","3":"3.75"}},"SportteryNWDL":{"bet_id":"266667","is_single":"0","boundary":"0","odds":{"0":"3.45","1":"3.1","3":"1.83"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"417","team_name":"东京绿茵","rank":"12","rank_league":""},"2":{"team_id":"1938","team_name":"枥木SC","rank":"19","rank_league":""}},"sort":5},"6106":{"serial_no":"6106","match_id":"1008118","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"爱媛FC","guest_name_s":"水户蜀葵","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266671","is_single":"0","boundary":"0","odds":{"0":"2.3","1":"2.95","3":"2.6"}},"SportteryWDL":{"bet_id":"266731","is_single":"0","boundary":"1","odds":{"0":"5.4","1":"3.85","3":"1.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1565","team_name":"爱媛FC","rank":"21","rank_league":""},"2":{"team_id":"1566","team_name":"水户蜀葵","rank":"17","rank_league":""}},"sort":6},"6107":{"serial_no":"6107","match_id":"1008116","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"山形山神","guest_name_s":"德岛漩涡","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266733","is_single":"0","boundary":"1","odds":{"0":"4.5","1":"3.65","3":"1.51"}},"SportteryNWDL":{"bet_id":"266675","is_single":"0","boundary":"0","odds":{"0":"2.06","1":"3.1","3":"2.85"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1571","team_name":"山形山神","rank":"11","rank_league":""},"2":{"team_id":"1567","team_name":"德岛漩涡","rank":"16","rank_league":""}},"sort":7},"6108":{"serial_no":"6108","match_id":"1008138","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"大分三神","guest_name_s":"福冈黄蜂","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266679","is_single":"0","boundary":"0","odds":{"0":"2.37","1":"3.12","3":"2.4"}},"SportteryWDL":{"bet_id":"266735","is_single":"0","boundary":"1","odds":{"0":"5.35","1":"4.05","3":"1.38"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"423","team_name":"大分三神","rank":"2","rank_league":""},"2":{"team_id":"1193","team_name":"福冈黄蜂","rank":"4","rank_league":""}},"sort":8},"6109":{"serial_no":"6109","match_id":"1008114","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"金泽塞维根","guest_name_s":"熊本深红","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266683","is_single":"0","boundary":"0","odds":{"0":"3.55","1":"3.3","3":"1.74"}},"SportteryWDL":{"bet_id":"266737","is_single":"0","boundary":"-1","odds":{"0":"1.75","1":"3.4","3":"3.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"12164","team_name":"金泽塞维根","rank":"15","rank_league":""},"2":{"team_id":"1811","team_name":"熊本深红","rank":"18","rank_league":""}},"sort":9},"6027":{"serial_no":"6027","match_id":"1000222","match_time":"2018-06-23 20:00:00","bet_time":"2018-06-23 20:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"比利时","guest_name_s":"突尼斯","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264183","is_single":"1","boundary":"0","odds":{"0":"9","1":"4.8","3":"1.19"}},"SportteryWDL":{"bet_id":"264185","is_single":"0","boundary":"-1","odds":{"0":"3.3","1":"3.4","3":"1.78"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"259","team_name":"比利时","rank":"3","rank_league":"世"},"2":{"team_id":"263","team_name":"突尼斯","rank":"21","rank_league":"世"}},"sort":10},"6028":{"serial_no":"6028","match_id":"1000227","match_time":"2018-06-23 23:00:00","bet_time":"2018-06-23 23:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"韩国","guest_name_s":"墨西哥","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264188","is_single":"1","boundary":"0","odds":{"0":"1.48","1":"3.5","3":"5.05"}},"SportteryWDL":{"bet_id":"264190","is_single":"0","boundary":"1","odds":{"0":"2.7","1":"3.15","3":"2.12"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"717","team_name":"韩国","rank":"57","rank_league":"世"},"2":{"team_id":"729","team_name":"墨西哥","rank":"15","rank_league":"世"}},"sort":11},"6110":{"serial_no":"6110","match_id":"1002916","match_time":"2018-06-24 00:00:00","bet_time":"2018-06-24 00:00:00","bet_date":"2018-06-23","league_name":"挪超","host_name_s":"莫尔德","guest_name_s":"斯塔贝克","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266687","is_single":"0","boundary":"0","odds":{"0":"4.7","1":"3.8","3":"1.47"}},"SportteryWDL":{"bet_id":"266739","is_single":"0","boundary":"-1","odds":{"0":"2.18","1":"3.5","3":"2.42"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"441","team_name":"莫尔德","rank":"8","rank_league":""},"2":{"team_id":"437","team_name":"斯塔贝克","rank":"14","rank_league":""}},"sort":12},"6029":{"serial_no":"6029","match_id":"1000241","match_time":"2018-06-24 02:00:00","bet_time":"2018-06-24 02:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"德国","guest_name_s":"瑞典","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264193","is_single":"1","boundary":"0","odds":{"0":"6","1":"4.25","3":"1.32"}},"SportteryWDL":{"bet_id":"264195","is_single":"0","boundary":"-1","odds":{"0":"2.6","1":"3.25","3":"2.14"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"211","team_name":"德国","rank":"1","rank_league":"世"},"2":{"team_id":"231","team_name":"瑞典","rank":"24","rank_league":"世"}},"sort":13}},"2018-06-24":{"7101":{"serial_no":"7101","match_id":"1008117","match_time":"2018-06-24 13:00:00","bet_time":"2018-06-24 13:00:00","bet_date":"2018-06-24","league_name":"J2联赛","host_name_s":"横滨FC","guest_name_s":"甲府风林","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266741","is_single":"0","boundary":"1","odds":{"0":"5.25","1":"4","3":"1.39"}},"SportteryNWDL":{"bet_id":"266691","is_single":"0","boundary":"0","odds":{"0":"2.35","1":"3.16","3":"2.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1331","team_name":"横滨FC","rank":"7","rank_league":""},"2":{"team_id":"1192","team_name":"甲府风林","rank":"10","rank_league":""}},"sort":1},"7102":{"serial_no":"7102","match_id":"1008120","match_time":"2018-06-24 17:00:00","bet_time":"2018-06-24 17:00:00","bet_date":"2018-06-24","league_name":"J2联赛","host_name_s":"町田泽维亚","guest_name_s":"新泻天鹅","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266695","is_single":"0","boundary":"0","odds":{"0":"2.55","1":"3.18","3":"2.21"}},"SportteryWDL":{"bet_id":"266743","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"2412","team_name":"町田泽维亚","rank":"3","rank_league":""},"2":{"team_id":"690","team_name":"新泻天鹅","rank":"14","rank_league":""}},"sort":2},"7030":{"serial_no":"7030","match_id":"1000240","match_time":"2018-06-24 20:00:00","bet_time":"2018-06-24 20:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"英格兰","guest_name_s":"巴拿马","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264198","is_single":"1","boundary":"0","odds":{"0":"14","1":"5.85","3":"1.09"}},"SportteryWDL":{"bet_id":"264200","is_single":"0","boundary":"-2","odds":{"0":"2.02","1":"3.7","3":"2.54"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"227","team_name":"英格兰","rank":"12","rank_league":"世"},"2":{"team_id":"815","team_name":"巴拿马","rank":"55","rank_league":"世"}},"sort":3},"7031":{"serial_no":"7031","match_id":"1000215","match_time":"2018-06-24 23:00:00","bet_time":"2018-06-24 23:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"日本","guest_name_s":"塞内加尔","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264203","is_single":"1","boundary":"0","odds":{"0":"2","1":"2.85","3":"3.25"}},"SportteryWDL":{"bet_id":"264205","is_single":"0","boundary":"1","odds":{"0":"4.3","1":"3.5","3":"1.56"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"718","team_name":"日本","rank":"61","rank_league":"世"},"2":{"team_id":"155","team_name":"塞内加尔","rank":"27","rank_league":"世"}},"sort":4},"7103":{"serial_no":"7103","match_id":"1002912","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"博德闪耀","guest_name_s":"桑纳菲尤尔","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266699","is_single":"0","boundary":"0","odds":{"0":"6","1":"4.2","3":"1.33"}},"SportteryWDL":{"bet_id":"266745","is_single":"0","boundary":"-1","odds":{"0":"2.58","1":"3.4","3":"2.1"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"449","team_name":"博德闪耀","rank":"11","rank_league":""},"2":{"team_id":"1200","team_name":"桑纳菲尤尔","rank":"16","rank_league":""}},"sort":5},"7104":{"serial_no":"7104","match_id":"1002918","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"海于格松","guest_name_s":"利勒斯特罗姆","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266703","is_single":"0","boundary":"0","odds":{"0":"3.5","1":"3.25","3":"1.77"}},"SportteryWDL":{"bet_id":"266747","is_single":"0","boundary":"-1","odds":{"0":"1.74","1":"3.45","3":"3.4"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1104","team_name":"海于格松","rank":"4","rank_league":""},"2":{"team_id":"440","team_name":"利勒斯特罗姆","rank":"13","rank_league":""}},"sort":6},"7105":{"serial_no":"7105","match_id":"1002915","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"斯达","guest_name_s":"克里斯蒂安松","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266749","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}},"SportteryNWDL":{"bet_id":"266707","is_single":"0","boundary":"0","odds":{"0":"2.5","1":"3.2","3":"2.25"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1074","team_name":"斯达","rank":"15","rank_league":""},"2":{"team_id":"1830","team_name":"克里斯蒂安松","rank":"9","rank_league":""}},"sort":7},"7106":{"serial_no":"7106","match_id":"1002917","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"萨尔普斯堡","guest_name_s":"特罗姆瑟","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266711","is_single":"0","boundary":"0","odds":{"0":"4.25","1":"3.6","3":"1.55"}},"SportteryWDL":{"bet_id":"266751","is_single":"0","boundary":"-1","odds":{"0":"2.03","1":"3.45","3":"2.66"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1407","team_name":"萨尔普斯堡","rank":"5","rank_league":""},"2":{"team_id":"448","team_name":"特罗姆瑟","rank":"7","rank_league":""}},"sort":8},"7107":{"serial_no":"7107","match_id":"1002914","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"斯特罗姆加斯特","guest_name_s":"兰赫姆","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266715","is_single":"0","boundary":"0","odds":{"0":"4.55","1":"3.75","3":"1.49"}},"SportteryWDL":{"bet_id":"266753","is_single":"0","boundary":"-1","odds":{"0":"2.14","1":"3.5","3":"2.48"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1099","team_name":"斯特罗姆加斯特","rank":"12","rank_league":""},"2":{"team_id":"1831","team_name":"兰赫姆","rank":"2","rank_league":""}},"sort":9},"7032":{"serial_no":"7032","match_id":"1000219","match_time":"2018-06-25 02:00:00","bet_time":"2018-06-25 02:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"波兰","guest_name_s":"哥伦比亚","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264208","is_single":"1","boundary":"0","odds":{"0":"1.97","1":"3.2","3":"2.95"}},"SportteryWDL":{"bet_id":"264210","is_single":"0","boundary":"1","odds":{"0":"4.15","1":"3.5","3":"1.58"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"195","team_name":"波兰","rank":"8","rank_league":"世"},"2":{"team_id":"732","team_name":"哥伦比亚","rank":"16","rank_league":"世"}},"sort":10},"7108":{"serial_no":"7108","match_id":"1002913","match_time":"2018-06-25 02:00:00","bet_time":"2018-06-25 02:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"罗森博格","guest_name_s":"瓦勒伦加","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266756","is_single":"0","boundary":"-1","odds":{"0":"2.23","1":"3.45","3":"2.38"}},"SportteryNWDL":{"bet_id":"266719","is_single":"0","boundary":"0","odds":{"0":"5","1":"3.8","3":"1.44"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"116","team_name":"罗森博格","rank":"3","rank_league":""},"2":{"team_id":"450","team_name":"瓦勒伦加","rank":"6","rank_league":""}},"sort":11}},"2018-06-25":{"1033":{"serial_no":"1033","match_id":"1000239","match_time":"2018-06-25 22:00:00","bet_time":"2018-06-25 22:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"沙特","guest_name_s":"埃及","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266627","is_single":"0","boundary":"0","odds":{"0":"1.58","1":"3.45","3":"4.25"}},"SportteryWDL":{"bet_id":"266630","is_single":"1","boundary":"1","odds":{"0":"2.76","1":"3.45","3":"1.97"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"722","team_name":"沙特","rank":"67","rank_league":"世"},"2":{"team_id":"363","team_name":"埃及","rank":"45","rank_league":"世"}},"sort":1},"1034":{"serial_no":"1034","match_id":"1000232","match_time":"2018-06-25 22:00:00","bet_time":"2018-06-25 22:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"俄罗斯","guest_name_s":"乌拉圭","sale_status":"1","reversion":"1","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266633","is_single":"1","boundary":"0","odds":{"0":"2.23","1":"2.9","3":"2.75"}},"SportteryWDL":{"bet_id":"266636","is_single":"0","boundary":"1","odds":{"0":"5.2","1":"3.75","3":"1.43"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"255","team_name":"俄罗斯","rank":"70","rank_league":"世"},"2":{"team_id":"730","team_name":"乌拉圭","rank":"14","rank_league":"世"}},"sort":2,"host_name_l":null,"guest_name_l":null},"1035":{"serial_no":"1035","match_id":"1000229","match_time":"2018-06-26 02:00:00","bet_time":"2018-06-26 02:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"伊朗","guest_name_s":"葡萄牙","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266639","is_single":"0","boundary":"0","odds":{"0":"1.45","1":"3.35","3":"5.85"}},"SportteryWDL":{"bet_id":"266642","is_single":"1","boundary":"1","odds":{"0":"2.58","1":"3.15","3":"2.2"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"719","team_name":"伊朗","rank":"43","rank_league":"世"},"2":{"team_id":"207","team_name":"葡萄牙","rank":"4","rank_league":"世"}},"sort":3},"1036":{"serial_no":"1036","match_id":"1000228","match_time":"2018-06-26 02:00:00","bet_time":"2018-06-26 02:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"西班牙","guest_name_s":"摩洛哥","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266645","is_single":"0","boundary":"0","odds":{"0":"9.75","1":"4.95","3":"1.17"}},"SportteryWDL":{"bet_id":"266648","is_single":"1","boundary":"-2","odds":{"0":"1.76","1":"3.9","3":"3"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"163","team_name":"西班牙","rank":"10","rank_league":"世"},"2":{"team_id":"893","team_name":"摩洛哥","rank":"41","rank_league":"世"}},"sort":4}}}
     * use_cache : 1
     * errcode : 0
     */

    private String msg;
    private DataBean data;
    private int use_cache;
    private int errcode;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getUse_cache() {
        return use_cache;
    }

    public void setUse_cache(int use_cache) {
        this.use_cache = use_cache;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public static class DataBean {
        /**
         * 2018-06-22 : {"5025":{"serial_no":"5025","match_id":"1000237","match_time":"2018-06-22 23:00:00","bet_time":"2018-06-22 23:00:00","bet_date":"2018-06-22","league_name":"世界杯","host_name_s":"尼日利亚","guest_name_s":"冰岛","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264173","is_single":"1","boundary":"0","odds":{"0":"2.27","1":"3","3":"2.6"}},"SportteryWDL":{"bet_id":"264175","is_single":"0","boundary":"-1","odds":{"0":"1.32","1":"4.15","3":"6.25"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"271","team_name":"尼日利亚","rank":"48","rank_league":"世"},"2":{"team_id":"57","team_name":"冰岛","rank":"22","rank_league":"世"}},"sort":1},"5026":{"serial_no":"5026","match_id":"1000226","match_time":"2018-06-23 02:00:00","bet_time":"2018-06-23 02:00:00","bet_date":"2018-06-22","league_name":"世界杯","host_name_s":"塞尔维亚","guest_name_s":"瑞士","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264178","is_single":"1","boundary":"0","odds":{"0":"2.36","1":"2.87","3":"2.58"}},"SportteryWDL":{"bet_id":"264180","is_single":"0","boundary":"1","odds":{"0":"5.72","1":"3.7","3":"1.4"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"83","team_name":"塞尔维亚","rank":"34","rank_league":"世"},"2":{"team_id":"71","team_name":"瑞士","rank":"6","rank_league":"世"}},"sort":2}}
         * 2018-06-23 : {"6101":{"serial_no":"6101","match_id":"1008107","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"岐阜FC","guest_name_s":"雷法山口","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266651","is_single":"0","boundary":"0","odds":{"0":"2.25","1":"3.35","3":"2.4"}},"SportteryWDL":{"bet_id":"266721","is_single":"0","boundary":"1","odds":{"0":"4.75","1":"4.1","3":"1.42"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1815","team_name":"岐阜FC","rank":"8","rank_league":""},"2":{"team_id":"12156","team_name":"雷法山口","rank":"1","rank_league":""}},"sort":1},"6102":{"serial_no":"6102","match_id":"1008115","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"赞岐釜玉海","guest_name_s":"冈山绿雉","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266655","is_single":"0","boundary":"0","odds":{"0":"1.56","1":"3.25","3":"4.8"}},"SportteryWDL":{"bet_id":"266723","is_single":"0","boundary":"1","odds":{"0":"2.93","1":"3.2","3":"1.98"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"12146","team_name":"赞岐釜玉海","rank":"22","rank_league":""},"2":{"team_id":"1998","team_name":"冈山绿雉","rank":"6","rank_league":""}},"sort":2},"6103":{"serial_no":"6103","match_id":"1008101","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"京都不死鸟","guest_name_s":"大宫松鼠","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266659","is_single":"0","boundary":"0","odds":{"0":"1.92","1":"3.12","3":"3.15"}},"SportteryWDL":{"bet_id":"266725","is_single":"0","boundary":"1","odds":{"0":"3.95","1":"3.55","3":"1.6"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"378","team_name":"京都不死鸟","rank":"20","rank_league":""},"2":{"team_id":"1064","team_name":"大宫松鼠","rank":"9","rank_league":""}},"sort":3},"6104":{"serial_no":"6104","match_id":"1008110","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"松本山雅","guest_name_s":"千叶市原","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266663","is_single":"0","boundary":"0","odds":{"0":"3.1","1":"3.35","3":"1.86"}},"SportteryWDL":{"bet_id":"266727","is_single":"0","boundary":"-1","odds":{"0":"1.65","1":"3.7","3":"3.55"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"2730","team_name":"松本山雅","rank":"5","rank_league":""},"2":{"team_id":"409","team_name":"千叶市原","rank":"13","rank_league":""}},"sort":4},"6105":{"serial_no":"6105","match_id":"1008108","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"东京绿茵","guest_name_s":"枥木SC","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266729","is_single":"0","boundary":"-1","odds":{"0":"1.67","1":"3.4","3":"3.75"}},"SportteryNWDL":{"bet_id":"266667","is_single":"0","boundary":"0","odds":{"0":"3.45","1":"3.1","3":"1.83"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"417","team_name":"东京绿茵","rank":"12","rank_league":""},"2":{"team_id":"1938","team_name":"枥木SC","rank":"19","rank_league":""}},"sort":5},"6106":{"serial_no":"6106","match_id":"1008118","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"爱媛FC","guest_name_s":"水户蜀葵","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266671","is_single":"0","boundary":"0","odds":{"0":"2.3","1":"2.95","3":"2.6"}},"SportteryWDL":{"bet_id":"266731","is_single":"0","boundary":"1","odds":{"0":"5.4","1":"3.85","3":"1.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1565","team_name":"爱媛FC","rank":"21","rank_league":""},"2":{"team_id":"1566","team_name":"水户蜀葵","rank":"17","rank_league":""}},"sort":6},"6107":{"serial_no":"6107","match_id":"1008116","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"山形山神","guest_name_s":"德岛漩涡","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266733","is_single":"0","boundary":"1","odds":{"0":"4.5","1":"3.65","3":"1.51"}},"SportteryNWDL":{"bet_id":"266675","is_single":"0","boundary":"0","odds":{"0":"2.06","1":"3.1","3":"2.85"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1571","team_name":"山形山神","rank":"11","rank_league":""},"2":{"team_id":"1567","team_name":"德岛漩涡","rank":"16","rank_league":""}},"sort":7},"6108":{"serial_no":"6108","match_id":"1008138","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"大分三神","guest_name_s":"福冈黄蜂","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266679","is_single":"0","boundary":"0","odds":{"0":"2.37","1":"3.12","3":"2.4"}},"SportteryWDL":{"bet_id":"266735","is_single":"0","boundary":"1","odds":{"0":"5.35","1":"4.05","3":"1.38"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"423","team_name":"大分三神","rank":"2","rank_league":""},"2":{"team_id":"1193","team_name":"福冈黄蜂","rank":"4","rank_league":""}},"sort":8},"6109":{"serial_no":"6109","match_id":"1008114","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"金泽塞维根","guest_name_s":"熊本深红","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266683","is_single":"0","boundary":"0","odds":{"0":"3.55","1":"3.3","3":"1.74"}},"SportteryWDL":{"bet_id":"266737","is_single":"0","boundary":"-1","odds":{"0":"1.75","1":"3.4","3":"3.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"12164","team_name":"金泽塞维根","rank":"15","rank_league":""},"2":{"team_id":"1811","team_name":"熊本深红","rank":"18","rank_league":""}},"sort":9},"6027":{"serial_no":"6027","match_id":"1000222","match_time":"2018-06-23 20:00:00","bet_time":"2018-06-23 20:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"比利时","guest_name_s":"突尼斯","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264183","is_single":"1","boundary":"0","odds":{"0":"9","1":"4.8","3":"1.19"}},"SportteryWDL":{"bet_id":"264185","is_single":"0","boundary":"-1","odds":{"0":"3.3","1":"3.4","3":"1.78"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"259","team_name":"比利时","rank":"3","rank_league":"世"},"2":{"team_id":"263","team_name":"突尼斯","rank":"21","rank_league":"世"}},"sort":10},"6028":{"serial_no":"6028","match_id":"1000227","match_time":"2018-06-23 23:00:00","bet_time":"2018-06-23 23:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"韩国","guest_name_s":"墨西哥","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264188","is_single":"1","boundary":"0","odds":{"0":"1.48","1":"3.5","3":"5.05"}},"SportteryWDL":{"bet_id":"264190","is_single":"0","boundary":"1","odds":{"0":"2.7","1":"3.15","3":"2.12"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"717","team_name":"韩国","rank":"57","rank_league":"世"},"2":{"team_id":"729","team_name":"墨西哥","rank":"15","rank_league":"世"}},"sort":11},"6110":{"serial_no":"6110","match_id":"1002916","match_time":"2018-06-24 00:00:00","bet_time":"2018-06-24 00:00:00","bet_date":"2018-06-23","league_name":"挪超","host_name_s":"莫尔德","guest_name_s":"斯塔贝克","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266687","is_single":"0","boundary":"0","odds":{"0":"4.7","1":"3.8","3":"1.47"}},"SportteryWDL":{"bet_id":"266739","is_single":"0","boundary":"-1","odds":{"0":"2.18","1":"3.5","3":"2.42"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"441","team_name":"莫尔德","rank":"8","rank_league":""},"2":{"team_id":"437","team_name":"斯塔贝克","rank":"14","rank_league":""}},"sort":12},"6029":{"serial_no":"6029","match_id":"1000241","match_time":"2018-06-24 02:00:00","bet_time":"2018-06-24 02:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"德国","guest_name_s":"瑞典","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264193","is_single":"1","boundary":"0","odds":{"0":"6","1":"4.25","3":"1.32"}},"SportteryWDL":{"bet_id":"264195","is_single":"0","boundary":"-1","odds":{"0":"2.6","1":"3.25","3":"2.14"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"211","team_name":"德国","rank":"1","rank_league":"世"},"2":{"team_id":"231","team_name":"瑞典","rank":"24","rank_league":"世"}},"sort":13}}
         * 2018-06-24 : {"7101":{"serial_no":"7101","match_id":"1008117","match_time":"2018-06-24 13:00:00","bet_time":"2018-06-24 13:00:00","bet_date":"2018-06-24","league_name":"J2联赛","host_name_s":"横滨FC","guest_name_s":"甲府风林","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266741","is_single":"0","boundary":"1","odds":{"0":"5.25","1":"4","3":"1.39"}},"SportteryNWDL":{"bet_id":"266691","is_single":"0","boundary":"0","odds":{"0":"2.35","1":"3.16","3":"2.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1331","team_name":"横滨FC","rank":"7","rank_league":""},"2":{"team_id":"1192","team_name":"甲府风林","rank":"10","rank_league":""}},"sort":1},"7102":{"serial_no":"7102","match_id":"1008120","match_time":"2018-06-24 17:00:00","bet_time":"2018-06-24 17:00:00","bet_date":"2018-06-24","league_name":"J2联赛","host_name_s":"町田泽维亚","guest_name_s":"新泻天鹅","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266695","is_single":"0","boundary":"0","odds":{"0":"2.55","1":"3.18","3":"2.21"}},"SportteryWDL":{"bet_id":"266743","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"2412","team_name":"町田泽维亚","rank":"3","rank_league":""},"2":{"team_id":"690","team_name":"新泻天鹅","rank":"14","rank_league":""}},"sort":2},"7030":{"serial_no":"7030","match_id":"1000240","match_time":"2018-06-24 20:00:00","bet_time":"2018-06-24 20:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"英格兰","guest_name_s":"巴拿马","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264198","is_single":"1","boundary":"0","odds":{"0":"14","1":"5.85","3":"1.09"}},"SportteryWDL":{"bet_id":"264200","is_single":"0","boundary":"-2","odds":{"0":"2.02","1":"3.7","3":"2.54"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"227","team_name":"英格兰","rank":"12","rank_league":"世"},"2":{"team_id":"815","team_name":"巴拿马","rank":"55","rank_league":"世"}},"sort":3},"7031":{"serial_no":"7031","match_id":"1000215","match_time":"2018-06-24 23:00:00","bet_time":"2018-06-24 23:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"日本","guest_name_s":"塞内加尔","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264203","is_single":"1","boundary":"0","odds":{"0":"2","1":"2.85","3":"3.25"}},"SportteryWDL":{"bet_id":"264205","is_single":"0","boundary":"1","odds":{"0":"4.3","1":"3.5","3":"1.56"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"718","team_name":"日本","rank":"61","rank_league":"世"},"2":{"team_id":"155","team_name":"塞内加尔","rank":"27","rank_league":"世"}},"sort":4},"7103":{"serial_no":"7103","match_id":"1002912","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"博德闪耀","guest_name_s":"桑纳菲尤尔","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266699","is_single":"0","boundary":"0","odds":{"0":"6","1":"4.2","3":"1.33"}},"SportteryWDL":{"bet_id":"266745","is_single":"0","boundary":"-1","odds":{"0":"2.58","1":"3.4","3":"2.1"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"449","team_name":"博德闪耀","rank":"11","rank_league":""},"2":{"team_id":"1200","team_name":"桑纳菲尤尔","rank":"16","rank_league":""}},"sort":5},"7104":{"serial_no":"7104","match_id":"1002918","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"海于格松","guest_name_s":"利勒斯特罗姆","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266703","is_single":"0","boundary":"0","odds":{"0":"3.5","1":"3.25","3":"1.77"}},"SportteryWDL":{"bet_id":"266747","is_single":"0","boundary":"-1","odds":{"0":"1.74","1":"3.45","3":"3.4"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1104","team_name":"海于格松","rank":"4","rank_league":""},"2":{"team_id":"440","team_name":"利勒斯特罗姆","rank":"13","rank_league":""}},"sort":6},"7105":{"serial_no":"7105","match_id":"1002915","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"斯达","guest_name_s":"克里斯蒂安松","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266749","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}},"SportteryNWDL":{"bet_id":"266707","is_single":"0","boundary":"0","odds":{"0":"2.5","1":"3.2","3":"2.25"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1074","team_name":"斯达","rank":"15","rank_league":""},"2":{"team_id":"1830","team_name":"克里斯蒂安松","rank":"9","rank_league":""}},"sort":7},"7106":{"serial_no":"7106","match_id":"1002917","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"萨尔普斯堡","guest_name_s":"特罗姆瑟","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266711","is_single":"0","boundary":"0","odds":{"0":"4.25","1":"3.6","3":"1.55"}},"SportteryWDL":{"bet_id":"266751","is_single":"0","boundary":"-1","odds":{"0":"2.03","1":"3.45","3":"2.66"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1407","team_name":"萨尔普斯堡","rank":"5","rank_league":""},"2":{"team_id":"448","team_name":"特罗姆瑟","rank":"7","rank_league":""}},"sort":8},"7107":{"serial_no":"7107","match_id":"1002914","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"斯特罗姆加斯特","guest_name_s":"兰赫姆","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266715","is_single":"0","boundary":"0","odds":{"0":"4.55","1":"3.75","3":"1.49"}},"SportteryWDL":{"bet_id":"266753","is_single":"0","boundary":"-1","odds":{"0":"2.14","1":"3.5","3":"2.48"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1099","team_name":"斯特罗姆加斯特","rank":"12","rank_league":""},"2":{"team_id":"1831","team_name":"兰赫姆","rank":"2","rank_league":""}},"sort":9},"7032":{"serial_no":"7032","match_id":"1000219","match_time":"2018-06-25 02:00:00","bet_time":"2018-06-25 02:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"波兰","guest_name_s":"哥伦比亚","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264208","is_single":"1","boundary":"0","odds":{"0":"1.97","1":"3.2","3":"2.95"}},"SportteryWDL":{"bet_id":"264210","is_single":"0","boundary":"1","odds":{"0":"4.15","1":"3.5","3":"1.58"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"195","team_name":"波兰","rank":"8","rank_league":"世"},"2":{"team_id":"732","team_name":"哥伦比亚","rank":"16","rank_league":"世"}},"sort":10},"7108":{"serial_no":"7108","match_id":"1002913","match_time":"2018-06-25 02:00:00","bet_time":"2018-06-25 02:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"罗森博格","guest_name_s":"瓦勒伦加","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266756","is_single":"0","boundary":"-1","odds":{"0":"2.23","1":"3.45","3":"2.38"}},"SportteryNWDL":{"bet_id":"266719","is_single":"0","boundary":"0","odds":{"0":"5","1":"3.8","3":"1.44"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"116","team_name":"罗森博格","rank":"3","rank_league":""},"2":{"team_id":"450","team_name":"瓦勒伦加","rank":"6","rank_league":""}},"sort":11}}
         * 2018-06-25 : {"1033":{"serial_no":"1033","match_id":"1000239","match_time":"2018-06-25 22:00:00","bet_time":"2018-06-25 22:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"沙特","guest_name_s":"埃及","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266627","is_single":"0","boundary":"0","odds":{"0":"1.58","1":"3.45","3":"4.25"}},"SportteryWDL":{"bet_id":"266630","is_single":"1","boundary":"1","odds":{"0":"2.76","1":"3.45","3":"1.97"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"722","team_name":"沙特","rank":"67","rank_league":"世"},"2":{"team_id":"363","team_name":"埃及","rank":"45","rank_league":"世"}},"sort":1},"1034":{"serial_no":"1034","match_id":"1000232","match_time":"2018-06-25 22:00:00","bet_time":"2018-06-25 22:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"俄罗斯","guest_name_s":"乌拉圭","sale_status":"1","reversion":"1","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266633","is_single":"1","boundary":"0","odds":{"0":"2.23","1":"2.9","3":"2.75"}},"SportteryWDL":{"bet_id":"266636","is_single":"0","boundary":"1","odds":{"0":"5.2","1":"3.75","3":"1.43"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"255","team_name":"俄罗斯","rank":"70","rank_league":"世"},"2":{"team_id":"730","team_name":"乌拉圭","rank":"14","rank_league":"世"}},"sort":2,"host_name_l":null,"guest_name_l":null},"1035":{"serial_no":"1035","match_id":"1000229","match_time":"2018-06-26 02:00:00","bet_time":"2018-06-26 02:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"伊朗","guest_name_s":"葡萄牙","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266639","is_single":"0","boundary":"0","odds":{"0":"1.45","1":"3.35","3":"5.85"}},"SportteryWDL":{"bet_id":"266642","is_single":"1","boundary":"1","odds":{"0":"2.58","1":"3.15","3":"2.2"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"719","team_name":"伊朗","rank":"43","rank_league":"世"},"2":{"team_id":"207","team_name":"葡萄牙","rank":"4","rank_league":"世"}},"sort":3},"1036":{"serial_no":"1036","match_id":"1000228","match_time":"2018-06-26 02:00:00","bet_time":"2018-06-26 02:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"西班牙","guest_name_s":"摩洛哥","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266645","is_single":"0","boundary":"0","odds":{"0":"9.75","1":"4.95","3":"1.17"}},"SportteryWDL":{"bet_id":"266648","is_single":"1","boundary":"-2","odds":{"0":"1.76","1":"3.9","3":"3"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"163","team_name":"西班牙","rank":"10","rank_league":"世"},"2":{"team_id":"893","team_name":"摩洛哥","rank":"41","rank_league":"世"}},"sort":4}}
         */

        @com.google.gson.annotations.SerializedName("2018-06-22")
        private _$20180622Bean _$20180622;
        @com.google.gson.annotations.SerializedName("2018-06-23")
        private _$20180623Bean _$20180623;
        @com.google.gson.annotations.SerializedName("2018-06-24")
        private _$20180624Bean _$20180624;
        @com.google.gson.annotations.SerializedName("2018-06-25")
        private _$20180625Bean _$20180625;

        public _$20180622Bean get_$20180622() {
            return _$20180622;
        }

        public void set_$20180622(_$20180622Bean _$20180622) {
            this._$20180622 = _$20180622;
        }

        public _$20180623Bean get_$20180623() {
            return _$20180623;
        }

        public void set_$20180623(_$20180623Bean _$20180623) {
            this._$20180623 = _$20180623;
        }

        public _$20180624Bean get_$20180624() {
            return _$20180624;
        }

        public void set_$20180624(_$20180624Bean _$20180624) {
            this._$20180624 = _$20180624;
        }

        public _$20180625Bean get_$20180625() {
            return _$20180625;
        }

        public void set_$20180625(_$20180625Bean _$20180625) {
            this._$20180625 = _$20180625;
        }

        public static class _$20180622Bean {
            /**
             * 5025 : {"serial_no":"5025","match_id":"1000237","match_time":"2018-06-22 23:00:00","bet_time":"2018-06-22 23:00:00","bet_date":"2018-06-22","league_name":"世界杯","host_name_s":"尼日利亚","guest_name_s":"冰岛","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264173","is_single":"1","boundary":"0","odds":{"0":"2.27","1":"3","3":"2.6"}},"SportteryWDL":{"bet_id":"264175","is_single":"0","boundary":"-1","odds":{"0":"1.32","1":"4.15","3":"6.25"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"271","team_name":"尼日利亚","rank":"48","rank_league":"世"},"2":{"team_id":"57","team_name":"冰岛","rank":"22","rank_league":"世"}},"sort":1}
             * 5026 : {"serial_no":"5026","match_id":"1000226","match_time":"2018-06-23 02:00:00","bet_time":"2018-06-23 02:00:00","bet_date":"2018-06-22","league_name":"世界杯","host_name_s":"塞尔维亚","guest_name_s":"瑞士","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264178","is_single":"1","boundary":"0","odds":{"0":"2.36","1":"2.87","3":"2.58"}},"SportteryWDL":{"bet_id":"264180","is_single":"0","boundary":"1","odds":{"0":"5.72","1":"3.7","3":"1.4"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"83","team_name":"塞尔维亚","rank":"34","rank_league":"世"},"2":{"team_id":"71","team_name":"瑞士","rank":"6","rank_league":"世"}},"sort":2}
             */

            @com.google.gson.annotations.SerializedName("5025")
            private _$5025Bean _$5025;
            @com.google.gson.annotations.SerializedName("5026")
            private _$5026Bean _$5026;

            public _$5025Bean get_$5025() {
                return _$5025;
            }

            public void set_$5025(_$5025Bean _$5025) {
                this._$5025 = _$5025;
            }

            public _$5026Bean get_$5026() {
                return _$5026;
            }

            public void set_$5026(_$5026Bean _$5026) {
                this._$5026 = _$5026;
            }

            public static class _$5025Bean {
                /**
                 * serial_no : 5025
                 * match_id : 1000237
                 * match_time : 2018-06-22 23:00:00
                 * bet_time : 2018-06-22 23:00:00
                 * bet_date : 2018-06-22
                 * league_name : 世界杯
                 * host_name_s : 尼日利亚
                 * guest_name_s : 冰岛
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264173","is_single":"1","boundary":"0","odds":{"0":"2.27","1":"3","3":"2.6"}},"SportteryWDL":{"bet_id":"264175","is_single":"0","boundary":"-1","odds":{"0":"1.32","1":"4.15","3":"6.25"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"271","team_name":"尼日利亚","rank":"48","rank_league":"世"},"2":{"team_id":"57","team_name":"冰岛","rank":"22","rank_league":"世"}}
                 * sort : 1
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBean list;
                private RankBean rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBean getList() {
                    return list;
                }

                public void setList(ListBean list) {
                    this.list = list;
                }

                public RankBean getRank() {
                    return rank;
                }

                public void setRank(RankBean rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBean {
                    /**
                     * SportteryNWDL : {"bet_id":"264173","is_single":"1","boundary":"0","odds":{"0":"2.27","1":"3","3":"2.6"}}
                     * SportteryWDL : {"bet_id":"264175","is_single":"0","boundary":"-1","odds":{"0":"1.32","1":"4.15","3":"6.25"}}
                     */

                    private SportteryNWDLBean SportteryNWDL;
                    private SportteryWDLBean SportteryWDL;

                    public SportteryNWDLBean getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBean SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBean getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBean SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBean {
                        /**
                         * bet_id : 264173
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"2.27","1":"3","3":"2.6"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBean odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBean getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBean odds) {
                            this.odds = odds;
                        }

                        public static class OddsBean {
                            /**
                             * 0 : 2.27
                             * 1 : 3
                             * 3 : 2.6
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBean {
                        /**
                         * bet_id : 264175
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"1.32","1":"4.15","3":"6.25"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanX {
                            /**
                             * 0 : 1.32
                             * 1 : 4.15
                             * 3 : 6.25
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBean {
                    /**
                     * 1 : {"team_id":"271","team_name":"尼日利亚","rank":"48","rank_league":"世"}
                     * 2 : {"team_id":"57","team_name":"冰岛","rank":"22","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1Bean _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2Bean _$2;

                    public _$1Bean get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1Bean _$1) {
                        this._$1 = _$1;
                    }

                    public _$2Bean get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2Bean _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1Bean {
                        /**
                         * team_id : 271
                         * team_name : 尼日利亚
                         * rank : 48
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2Bean {
                        /**
                         * team_id : 57
                         * team_name : 冰岛
                         * rank : 22
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$5026Bean {
                /**
                 * serial_no : 5026
                 * match_id : 1000226
                 * match_time : 2018-06-23 02:00:00
                 * bet_time : 2018-06-23 02:00:00
                 * bet_date : 2018-06-22
                 * league_name : 世界杯
                 * host_name_s : 塞尔维亚
                 * guest_name_s : 瑞士
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264178","is_single":"1","boundary":"0","odds":{"0":"2.36","1":"2.87","3":"2.58"}},"SportteryWDL":{"bet_id":"264180","is_single":"0","boundary":"1","odds":{"0":"5.72","1":"3.7","3":"1.4"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"83","team_name":"塞尔维亚","rank":"34","rank_league":"世"},"2":{"team_id":"71","team_name":"瑞士","rank":"6","rank_league":"世"}}
                 * sort : 2
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanX list;
                private RankBeanX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanX getList() {
                    return list;
                }

                public void setList(ListBeanX list) {
                    this.list = list;
                }

                public RankBeanX getRank() {
                    return rank;
                }

                public void setRank(RankBeanX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanX {
                    /**
                     * SportteryNWDL : {"bet_id":"264178","is_single":"1","boundary":"0","odds":{"0":"2.36","1":"2.87","3":"2.58"}}
                     * SportteryWDL : {"bet_id":"264180","is_single":"0","boundary":"1","odds":{"0":"5.72","1":"3.7","3":"1.4"}}
                     */

                    private SportteryNWDLBeanX SportteryNWDL;
                    private SportteryWDLBeanX SportteryWDL;

                    public SportteryNWDLBeanX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanX {
                        /**
                         * bet_id : 264178
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"2.36","1":"2.87","3":"2.58"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXX {
                            /**
                             * 0 : 2.36
                             * 1 : 2.87
                             * 3 : 2.58
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanX {
                        /**
                         * bet_id : 264180
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"5.72","1":"3.7","3":"1.4"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXX {
                            /**
                             * 0 : 5.72
                             * 1 : 3.7
                             * 3 : 1.4
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanX {
                    /**
                     * 1 : {"team_id":"83","team_name":"塞尔维亚","rank":"34","rank_league":"世"}
                     * 2 : {"team_id":"71","team_name":"瑞士","rank":"6","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanX _$2;

                    public _$1BeanX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanX {
                        /**
                         * team_id : 83
                         * team_name : 塞尔维亚
                         * rank : 34
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanX {
                        /**
                         * team_id : 71
                         * team_name : 瑞士
                         * rank : 6
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }
        }

        public static class _$20180623Bean {
            /**
             * 6101 : {"serial_no":"6101","match_id":"1008107","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"岐阜FC","guest_name_s":"雷法山口","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266651","is_single":"0","boundary":"0","odds":{"0":"2.25","1":"3.35","3":"2.4"}},"SportteryWDL":{"bet_id":"266721","is_single":"0","boundary":"1","odds":{"0":"4.75","1":"4.1","3":"1.42"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1815","team_name":"岐阜FC","rank":"8","rank_league":""},"2":{"team_id":"12156","team_name":"雷法山口","rank":"1","rank_league":""}},"sort":1}
             * 6102 : {"serial_no":"6102","match_id":"1008115","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"赞岐釜玉海","guest_name_s":"冈山绿雉","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266655","is_single":"0","boundary":"0","odds":{"0":"1.56","1":"3.25","3":"4.8"}},"SportteryWDL":{"bet_id":"266723","is_single":"0","boundary":"1","odds":{"0":"2.93","1":"3.2","3":"1.98"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"12146","team_name":"赞岐釜玉海","rank":"22","rank_league":""},"2":{"team_id":"1998","team_name":"冈山绿雉","rank":"6","rank_league":""}},"sort":2}
             * 6103 : {"serial_no":"6103","match_id":"1008101","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"京都不死鸟","guest_name_s":"大宫松鼠","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266659","is_single":"0","boundary":"0","odds":{"0":"1.92","1":"3.12","3":"3.15"}},"SportteryWDL":{"bet_id":"266725","is_single":"0","boundary":"1","odds":{"0":"3.95","1":"3.55","3":"1.6"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"378","team_name":"京都不死鸟","rank":"20","rank_league":""},"2":{"team_id":"1064","team_name":"大宫松鼠","rank":"9","rank_league":""}},"sort":3}
             * 6104 : {"serial_no":"6104","match_id":"1008110","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"松本山雅","guest_name_s":"千叶市原","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266663","is_single":"0","boundary":"0","odds":{"0":"3.1","1":"3.35","3":"1.86"}},"SportteryWDL":{"bet_id":"266727","is_single":"0","boundary":"-1","odds":{"0":"1.65","1":"3.7","3":"3.55"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"2730","team_name":"松本山雅","rank":"5","rank_league":""},"2":{"team_id":"409","team_name":"千叶市原","rank":"13","rank_league":""}},"sort":4}
             * 6105 : {"serial_no":"6105","match_id":"1008108","match_time":"2018-06-23 17:00:00","bet_time":"2018-06-23 17:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"东京绿茵","guest_name_s":"枥木SC","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266729","is_single":"0","boundary":"-1","odds":{"0":"1.67","1":"3.4","3":"3.75"}},"SportteryNWDL":{"bet_id":"266667","is_single":"0","boundary":"0","odds":{"0":"3.45","1":"3.1","3":"1.83"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"417","team_name":"东京绿茵","rank":"12","rank_league":""},"2":{"team_id":"1938","team_name":"枥木SC","rank":"19","rank_league":""}},"sort":5}
             * 6106 : {"serial_no":"6106","match_id":"1008118","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"爱媛FC","guest_name_s":"水户蜀葵","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266671","is_single":"0","boundary":"0","odds":{"0":"2.3","1":"2.95","3":"2.6"}},"SportteryWDL":{"bet_id":"266731","is_single":"0","boundary":"1","odds":{"0":"5.4","1":"3.85","3":"1.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1565","team_name":"爱媛FC","rank":"21","rank_league":""},"2":{"team_id":"1566","team_name":"水户蜀葵","rank":"17","rank_league":""}},"sort":6}
             * 6107 : {"serial_no":"6107","match_id":"1008116","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"山形山神","guest_name_s":"德岛漩涡","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266733","is_single":"0","boundary":"1","odds":{"0":"4.5","1":"3.65","3":"1.51"}},"SportteryNWDL":{"bet_id":"266675","is_single":"0","boundary":"0","odds":{"0":"2.06","1":"3.1","3":"2.85"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1571","team_name":"山形山神","rank":"11","rank_league":""},"2":{"team_id":"1567","team_name":"德岛漩涡","rank":"16","rank_league":""}},"sort":7}
             * 6108 : {"serial_no":"6108","match_id":"1008138","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"大分三神","guest_name_s":"福冈黄蜂","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266679","is_single":"0","boundary":"0","odds":{"0":"2.37","1":"3.12","3":"2.4"}},"SportteryWDL":{"bet_id":"266735","is_single":"0","boundary":"1","odds":{"0":"5.35","1":"4.05","3":"1.38"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"423","team_name":"大分三神","rank":"2","rank_league":""},"2":{"team_id":"1193","team_name":"福冈黄蜂","rank":"4","rank_league":""}},"sort":8}
             * 6109 : {"serial_no":"6109","match_id":"1008114","match_time":"2018-06-23 18:00:00","bet_time":"2018-06-23 18:00:00","bet_date":"2018-06-23","league_name":"J2联赛","host_name_s":"金泽塞维根","guest_name_s":"熊本深红","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266683","is_single":"0","boundary":"0","odds":{"0":"3.55","1":"3.3","3":"1.74"}},"SportteryWDL":{"bet_id":"266737","is_single":"0","boundary":"-1","odds":{"0":"1.75","1":"3.4","3":"3.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"12164","team_name":"金泽塞维根","rank":"15","rank_league":""},"2":{"team_id":"1811","team_name":"熊本深红","rank":"18","rank_league":""}},"sort":9}
             * 6027 : {"serial_no":"6027","match_id":"1000222","match_time":"2018-06-23 20:00:00","bet_time":"2018-06-23 20:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"比利时","guest_name_s":"突尼斯","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264183","is_single":"1","boundary":"0","odds":{"0":"9","1":"4.8","3":"1.19"}},"SportteryWDL":{"bet_id":"264185","is_single":"0","boundary":"-1","odds":{"0":"3.3","1":"3.4","3":"1.78"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"259","team_name":"比利时","rank":"3","rank_league":"世"},"2":{"team_id":"263","team_name":"突尼斯","rank":"21","rank_league":"世"}},"sort":10}
             * 6028 : {"serial_no":"6028","match_id":"1000227","match_time":"2018-06-23 23:00:00","bet_time":"2018-06-23 23:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"韩国","guest_name_s":"墨西哥","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264188","is_single":"1","boundary":"0","odds":{"0":"1.48","1":"3.5","3":"5.05"}},"SportteryWDL":{"bet_id":"264190","is_single":"0","boundary":"1","odds":{"0":"2.7","1":"3.15","3":"2.12"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"717","team_name":"韩国","rank":"57","rank_league":"世"},"2":{"team_id":"729","team_name":"墨西哥","rank":"15","rank_league":"世"}},"sort":11}
             * 6110 : {"serial_no":"6110","match_id":"1002916","match_time":"2018-06-24 00:00:00","bet_time":"2018-06-24 00:00:00","bet_date":"2018-06-23","league_name":"挪超","host_name_s":"莫尔德","guest_name_s":"斯塔贝克","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266687","is_single":"0","boundary":"0","odds":{"0":"4.7","1":"3.8","3":"1.47"}},"SportteryWDL":{"bet_id":"266739","is_single":"0","boundary":"-1","odds":{"0":"2.18","1":"3.5","3":"2.42"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"441","team_name":"莫尔德","rank":"8","rank_league":""},"2":{"team_id":"437","team_name":"斯塔贝克","rank":"14","rank_league":""}},"sort":12}
             * 6029 : {"serial_no":"6029","match_id":"1000241","match_time":"2018-06-24 02:00:00","bet_time":"2018-06-24 02:00:00","bet_date":"2018-06-23","league_name":"世界杯","host_name_s":"德国","guest_name_s":"瑞典","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264193","is_single":"1","boundary":"0","odds":{"0":"6","1":"4.25","3":"1.32"}},"SportteryWDL":{"bet_id":"264195","is_single":"0","boundary":"-1","odds":{"0":"2.6","1":"3.25","3":"2.14"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"211","team_name":"德国","rank":"1","rank_league":"世"},"2":{"team_id":"231","team_name":"瑞典","rank":"24","rank_league":"世"}},"sort":13}
             */

            @com.google.gson.annotations.SerializedName("6101")
            private _$6101Bean _$6101;
            @com.google.gson.annotations.SerializedName("6102")
            private _$6102Bean _$6102;
            @com.google.gson.annotations.SerializedName("6103")
            private _$6103Bean _$6103;
            @com.google.gson.annotations.SerializedName("6104")
            private _$6104Bean _$6104;
            @com.google.gson.annotations.SerializedName("6105")
            private _$6105Bean _$6105;
            @com.google.gson.annotations.SerializedName("6106")
            private _$6106Bean _$6106;
            @com.google.gson.annotations.SerializedName("6107")
            private _$6107Bean _$6107;
            @com.google.gson.annotations.SerializedName("6108")
            private _$6108Bean _$6108;
            @com.google.gson.annotations.SerializedName("6109")
            private _$6109Bean _$6109;
            @com.google.gson.annotations.SerializedName("6027")
            private _$6027Bean _$6027;
            @com.google.gson.annotations.SerializedName("6028")
            private _$6028Bean _$6028;
            @com.google.gson.annotations.SerializedName("6110")
            private _$6110Bean _$6110;
            @com.google.gson.annotations.SerializedName("6029")
            private _$6029Bean _$6029;

            public _$6101Bean get_$6101() {
                return _$6101;
            }

            public void set_$6101(_$6101Bean _$6101) {
                this._$6101 = _$6101;
            }

            public _$6102Bean get_$6102() {
                return _$6102;
            }

            public void set_$6102(_$6102Bean _$6102) {
                this._$6102 = _$6102;
            }

            public _$6103Bean get_$6103() {
                return _$6103;
            }

            public void set_$6103(_$6103Bean _$6103) {
                this._$6103 = _$6103;
            }

            public _$6104Bean get_$6104() {
                return _$6104;
            }

            public void set_$6104(_$6104Bean _$6104) {
                this._$6104 = _$6104;
            }

            public _$6105Bean get_$6105() {
                return _$6105;
            }

            public void set_$6105(_$6105Bean _$6105) {
                this._$6105 = _$6105;
            }

            public _$6106Bean get_$6106() {
                return _$6106;
            }

            public void set_$6106(_$6106Bean _$6106) {
                this._$6106 = _$6106;
            }

            public _$6107Bean get_$6107() {
                return _$6107;
            }

            public void set_$6107(_$6107Bean _$6107) {
                this._$6107 = _$6107;
            }

            public _$6108Bean get_$6108() {
                return _$6108;
            }

            public void set_$6108(_$6108Bean _$6108) {
                this._$6108 = _$6108;
            }

            public _$6109Bean get_$6109() {
                return _$6109;
            }

            public void set_$6109(_$6109Bean _$6109) {
                this._$6109 = _$6109;
            }

            public _$6027Bean get_$6027() {
                return _$6027;
            }

            public void set_$6027(_$6027Bean _$6027) {
                this._$6027 = _$6027;
            }

            public _$6028Bean get_$6028() {
                return _$6028;
            }

            public void set_$6028(_$6028Bean _$6028) {
                this._$6028 = _$6028;
            }

            public _$6110Bean get_$6110() {
                return _$6110;
            }

            public void set_$6110(_$6110Bean _$6110) {
                this._$6110 = _$6110;
            }

            public _$6029Bean get_$6029() {
                return _$6029;
            }

            public void set_$6029(_$6029Bean _$6029) {
                this._$6029 = _$6029;
            }

            public static class _$6101Bean {
                /**
                 * serial_no : 6101
                 * match_id : 1008107
                 * match_time : 2018-06-23 17:00:00
                 * bet_time : 2018-06-23 17:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 岐阜FC
                 * guest_name_s : 雷法山口
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266651","is_single":"0","boundary":"0","odds":{"0":"2.25","1":"3.35","3":"2.4"}},"SportteryWDL":{"bet_id":"266721","is_single":"0","boundary":"1","odds":{"0":"4.75","1":"4.1","3":"1.42"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"1815","team_name":"岐阜FC","rank":"8","rank_league":""},"2":{"team_id":"12156","team_name":"雷法山口","rank":"1","rank_league":""}}
                 * sort : 1
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXX list;
                private RankBeanXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXX getList() {
                    return list;
                }

                public void setList(ListBeanXX list) {
                    this.list = list;
                }

                public RankBeanXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266651","is_single":"0","boundary":"0","odds":{"0":"2.25","1":"3.35","3":"2.4"}}
                     * SportteryWDL : {"bet_id":"266721","is_single":"0","boundary":"1","odds":{"0":"4.75","1":"4.1","3":"1.42"}}
                     */

                    private SportteryNWDLBeanXX SportteryNWDL;
                    private SportteryWDLBeanXX SportteryWDL;

                    public SportteryNWDLBeanXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXX {
                        /**
                         * bet_id : 266651
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"2.25","1":"3.35","3":"2.4"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXX {
                            /**
                             * 0 : 2.25
                             * 1 : 3.35
                             * 3 : 2.4
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXX {
                        /**
                         * bet_id : 266721
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"4.75","1":"4.1","3":"1.42"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXX {
                            /**
                             * 0 : 4.75
                             * 1 : 4.1
                             * 3 : 1.42
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXX {
                    /**
                     * 1 : {"team_id":"1815","team_name":"岐阜FC","rank":"8","rank_league":""}
                     * 2 : {"team_id":"12156","team_name":"雷法山口","rank":"1","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXX _$2;

                    public _$1BeanXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXX {
                        /**
                         * team_id : 1815
                         * team_name : 岐阜FC
                         * rank : 8
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXX {
                        /**
                         * team_id : 12156
                         * team_name : 雷法山口
                         * rank : 1
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6102Bean {
                /**
                 * serial_no : 6102
                 * match_id : 1008115
                 * match_time : 2018-06-23 17:00:00
                 * bet_time : 2018-06-23 17:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 赞岐釜玉海
                 * guest_name_s : 冈山绿雉
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266655","is_single":"0","boundary":"0","odds":{"0":"1.56","1":"3.25","3":"4.8"}},"SportteryWDL":{"bet_id":"266723","is_single":"0","boundary":"1","odds":{"0":"2.93","1":"3.2","3":"1.98"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"12146","team_name":"赞岐釜玉海","rank":"22","rank_league":""},"2":{"team_id":"1998","team_name":"冈山绿雉","rank":"6","rank_league":""}}
                 * sort : 2
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXX list;
                private RankBeanXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXX list) {
                    this.list = list;
                }

                public RankBeanXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266655","is_single":"0","boundary":"0","odds":{"0":"1.56","1":"3.25","3":"4.8"}}
                     * SportteryWDL : {"bet_id":"266723","is_single":"0","boundary":"1","odds":{"0":"2.93","1":"3.2","3":"1.98"}}
                     */

                    private SportteryNWDLBeanXXX SportteryNWDL;
                    private SportteryWDLBeanXXX SportteryWDL;

                    public SportteryNWDLBeanXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXX {
                        /**
                         * bet_id : 266655
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"1.56","1":"3.25","3":"4.8"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXX {
                            /**
                             * 0 : 1.56
                             * 1 : 3.25
                             * 3 : 4.8
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXX {
                        /**
                         * bet_id : 266723
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"2.93","1":"3.2","3":"1.98"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXX {
                            /**
                             * 0 : 2.93
                             * 1 : 3.2
                             * 3 : 1.98
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXX {
                    /**
                     * 1 : {"team_id":"12146","team_name":"赞岐釜玉海","rank":"22","rank_league":""}
                     * 2 : {"team_id":"1998","team_name":"冈山绿雉","rank":"6","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXX _$2;

                    public _$1BeanXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXX {
                        /**
                         * team_id : 12146
                         * team_name : 赞岐釜玉海
                         * rank : 22
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXX {
                        /**
                         * team_id : 1998
                         * team_name : 冈山绿雉
                         * rank : 6
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6103Bean {
                /**
                 * serial_no : 6103
                 * match_id : 1008101
                 * match_time : 2018-06-23 17:00:00
                 * bet_time : 2018-06-23 17:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 京都不死鸟
                 * guest_name_s : 大宫松鼠
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266659","is_single":"0","boundary":"0","odds":{"0":"1.92","1":"3.12","3":"3.15"}},"SportteryWDL":{"bet_id":"266725","is_single":"0","boundary":"1","odds":{"0":"3.95","1":"3.55","3":"1.6"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"378","team_name":"京都不死鸟","rank":"20","rank_league":""},"2":{"team_id":"1064","team_name":"大宫松鼠","rank":"9","rank_league":""}}
                 * sort : 3
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXX list;
                private RankBeanXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266659","is_single":"0","boundary":"0","odds":{"0":"1.92","1":"3.12","3":"3.15"}}
                     * SportteryWDL : {"bet_id":"266725","is_single":"0","boundary":"1","odds":{"0":"3.95","1":"3.55","3":"1.6"}}
                     */

                    private SportteryNWDLBeanXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXX {
                        /**
                         * bet_id : 266659
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"1.92","1":"3.12","3":"3.15"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXX {
                            /**
                             * 0 : 1.92
                             * 1 : 3.12
                             * 3 : 3.15
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXX {
                        /**
                         * bet_id : 266725
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"3.95","1":"3.55","3":"1.6"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXX {
                            /**
                             * 0 : 3.95
                             * 1 : 3.55
                             * 3 : 1.6
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXX {
                    /**
                     * 1 : {"team_id":"378","team_name":"京都不死鸟","rank":"20","rank_league":""}
                     * 2 : {"team_id":"1064","team_name":"大宫松鼠","rank":"9","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXX _$2;

                    public _$1BeanXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXX {
                        /**
                         * team_id : 378
                         * team_name : 京都不死鸟
                         * rank : 20
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXX {
                        /**
                         * team_id : 1064
                         * team_name : 大宫松鼠
                         * rank : 9
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6104Bean {
                /**
                 * serial_no : 6104
                 * match_id : 1008110
                 * match_time : 2018-06-23 17:00:00
                 * bet_time : 2018-06-23 17:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 松本山雅
                 * guest_name_s : 千叶市原
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266663","is_single":"0","boundary":"0","odds":{"0":"3.1","1":"3.35","3":"1.86"}},"SportteryWDL":{"bet_id":"266727","is_single":"0","boundary":"-1","odds":{"0":"1.65","1":"3.7","3":"3.55"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"2730","team_name":"松本山雅","rank":"5","rank_league":""},"2":{"team_id":"409","team_name":"千叶市原","rank":"13","rank_league":""}}
                 * sort : 4
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXX list;
                private RankBeanXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266663","is_single":"0","boundary":"0","odds":{"0":"3.1","1":"3.35","3":"1.86"}}
                     * SportteryWDL : {"bet_id":"266727","is_single":"0","boundary":"-1","odds":{"0":"1.65","1":"3.7","3":"3.55"}}
                     */

                    private SportteryNWDLBeanXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXX {
                        /**
                         * bet_id : 266663
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"3.1","1":"3.35","3":"1.86"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXX {
                            /**
                             * 0 : 3.1
                             * 1 : 3.35
                             * 3 : 1.86
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXX {
                        /**
                         * bet_id : 266727
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"1.65","1":"3.7","3":"3.55"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXX {
                            /**
                             * 0 : 1.65
                             * 1 : 3.7
                             * 3 : 3.55
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXX {
                    /**
                     * 1 : {"team_id":"2730","team_name":"松本山雅","rank":"5","rank_league":""}
                     * 2 : {"team_id":"409","team_name":"千叶市原","rank":"13","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXX _$2;

                    public _$1BeanXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXX {
                        /**
                         * team_id : 2730
                         * team_name : 松本山雅
                         * rank : 5
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXX {
                        /**
                         * team_id : 409
                         * team_name : 千叶市原
                         * rank : 13
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6105Bean {
                /**
                 * serial_no : 6105
                 * match_id : 1008108
                 * match_time : 2018-06-23 17:00:00
                 * bet_time : 2018-06-23 17:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 东京绿茵
                 * guest_name_s : 枥木SC
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryWDL":{"bet_id":"266729","is_single":"0","boundary":"-1","odds":{"0":"1.67","1":"3.4","3":"3.75"}},"SportteryNWDL":{"bet_id":"266667","is_single":"0","boundary":"0","odds":{"0":"3.45","1":"3.1","3":"1.83"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"417","team_name":"东京绿茵","rank":"12","rank_league":""},"2":{"team_id":"1938","team_name":"枥木SC","rank":"19","rank_league":""}}
                 * sort : 5
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXX list;
                private RankBeanXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXX {
                    /**
                     * SportteryWDL : {"bet_id":"266729","is_single":"0","boundary":"-1","odds":{"0":"1.67","1":"3.4","3":"3.75"}}
                     * SportteryNWDL : {"bet_id":"266667","is_single":"0","boundary":"0","odds":{"0":"3.45","1":"3.1","3":"1.83"}}
                     */

                    private SportteryWDLBeanXXXXXX SportteryWDL;
                    private SportteryNWDLBeanXXXXXX SportteryNWDL;

                    public SportteryWDLBeanXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public SportteryNWDLBeanXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public static class SportteryWDLBeanXXXXXX {
                        /**
                         * bet_id : 266729
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"1.67","1":"3.4","3":"3.75"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXX {
                            /**
                             * 0 : 1.67
                             * 1 : 3.4
                             * 3 : 3.75
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryNWDLBeanXXXXXX {
                        /**
                         * bet_id : 266667
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"3.45","1":"3.1","3":"1.83"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXX {
                            /**
                             * 0 : 3.45
                             * 1 : 3.1
                             * 3 : 1.83
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXX {
                    /**
                     * 1 : {"team_id":"417","team_name":"东京绿茵","rank":"12","rank_league":""}
                     * 2 : {"team_id":"1938","team_name":"枥木SC","rank":"19","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXX _$2;

                    public _$1BeanXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXX {
                        /**
                         * team_id : 417
                         * team_name : 东京绿茵
                         * rank : 12
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXX {
                        /**
                         * team_id : 1938
                         * team_name : 枥木SC
                         * rank : 19
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6106Bean {
                /**
                 * serial_no : 6106
                 * match_id : 1008118
                 * match_time : 2018-06-23 18:00:00
                 * bet_time : 2018-06-23 18:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 爱媛FC
                 * guest_name_s : 水户蜀葵
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266671","is_single":"0","boundary":"0","odds":{"0":"2.3","1":"2.95","3":"2.6"}},"SportteryWDL":{"bet_id":"266731","is_single":"0","boundary":"1","odds":{"0":"5.4","1":"3.85","3":"1.4"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"1565","team_name":"爱媛FC","rank":"21","rank_league":""},"2":{"team_id":"1566","team_name":"水户蜀葵","rank":"17","rank_league":""}}
                 * sort : 6
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXX list;
                private RankBeanXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266671","is_single":"0","boundary":"0","odds":{"0":"2.3","1":"2.95","3":"2.6"}}
                     * SportteryWDL : {"bet_id":"266731","is_single":"0","boundary":"1","odds":{"0":"5.4","1":"3.85","3":"1.4"}}
                     */

                    private SportteryNWDLBeanXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXX {
                        /**
                         * bet_id : 266671
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"2.3","1":"2.95","3":"2.6"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.3
                             * 1 : 2.95
                             * 3 : 2.6
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXX {
                        /**
                         * bet_id : 266731
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"5.4","1":"3.85","3":"1.4"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 5.4
                             * 1 : 3.85
                             * 3 : 1.4
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXX {
                    /**
                     * 1 : {"team_id":"1565","team_name":"爱媛FC","rank":"21","rank_league":""}
                     * 2 : {"team_id":"1566","team_name":"水户蜀葵","rank":"17","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXX _$2;

                    public _$1BeanXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXX {
                        /**
                         * team_id : 1565
                         * team_name : 爱媛FC
                         * rank : 21
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXX {
                        /**
                         * team_id : 1566
                         * team_name : 水户蜀葵
                         * rank : 17
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6107Bean {
                /**
                 * serial_no : 6107
                 * match_id : 1008116
                 * match_time : 2018-06-23 18:00:00
                 * bet_time : 2018-06-23 18:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 山形山神
                 * guest_name_s : 德岛漩涡
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryWDL":{"bet_id":"266733","is_single":"0","boundary":"1","odds":{"0":"4.5","1":"3.65","3":"1.51"}},"SportteryNWDL":{"bet_id":"266675","is_single":"0","boundary":"0","odds":{"0":"2.06","1":"3.1","3":"2.85"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"1571","team_name":"山形山神","rank":"11","rank_league":""},"2":{"team_id":"1567","team_name":"德岛漩涡","rank":"16","rank_league":""}}
                 * sort : 7
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXX list;
                private RankBeanXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXX {
                    /**
                     * SportteryWDL : {"bet_id":"266733","is_single":"0","boundary":"1","odds":{"0":"4.5","1":"3.65","3":"1.51"}}
                     * SportteryNWDL : {"bet_id":"266675","is_single":"0","boundary":"0","odds":{"0":"2.06","1":"3.1","3":"2.85"}}
                     */

                    private SportteryWDLBeanXXXXXXXX SportteryWDL;
                    private SportteryNWDLBeanXXXXXXXX SportteryNWDL;

                    public SportteryWDLBeanXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public SportteryNWDLBeanXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public static class SportteryWDLBeanXXXXXXXX {
                        /**
                         * bet_id : 266733
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"4.5","1":"3.65","3":"1.51"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 4.5
                             * 1 : 3.65
                             * 3 : 1.51
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryNWDLBeanXXXXXXXX {
                        /**
                         * bet_id : 266675
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"2.06","1":"3.1","3":"2.85"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.06
                             * 1 : 3.1
                             * 3 : 2.85
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXX {
                    /**
                     * 1 : {"team_id":"1571","team_name":"山形山神","rank":"11","rank_league":""}
                     * 2 : {"team_id":"1567","team_name":"德岛漩涡","rank":"16","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXX _$2;

                    public _$1BeanXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXX {
                        /**
                         * team_id : 1571
                         * team_name : 山形山神
                         * rank : 11
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXX {
                        /**
                         * team_id : 1567
                         * team_name : 德岛漩涡
                         * rank : 16
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6108Bean {
                /**
                 * serial_no : 6108
                 * match_id : 1008138
                 * match_time : 2018-06-23 18:00:00
                 * bet_time : 2018-06-23 18:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 大分三神
                 * guest_name_s : 福冈黄蜂
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266679","is_single":"0","boundary":"0","odds":{"0":"2.37","1":"3.12","3":"2.4"}},"SportteryWDL":{"bet_id":"266735","is_single":"0","boundary":"1","odds":{"0":"5.35","1":"4.05","3":"1.38"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"423","team_name":"大分三神","rank":"2","rank_league":""},"2":{"team_id":"1193","team_name":"福冈黄蜂","rank":"4","rank_league":""}}
                 * sort : 8
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXX list;
                private RankBeanXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266679","is_single":"0","boundary":"0","odds":{"0":"2.37","1":"3.12","3":"2.4"}}
                     * SportteryWDL : {"bet_id":"266735","is_single":"0","boundary":"1","odds":{"0":"5.35","1":"4.05","3":"1.38"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXX {
                        /**
                         * bet_id : 266679
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"2.37","1":"3.12","3":"2.4"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.37
                             * 1 : 3.12
                             * 3 : 2.4
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXX {
                        /**
                         * bet_id : 266735
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"5.35","1":"4.05","3":"1.38"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 5.35
                             * 1 : 4.05
                             * 3 : 1.38
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"423","team_name":"大分三神","rank":"2","rank_league":""}
                     * 2 : {"team_id":"1193","team_name":"福冈黄蜂","rank":"4","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXX {
                        /**
                         * team_id : 423
                         * team_name : 大分三神
                         * rank : 2
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXX {
                        /**
                         * team_id : 1193
                         * team_name : 福冈黄蜂
                         * rank : 4
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6109Bean {
                /**
                 * serial_no : 6109
                 * match_id : 1008114
                 * match_time : 2018-06-23 18:00:00
                 * bet_time : 2018-06-23 18:00:00
                 * bet_date : 2018-06-23
                 * league_name : J2联赛
                 * host_name_s : 金泽塞维根
                 * guest_name_s : 熊本深红
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266683","is_single":"0","boundary":"0","odds":{"0":"3.55","1":"3.3","3":"1.74"}},"SportteryWDL":{"bet_id":"266737","is_single":"0","boundary":"-1","odds":{"0":"1.75","1":"3.4","3":"3.4"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"12164","team_name":"金泽塞维根","rank":"15","rank_league":""},"2":{"team_id":"1811","team_name":"熊本深红","rank":"18","rank_league":""}}
                 * sort : 9
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXX list;
                private RankBeanXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266683","is_single":"0","boundary":"0","odds":{"0":"3.55","1":"3.3","3":"1.74"}}
                     * SportteryWDL : {"bet_id":"266737","is_single":"0","boundary":"-1","odds":{"0":"1.75","1":"3.4","3":"3.4"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXX {
                        /**
                         * bet_id : 266683
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"3.55","1":"3.3","3":"1.74"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 3.55
                             * 1 : 3.3
                             * 3 : 1.74
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXX {
                        /**
                         * bet_id : 266737
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"1.75","1":"3.4","3":"3.4"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.75
                             * 1 : 3.4
                             * 3 : 3.4
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"12164","team_name":"金泽塞维根","rank":"15","rank_league":""}
                     * 2 : {"team_id":"1811","team_name":"熊本深红","rank":"18","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXX {
                        /**
                         * team_id : 12164
                         * team_name : 金泽塞维根
                         * rank : 15
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXX {
                        /**
                         * team_id : 1811
                         * team_name : 熊本深红
                         * rank : 18
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6027Bean {
                /**
                 * serial_no : 6027
                 * match_id : 1000222
                 * match_time : 2018-06-23 20:00:00
                 * bet_time : 2018-06-23 20:00:00
                 * bet_date : 2018-06-23
                 * league_name : 世界杯
                 * host_name_s : 比利时
                 * guest_name_s : 突尼斯
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264183","is_single":"1","boundary":"0","odds":{"0":"9","1":"4.8","3":"1.19"}},"SportteryWDL":{"bet_id":"264185","is_single":"0","boundary":"-1","odds":{"0":"3.3","1":"3.4","3":"1.78"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"259","team_name":"比利时","rank":"3","rank_league":"世"},"2":{"team_id":"263","team_name":"突尼斯","rank":"21","rank_league":"世"}}
                 * sort : 10
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"264183","is_single":"1","boundary":"0","odds":{"0":"9","1":"4.8","3":"1.19"}}
                     * SportteryWDL : {"bet_id":"264185","is_single":"0","boundary":"-1","odds":{"0":"3.3","1":"3.4","3":"1.78"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXX {
                        /**
                         * bet_id : 264183
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"9","1":"4.8","3":"1.19"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 9
                             * 1 : 4.8
                             * 3 : 1.19
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXX {
                        /**
                         * bet_id : 264185
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"3.3","1":"3.4","3":"1.78"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 3.3
                             * 1 : 3.4
                             * 3 : 1.78
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"259","team_name":"比利时","rank":"3","rank_league":"世"}
                     * 2 : {"team_id":"263","team_name":"突尼斯","rank":"21","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXX {
                        /**
                         * team_id : 259
                         * team_name : 比利时
                         * rank : 3
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXX {
                        /**
                         * team_id : 263
                         * team_name : 突尼斯
                         * rank : 21
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6028Bean {
                /**
                 * serial_no : 6028
                 * match_id : 1000227
                 * match_time : 2018-06-23 23:00:00
                 * bet_time : 2018-06-23 23:00:00
                 * bet_date : 2018-06-23
                 * league_name : 世界杯
                 * host_name_s : 韩国
                 * guest_name_s : 墨西哥
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264188","is_single":"1","boundary":"0","odds":{"0":"1.48","1":"3.5","3":"5.05"}},"SportteryWDL":{"bet_id":"264190","is_single":"0","boundary":"1","odds":{"0":"2.7","1":"3.15","3":"2.12"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"717","team_name":"韩国","rank":"57","rank_league":"世"},"2":{"team_id":"729","team_name":"墨西哥","rank":"15","rank_league":"世"}}
                 * sort : 11
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"264188","is_single":"1","boundary":"0","odds":{"0":"1.48","1":"3.5","3":"5.05"}}
                     * SportteryWDL : {"bet_id":"264190","is_single":"0","boundary":"1","odds":{"0":"2.7","1":"3.15","3":"2.12"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXX {
                        /**
                         * bet_id : 264188
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"1.48","1":"3.5","3":"5.05"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.48
                             * 1 : 3.5
                             * 3 : 5.05
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXX {
                        /**
                         * bet_id : 264190
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"2.7","1":"3.15","3":"2.12"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.7
                             * 1 : 3.15
                             * 3 : 2.12
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"717","team_name":"韩国","rank":"57","rank_league":"世"}
                     * 2 : {"team_id":"729","team_name":"墨西哥","rank":"15","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXX {
                        /**
                         * team_id : 717
                         * team_name : 韩国
                         * rank : 57
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXX {
                        /**
                         * team_id : 729
                         * team_name : 墨西哥
                         * rank : 15
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6110Bean {
                /**
                 * serial_no : 6110
                 * match_id : 1002916
                 * match_time : 2018-06-24 00:00:00
                 * bet_time : 2018-06-24 00:00:00
                 * bet_date : 2018-06-23
                 * league_name : 挪超
                 * host_name_s : 莫尔德
                 * guest_name_s : 斯塔贝克
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266687","is_single":"0","boundary":"0","odds":{"0":"4.7","1":"3.8","3":"1.47"}},"SportteryWDL":{"bet_id":"266739","is_single":"0","boundary":"-1","odds":{"0":"2.18","1":"3.5","3":"2.42"}}}
                 * league_color : ["#EC2300","#FFF200"]
                 * rank : {"1":{"team_id":"441","team_name":"莫尔德","rank":"8","rank_league":""},"2":{"team_id":"437","team_name":"斯塔贝克","rank":"14","rank_league":""}}
                 * sort : 12
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266687","is_single":"0","boundary":"0","odds":{"0":"4.7","1":"3.8","3":"1.47"}}
                     * SportteryWDL : {"bet_id":"266739","is_single":"0","boundary":"-1","odds":{"0":"2.18","1":"3.5","3":"2.42"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266687
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"4.7","1":"3.8","3":"1.47"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 4.7
                             * 1 : 3.8
                             * 3 : 1.47
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266739
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"2.18","1":"3.5","3":"2.42"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.18
                             * 1 : 3.5
                             * 3 : 2.42
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"441","team_name":"莫尔德","rank":"8","rank_league":""}
                     * 2 : {"team_id":"437","team_name":"斯塔贝克","rank":"14","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXX {
                        /**
                         * team_id : 441
                         * team_name : 莫尔德
                         * rank : 8
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXX {
                        /**
                         * team_id : 437
                         * team_name : 斯塔贝克
                         * rank : 14
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$6029Bean {
                /**
                 * serial_no : 6029
                 * match_id : 1000241
                 * match_time : 2018-06-24 02:00:00
                 * bet_time : 2018-06-24 02:00:00
                 * bet_date : 2018-06-23
                 * league_name : 世界杯
                 * host_name_s : 德国
                 * guest_name_s : 瑞典
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264193","is_single":"1","boundary":"0","odds":{"0":"6","1":"4.25","3":"1.32"}},"SportteryWDL":{"bet_id":"264195","is_single":"0","boundary":"-1","odds":{"0":"2.6","1":"3.25","3":"2.14"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"211","team_name":"德国","rank":"1","rank_league":"世"},"2":{"team_id":"231","team_name":"瑞典","rank":"24","rank_league":"世"}}
                 * sort : 13
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"264193","is_single":"1","boundary":"0","odds":{"0":"6","1":"4.25","3":"1.32"}}
                     * SportteryWDL : {"bet_id":"264195","is_single":"0","boundary":"-1","odds":{"0":"2.6","1":"3.25","3":"2.14"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264193
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"6","1":"4.25","3":"1.32"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 6
                             * 1 : 4.25
                             * 3 : 1.32
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264195
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"2.6","1":"3.25","3":"2.14"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.6
                             * 1 : 3.25
                             * 3 : 2.14
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"211","team_name":"德国","rank":"1","rank_league":"世"}
                     * 2 : {"team_id":"231","team_name":"瑞典","rank":"24","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXX {
                        /**
                         * team_id : 211
                         * team_name : 德国
                         * rank : 1
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXX {
                        /**
                         * team_id : 231
                         * team_name : 瑞典
                         * rank : 24
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }
        }

        public static class _$20180624Bean {
            /**
             * 7101 : {"serial_no":"7101","match_id":"1008117","match_time":"2018-06-24 13:00:00","bet_time":"2018-06-24 13:00:00","bet_date":"2018-06-24","league_name":"J2联赛","host_name_s":"横滨FC","guest_name_s":"甲府风林","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266741","is_single":"0","boundary":"1","odds":{"0":"5.25","1":"4","3":"1.39"}},"SportteryNWDL":{"bet_id":"266691","is_single":"0","boundary":"0","odds":{"0":"2.35","1":"3.16","3":"2.4"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"1331","team_name":"横滨FC","rank":"7","rank_league":""},"2":{"team_id":"1192","team_name":"甲府风林","rank":"10","rank_league":""}},"sort":1}
             * 7102 : {"serial_no":"7102","match_id":"1008120","match_time":"2018-06-24 17:00:00","bet_time":"2018-06-24 17:00:00","bet_date":"2018-06-24","league_name":"J2联赛","host_name_s":"町田泽维亚","guest_name_s":"新泻天鹅","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266695","is_single":"0","boundary":"0","odds":{"0":"2.55","1":"3.18","3":"2.21"}},"SportteryWDL":{"bet_id":"266743","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}}},"league_color":["#146F18","#FFF200"],"rank":{"1":{"team_id":"2412","team_name":"町田泽维亚","rank":"3","rank_league":""},"2":{"team_id":"690","team_name":"新泻天鹅","rank":"14","rank_league":""}},"sort":2}
             * 7030 : {"serial_no":"7030","match_id":"1000240","match_time":"2018-06-24 20:00:00","bet_time":"2018-06-24 20:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"英格兰","guest_name_s":"巴拿马","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264198","is_single":"1","boundary":"0","odds":{"0":"14","1":"5.85","3":"1.09"}},"SportteryWDL":{"bet_id":"264200","is_single":"0","boundary":"-2","odds":{"0":"2.02","1":"3.7","3":"2.54"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"227","team_name":"英格兰","rank":"12","rank_league":"世"},"2":{"team_id":"815","team_name":"巴拿马","rank":"55","rank_league":"世"}},"sort":3}
             * 7031 : {"serial_no":"7031","match_id":"1000215","match_time":"2018-06-24 23:00:00","bet_time":"2018-06-24 23:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"日本","guest_name_s":"塞内加尔","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264203","is_single":"1","boundary":"0","odds":{"0":"2","1":"2.85","3":"3.25"}},"SportteryWDL":{"bet_id":"264205","is_single":"0","boundary":"1","odds":{"0":"4.3","1":"3.5","3":"1.56"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"718","team_name":"日本","rank":"61","rank_league":"世"},"2":{"team_id":"155","team_name":"塞内加尔","rank":"27","rank_league":"世"}},"sort":4}
             * 7103 : {"serial_no":"7103","match_id":"1002912","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"博德闪耀","guest_name_s":"桑纳菲尤尔","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266699","is_single":"0","boundary":"0","odds":{"0":"6","1":"4.2","3":"1.33"}},"SportteryWDL":{"bet_id":"266745","is_single":"0","boundary":"-1","odds":{"0":"2.58","1":"3.4","3":"2.1"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"449","team_name":"博德闪耀","rank":"11","rank_league":""},"2":{"team_id":"1200","team_name":"桑纳菲尤尔","rank":"16","rank_league":""}},"sort":5}
             * 7104 : {"serial_no":"7104","match_id":"1002918","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"海于格松","guest_name_s":"利勒斯特罗姆","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266703","is_single":"0","boundary":"0","odds":{"0":"3.5","1":"3.25","3":"1.77"}},"SportteryWDL":{"bet_id":"266747","is_single":"0","boundary":"-1","odds":{"0":"1.74","1":"3.45","3":"3.4"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1104","team_name":"海于格松","rank":"4","rank_league":""},"2":{"team_id":"440","team_name":"利勒斯特罗姆","rank":"13","rank_league":""}},"sort":6}
             * 7105 : {"serial_no":"7105","match_id":"1002915","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"斯达","guest_name_s":"克里斯蒂安松","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266749","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}},"SportteryNWDL":{"bet_id":"266707","is_single":"0","boundary":"0","odds":{"0":"2.5","1":"3.2","3":"2.25"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1074","team_name":"斯达","rank":"15","rank_league":""},"2":{"team_id":"1830","team_name":"克里斯蒂安松","rank":"9","rank_league":""}},"sort":7}
             * 7106 : {"serial_no":"7106","match_id":"1002917","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"萨尔普斯堡","guest_name_s":"特罗姆瑟","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266711","is_single":"0","boundary":"0","odds":{"0":"4.25","1":"3.6","3":"1.55"}},"SportteryWDL":{"bet_id":"266751","is_single":"0","boundary":"-1","odds":{"0":"2.03","1":"3.45","3":"2.66"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1407","team_name":"萨尔普斯堡","rank":"5","rank_league":""},"2":{"team_id":"448","team_name":"特罗姆瑟","rank":"7","rank_league":""}},"sort":8}
             * 7107 : {"serial_no":"7107","match_id":"1002914","match_time":"2018-06-25 00:00:00","bet_time":"2018-06-25 00:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"斯特罗姆加斯特","guest_name_s":"兰赫姆","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266715","is_single":"0","boundary":"0","odds":{"0":"4.55","1":"3.75","3":"1.49"}},"SportteryWDL":{"bet_id":"266753","is_single":"0","boundary":"-1","odds":{"0":"2.14","1":"3.5","3":"2.48"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"1099","team_name":"斯特罗姆加斯特","rank":"12","rank_league":""},"2":{"team_id":"1831","team_name":"兰赫姆","rank":"2","rank_league":""}},"sort":9}
             * 7032 : {"serial_no":"7032","match_id":"1000219","match_time":"2018-06-25 02:00:00","bet_time":"2018-06-25 02:00:00","bet_date":"2018-06-24","league_name":"世界杯","host_name_s":"波兰","guest_name_s":"哥伦比亚","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"264208","is_single":"1","boundary":"0","odds":{"0":"1.97","1":"3.2","3":"2.95"}},"SportteryWDL":{"bet_id":"264210","is_single":"0","boundary":"1","odds":{"0":"4.15","1":"3.5","3":"1.58"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"195","team_name":"波兰","rank":"8","rank_league":"世"},"2":{"team_id":"732","team_name":"哥伦比亚","rank":"16","rank_league":"世"}},"sort":10}
             * 7108 : {"serial_no":"7108","match_id":"1002913","match_time":"2018-06-25 02:00:00","bet_time":"2018-06-25 02:00:00","bet_date":"2018-06-24","league_name":"挪超","host_name_s":"罗森博格","guest_name_s":"瓦勒伦加","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryWDL":{"bet_id":"266756","is_single":"0","boundary":"-1","odds":{"0":"2.23","1":"3.45","3":"2.38"}},"SportteryNWDL":{"bet_id":"266719","is_single":"0","boundary":"0","odds":{"0":"5","1":"3.8","3":"1.44"}}},"league_color":["#EC2300","#FFF200"],"rank":{"1":{"team_id":"116","team_name":"罗森博格","rank":"3","rank_league":""},"2":{"team_id":"450","team_name":"瓦勒伦加","rank":"6","rank_league":""}},"sort":11}
             */

            @com.google.gson.annotations.SerializedName("7101")
            private _$7101Bean _$7101;
            @com.google.gson.annotations.SerializedName("7102")
            private _$7102Bean _$7102;
            @com.google.gson.annotations.SerializedName("7030")
            private _$7030Bean _$7030;
            @com.google.gson.annotations.SerializedName("7031")
            private _$7031Bean _$7031;
            @com.google.gson.annotations.SerializedName("7103")
            private _$7103Bean _$7103;
            @com.google.gson.annotations.SerializedName("7104")
            private _$7104Bean _$7104;
            @com.google.gson.annotations.SerializedName("7105")
            private _$7105Bean _$7105;
            @com.google.gson.annotations.SerializedName("7106")
            private _$7106Bean _$7106;
            @com.google.gson.annotations.SerializedName("7107")
            private _$7107Bean _$7107;
            @com.google.gson.annotations.SerializedName("7032")
            private _$7032Bean _$7032;
            @com.google.gson.annotations.SerializedName("7108")
            private _$7108Bean _$7108;

            public _$7101Bean get_$7101() {
                return _$7101;
            }

            public void set_$7101(_$7101Bean _$7101) {
                this._$7101 = _$7101;
            }

            public _$7102Bean get_$7102() {
                return _$7102;
            }

            public void set_$7102(_$7102Bean _$7102) {
                this._$7102 = _$7102;
            }

            public _$7030Bean get_$7030() {
                return _$7030;
            }

            public void set_$7030(_$7030Bean _$7030) {
                this._$7030 = _$7030;
            }

            public _$7031Bean get_$7031() {
                return _$7031;
            }

            public void set_$7031(_$7031Bean _$7031) {
                this._$7031 = _$7031;
            }

            public _$7103Bean get_$7103() {
                return _$7103;
            }

            public void set_$7103(_$7103Bean _$7103) {
                this._$7103 = _$7103;
            }

            public _$7104Bean get_$7104() {
                return _$7104;
            }

            public void set_$7104(_$7104Bean _$7104) {
                this._$7104 = _$7104;
            }

            public _$7105Bean get_$7105() {
                return _$7105;
            }

            public void set_$7105(_$7105Bean _$7105) {
                this._$7105 = _$7105;
            }

            public _$7106Bean get_$7106() {
                return _$7106;
            }

            public void set_$7106(_$7106Bean _$7106) {
                this._$7106 = _$7106;
            }

            public _$7107Bean get_$7107() {
                return _$7107;
            }

            public void set_$7107(_$7107Bean _$7107) {
                this._$7107 = _$7107;
            }

            public _$7032Bean get_$7032() {
                return _$7032;
            }

            public void set_$7032(_$7032Bean _$7032) {
                this._$7032 = _$7032;
            }

            public _$7108Bean get_$7108() {
                return _$7108;
            }

            public void set_$7108(_$7108Bean _$7108) {
                this._$7108 = _$7108;
            }

            public static class _$7101Bean {
                /**
                 * serial_no : 7101
                 * match_id : 1008117
                 * match_time : 2018-06-24 13:00:00
                 * bet_time : 2018-06-24 13:00:00
                 * bet_date : 2018-06-24
                 * league_name : J2联赛
                 * host_name_s : 横滨FC
                 * guest_name_s : 甲府风林
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryWDL":{"bet_id":"266741","is_single":"0","boundary":"1","odds":{"0":"5.25","1":"4","3":"1.39"}},"SportteryNWDL":{"bet_id":"266691","is_single":"0","boundary":"0","odds":{"0":"2.35","1":"3.16","3":"2.4"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"1331","team_name":"横滨FC","rank":"7","rank_league":""},"2":{"team_id":"1192","team_name":"甲府风林","rank":"10","rank_league":""}}
                 * sort : 1
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXX {
                    /**
                     * SportteryWDL : {"bet_id":"266741","is_single":"0","boundary":"1","odds":{"0":"5.25","1":"4","3":"1.39"}}
                     * SportteryNWDL : {"bet_id":"266691","is_single":"0","boundary":"0","odds":{"0":"2.35","1":"3.16","3":"2.4"}}
                     */

                    private SportteryWDLBeanXXXXXXXXXXXXXXX SportteryWDL;
                    private SportteryNWDLBeanXXXXXXXXXXXXXXX SportteryNWDL;

                    public SportteryWDLBeanXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public SportteryNWDLBeanXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266741
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"5.25","1":"4","3":"1.39"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 5.25
                             * 1 : 4
                             * 3 : 1.39
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266691
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"2.35","1":"3.16","3":"2.4"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.35
                             * 1 : 3.16
                             * 3 : 2.4
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"1331","team_name":"横滨FC","rank":"7","rank_league":""}
                     * 2 : {"team_id":"1192","team_name":"甲府风林","rank":"10","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1331
                         * team_name : 横滨FC
                         * rank : 7
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1192
                         * team_name : 甲府风林
                         * rank : 10
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7102Bean {
                /**
                 * serial_no : 7102
                 * match_id : 1008120
                 * match_time : 2018-06-24 17:00:00
                 * bet_time : 2018-06-24 17:00:00
                 * bet_date : 2018-06-24
                 * league_name : J2联赛
                 * host_name_s : 町田泽维亚
                 * guest_name_s : 新泻天鹅
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266695","is_single":"0","boundary":"0","odds":{"0":"2.55","1":"3.18","3":"2.21"}},"SportteryWDL":{"bet_id":"266743","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}}}
                 * league_color : ["#146F18","#FFF200"]
                 * rank : {"1":{"team_id":"2412","team_name":"町田泽维亚","rank":"3","rank_league":""},"2":{"team_id":"690","team_name":"新泻天鹅","rank":"14","rank_league":""}}
                 * sort : 2
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266695","is_single":"0","boundary":"0","odds":{"0":"2.55","1":"3.18","3":"2.21"}}
                     * SportteryWDL : {"bet_id":"266743","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266695
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"2.55","1":"3.18","3":"2.21"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.55
                             * 1 : 3.18
                             * 3 : 2.21
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266743
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"1.44","1":"3.9","3":"4.8"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.44
                             * 1 : 3.9
                             * 3 : 4.8
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"2412","team_name":"町田泽维亚","rank":"3","rank_league":""}
                     * 2 : {"team_id":"690","team_name":"新泻天鹅","rank":"14","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 2412
                         * team_name : 町田泽维亚
                         * rank : 3
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 690
                         * team_name : 新泻天鹅
                         * rank : 14
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7030Bean {
                /**
                 * serial_no : 7030
                 * match_id : 1000240
                 * match_time : 2018-06-24 20:00:00
                 * bet_time : 2018-06-24 20:00:00
                 * bet_date : 2018-06-24
                 * league_name : 世界杯
                 * host_name_s : 英格兰
                 * guest_name_s : 巴拿马
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264198","is_single":"1","boundary":"0","odds":{"0":"14","1":"5.85","3":"1.09"}},"SportteryWDL":{"bet_id":"264200","is_single":"0","boundary":"-2","odds":{"0":"2.02","1":"3.7","3":"2.54"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"227","team_name":"英格兰","rank":"12","rank_league":"世"},"2":{"team_id":"815","team_name":"巴拿马","rank":"55","rank_league":"世"}}
                 * sort : 3
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"264198","is_single":"1","boundary":"0","odds":{"0":"14","1":"5.85","3":"1.09"}}
                     * SportteryWDL : {"bet_id":"264200","is_single":"0","boundary":"-2","odds":{"0":"2.02","1":"3.7","3":"2.54"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264198
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"14","1":"5.85","3":"1.09"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 14
                             * 1 : 5.85
                             * 3 : 1.09
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264200
                         * is_single : 0
                         * boundary : -2
                         * odds : {"0":"2.02","1":"3.7","3":"2.54"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.02
                             * 1 : 3.7
                             * 3 : 2.54
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"227","team_name":"英格兰","rank":"12","rank_league":"世"}
                     * 2 : {"team_id":"815","team_name":"巴拿马","rank":"55","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 227
                         * team_name : 英格兰
                         * rank : 12
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 815
                         * team_name : 巴拿马
                         * rank : 55
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7031Bean {
                /**
                 * serial_no : 7031
                 * match_id : 1000215
                 * match_time : 2018-06-24 23:00:00
                 * bet_time : 2018-06-24 23:00:00
                 * bet_date : 2018-06-24
                 * league_name : 世界杯
                 * host_name_s : 日本
                 * guest_name_s : 塞内加尔
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264203","is_single":"1","boundary":"0","odds":{"0":"2","1":"2.85","3":"3.25"}},"SportteryWDL":{"bet_id":"264205","is_single":"0","boundary":"1","odds":{"0":"4.3","1":"3.5","3":"1.56"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"718","team_name":"日本","rank":"61","rank_league":"世"},"2":{"team_id":"155","team_name":"塞内加尔","rank":"27","rank_league":"世"}}
                 * sort : 4
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"264203","is_single":"1","boundary":"0","odds":{"0":"2","1":"2.85","3":"3.25"}}
                     * SportteryWDL : {"bet_id":"264205","is_single":"0","boundary":"1","odds":{"0":"4.3","1":"3.5","3":"1.56"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264203
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"2","1":"2.85","3":"3.25"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2
                             * 1 : 2.85
                             * 3 : 3.25
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264205
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"4.3","1":"3.5","3":"1.56"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 4.3
                             * 1 : 3.5
                             * 3 : 1.56
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"718","team_name":"日本","rank":"61","rank_league":"世"}
                     * 2 : {"team_id":"155","team_name":"塞内加尔","rank":"27","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 718
                         * team_name : 日本
                         * rank : 61
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 155
                         * team_name : 塞内加尔
                         * rank : 27
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7103Bean {
                /**
                 * serial_no : 7103
                 * match_id : 1002912
                 * match_time : 2018-06-25 00:00:00
                 * bet_time : 2018-06-25 00:00:00
                 * bet_date : 2018-06-24
                 * league_name : 挪超
                 * host_name_s : 博德闪耀
                 * guest_name_s : 桑纳菲尤尔
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266699","is_single":"0","boundary":"0","odds":{"0":"6","1":"4.2","3":"1.33"}},"SportteryWDL":{"bet_id":"266745","is_single":"0","boundary":"-1","odds":{"0":"2.58","1":"3.4","3":"2.1"}}}
                 * league_color : ["#EC2300","#FFF200"]
                 * rank : {"1":{"team_id":"449","team_name":"博德闪耀","rank":"11","rank_league":""},"2":{"team_id":"1200","team_name":"桑纳菲尤尔","rank":"16","rank_league":""}}
                 * sort : 5
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266699","is_single":"0","boundary":"0","odds":{"0":"6","1":"4.2","3":"1.33"}}
                     * SportteryWDL : {"bet_id":"266745","is_single":"0","boundary":"-1","odds":{"0":"2.58","1":"3.4","3":"2.1"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266699
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"6","1":"4.2","3":"1.33"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 6
                             * 1 : 4.2
                             * 3 : 1.33
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266745
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"2.58","1":"3.4","3":"2.1"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.58
                             * 1 : 3.4
                             * 3 : 2.1
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"449","team_name":"博德闪耀","rank":"11","rank_league":""}
                     * 2 : {"team_id":"1200","team_name":"桑纳菲尤尔","rank":"16","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 449
                         * team_name : 博德闪耀
                         * rank : 11
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1200
                         * team_name : 桑纳菲尤尔
                         * rank : 16
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7104Bean {
                /**
                 * serial_no : 7104
                 * match_id : 1002918
                 * match_time : 2018-06-25 00:00:00
                 * bet_time : 2018-06-25 00:00:00
                 * bet_date : 2018-06-24
                 * league_name : 挪超
                 * host_name_s : 海于格松
                 * guest_name_s : 利勒斯特罗姆
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266703","is_single":"0","boundary":"0","odds":{"0":"3.5","1":"3.25","3":"1.77"}},"SportteryWDL":{"bet_id":"266747","is_single":"0","boundary":"-1","odds":{"0":"1.74","1":"3.45","3":"3.4"}}}
                 * league_color : ["#EC2300","#FFF200"]
                 * rank : {"1":{"team_id":"1104","team_name":"海于格松","rank":"4","rank_league":""},"2":{"team_id":"440","team_name":"利勒斯特罗姆","rank":"13","rank_league":""}}
                 * sort : 6
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266703","is_single":"0","boundary":"0","odds":{"0":"3.5","1":"3.25","3":"1.77"}}
                     * SportteryWDL : {"bet_id":"266747","is_single":"0","boundary":"-1","odds":{"0":"1.74","1":"3.45","3":"3.4"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266703
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"3.5","1":"3.25","3":"1.77"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 3.5
                             * 1 : 3.25
                             * 3 : 1.77
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266747
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"1.74","1":"3.45","3":"3.4"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.74
                             * 1 : 3.45
                             * 3 : 3.4
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"1104","team_name":"海于格松","rank":"4","rank_league":""}
                     * 2 : {"team_id":"440","team_name":"利勒斯特罗姆","rank":"13","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1104
                         * team_name : 海于格松
                         * rank : 4
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 440
                         * team_name : 利勒斯特罗姆
                         * rank : 13
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7105Bean {
                /**
                 * serial_no : 7105
                 * match_id : 1002915
                 * match_time : 2018-06-25 00:00:00
                 * bet_time : 2018-06-25 00:00:00
                 * bet_date : 2018-06-24
                 * league_name : 挪超
                 * host_name_s : 斯达
                 * guest_name_s : 克里斯蒂安松
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryWDL":{"bet_id":"266749","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}},"SportteryNWDL":{"bet_id":"266707","is_single":"0","boundary":"0","odds":{"0":"2.5","1":"3.2","3":"2.25"}}}
                 * league_color : ["#EC2300","#FFF200"]
                 * rank : {"1":{"team_id":"1074","team_name":"斯达","rank":"15","rank_league":""},"2":{"team_id":"1830","team_name":"克里斯蒂安松","rank":"9","rank_league":""}}
                 * sort : 7
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryWDL : {"bet_id":"266749","is_single":"0","boundary":"-1","odds":{"0":"1.44","1":"3.9","3":"4.8"}}
                     * SportteryNWDL : {"bet_id":"266707","is_single":"0","boundary":"0","odds":{"0":"2.5","1":"3.2","3":"2.25"}}
                     */

                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXX SportteryWDL;
                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266749
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"1.44","1":"3.9","3":"4.8"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.44
                             * 1 : 3.9
                             * 3 : 4.8
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266707
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"2.5","1":"3.2","3":"2.25"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.5
                             * 1 : 3.2
                             * 3 : 2.25
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"1074","team_name":"斯达","rank":"15","rank_league":""}
                     * 2 : {"team_id":"1830","team_name":"克里斯蒂安松","rank":"9","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1074
                         * team_name : 斯达
                         * rank : 15
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1830
                         * team_name : 克里斯蒂安松
                         * rank : 9
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7106Bean {
                /**
                 * serial_no : 7106
                 * match_id : 1002917
                 * match_time : 2018-06-25 00:00:00
                 * bet_time : 2018-06-25 00:00:00
                 * bet_date : 2018-06-24
                 * league_name : 挪超
                 * host_name_s : 萨尔普斯堡
                 * guest_name_s : 特罗姆瑟
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266711","is_single":"0","boundary":"0","odds":{"0":"4.25","1":"3.6","3":"1.55"}},"SportteryWDL":{"bet_id":"266751","is_single":"0","boundary":"-1","odds":{"0":"2.03","1":"3.45","3":"2.66"}}}
                 * league_color : ["#EC2300","#FFF200"]
                 * rank : {"1":{"team_id":"1407","team_name":"萨尔普斯堡","rank":"5","rank_league":""},"2":{"team_id":"448","team_name":"特罗姆瑟","rank":"7","rank_league":""}}
                 * sort : 8
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266711","is_single":"0","boundary":"0","odds":{"0":"4.25","1":"3.6","3":"1.55"}}
                     * SportteryWDL : {"bet_id":"266751","is_single":"0","boundary":"-1","odds":{"0":"2.03","1":"3.45","3":"2.66"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266711
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"4.25","1":"3.6","3":"1.55"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 4.25
                             * 1 : 3.6
                             * 3 : 1.55
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266751
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"2.03","1":"3.45","3":"2.66"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.03
                             * 1 : 3.45
                             * 3 : 2.66
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"1407","team_name":"萨尔普斯堡","rank":"5","rank_league":""}
                     * 2 : {"team_id":"448","team_name":"特罗姆瑟","rank":"7","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1407
                         * team_name : 萨尔普斯堡
                         * rank : 5
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 448
                         * team_name : 特罗姆瑟
                         * rank : 7
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7107Bean {
                /**
                 * serial_no : 7107
                 * match_id : 1002914
                 * match_time : 2018-06-25 00:00:00
                 * bet_time : 2018-06-25 00:00:00
                 * bet_date : 2018-06-24
                 * league_name : 挪超
                 * host_name_s : 斯特罗姆加斯特
                 * guest_name_s : 兰赫姆
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266715","is_single":"0","boundary":"0","odds":{"0":"4.55","1":"3.75","3":"1.49"}},"SportteryWDL":{"bet_id":"266753","is_single":"0","boundary":"-1","odds":{"0":"2.14","1":"3.5","3":"2.48"}}}
                 * league_color : ["#EC2300","#FFF200"]
                 * rank : {"1":{"team_id":"1099","team_name":"斯特罗姆加斯特","rank":"12","rank_league":""},"2":{"team_id":"1831","team_name":"兰赫姆","rank":"2","rank_league":""}}
                 * sort : 9
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266715","is_single":"0","boundary":"0","odds":{"0":"4.55","1":"3.75","3":"1.49"}}
                     * SportteryWDL : {"bet_id":"266753","is_single":"0","boundary":"-1","odds":{"0":"2.14","1":"3.5","3":"2.48"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266715
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"4.55","1":"3.75","3":"1.49"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 4.55
                             * 1 : 3.75
                             * 3 : 1.49
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266753
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"2.14","1":"3.5","3":"2.48"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.14
                             * 1 : 3.5
                             * 3 : 2.48
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"1099","team_name":"斯特罗姆加斯特","rank":"12","rank_league":""}
                     * 2 : {"team_id":"1831","team_name":"兰赫姆","rank":"2","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1099
                         * team_name : 斯特罗姆加斯特
                         * rank : 12
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 1831
                         * team_name : 兰赫姆
                         * rank : 2
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7032Bean {
                /**
                 * serial_no : 7032
                 * match_id : 1000219
                 * match_time : 2018-06-25 02:00:00
                 * bet_time : 2018-06-25 02:00:00
                 * bet_date : 2018-06-24
                 * league_name : 世界杯
                 * host_name_s : 波兰
                 * guest_name_s : 哥伦比亚
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"264208","is_single":"1","boundary":"0","odds":{"0":"1.97","1":"3.2","3":"2.95"}},"SportteryWDL":{"bet_id":"264210","is_single":"0","boundary":"1","odds":{"0":"4.15","1":"3.5","3":"1.58"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"195","team_name":"波兰","rank":"8","rank_league":"世"},"2":{"team_id":"732","team_name":"哥伦比亚","rank":"16","rank_league":"世"}}
                 * sort : 10
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"264208","is_single":"1","boundary":"0","odds":{"0":"1.97","1":"3.2","3":"2.95"}}
                     * SportteryWDL : {"bet_id":"264210","is_single":"0","boundary":"1","odds":{"0":"4.15","1":"3.5","3":"1.58"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264208
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"1.97","1":"3.2","3":"2.95"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.97
                             * 1 : 3.2
                             * 3 : 2.95
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 264210
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"4.15","1":"3.5","3":"1.58"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 4.15
                             * 1 : 3.5
                             * 3 : 1.58
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"195","team_name":"波兰","rank":"8","rank_league":"世"}
                     * 2 : {"team_id":"732","team_name":"哥伦比亚","rank":"16","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 195
                         * team_name : 波兰
                         * rank : 8
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 732
                         * team_name : 哥伦比亚
                         * rank : 16
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$7108Bean {
                /**
                 * serial_no : 7108
                 * match_id : 1002913
                 * match_time : 2018-06-25 02:00:00
                 * bet_time : 2018-06-25 02:00:00
                 * bet_date : 2018-06-24
                 * league_name : 挪超
                 * host_name_s : 罗森博格
                 * guest_name_s : 瓦勒伦加
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryWDL":{"bet_id":"266756","is_single":"0","boundary":"-1","odds":{"0":"2.23","1":"3.45","3":"2.38"}},"SportteryNWDL":{"bet_id":"266719","is_single":"0","boundary":"0","odds":{"0":"5","1":"3.8","3":"1.44"}}}
                 * league_color : ["#EC2300","#FFF200"]
                 * rank : {"1":{"team_id":"116","team_name":"罗森博格","rank":"3","rank_league":""},"2":{"team_id":"450","team_name":"瓦勒伦加","rank":"6","rank_league":""}}
                 * sort : 11
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryWDL : {"bet_id":"266756","is_single":"0","boundary":"-1","odds":{"0":"2.23","1":"3.45","3":"2.38"}}
                     * SportteryNWDL : {"bet_id":"266719","is_single":"0","boundary":"0","odds":{"0":"5","1":"3.8","3":"1.44"}}
                     */

                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;
                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266756
                         * is_single : 0
                         * boundary : -1
                         * odds : {"0":"2.23","1":"3.45","3":"2.38"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.23
                             * 1 : 3.45
                             * 3 : 2.38
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266719
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"5","1":"3.8","3":"1.44"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 5
                             * 1 : 3.8
                             * 3 : 1.44
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"116","team_name":"罗森博格","rank":"3","rank_league":""}
                     * 2 : {"team_id":"450","team_name":"瓦勒伦加","rank":"6","rank_league":""}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 116
                         * team_name : 罗森博格
                         * rank : 3
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 450
                         * team_name : 瓦勒伦加
                         * rank : 6
                         * rank_league :
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }
        }

        public static class _$20180625Bean {
            /**
             * 1033 : {"serial_no":"1033","match_id":"1000239","match_time":"2018-06-25 22:00:00","bet_time":"2018-06-25 22:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"沙特","guest_name_s":"埃及","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266627","is_single":"0","boundary":"0","odds":{"0":"1.58","1":"3.45","3":"4.25"}},"SportteryWDL":{"bet_id":"266630","is_single":"1","boundary":"1","odds":{"0":"2.76","1":"3.45","3":"1.97"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"722","team_name":"沙特","rank":"67","rank_league":"世"},"2":{"team_id":"363","team_name":"埃及","rank":"45","rank_league":"世"}},"sort":1}
             * 1034 : {"serial_no":"1034","match_id":"1000232","match_time":"2018-06-25 22:00:00","bet_time":"2018-06-25 22:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"俄罗斯","guest_name_s":"乌拉圭","sale_status":"1","reversion":"1","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266633","is_single":"1","boundary":"0","odds":{"0":"2.23","1":"2.9","3":"2.75"}},"SportteryWDL":{"bet_id":"266636","is_single":"0","boundary":"1","odds":{"0":"5.2","1":"3.75","3":"1.43"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"255","team_name":"俄罗斯","rank":"70","rank_league":"世"},"2":{"team_id":"730","team_name":"乌拉圭","rank":"14","rank_league":"世"}},"sort":2,"host_name_l":null,"guest_name_l":null}
             * 1035 : {"serial_no":"1035","match_id":"1000229","match_time":"2018-06-26 02:00:00","bet_time":"2018-06-26 02:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"伊朗","guest_name_s":"葡萄牙","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266639","is_single":"0","boundary":"0","odds":{"0":"1.45","1":"3.35","3":"5.85"}},"SportteryWDL":{"bet_id":"266642","is_single":"1","boundary":"1","odds":{"0":"2.58","1":"3.15","3":"2.2"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"719","team_name":"伊朗","rank":"43","rank_league":"世"},"2":{"team_id":"207","team_name":"葡萄牙","rank":"4","rank_league":"世"}},"sort":3}
             * 1036 : {"serial_no":"1036","match_id":"1000228","match_time":"2018-06-26 02:00:00","bet_time":"2018-06-26 02:00:00","bet_date":"2018-06-25","league_name":"世界杯","host_name_s":"西班牙","guest_name_s":"摩洛哥","sale_status":"1","reversion":"0","is_disable":"0","list":{"SportteryNWDL":{"bet_id":"266645","is_single":"0","boundary":"0","odds":{"0":"9.75","1":"4.95","3":"1.17"}},"SportteryWDL":{"bet_id":"266648","is_single":"1","boundary":"-2","odds":{"0":"1.76","1":"3.9","3":"3"}}},"league_color":["#059e3f","#FFF200"],"rank":{"1":{"team_id":"163","team_name":"西班牙","rank":"10","rank_league":"世"},"2":{"team_id":"893","team_name":"摩洛哥","rank":"41","rank_league":"世"}},"sort":4}
             */

            @com.google.gson.annotations.SerializedName("1033")
            private _$1033Bean _$1033;
            @com.google.gson.annotations.SerializedName("1034")
            private _$1034Bean _$1034;
            @com.google.gson.annotations.SerializedName("1035")
            private _$1035Bean _$1035;
            @com.google.gson.annotations.SerializedName("1036")
            private _$1036Bean _$1036;

            public _$1033Bean get_$1033() {
                return _$1033;
            }

            public void set_$1033(_$1033Bean _$1033) {
                this._$1033 = _$1033;
            }

            public _$1034Bean get_$1034() {
                return _$1034;
            }

            public void set_$1034(_$1034Bean _$1034) {
                this._$1034 = _$1034;
            }

            public _$1035Bean get_$1035() {
                return _$1035;
            }

            public void set_$1035(_$1035Bean _$1035) {
                this._$1035 = _$1035;
            }

            public _$1036Bean get_$1036() {
                return _$1036;
            }

            public void set_$1036(_$1036Bean _$1036) {
                this._$1036 = _$1036;
            }

            public static class _$1033Bean {
                /**
                 * serial_no : 1033
                 * match_id : 1000239
                 * match_time : 2018-06-25 22:00:00
                 * bet_time : 2018-06-25 22:00:00
                 * bet_date : 2018-06-25
                 * league_name : 世界杯
                 * host_name_s : 沙特
                 * guest_name_s : 埃及
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266627","is_single":"0","boundary":"0","odds":{"0":"1.58","1":"3.45","3":"4.25"}},"SportteryWDL":{"bet_id":"266630","is_single":"1","boundary":"1","odds":{"0":"2.76","1":"3.45","3":"1.97"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"722","team_name":"沙特","rank":"67","rank_league":"世"},"2":{"team_id":"363","team_name":"埃及","rank":"45","rank_league":"世"}}
                 * sort : 1
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266627","is_single":"0","boundary":"0","odds":{"0":"1.58","1":"3.45","3":"4.25"}}
                     * SportteryWDL : {"bet_id":"266630","is_single":"1","boundary":"1","odds":{"0":"2.76","1":"3.45","3":"1.97"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266627
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"1.58","1":"3.45","3":"4.25"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.58
                             * 1 : 3.45
                             * 3 : 4.25
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266630
                         * is_single : 1
                         * boundary : 1
                         * odds : {"0":"2.76","1":"3.45","3":"1.97"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.76
                             * 1 : 3.45
                             * 3 : 1.97
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"722","team_name":"沙特","rank":"67","rank_league":"世"}
                     * 2 : {"team_id":"363","team_name":"埃及","rank":"45","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 722
                         * team_name : 沙特
                         * rank : 67
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 363
                         * team_name : 埃及
                         * rank : 45
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$1034Bean {
                /**
                 * serial_no : 1034
                 * match_id : 1000232
                 * match_time : 2018-06-25 22:00:00
                 * bet_time : 2018-06-25 22:00:00
                 * bet_date : 2018-06-25
                 * league_name : 世界杯
                 * host_name_s : 俄罗斯
                 * guest_name_s : 乌拉圭
                 * sale_status : 1
                 * reversion : 1
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266633","is_single":"1","boundary":"0","odds":{"0":"2.23","1":"2.9","3":"2.75"}},"SportteryWDL":{"bet_id":"266636","is_single":"0","boundary":"1","odds":{"0":"5.2","1":"3.75","3":"1.43"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"255","team_name":"俄罗斯","rank":"70","rank_league":"世"},"2":{"team_id":"730","team_name":"乌拉圭","rank":"14","rank_league":"世"}}
                 * sort : 2
                 * host_name_l : null
                 * guest_name_l : null
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private Object host_name_l;
                private Object guest_name_l;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public Object getHost_name_l() {
                    return host_name_l;
                }

                public void setHost_name_l(Object host_name_l) {
                    this.host_name_l = host_name_l;
                }

                public Object getGuest_name_l() {
                    return guest_name_l;
                }

                public void setGuest_name_l(Object guest_name_l) {
                    this.guest_name_l = guest_name_l;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266633","is_single":"1","boundary":"0","odds":{"0":"2.23","1":"2.9","3":"2.75"}}
                     * SportteryWDL : {"bet_id":"266636","is_single":"0","boundary":"1","odds":{"0":"5.2","1":"3.75","3":"1.43"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266633
                         * is_single : 1
                         * boundary : 0
                         * odds : {"0":"2.23","1":"2.9","3":"2.75"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.23
                             * 1 : 2.9
                             * 3 : 2.75
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266636
                         * is_single : 0
                         * boundary : 1
                         * odds : {"0":"5.2","1":"3.75","3":"1.43"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 5.2
                             * 1 : 3.75
                             * 3 : 1.43
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"255","team_name":"俄罗斯","rank":"70","rank_league":"世"}
                     * 2 : {"team_id":"730","team_name":"乌拉圭","rank":"14","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 255
                         * team_name : 俄罗斯
                         * rank : 70
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 730
                         * team_name : 乌拉圭
                         * rank : 14
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$1035Bean {
                /**
                 * serial_no : 1035
                 * match_id : 1000229
                 * match_time : 2018-06-26 02:00:00
                 * bet_time : 2018-06-26 02:00:00
                 * bet_date : 2018-06-25
                 * league_name : 世界杯
                 * host_name_s : 伊朗
                 * guest_name_s : 葡萄牙
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266639","is_single":"0","boundary":"0","odds":{"0":"1.45","1":"3.35","3":"5.85"}},"SportteryWDL":{"bet_id":"266642","is_single":"1","boundary":"1","odds":{"0":"2.58","1":"3.15","3":"2.2"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"719","team_name":"伊朗","rank":"43","rank_league":"世"},"2":{"team_id":"207","team_name":"葡萄牙","rank":"4","rank_league":"世"}}
                 * sort : 3
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266639","is_single":"0","boundary":"0","odds":{"0":"1.45","1":"3.35","3":"5.85"}}
                     * SportteryWDL : {"bet_id":"266642","is_single":"1","boundary":"1","odds":{"0":"2.58","1":"3.15","3":"2.2"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266639
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"1.45","1":"3.35","3":"5.85"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.45
                             * 1 : 3.35
                             * 3 : 5.85
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266642
                         * is_single : 1
                         * boundary : 1
                         * odds : {"0":"2.58","1":"3.15","3":"2.2"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 2.58
                             * 1 : 3.15
                             * 3 : 2.2
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"719","team_name":"伊朗","rank":"43","rank_league":"世"}
                     * 2 : {"team_id":"207","team_name":"葡萄牙","rank":"4","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 719
                         * team_name : 伊朗
                         * rank : 43
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 207
                         * team_name : 葡萄牙
                         * rank : 4
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }

            public static class _$1036Bean {
                /**
                 * serial_no : 1036
                 * match_id : 1000228
                 * match_time : 2018-06-26 02:00:00
                 * bet_time : 2018-06-26 02:00:00
                 * bet_date : 2018-06-25
                 * league_name : 世界杯
                 * host_name_s : 西班牙
                 * guest_name_s : 摩洛哥
                 * sale_status : 1
                 * reversion : 0
                 * is_disable : 0
                 * list : {"SportteryNWDL":{"bet_id":"266645","is_single":"0","boundary":"0","odds":{"0":"9.75","1":"4.95","3":"1.17"}},"SportteryWDL":{"bet_id":"266648","is_single":"1","boundary":"-2","odds":{"0":"1.76","1":"3.9","3":"3"}}}
                 * league_color : ["#059e3f","#FFF200"]
                 * rank : {"1":{"team_id":"163","team_name":"西班牙","rank":"10","rank_league":"世"},"2":{"team_id":"893","team_name":"摩洛哥","rank":"41","rank_league":"世"}}
                 * sort : 4
                 */

                private String serial_no;
                private String match_id;
                private String match_time;
                private String bet_time;
                private String bet_date;
                private String league_name;
                private String host_name_s;
                private String guest_name_s;
                private String sale_status;
                private String reversion;
                private String is_disable;
                private ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX list;
                private RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX rank;
                private int sort;
                private List<String> league_color;

                public String getSerial_no() {
                    return serial_no;
                }

                public void setSerial_no(String serial_no) {
                    this.serial_no = serial_no;
                }

                public String getMatch_id() {
                    return match_id;
                }

                public void setMatch_id(String match_id) {
                    this.match_id = match_id;
                }

                public String getMatch_time() {
                    return match_time;
                }

                public void setMatch_time(String match_time) {
                    this.match_time = match_time;
                }

                public String getBet_time() {
                    return bet_time;
                }

                public void setBet_time(String bet_time) {
                    this.bet_time = bet_time;
                }

                public String getBet_date() {
                    return bet_date;
                }

                public void setBet_date(String bet_date) {
                    this.bet_date = bet_date;
                }

                public String getLeague_name() {
                    return league_name;
                }

                public void setLeague_name(String league_name) {
                    this.league_name = league_name;
                }

                public String getHost_name_s() {
                    return host_name_s;
                }

                public void setHost_name_s(String host_name_s) {
                    this.host_name_s = host_name_s;
                }

                public String getGuest_name_s() {
                    return guest_name_s;
                }

                public void setGuest_name_s(String guest_name_s) {
                    this.guest_name_s = guest_name_s;
                }

                public String getSale_status() {
                    return sale_status;
                }

                public void setSale_status(String sale_status) {
                    this.sale_status = sale_status;
                }

                public String getReversion() {
                    return reversion;
                }

                public void setReversion(String reversion) {
                    this.reversion = reversion;
                }

                public String getIs_disable() {
                    return is_disable;
                }

                public void setIs_disable(String is_disable) {
                    this.is_disable = is_disable;
                }

                public ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getList() {
                    return list;
                }

                public void setList(ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX list) {
                    this.list = list;
                }

                public RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getRank() {
                    return rank;
                }

                public void setRank(RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX rank) {
                    this.rank = rank;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public List<String> getLeague_color() {
                    return league_color;
                }

                public void setLeague_color(List<String> league_color) {
                    this.league_color = league_color;
                }

                public static class ListBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * SportteryNWDL : {"bet_id":"266645","is_single":"0","boundary":"0","odds":{"0":"9.75","1":"4.95","3":"1.17"}}
                     * SportteryWDL : {"bet_id":"266648","is_single":"1","boundary":"-2","odds":{"0":"1.76","1":"3.9","3":"3"}}
                     */

                    private SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL;
                    private SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL;

                    public SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryNWDL() {
                        return SportteryNWDL;
                    }

                    public void setSportteryNWDL(SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryNWDL) {
                        this.SportteryNWDL = SportteryNWDL;
                    }

                    public SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getSportteryWDL() {
                        return SportteryWDL;
                    }

                    public void setSportteryWDL(SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX SportteryWDL) {
                        this.SportteryWDL = SportteryWDL;
                    }

                    public static class SportteryNWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266645
                         * is_single : 0
                         * boundary : 0
                         * odds : {"0":"9.75","1":"4.95","3":"1.17"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 9.75
                             * 1 : 4.95
                             * 3 : 1.17
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }

                    public static class SportteryWDLBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * bet_id : 266648
                         * is_single : 1
                         * boundary : -2
                         * odds : {"0":"1.76","1":"3.9","3":"3"}
                         */

                        private String bet_id;
                        private String is_single;
                        private String boundary;
                        private OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds;

                        public String getBet_id() {
                            return bet_id;
                        }

                        public void setBet_id(String bet_id) {
                            this.bet_id = bet_id;
                        }

                        public String getIs_single() {
                            return is_single;
                        }

                        public void setIs_single(String is_single) {
                            this.is_single = is_single;
                        }

                        public String getBoundary() {
                            return boundary;
                        }

                        public void setBoundary(String boundary) {
                            this.boundary = boundary;
                        }

                        public OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX getOdds() {
                            return odds;
                        }

                        public void setOdds(OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX odds) {
                            this.odds = odds;
                        }

                        public static class OddsBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                            /**
                             * 0 : 1.76
                             * 1 : 3.9
                             * 3 : 3
                             */

                            @com.google.gson.annotations.SerializedName("0")
                            private String _$0;
                            @com.google.gson.annotations.SerializedName("1")
                            private String _$1;
                            @com.google.gson.annotations.SerializedName("3")
                            private String _$3;

                            public String get_$0() {
                                return _$0;
                            }

                            public void set_$0(String _$0) {
                                this._$0 = _$0;
                            }

                            public String get_$1() {
                                return _$1;
                            }

                            public void set_$1(String _$1) {
                                this._$1 = _$1;
                            }

                            public String get_$3() {
                                return _$3;
                            }

                            public void set_$3(String _$3) {
                                this._$3 = _$3;
                            }
                        }
                    }
                }

                public static class RankBeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                    /**
                     * 1 : {"team_id":"163","team_name":"西班牙","rank":"10","rank_league":"世"}
                     * 2 : {"team_id":"893","team_name":"摩洛哥","rank":"41","rank_league":"世"}
                     */

                    @com.google.gson.annotations.SerializedName("1")
                    private _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$1;
                    @com.google.gson.annotations.SerializedName("2")
                    private _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$2;

                    public _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX get_$1() {
                        return _$1;
                    }

                    public void set_$1(_$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$1) {
                        this._$1 = _$1;
                    }

                    public _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX get_$2() {
                        return _$2;
                    }

                    public void set_$2(_$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX _$2) {
                        this._$2 = _$2;
                    }

                    public static class _$1BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 163
                         * team_name : 西班牙
                         * rank : 10
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }

                    public static class _$2BeanXXXXXXXXXXXXXXXXXXXXXXXXXXXXX {
                        /**
                         * team_id : 893
                         * team_name : 摩洛哥
                         * rank : 41
                         * rank_league : 世
                         */

                        private String team_id;
                        private String team_name;
                        private String rank;
                        private String rank_league;

                        public String getTeam_id() {
                            return team_id;
                        }

                        public void setTeam_id(String team_id) {
                            this.team_id = team_id;
                        }

                        public String getTeam_name() {
                            return team_name;
                        }

                        public void setTeam_name(String team_name) {
                            this.team_name = team_name;
                        }

                        public String getRank() {
                            return rank;
                        }

                        public void setRank(String rank) {
                            this.rank = rank;
                        }

                        public String getRank_league() {
                            return rank_league;
                        }

                        public void setRank_league(String rank_league) {
                            this.rank_league = rank_league;
                        }
                    }
                }
            }
        }
    }
}
