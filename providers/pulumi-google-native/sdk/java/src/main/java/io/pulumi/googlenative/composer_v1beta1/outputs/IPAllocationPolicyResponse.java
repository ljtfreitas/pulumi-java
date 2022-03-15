// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IPAllocationPolicyResponse {
    /**
     * Optional. The IP address range used to allocate IP addresses to pods in the cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use. Specify `cluster_secondary_range_name` or `cluster_ipv4_cidr_block` but not both.
     * 
     */
    private final String clusterIpv4CidrBlock;
    /**
     * Optional. The name of the cluster's secondary range used to allocate IP addresses to pods. Specify either `cluster_secondary_range_name` or `cluster_ipv4_cidr_block` but not both. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    private final String clusterSecondaryRangeName;
    /**
     * Optional. The IP address range of the services IP addresses in this cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use. Specify `services_secondary_range_name` or `services_ipv4_cidr_block` but not both.
     * 
     */
    private final String servicesIpv4CidrBlock;
    /**
     * Optional. The name of the services' secondary range used to allocate IP addresses to the cluster. Specify either `services_secondary_range_name` or `services_ipv4_cidr_block` but not both. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    private final String servicesSecondaryRangeName;
    /**
     * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
     * 
     */
    private final Boolean useIpAliases;

    @CustomType.Constructor
    private IPAllocationPolicyResponse(
        @CustomType.Parameter("clusterIpv4CidrBlock") String clusterIpv4CidrBlock,
        @CustomType.Parameter("clusterSecondaryRangeName") String clusterSecondaryRangeName,
        @CustomType.Parameter("servicesIpv4CidrBlock") String servicesIpv4CidrBlock,
        @CustomType.Parameter("servicesSecondaryRangeName") String servicesSecondaryRangeName,
        @CustomType.Parameter("useIpAliases") Boolean useIpAliases) {
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
        this.useIpAliases = useIpAliases;
    }

    /**
     * Optional. The IP address range used to allocate IP addresses to pods in the cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use. Specify `cluster_secondary_range_name` or `cluster_ipv4_cidr_block` but not both.
     * 
    */
    public String getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock;
    }
    /**
     * Optional. The name of the cluster's secondary range used to allocate IP addresses to pods. Specify either `cluster_secondary_range_name` or `cluster_ipv4_cidr_block` but not both. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
    */
    public String getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName;
    }
    /**
     * Optional. The IP address range of the services IP addresses in this cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use. Specify `services_secondary_range_name` or `services_ipv4_cidr_block` but not both.
     * 
    */
    public String getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock;
    }
    /**
     * Optional. The name of the services' secondary range used to allocate IP addresses to the cluster. Specify either `services_secondary_range_name` or `services_ipv4_cidr_block` but not both. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
    */
    public String getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName;
    }
    /**
     * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
     * 
    */
    public Boolean getUseIpAliases() {
        return this.useIpAliases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAllocationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterIpv4CidrBlock;
        private String clusterSecondaryRangeName;
        private String servicesIpv4CidrBlock;
        private String servicesSecondaryRangeName;
        private Boolean useIpAliases;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAllocationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
    	      this.useIpAliases = defaults.useIpAliases;
        }

        public Builder clusterIpv4CidrBlock(String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Objects.requireNonNull(clusterIpv4CidrBlock);
            return this;
        }

        public Builder clusterSecondaryRangeName(String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Objects.requireNonNull(clusterSecondaryRangeName);
            return this;
        }

        public Builder servicesIpv4CidrBlock(String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Objects.requireNonNull(servicesIpv4CidrBlock);
            return this;
        }

        public Builder servicesSecondaryRangeName(String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Objects.requireNonNull(servicesSecondaryRangeName);
            return this;
        }

        public Builder useIpAliases(Boolean useIpAliases) {
            this.useIpAliases = Objects.requireNonNull(useIpAliases);
            return this;
        }
        public IPAllocationPolicyResponse build() {
            return new IPAllocationPolicyResponse(clusterIpv4CidrBlock, clusterSecondaryRangeName, servicesIpv4CidrBlock, servicesSecondaryRangeName, useIpAliases);
        }
    }
}
