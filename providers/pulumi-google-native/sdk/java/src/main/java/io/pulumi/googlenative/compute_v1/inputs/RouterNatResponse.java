// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.RouterNatLogConfigResponse;
import io.pulumi.googlenative.compute_v1.inputs.RouterNatRuleResponse;
import io.pulumi.googlenative.compute_v1.inputs.RouterNatSubnetworkToNatResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a Nat resource. It enables the VMs within the specified subnetworks to access Internet without external IP addresses. It specifies a list of subnetworks (and the ranges within) that want to use NAT. Customers can also provide the external IPs that would be used for NAT. GCP would auto-allocate ephemeral IPs if no external IPs are provided.
 * 
 */
public final class RouterNatResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterNatResponse Empty = new RouterNatResponse();

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
     * 
     */
    @Import(name="drainNatIps", required=true)
      private final List<String> drainNatIps;

    public List<String> getDrainNatIps() {
        return this.drainNatIps;
    }

    /**
     * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
     * 
     */
    @Import(name="enableDynamicPortAllocation", required=true)
      private final Boolean enableDynamicPortAllocation;

    public Boolean getEnableDynamicPortAllocation() {
        return this.enableDynamicPortAllocation;
    }

    @Import(name="enableEndpointIndependentMapping", required=true)
      private final Boolean enableEndpointIndependentMapping;

    public Boolean getEnableEndpointIndependentMapping() {
        return this.enableEndpointIndependentMapping;
    }

    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    @Import(name="icmpIdleTimeoutSec", required=true)
      private final Integer icmpIdleTimeoutSec;

    public Integer getIcmpIdleTimeoutSec() {
        return this.icmpIdleTimeoutSec;
    }

    /**
     * Configure logging on this NAT.
     * 
     */
    @Import(name="logConfig", required=true)
      private final RouterNatLogConfigResponse logConfig;

    public RouterNatLogConfigResponse getLogConfig() {
        return this.logConfig;
    }

    /**
     * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
     * 
     */
    @Import(name="maxPortsPerVm", required=true)
      private final Integer maxPortsPerVm;

    public Integer getMaxPortsPerVm() {
        return this.maxPortsPerVm;
    }

    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
     * 
     */
    @Import(name="minPortsPerVm", required=true)
      private final Integer minPortsPerVm;

    public Integer getMinPortsPerVm() {
        return this.minPortsPerVm;
    }

    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
     */
    @Import(name="natIpAllocateOption", required=true)
      private final String natIpAllocateOption;

    public String getNatIpAllocateOption() {
        return this.natIpAllocateOption;
    }

    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
     * 
     */
    @Import(name="natIps", required=true)
      private final List<String> natIps;

    public List<String> getNatIps() {
        return this.natIps;
    }

    /**
     * A list of rules associated with this NAT.
     * 
     */
    @Import(name="rules", required=true)
      private final List<RouterNatRuleResponse> rules;

    public List<RouterNatRuleResponse> getRules() {
        return this.rules;
    }

    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
     */
    @Import(name="sourceSubnetworkIpRangesToNat", required=true)
      private final String sourceSubnetworkIpRangesToNat;

    public String getSourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat;
    }

    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     * 
     */
    @Import(name="subnetworks", required=true)
      private final List<RouterNatSubnetworkToNatResponse> subnetworks;

    public List<RouterNatSubnetworkToNatResponse> getSubnetworks() {
        return this.subnetworks;
    }

    /**
     * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
     * 
     */
    @Import(name="tcpEstablishedIdleTimeoutSec", required=true)
      private final Integer tcpEstablishedIdleTimeoutSec;

    public Integer getTcpEstablishedIdleTimeoutSec() {
        return this.tcpEstablishedIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
     * 
     */
    @Import(name="tcpTimeWaitTimeoutSec", required=true)
      private final Integer tcpTimeWaitTimeoutSec;

    public Integer getTcpTimeWaitTimeoutSec() {
        return this.tcpTimeWaitTimeoutSec;
    }

    /**
     * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
     * 
     */
    @Import(name="tcpTransitoryIdleTimeoutSec", required=true)
      private final Integer tcpTransitoryIdleTimeoutSec;

    public Integer getTcpTransitoryIdleTimeoutSec() {
        return this.tcpTransitoryIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    @Import(name="udpIdleTimeoutSec", required=true)
      private final Integer udpIdleTimeoutSec;

    public Integer getUdpIdleTimeoutSec() {
        return this.udpIdleTimeoutSec;
    }

    public RouterNatResponse(
        List<String> drainNatIps,
        Boolean enableDynamicPortAllocation,
        Boolean enableEndpointIndependentMapping,
        Integer icmpIdleTimeoutSec,
        RouterNatLogConfigResponse logConfig,
        Integer maxPortsPerVm,
        Integer minPortsPerVm,
        String name,
        String natIpAllocateOption,
        List<String> natIps,
        List<RouterNatRuleResponse> rules,
        String sourceSubnetworkIpRangesToNat,
        List<RouterNatSubnetworkToNatResponse> subnetworks,
        Integer tcpEstablishedIdleTimeoutSec,
        Integer tcpTimeWaitTimeoutSec,
        Integer tcpTransitoryIdleTimeoutSec,
        Integer udpIdleTimeoutSec) {
        this.drainNatIps = Objects.requireNonNull(drainNatIps, "expected parameter 'drainNatIps' to be non-null");
        this.enableDynamicPortAllocation = Objects.requireNonNull(enableDynamicPortAllocation, "expected parameter 'enableDynamicPortAllocation' to be non-null");
        this.enableEndpointIndependentMapping = Objects.requireNonNull(enableEndpointIndependentMapping, "expected parameter 'enableEndpointIndependentMapping' to be non-null");
        this.icmpIdleTimeoutSec = Objects.requireNonNull(icmpIdleTimeoutSec, "expected parameter 'icmpIdleTimeoutSec' to be non-null");
        this.logConfig = Objects.requireNonNull(logConfig, "expected parameter 'logConfig' to be non-null");
        this.maxPortsPerVm = Objects.requireNonNull(maxPortsPerVm, "expected parameter 'maxPortsPerVm' to be non-null");
        this.minPortsPerVm = Objects.requireNonNull(minPortsPerVm, "expected parameter 'minPortsPerVm' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.natIpAllocateOption = Objects.requireNonNull(natIpAllocateOption, "expected parameter 'natIpAllocateOption' to be non-null");
        this.natIps = Objects.requireNonNull(natIps, "expected parameter 'natIps' to be non-null");
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
        this.sourceSubnetworkIpRangesToNat = Objects.requireNonNull(sourceSubnetworkIpRangesToNat, "expected parameter 'sourceSubnetworkIpRangesToNat' to be non-null");
        this.subnetworks = Objects.requireNonNull(subnetworks, "expected parameter 'subnetworks' to be non-null");
        this.tcpEstablishedIdleTimeoutSec = Objects.requireNonNull(tcpEstablishedIdleTimeoutSec, "expected parameter 'tcpEstablishedIdleTimeoutSec' to be non-null");
        this.tcpTimeWaitTimeoutSec = Objects.requireNonNull(tcpTimeWaitTimeoutSec, "expected parameter 'tcpTimeWaitTimeoutSec' to be non-null");
        this.tcpTransitoryIdleTimeoutSec = Objects.requireNonNull(tcpTransitoryIdleTimeoutSec, "expected parameter 'tcpTransitoryIdleTimeoutSec' to be non-null");
        this.udpIdleTimeoutSec = Objects.requireNonNull(udpIdleTimeoutSec, "expected parameter 'udpIdleTimeoutSec' to be non-null");
    }

    private RouterNatResponse() {
        this.drainNatIps = List.of();
        this.enableDynamicPortAllocation = null;
        this.enableEndpointIndependentMapping = null;
        this.icmpIdleTimeoutSec = null;
        this.logConfig = null;
        this.maxPortsPerVm = null;
        this.minPortsPerVm = null;
        this.name = null;
        this.natIpAllocateOption = null;
        this.natIps = List.of();
        this.rules = List.of();
        this.sourceSubnetworkIpRangesToNat = null;
        this.subnetworks = List.of();
        this.tcpEstablishedIdleTimeoutSec = null;
        this.tcpTimeWaitTimeoutSec = null;
        this.tcpTransitoryIdleTimeoutSec = null;
        this.udpIdleTimeoutSec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> drainNatIps;
        private Boolean enableDynamicPortAllocation;
        private Boolean enableEndpointIndependentMapping;
        private Integer icmpIdleTimeoutSec;
        private RouterNatLogConfigResponse logConfig;
        private Integer maxPortsPerVm;
        private Integer minPortsPerVm;
        private String name;
        private String natIpAllocateOption;
        private List<String> natIps;
        private List<RouterNatRuleResponse> rules;
        private String sourceSubnetworkIpRangesToNat;
        private List<RouterNatSubnetworkToNatResponse> subnetworks;
        private Integer tcpEstablishedIdleTimeoutSec;
        private Integer tcpTimeWaitTimeoutSec;
        private Integer tcpTransitoryIdleTimeoutSec;
        private Integer udpIdleTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.drainNatIps = defaults.drainNatIps;
    	      this.enableDynamicPortAllocation = defaults.enableDynamicPortAllocation;
    	      this.enableEndpointIndependentMapping = defaults.enableEndpointIndependentMapping;
    	      this.icmpIdleTimeoutSec = defaults.icmpIdleTimeoutSec;
    	      this.logConfig = defaults.logConfig;
    	      this.maxPortsPerVm = defaults.maxPortsPerVm;
    	      this.minPortsPerVm = defaults.minPortsPerVm;
    	      this.name = defaults.name;
    	      this.natIpAllocateOption = defaults.natIpAllocateOption;
    	      this.natIps = defaults.natIps;
    	      this.rules = defaults.rules;
    	      this.sourceSubnetworkIpRangesToNat = defaults.sourceSubnetworkIpRangesToNat;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tcpEstablishedIdleTimeoutSec = defaults.tcpEstablishedIdleTimeoutSec;
    	      this.tcpTimeWaitTimeoutSec = defaults.tcpTimeWaitTimeoutSec;
    	      this.tcpTransitoryIdleTimeoutSec = defaults.tcpTransitoryIdleTimeoutSec;
    	      this.udpIdleTimeoutSec = defaults.udpIdleTimeoutSec;
        }

        public Builder drainNatIps(List<String> drainNatIps) {
            this.drainNatIps = Objects.requireNonNull(drainNatIps);
            return this;
        }

        public Builder enableDynamicPortAllocation(Boolean enableDynamicPortAllocation) {
            this.enableDynamicPortAllocation = Objects.requireNonNull(enableDynamicPortAllocation);
            return this;
        }

        public Builder enableEndpointIndependentMapping(Boolean enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = Objects.requireNonNull(enableEndpointIndependentMapping);
            return this;
        }

        public Builder icmpIdleTimeoutSec(Integer icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = Objects.requireNonNull(icmpIdleTimeoutSec);
            return this;
        }

        public Builder logConfig(RouterNatLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }

        public Builder maxPortsPerVm(Integer maxPortsPerVm) {
            this.maxPortsPerVm = Objects.requireNonNull(maxPortsPerVm);
            return this;
        }

        public Builder minPortsPerVm(Integer minPortsPerVm) {
            this.minPortsPerVm = Objects.requireNonNull(minPortsPerVm);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder natIpAllocateOption(String natIpAllocateOption) {
            this.natIpAllocateOption = Objects.requireNonNull(natIpAllocateOption);
            return this;
        }

        public Builder natIps(List<String> natIps) {
            this.natIps = Objects.requireNonNull(natIps);
            return this;
        }

        public Builder rules(List<RouterNatRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder sourceSubnetworkIpRangesToNat(String sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = Objects.requireNonNull(sourceSubnetworkIpRangesToNat);
            return this;
        }

        public Builder subnetworks(List<RouterNatSubnetworkToNatResponse> subnetworks) {
            this.subnetworks = Objects.requireNonNull(subnetworks);
            return this;
        }

        public Builder tcpEstablishedIdleTimeoutSec(Integer tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = Objects.requireNonNull(tcpEstablishedIdleTimeoutSec);
            return this;
        }

        public Builder tcpTimeWaitTimeoutSec(Integer tcpTimeWaitTimeoutSec) {
            this.tcpTimeWaitTimeoutSec = Objects.requireNonNull(tcpTimeWaitTimeoutSec);
            return this;
        }

        public Builder tcpTransitoryIdleTimeoutSec(Integer tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = Objects.requireNonNull(tcpTransitoryIdleTimeoutSec);
            return this;
        }

        public Builder udpIdleTimeoutSec(Integer udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = Objects.requireNonNull(udpIdleTimeoutSec);
            return this;
        }
        public RouterNatResponse build() {
            return new RouterNatResponse(drainNatIps, enableDynamicPortAllocation, enableEndpointIndependentMapping, icmpIdleTimeoutSec, logConfig, maxPortsPerVm, minPortsPerVm, name, natIpAllocateOption, natIps, rules, sourceSubnetworkIpRangesToNat, subnetworks, tcpEstablishedIdleTimeoutSec, tcpTimeWaitTimeoutSec, tcpTransitoryIdleTimeoutSec, udpIdleTimeoutSec);
        }
    }
}
