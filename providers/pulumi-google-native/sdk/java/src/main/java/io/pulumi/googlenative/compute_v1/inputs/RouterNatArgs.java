// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.enums.RouterNatNatIpAllocateOption;
import io.pulumi.googlenative.compute_v1.enums.RouterNatSourceSubnetworkIpRangesToNat;
import io.pulumi.googlenative.compute_v1.inputs.RouterNatLogConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.RouterNatRuleArgs;
import io.pulumi.googlenative.compute_v1.inputs.RouterNatSubnetworkToNatArgs;
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
    @Import(name="drainNatIps")
      private final @Nullable Output<List<String>> drainNatIps;

    public Output<List<String>> getDrainNatIps() {
        return this.drainNatIps == null ? Output.empty() : this.drainNatIps;
    }

    /**
     * Enable Dynamic Port Allocation. If not specified, it is disabled by default. If set to true, - Dynamic Port Allocation will be enabled on this NAT config. - enableEndpointIndependentMapping cannot be set to true. - If minPorts is set, minPortsPerVm must be set to a power of two greater than or equal to 32. If minPortsPerVm is not set, a minimum of 32 ports will be allocated to a VM from this NAT config.
     * 
     */
    @Import(name="enableDynamicPortAllocation")
      private final @Nullable Output<Boolean> enableDynamicPortAllocation;

    public Output<Boolean> getEnableDynamicPortAllocation() {
        return this.enableDynamicPortAllocation == null ? Output.empty() : this.enableDynamicPortAllocation;
    }

    @Import(name="enableEndpointIndependentMapping")
      private final @Nullable Output<Boolean> enableEndpointIndependentMapping;

    public Output<Boolean> getEnableEndpointIndependentMapping() {
        return this.enableEndpointIndependentMapping == null ? Output.empty() : this.enableEndpointIndependentMapping;
    }

    /**
     * Timeout (in seconds) for ICMP connections. Defaults to 30s if not set.
     * 
     */
    @Import(name="icmpIdleTimeoutSec")
      private final @Nullable Output<Integer> icmpIdleTimeoutSec;

    public Output<Integer> getIcmpIdleTimeoutSec() {
        return this.icmpIdleTimeoutSec == null ? Output.empty() : this.icmpIdleTimeoutSec;
    }

    /**
     * Configure logging on this NAT.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<RouterNatLogConfigArgs> logConfig;

    public Output<RouterNatLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Output.empty() : this.logConfig;
    }

    /**
     * Maximum number of ports allocated to a VM from this NAT config when Dynamic Port Allocation is enabled. If Dynamic Port Allocation is not enabled, this field has no effect. If Dynamic Port Allocation is enabled, and this field is set, it must be set to a power of two greater than minPortsPerVm, or 64 if minPortsPerVm is not set. If Dynamic Port Allocation is enabled and this field is not set, a maximum of 65536 ports will be allocated to a VM from this NAT config.
     * 
     */
    @Import(name="maxPortsPerVm")
      private final @Nullable Output<Integer> maxPortsPerVm;

    public Output<Integer> getMaxPortsPerVm() {
        return this.maxPortsPerVm == null ? Output.empty() : this.maxPortsPerVm;
    }

    /**
     * Minimum number of ports allocated to a VM from this NAT config. If not set, a default number of ports is allocated to a VM. This is rounded up to the nearest power of 2. For example, if the value of this field is 50, at least 64 ports are allocated to a VM.
     * 
     */
    @Import(name="minPortsPerVm")
      private final @Nullable Output<Integer> minPortsPerVm;

    public Output<Integer> getMinPortsPerVm() {
        return this.minPortsPerVm == null ? Output.empty() : this.minPortsPerVm;
    }

    /**
     * Unique name of this Nat service. The name must be 1-63 characters long and comply with RFC1035.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specify the NatIpAllocateOption, which can take one of the following values: - MANUAL_ONLY: Uses only Nat IP addresses provided by customers. When there are not enough specified Nat IPs, the Nat service fails for new VMs. - AUTO_ONLY: Nat IPs are allocated by Google Cloud Platform; customers can't specify any Nat IPs. When choosing AUTO_ONLY, then nat_ip should be empty.
     * 
     */
    @Import(name="natIpAllocateOption")
      private final @Nullable Output<RouterNatNatIpAllocateOption> natIpAllocateOption;

    public Output<RouterNatNatIpAllocateOption> getNatIpAllocateOption() {
        return this.natIpAllocateOption == null ? Output.empty() : this.natIpAllocateOption;
    }

    /**
     * A list of URLs of the IP resources used for this Nat service. These IP addresses must be valid static external IP addresses assigned to the project.
     * 
     */
    @Import(name="natIps")
      private final @Nullable Output<List<String>> natIps;

    public Output<List<String>> getNatIps() {
        return this.natIps == null ? Output.empty() : this.natIps;
    }

    /**
     * A list of rules associated with this NAT.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RouterNatRuleArgs>> rules;

    public Output<List<RouterNatRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * Specify the Nat option, which can take one of the following values: - ALL_SUBNETWORKS_ALL_IP_RANGES: All of the IP ranges in every Subnetwork are allowed to Nat. - ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES: All of the primary IP ranges in every Subnetwork are allowed to Nat. - LIST_OF_SUBNETWORKS: A list of Subnetworks are allowed to Nat (specified in the field subnetwork below) The default is SUBNETWORK_IP_RANGE_TO_NAT_OPTION_UNSPECIFIED. Note that if this field contains ALL_SUBNETWORKS_ALL_IP_RANGES or ALL_SUBNETWORKS_ALL_PRIMARY_IP_RANGES, then there should not be any other Router.Nat section in any Router for this network in this region.
     * 
     */
    @Import(name="sourceSubnetworkIpRangesToNat")
      private final @Nullable Output<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat;

    public Output<RouterNatSourceSubnetworkIpRangesToNat> getSourceSubnetworkIpRangesToNat() {
        return this.sourceSubnetworkIpRangesToNat == null ? Output.empty() : this.sourceSubnetworkIpRangesToNat;
    }

    /**
     * A list of Subnetwork resources whose traffic should be translated by NAT Gateway. It is used only when LIST_OF_SUBNETWORKS is selected for the SubnetworkIpRangeToNatOption above.
     * 
     */
    @Import(name="subnetworks")
      private final @Nullable Output<List<RouterNatSubnetworkToNatArgs>> subnetworks;

    public Output<List<RouterNatSubnetworkToNatArgs>> getSubnetworks() {
        return this.subnetworks == null ? Output.empty() : this.subnetworks;
    }

    /**
     * Timeout (in seconds) for TCP established connections. Defaults to 1200s if not set.
     * 
     */
    @Import(name="tcpEstablishedIdleTimeoutSec")
      private final @Nullable Output<Integer> tcpEstablishedIdleTimeoutSec;

    public Output<Integer> getTcpEstablishedIdleTimeoutSec() {
        return this.tcpEstablishedIdleTimeoutSec == null ? Output.empty() : this.tcpEstablishedIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for TCP connections that are in TIME_WAIT state. Defaults to 120s if not set.
     * 
     */
    @Import(name="tcpTimeWaitTimeoutSec")
      private final @Nullable Output<Integer> tcpTimeWaitTimeoutSec;

    public Output<Integer> getTcpTimeWaitTimeoutSec() {
        return this.tcpTimeWaitTimeoutSec == null ? Output.empty() : this.tcpTimeWaitTimeoutSec;
    }

    /**
     * Timeout (in seconds) for TCP transitory connections. Defaults to 30s if not set.
     * 
     */
    @Import(name="tcpTransitoryIdleTimeoutSec")
      private final @Nullable Output<Integer> tcpTransitoryIdleTimeoutSec;

    public Output<Integer> getTcpTransitoryIdleTimeoutSec() {
        return this.tcpTransitoryIdleTimeoutSec == null ? Output.empty() : this.tcpTransitoryIdleTimeoutSec;
    }

    /**
     * Timeout (in seconds) for UDP connections. Defaults to 30s if not set.
     * 
     */
    @Import(name="udpIdleTimeoutSec")
      private final @Nullable Output<Integer> udpIdleTimeoutSec;

    public Output<Integer> getUdpIdleTimeoutSec() {
        return this.udpIdleTimeoutSec == null ? Output.empty() : this.udpIdleTimeoutSec;
    }

    public RouterNatArgs(
        @Nullable Output<List<String>> drainNatIps,
        @Nullable Output<Boolean> enableDynamicPortAllocation,
        @Nullable Output<Boolean> enableEndpointIndependentMapping,
        @Nullable Output<Integer> icmpIdleTimeoutSec,
        @Nullable Output<RouterNatLogConfigArgs> logConfig,
        @Nullable Output<Integer> maxPortsPerVm,
        @Nullable Output<Integer> minPortsPerVm,
        @Nullable Output<String> name,
        @Nullable Output<RouterNatNatIpAllocateOption> natIpAllocateOption,
        @Nullable Output<List<String>> natIps,
        @Nullable Output<List<RouterNatRuleArgs>> rules,
        @Nullable Output<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat,
        @Nullable Output<List<RouterNatSubnetworkToNatArgs>> subnetworks,
        @Nullable Output<Integer> tcpEstablishedIdleTimeoutSec,
        @Nullable Output<Integer> tcpTimeWaitTimeoutSec,
        @Nullable Output<Integer> tcpTransitoryIdleTimeoutSec,
        @Nullable Output<Integer> udpIdleTimeoutSec) {
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
        this.drainNatIps = Output.empty();
        this.enableDynamicPortAllocation = Output.empty();
        this.enableEndpointIndependentMapping = Output.empty();
        this.icmpIdleTimeoutSec = Output.empty();
        this.logConfig = Output.empty();
        this.maxPortsPerVm = Output.empty();
        this.minPortsPerVm = Output.empty();
        this.name = Output.empty();
        this.natIpAllocateOption = Output.empty();
        this.natIps = Output.empty();
        this.rules = Output.empty();
        this.sourceSubnetworkIpRangesToNat = Output.empty();
        this.subnetworks = Output.empty();
        this.tcpEstablishedIdleTimeoutSec = Output.empty();
        this.tcpTimeWaitTimeoutSec = Output.empty();
        this.tcpTransitoryIdleTimeoutSec = Output.empty();
        this.udpIdleTimeoutSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> drainNatIps;
        private @Nullable Output<Boolean> enableDynamicPortAllocation;
        private @Nullable Output<Boolean> enableEndpointIndependentMapping;
        private @Nullable Output<Integer> icmpIdleTimeoutSec;
        private @Nullable Output<RouterNatLogConfigArgs> logConfig;
        private @Nullable Output<Integer> maxPortsPerVm;
        private @Nullable Output<Integer> minPortsPerVm;
        private @Nullable Output<String> name;
        private @Nullable Output<RouterNatNatIpAllocateOption> natIpAllocateOption;
        private @Nullable Output<List<String>> natIps;
        private @Nullable Output<List<RouterNatRuleArgs>> rules;
        private @Nullable Output<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat;
        private @Nullable Output<List<RouterNatSubnetworkToNatArgs>> subnetworks;
        private @Nullable Output<Integer> tcpEstablishedIdleTimeoutSec;
        private @Nullable Output<Integer> tcpTimeWaitTimeoutSec;
        private @Nullable Output<Integer> tcpTransitoryIdleTimeoutSec;
        private @Nullable Output<Integer> udpIdleTimeoutSec;

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

        public Builder drainNatIps(@Nullable Output<List<String>> drainNatIps) {
            this.drainNatIps = drainNatIps;
            return this;
        }

        public Builder drainNatIps(@Nullable List<String> drainNatIps) {
            this.drainNatIps = Output.ofNullable(drainNatIps);
            return this;
        }

        public Builder enableDynamicPortAllocation(@Nullable Output<Boolean> enableDynamicPortAllocation) {
            this.enableDynamicPortAllocation = enableDynamicPortAllocation;
            return this;
        }

        public Builder enableDynamicPortAllocation(@Nullable Boolean enableDynamicPortAllocation) {
            this.enableDynamicPortAllocation = Output.ofNullable(enableDynamicPortAllocation);
            return this;
        }

        public Builder enableEndpointIndependentMapping(@Nullable Output<Boolean> enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = enableEndpointIndependentMapping;
            return this;
        }

        public Builder enableEndpointIndependentMapping(@Nullable Boolean enableEndpointIndependentMapping) {
            this.enableEndpointIndependentMapping = Output.ofNullable(enableEndpointIndependentMapping);
            return this;
        }

        public Builder icmpIdleTimeoutSec(@Nullable Output<Integer> icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = icmpIdleTimeoutSec;
            return this;
        }

        public Builder icmpIdleTimeoutSec(@Nullable Integer icmpIdleTimeoutSec) {
            this.icmpIdleTimeoutSec = Output.ofNullable(icmpIdleTimeoutSec);
            return this;
        }

        public Builder logConfig(@Nullable Output<RouterNatLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(@Nullable RouterNatLogConfigArgs logConfig) {
            this.logConfig = Output.ofNullable(logConfig);
            return this;
        }

        public Builder maxPortsPerVm(@Nullable Output<Integer> maxPortsPerVm) {
            this.maxPortsPerVm = maxPortsPerVm;
            return this;
        }

        public Builder maxPortsPerVm(@Nullable Integer maxPortsPerVm) {
            this.maxPortsPerVm = Output.ofNullable(maxPortsPerVm);
            return this;
        }

        public Builder minPortsPerVm(@Nullable Output<Integer> minPortsPerVm) {
            this.minPortsPerVm = minPortsPerVm;
            return this;
        }

        public Builder minPortsPerVm(@Nullable Integer minPortsPerVm) {
            this.minPortsPerVm = Output.ofNullable(minPortsPerVm);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder natIpAllocateOption(@Nullable Output<RouterNatNatIpAllocateOption> natIpAllocateOption) {
            this.natIpAllocateOption = natIpAllocateOption;
            return this;
        }

        public Builder natIpAllocateOption(@Nullable RouterNatNatIpAllocateOption natIpAllocateOption) {
            this.natIpAllocateOption = Output.ofNullable(natIpAllocateOption);
            return this;
        }

        public Builder natIps(@Nullable Output<List<String>> natIps) {
            this.natIps = natIps;
            return this;
        }

        public Builder natIps(@Nullable List<String> natIps) {
            this.natIps = Output.ofNullable(natIps);
            return this;
        }

        public Builder rules(@Nullable Output<List<RouterNatRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<RouterNatRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }

        public Builder sourceSubnetworkIpRangesToNat(@Nullable Output<RouterNatSourceSubnetworkIpRangesToNat> sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = sourceSubnetworkIpRangesToNat;
            return this;
        }

        public Builder sourceSubnetworkIpRangesToNat(@Nullable RouterNatSourceSubnetworkIpRangesToNat sourceSubnetworkIpRangesToNat) {
            this.sourceSubnetworkIpRangesToNat = Output.ofNullable(sourceSubnetworkIpRangesToNat);
            return this;
        }

        public Builder subnetworks(@Nullable Output<List<RouterNatSubnetworkToNatArgs>> subnetworks) {
            this.subnetworks = subnetworks;
            return this;
        }

        public Builder subnetworks(@Nullable List<RouterNatSubnetworkToNatArgs> subnetworks) {
            this.subnetworks = Output.ofNullable(subnetworks);
            return this;
        }

        public Builder tcpEstablishedIdleTimeoutSec(@Nullable Output<Integer> tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = tcpEstablishedIdleTimeoutSec;
            return this;
        }

        public Builder tcpEstablishedIdleTimeoutSec(@Nullable Integer tcpEstablishedIdleTimeoutSec) {
            this.tcpEstablishedIdleTimeoutSec = Output.ofNullable(tcpEstablishedIdleTimeoutSec);
            return this;
        }

        public Builder tcpTimeWaitTimeoutSec(@Nullable Output<Integer> tcpTimeWaitTimeoutSec) {
            this.tcpTimeWaitTimeoutSec = tcpTimeWaitTimeoutSec;
            return this;
        }

        public Builder tcpTimeWaitTimeoutSec(@Nullable Integer tcpTimeWaitTimeoutSec) {
            this.tcpTimeWaitTimeoutSec = Output.ofNullable(tcpTimeWaitTimeoutSec);
            return this;
        }

        public Builder tcpTransitoryIdleTimeoutSec(@Nullable Output<Integer> tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = tcpTransitoryIdleTimeoutSec;
            return this;
        }

        public Builder tcpTransitoryIdleTimeoutSec(@Nullable Integer tcpTransitoryIdleTimeoutSec) {
            this.tcpTransitoryIdleTimeoutSec = Output.ofNullable(tcpTransitoryIdleTimeoutSec);
            return this;
        }

        public Builder udpIdleTimeoutSec(@Nullable Output<Integer> udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = udpIdleTimeoutSec;
            return this;
        }

        public Builder udpIdleTimeoutSec(@Nullable Integer udpIdleTimeoutSec) {
            this.udpIdleTimeoutSec = Output.ofNullable(udpIdleTimeoutSec);
            return this;
        }
        public RouterNatArgs build() {
            return new RouterNatArgs(drainNatIps, enableDynamicPortAllocation, enableEndpointIndependentMapping, icmpIdleTimeoutSec, logConfig, maxPortsPerVm, minPortsPerVm, name, natIpAllocateOption, natIps, rules, sourceSubnetworkIpRangesToNat, subnetworks, tcpEstablishedIdleTimeoutSec, tcpTimeWaitTimeoutSec, tcpTransitoryIdleTimeoutSec, udpIdleTimeoutSec);
        }
    }
}
