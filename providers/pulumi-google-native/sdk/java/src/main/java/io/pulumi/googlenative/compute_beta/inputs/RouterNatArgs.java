// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.RouterNatNatIpAllocateOption;
import io.pulumi.googlenative.compute_beta.enums.RouterNatSourceSubnetworkIpRangesToNat;
import io.pulumi.googlenative.compute_beta.inputs.RouterNatLogConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.RouterNatRuleArgs;
import io.pulumi.googlenative.compute_beta.inputs.RouterNatSubnetworkToNatArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Nat resource. It enables the VMs within the specified subnetworks to access Internet without external IP addresses. It specifies a list of subnetworks (and the ranges within) that want to use NAT. Customers can also provide the external IPs that would be used for NAT. GCP would auto-allocate ephemeral IPs if no external IPs are provided.
 * 
 */
public final class RouterNatArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterNatArgs Empty = new RouterNatArgs();

    /**
     * A list of URLs of the IP resources to be drained. These IPs must be valid static external IPs that have been assigned to the NAT. These IPs should be used for updating/patching a NAT only.
     * 
     */
    @InputImport(name="drainNatIps")
      private final @Nullable Input<List<String>> drainNatIps;

    public Input<List<String>> getDrainNatIps() {
        return this.drainNatIps == null ? Input.empty() : this.drainNatIps;
    }

    /**
     * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
     * 
     */
    @InputImport(name="enableDynamicPortAllocation")
      private final @Nullable Input<Boolean> enableDynamicPortAllocation;

    public Input<Boolean> getEnableDynamicPortAllocation() {
        return this.enableDynamicPortAllocation == null ? Input.empty() : this.enableDynamicPortAllocation;
    }

    @InputImport(name="enableEndpointIndependentMapping")
      private final @Nullable Input<Boolean> enableEndpointIndependentMapping;

    public Input<Boolean> getEnableEndpointIndependentMapping() {
        return this.enableEndpointIndependentMapping == null ? Input.empty() : this.enableEndpointIndependentMapping;
    }

    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    @InputImport(name="icmpIdleTimeoutSec")
      private final @Nullable Input<Integer> icmpIdleTimeoutSec;

    public Input<Integer> getIcmpIdleTimeoutSec() {
        return this.icmpIdleTimeoutSec == null ? Input.empty() : this.icmpIdleTimeoutSec;
    }

    /**
     * Configure logging on this NAT.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<RouterNatLogConfigArgs> logConfig;

    public Input<RouterNatLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
     * 
     */
    @InputImport(name="maxPortsPerVm")
      private final @Nullable Input<Integer> maxPortsPerVm;

    public Input<Integer> getMaxPortsPerVm() {
        return this.maxPortsPerVm == null ? Input.empty() : this.maxPortsPerVm;
    }

    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
     * 
     */
    @InputImport(name="minPortsPerVm")
      private final @Nullable Input<Integer> minPortsPerVm;

    public Input<Integer> getMinPortsPerVm() {
        return this.minPortsPerVm == null ? Input.empty() : this.minPortsPerVm;
    }

    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
     */
    @InputImport(name="natIpAllocateOption")
      private final @Nullable Input<RouterNatNatIpAllocateOption> natIpAllocateOption;

    public Input<RouterNatNatIpAllocateOption> getNatIpAllocateOption() {
        return this.natIpAllocateOption == null ? Input.empty() : this.natIpAllocateOption;
    }

    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
     * 
     */
    @InputImport(name="natIps")
      private final @Nullable Input<List<String>> natIps;

    public Input<List<String>> getNatIps() {
        return this.natIps == null ? Input.empty() : this.natIps;
    }

    /**
     * A list of rules associated with this NAT.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<RouterNatRuleArgs>> rules;

    public Input<List<RouterNatRuleArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
     */
    @InputImport(name="sourceSubnetworkIpRangesToNat")
      private final @Nullable Input<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat;

    public Input<RouterNatSourceSubnetworkIpRangesToNat> getSourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat == null ? Input.empty() : this.sourceSubnetworkIpRangesToNat;
    }

    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     * 
     */
    @InputImport(name="subnetworks")
      private final @Nullable Input<List<RouterNatSubnetworkToNatArgs>> subnetworks;

    public Input<List<RouterNatSubnetworkToNatArgs>> getSubnetworks() {
        return this.subnetworks == null ? Input.empty() : this.subnetworks;
    }

    /**
     * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
     * 
     */
    @InputImport(name="tcpEstablishedIdleTimeoutSec")
      private final @Nullable Input<Integer> tcpEstablishedIdleTimeoutSec;

    public Input<Integer> getTcpEstablishedIdleTimeoutSec() {
        return this.tcpEstablishedIdleTimeoutSec == null ? Input.empty() : this.tcpEstablishedIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
     * 
     */
    @InputImport(name="tcpTimeWaitTimeoutSec")
      private final @Nullable Input<Integer> tcpTimeWaitTimeoutSec;

    public Input<Integer> getTcpTimeWaitTimeoutSec() {
        return this.tcpTimeWaitTimeoutSec == null ? Input.empty() : this.tcpTimeWaitTimeoutSec;
    }

    /**
     * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
     * 
     */
    @InputImport(name="tcpTransitoryIdleTimeoutSec")
      private final @Nullable Input<Integer> tcpTransitoryIdleTimeoutSec;

    public Input<Integer> getTcpTransitoryIdleTimeoutSec() {
        return this.tcpTransitoryIdleTimeoutSec == null ? Input.empty() : this.tcpTransitoryIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    @InputImport(name="udpIdleTimeoutSec")
      private final @Nullable Input<Integer> udpIdleTimeoutSec;

    public Input<Integer> getUdpIdleTimeoutSec() {
        return this.udpIdleTimeoutSec == null ? Input.empty() : this.udpIdleTimeoutSec;
    }

    public RouterNatArgs(
        @Nullable Input<List<String>> drainNatIps,
        @Nullable Input<Boolean> enableDynamicPortAllocation,
        @Nullable Input<Boolean> enableEndpointIndependentMapping,
        @Nullable Input<Integer> icmpIdleTimeoutSec,
        @Nullable Input<RouterNatLogConfigArgs> logConfig,
        @Nullable Input<Integer> maxPortsPerVm,
        @Nullable Input<Integer> minPortsPerVm,
        @Nullable Input<String> name,
        @Nullable Input<RouterNatNatIpAllocateOption> natIpAllocateOption,
        @Nullable Input<List<String>> natIps,
        @Nullable Input<List<RouterNatRuleArgs>> rules,
        @Nullable Input<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat,
        @Nullable Input<List<RouterNatSubnetworkToNatArgs>> subnetworks,
        @Nullable Input<Integer> tcpEstablishedIdleTimeoutSec,
        @Nullable Input<Integer> tcpTimeWaitTimeoutSec,
        @Nullable Input<Integer> tcpTransitoryIdleTimeoutSec,
        @Nullable Input<Integer> udpIdleTimeoutSec) {
        this.drainNatIps = drainNatIps;
        this.enableDynamicPortAllocation = enableDynamicPortAllocation;
        this.enableEndpointIndependentMapping = enableEndpointIndependentMapping;
        this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
        this.logConfig = logConfig;
        this.maxPortsPerVm = maxPortsPerVm;
        this.minPortsPerVm = minPortsPerVm;
        this.name = name;
        this.natIpAllocateOption = natIpAllocateOption;
        this.natIps = natIps;
        this.rules = rules;
        this.sourceSubnetworkIpRangesToNat = sourceSubnetworkIpRangesToNat;
        this.subnetworks = subnetworks;
        this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
        this.tcpTimeWaitTimeoutSec = tcpTimeWaitTimeoutSec;
        this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
        this.udpIdleTimeoutSec = udpIdleTimeoutSec;
    }

    private RouterNatArgs() {
        this.drainNatIps = Input.empty();
        this.enableDynamicPortAllocation = Input.empty();
        this.enableEndpointIndependentMapping = Input.empty();
        this.icmpIdleTimeoutSec = Input.empty();
        this.logConfig = Input.empty();
        this.maxPortsPerVm = Input.empty();
        this.minPortsPerVm = Input.empty();
        this.name = Input.empty();
        this.natIpAllocateOption = Input.empty();
        this.natIps = Input.empty();
        this.rules = Input.empty();
        this.sourceSubnetworkIpRangesToNat = Input.empty();
        this.subnetworks = Input.empty();
        this.tcpEstablishedIdleTimeoutSec = Input.empty();
        this.tcpTimeWaitTimeoutSec = Input.empty();
        this.tcpTransitoryIdleTimeoutSec = Input.empty();
        this.udpIdleTimeoutSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> drainNatIps;
        private @Nullable Input<Boolean> enableDynamicPortAllocation;
        private @Nullable Input<Boolean> enableEndpointIndependentMapping;
        private @Nullable Input<Integer> icmpIdleTimeoutSec;
        private @Nullable Input<RouterNatLogConfigArgs> logConfig;
        private @Nullable Input<Integer> maxPortsPerVm;
        private @Nullable Input<Integer> minPortsPerVm;
        private @Nullable Input<String> name;
        private @Nullable Input<RouterNatNatIpAllocateOption> natIpAllocateOption;
        private @Nullable Input<List<String>> natIps;
        private @Nullable Input<List<RouterNatRuleArgs>> rules;
        private @Nullable Input<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat;
        private @Nullable Input<List<RouterNatSubnetworkToNatArgs>> subnetworks;
        private @Nullable Input<Integer> tcpEstablishedIdleTimeoutSec;
        private @Nullable Input<Integer> tcpTimeWaitTimeoutSec;
        private @Nullable Input<Integer> tcpTransitoryIdleTimeoutSec;
        private @Nullable Input<Integer> udpIdleTimeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatArgs defaults) {
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

        public Builder setDrainNatIps(@Nullable Input<List<String>> drainNatIps) {
            this.drainNatIps = drainNatIps;
            return this;
        }

        public Builder setDrainNatIps(@Nullable List<String> drainNatIps) {
            this.drainNatIps = Input.ofNullable(drainNatIps);
            return this;
        }

        public Builder setEnableDynamicPortAllocation(@Nullable Input<Boolean> enableDynamicPortAllocation) {
            this.enableDynamicPortAllocation = enableDynamicPortAllocation;
            return this;
        }

        public Builder setEnableDynamicPortAllocation(@Nullable Boolean enableDynamicPortAllocation) {
            this.enableDynamicPortAllocation = Input.ofNullable(enableDynamicPortAllocation);
            return this;
        }

        public Builder setEnableEndpointIndependentMapping(@Nullable Input<Boolean> enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = enableEndpointIndependentMapping;
            return this;
        }

        public Builder setEnableEndpointIndependentMapping(@Nullable Boolean enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = Input.ofNullable(enableEndpointIndependentMapping);
            return this;
        }

        public Builder setIcmpIdleTimeoutSec(@Nullable Input<Integer> icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
            return this;
        }

        public Builder setIcmpIdleTimeoutSec(@Nullable Integer icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = Input.ofNullable(icmpIdleTimeoutSec);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<RouterNatLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable RouterNatLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setMaxPortsPerVm(@Nullable Input<Integer> maxPortsPerVm) {
            this.maxPortsPerVm = maxPortsPerVm;
            return this;
        }

        public Builder setMaxPortsPerVm(@Nullable Integer maxPortsPerVm) {
            this.maxPortsPerVm = Input.ofNullable(maxPortsPerVm);
            return this;
        }

        public Builder setMinPortsPerVm(@Nullable Input<Integer> minPortsPerVm) {
            this.minPortsPerVm = minPortsPerVm;
            return this;
        }

        public Builder setMinPortsPerVm(@Nullable Integer minPortsPerVm) {
            this.minPortsPerVm = Input.ofNullable(minPortsPerVm);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNatIpAllocateOption(@Nullable Input<RouterNatNatIpAllocateOption> natIpAllocateOption) {
            this.natIpAllocateOption = natIpAllocateOption;
            return this;
        }

        public Builder setNatIpAllocateOption(@Nullable RouterNatNatIpAllocateOption natIpAllocateOption) {
            this.natIpAllocateOption = Input.ofNullable(natIpAllocateOption);
            return this;
        }

        public Builder setNatIps(@Nullable Input<List<String>> natIps) {
            this.natIps = natIps;
            return this;
        }

        public Builder setNatIps(@Nullable List<String> natIps) {
            this.natIps = Input.ofNullable(natIps);
            return this;
        }

        public Builder setRules(@Nullable Input<List<RouterNatRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<RouterNatRuleArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setSourceSubnetworkIpRangesToNat(@Nullable Input<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = sourceSubnetworkIpRangesToNat;
            return this;
        }

        public Builder setSourceSubnetworkIpRangesToNat(@Nullable RouterNatSourceSubnetworkIpRangesToNat sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = Input.ofNullable(sourceSubnetworkIpRangesToNat);
            return this;
        }

        public Builder setSubnetworks(@Nullable Input<List<RouterNatSubnetworkToNatArgs>> subnetworks) {
            this.subnetworks = subnetworks;
            return this;
        }

        public Builder setSubnetworks(@Nullable List<RouterNatSubnetworkToNatArgs> subnetworks) {
            this.subnetworks = Input.ofNullable(subnetworks);
            return this;
        }

        public Builder setTcpEstablishedIdleTimeoutSec(@Nullable Input<Integer> tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
            return this;
        }

        public Builder setTcpEstablishedIdleTimeoutSec(@Nullable Integer tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = Input.ofNullable(tcpEstablishedIdleTimeoutSec);
            return this;
        }

        public Builder setTcpTimeWaitTimeoutSec(@Nullable Input<Integer> tcpTimeWaitTimeoutSec) {
            this.tcpTimeWaitTimeoutSec = tcpTimeWaitTimeoutSec;
            return this;
        }

        public Builder setTcpTimeWaitTimeoutSec(@Nullable Integer tcpTimeWaitTimeoutSec) {
            this.tcpTimeWaitTimeoutSec = Input.ofNullable(tcpTimeWaitTimeoutSec);
            return this;
        }

        public Builder setTcpTransitoryIdleTimeoutSec(@Nullable Input<Integer> tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
            return this;
        }

        public Builder setTcpTransitoryIdleTimeoutSec(@Nullable Integer tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = Input.ofNullable(tcpTransitoryIdleTimeoutSec);
            return this;
        }

        public Builder setUdpIdleTimeoutSec(@Nullable Input<Integer> udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = udpIdleTimeoutSec;
            return this;
        }

        public Builder setUdpIdleTimeoutSec(@Nullable Integer udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = Input.ofNullable(udpIdleTimeoutSec);
            return this;
        }
        public RouterNatArgs build() {
            return new RouterNatArgs(drainNatIps, enableDynamicPortAllocation, enableEndpointIndependentMapping, icmpIdleTimeoutSec, logConfig, maxPortsPerVm, minPortsPerVm, name, natIpAllocateOption, natIps, rules, sourceSubnetworkIpRangesToNat, subnetworks, tcpEstablishedIdleTimeoutSec, tcpTimeWaitTimeoutSec, tcpTransitoryIdleTimeoutSec, udpIdleTimeoutSec);
        }
    }
}
