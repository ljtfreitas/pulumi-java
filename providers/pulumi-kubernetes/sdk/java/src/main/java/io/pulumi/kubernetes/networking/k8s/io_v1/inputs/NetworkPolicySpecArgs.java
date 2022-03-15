// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyEgressRuleArgs;
import io.pulumi.kubernetes.networking.k8s.io_v1.inputs.NetworkPolicyIngressRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkPolicySpec provides the specification of a NetworkPolicy
 * 
 */
public final class NetworkPolicySpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicySpecArgs Empty = new NetworkPolicySpecArgs();

    /**
     * List of egress rules to be applied to the selected pods. Outgoing traffic is allowed if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic matches at least one egress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy limits all outgoing traffic (and serves solely to ensure that the pods it selects are isolated by default). This field is beta-level in 1.8
     * 
     */
    @Import(name="egress")
      private final @Nullable Output<List<NetworkPolicyEgressRuleArgs>> egress;

    public Output<List<NetworkPolicyEgressRuleArgs>> getEgress() {
        return this.egress == null ? Output.empty() : this.egress;
    }

    /**
     * List of ingress rules to be applied to the selected pods. Traffic is allowed to a pod if there are no NetworkPolicies selecting the pod (and cluster policy otherwise allows the traffic), OR if the traffic source is the pod's local node, OR if the traffic matches at least one ingress rule across all of the NetworkPolicy objects whose podSelector matches the pod. If this field is empty then this NetworkPolicy does not allow any traffic (and serves solely to ensure that the pods it selects are isolated by default)
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<List<NetworkPolicyIngressRuleArgs>> ingress;

    public Output<List<NetworkPolicyIngressRuleArgs>> getIngress() {
        return this.ingress == null ? Output.empty() : this.ingress;
    }

    /**
     * Selects the pods to which this NetworkPolicy object applies. The array of ingress rules is applied to any pods selected by this field. Multiple network policies can select the same set of pods. In this case, the ingress rules for each are combined additively. This field is NOT optional and follows standard label selector semantics. An empty podSelector matches all pods in this namespace.
     * 
     */
    @Import(name="podSelector", required=true)
      private final Output<LabelSelectorArgs> podSelector;

    public Output<LabelSelectorArgs> getPodSelector() {
        return this.podSelector;
    }

    /**
     * List of rule types that the NetworkPolicy relates to. Valid options are ["Ingress"], ["Egress"], or ["Ingress", "Egress"]. If this field is not specified, it will default based on the existence of Ingress or Egress rules; policies that contain an Egress section are assumed to affect Egress, and all policies (whether or not they contain an Ingress section) are assumed to affect Ingress. If you want to write an egress-only policy, you must explicitly specify policyTypes [ "Egress" ]. Likewise, if you want to write a policy that specifies that no egress is allowed, you must specify a policyTypes value that include "Egress" (since such a policy would not include an Egress section and would otherwise default to just [ "Ingress" ]). This field is beta-level in 1.8
     * 
     */
    @Import(name="policyTypes")
      private final @Nullable Output<List<String>> policyTypes;

    public Output<List<String>> getPolicyTypes() {
        return this.policyTypes == null ? Output.empty() : this.policyTypes;
    }

    public NetworkPolicySpecArgs(
        @Nullable Output<List<NetworkPolicyEgressRuleArgs>> egress,
        @Nullable Output<List<NetworkPolicyIngressRuleArgs>> ingress,
        Output<LabelSelectorArgs> podSelector,
        @Nullable Output<List<String>> policyTypes) {
        this.egress = egress;
        this.ingress = ingress;
        this.podSelector = Objects.requireNonNull(podSelector, "expected parameter 'podSelector' to be non-null");
        this.policyTypes = policyTypes;
    }

    private NetworkPolicySpecArgs() {
        this.egress = Output.empty();
        this.ingress = Output.empty();
        this.podSelector = Output.empty();
        this.policyTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkPolicyEgressRuleArgs>> egress;
        private @Nullable Output<List<NetworkPolicyIngressRuleArgs>> ingress;
        private Output<LabelSelectorArgs> podSelector;
        private @Nullable Output<List<String>> policyTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicySpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.podSelector = defaults.podSelector;
    	      this.policyTypes = defaults.policyTypes;
        }

        public Builder egress(@Nullable Output<List<NetworkPolicyEgressRuleArgs>> egress) {
            this.egress = egress;
            return this;
        }

        public Builder egress(@Nullable List<NetworkPolicyEgressRuleArgs> egress) {
            this.egress = Output.ofNullable(egress);
            return this;
        }

        public Builder ingress(@Nullable Output<List<NetworkPolicyIngressRuleArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder ingress(@Nullable List<NetworkPolicyIngressRuleArgs> ingress) {
            this.ingress = Output.ofNullable(ingress);
            return this;
        }

        public Builder podSelector(Output<LabelSelectorArgs> podSelector) {
            this.podSelector = Objects.requireNonNull(podSelector);
            return this;
        }

        public Builder podSelector(LabelSelectorArgs podSelector) {
            this.podSelector = Output.of(Objects.requireNonNull(podSelector));
            return this;
        }

        public Builder policyTypes(@Nullable Output<List<String>> policyTypes) {
            this.policyTypes = policyTypes;
            return this;
        }

        public Builder policyTypes(@Nullable List<String> policyTypes) {
            this.policyTypes = Output.ofNullable(policyTypes);
            return this;
        }
        public NetworkPolicySpecArgs build() {
            return new NetworkPolicySpecArgs(egress, ingress, podSelector, policyTypes);
        }
    }
}
