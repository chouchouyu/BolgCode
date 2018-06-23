package com.github.susan.lottery.lottery;


import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by susan on 2018/6/23.
 */

public class OneDayInfoBean {

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
     * list : {"SportteryNWDL":{"bet_id":"264188","is_single":"1","boundary":"0","odds":{"0":"1.48","1":"3.43","3":"5.2"}},"SportteryWDL":{"bet_id":"264190","is_single":"0","boundary":"1","odds":{"0":"2.7","1":"3.15","3":"2.12"}}}
     * league_color : ["#059e3f","#FFF200"]
     * rank : {"1":{"team_id":"717","team_name":"韩国","rank":"57","rank_league":"世"},"2":{"team_id":"729","team_name":"墨西哥","rank":"15","rank_league":"世"}}
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
         * SportteryNWDL : {"bet_id":"264188","is_single":"1","boundary":"0","odds":{"0":"1.48","1":"3.43","3":"5.2"}}
         * SportteryWDL : {"bet_id":"264190","is_single":"0","boundary":"1","odds":{"0":"2.7","1":"3.15","3":"2.12"}}
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
             * bet_id : 264188
             * is_single : 1
             * boundary : 0
             * odds : {"0":"1.48","1":"3.43","3":"5.2"}
             */

            private String bet_id;
            private String is_single;
            private String boundary;
            private LinkedHashMap<String, String> odds;

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


            public LinkedHashMap<String, String> getOdds() {
                return odds;
            }

            public void setOdds(LinkedHashMap<String, String> odds) {
                this.odds = odds;
            }
        }

        public static class SportteryWDLBean {
            /**
             * bet_id : 264190
             * is_single : 0
             * boundary : 1
             * odds : {"0":"2.7","1":"3.15","3":"2.12"}
             */

            private String bet_id;
            private String is_single;
            private String boundary;
            private LinkedHashMap<String, String> odds;

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

            public LinkedHashMap<String, String> getOdds() {
                return odds;
            }

            public void setOdds(LinkedHashMap<String, String> odds) {
                this.odds = odds;
            }
        }
    }

}
