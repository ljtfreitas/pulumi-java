// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for controlling how IPs are allocated in the GKE cluster running the Apache Airflow software.
 * 
 */
public final class IPAllocationPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final IPAllocationPolicyResponse Empty = new IPAllocationPolicyResponse();

    /**
     * Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="clusterIpv4CidrBlock", required=true)
      private final String clusterIpv4CidrBlock;

    public String getClusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock;
    }

    /**
     * Optional. The name of the GKE cluster's secondary range used to allocate IP addresses to pods. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    @Import(name="clusterSecondaryRangeName", required=true)
      private final String clusterSecondaryRangeName;

    public String getClusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName;
    }

    /**
     * Optional. The IP address range of the services IP addresses in this GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true. Set to blank to have GKE choose a range with the default size. Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask. Set to a [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="servicesIpv4CidrBlock", required=true)
      private final String servicesIpv4CidrBlock;

    public String getServicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock;
    }

    /**
     * Optional. The name of the services' secondary range used to allocate IP addresses to the GKE cluster. For Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*, this field is applicable only when `use_ip_aliases` is true.
     * 
     */
    @Import(name="servicesSecondaryRangeName", required=true)
      private final String servicesSecondaryRangeName;

    public String getServicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName;
    }

    /**
     * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native cluster is created. This field is only supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*. Environments in newer versions always use VPC-native GKE clusters.
     * 
     */
    @Import(name="useIpAliases", required=true)
      private final Boolean useIpAliases;

    public Boolean getUseIpAliases() {
        return this.useIpAliases;
    }

    public IPAllocationPolicyResponse(
        String clusterIpv4CidrBlock,
        String clusterSecondaryRangeName,
        String servicesIpv4CidrBlock,
        String servicesSecondaryRangeName,
        Boolean useIpAliases) {
        this.clusterIpv4CidrBlock = Objects.requireNonNull(clusterIpv4CidrBlock, "expected parameter 'clusterIpv4CidrBlock' to be non-null");
        this.clusterSecondaryRangeName = Objects.requireNonNull(clusterSecondaryRangeName, "expected parameter 'clusterSecondaryRangeName' to be non-null");
        this.servicesIpv4CidrBlock = Objects.requireNonNull(servicesIpv4CidrBlock, "expected parameter 'servicesIpv4CidrBlock' to be non-null");
        this.servicesSecondaryRangeName = Objects.requireNonNull(servicesSecondaryRangeName, "expected parameter 'servicesSecondaryRangeName' to be non-null");
        this.useIpAliases = Objects.requireNonNull(useIpAliases, "expected parameter 'useIpAliases' to be non-null");
    }

    private IPAllocationPolicyResponse() {
        this.clusterIpv4CidrBlock = null;
        this.clusterSecondaryRangeName = null;
        this.servicesIpv4CidrBlock = null;
        this.servicesSecondaryRangeName = null;
        this.useIpAliases = null;
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
