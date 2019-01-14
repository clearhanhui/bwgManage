package com.forphan.bwgmanage.bwg;
import java.util.List;

/**
 * Auto-generated: 2019-01-12 14:41:35
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ServerInfo {

    private String vm_type;
    private String hostname;
    private String node_ip;
    private String node_alias;
    private String node_location;
    private String node_location_id;
    private String node_datacenter;
    private boolean location_ipv6_ready;
    private String plan;
    private long plan_monthly_data;
    private int monthly_data_multiplier;
    private long plan_disk;
    private long plan_ram;
    private long plan_swap;
    private int plan_max_ipv6s;
    private String os;
    private String email;
    private long data_counter;
    private long data_next_reset;
    private List<String> ip_addresses;
    private boolean rdns_api_available;
    private boolean suspended;
    private int error;
    public void setVm_type(String vm_type) {
         this.vm_type = vm_type;
     }
     public String getVm_type() {
         return vm_type;
     }

    public void setHostname(String hostname) {
         this.hostname = hostname;
     }
     public String getHostname() {
         return hostname;
     }

    public void setNode_ip(String node_ip) {
         this.node_ip = node_ip;
     }
     public String getNode_ip() {
         return node_ip;
     }

    public void setNode_alias(String node_alias) {
         this.node_alias = node_alias;
     }
     public String getNode_alias() {
         return node_alias;
     }

    public void setNode_location(String node_location) {
         this.node_location = node_location;
     }
     public String getNode_location() {
         return node_location;
     }

    public void setNode_location_id(String node_location_id) {
         this.node_location_id = node_location_id;
     }
     public String getNode_location_id() {
         return node_location_id;
     }

    public void setNode_datacenter(String node_datacenter) {
         this.node_datacenter = node_datacenter;
     }
     public String getNode_datacenter() {
         return node_datacenter;
     }

    public void setLocation_ipv6_ready(boolean location_ipv6_ready) {
         this.location_ipv6_ready = location_ipv6_ready;
     }
     public boolean getLocation_ipv6_ready() {
         return location_ipv6_ready;
     }

    public void setPlan(String plan) {
         this.plan = plan;
     }
     public String getPlan() {
         return plan;
     }

    public void setPlan_monthly_data(long plan_monthly_data) {
         this.plan_monthly_data = plan_monthly_data;
     }
     public long getPlan_monthly_data() {
         return plan_monthly_data;
     }

    public void setMonthly_data_multiplier(int monthly_data_multiplier) {
         this.monthly_data_multiplier = monthly_data_multiplier;
     }
     public int getMonthly_data_multiplier() {
         return monthly_data_multiplier;
     }

    public void setPlan_disk(long plan_disk) {
         this.plan_disk = plan_disk;
     }
     public long getPlan_disk() {
         return plan_disk;
     }

    public void setPlan_ram(long plan_ram) {
         this.plan_ram = plan_ram;
     }
     public long getPlan_ram() {
         return plan_ram;
     }

    public void setPlan_swap(long plan_swap) {
         this.plan_swap = plan_swap;
     }
     public long getPlan_swap() {
         return plan_swap;
     }

    public void setPlan_max_ipv6s(int plan_max_ipv6s) {
         this.plan_max_ipv6s = plan_max_ipv6s;
     }
     public int getPlan_max_ipv6s() {
         return plan_max_ipv6s;
     }

    public void setOs(String os) {
         this.os = os;
     }
     public String getOs() {
         return os;
     }

    public void setEmail(String email) {
         this.email = email;
     }
     public String getEmail() {
         return email;
     }

    public void setData_counter(long data_counter) {
         this.data_counter = data_counter;
     }
     public long getData_counter() {
         return data_counter;
     }

    public void setData_next_reset(long data_next_reset) {
         this.data_next_reset = data_next_reset;
     }
     public long getData_next_reset() {
         return data_next_reset;
     }

    public void setIp_addresses(List<String> ip_addresses) {
         this.ip_addresses = ip_addresses;
     }
     public List<String> getIp_addresses() {
         return ip_addresses;
     }

    public void setRdns_api_available(boolean rdns_api_available) {
         this.rdns_api_available = rdns_api_available;
     }
     public boolean getRdns_api_available() {
         return rdns_api_available;
     }

    public void setSuspended(boolean suspended) {
         this.suspended = suspended;
     }
     public boolean getSuspended() {
         return suspended;
     }

    public void setError(int error) {
         this.error = error;
     }
     public int getError() {
         return error;
     }

}