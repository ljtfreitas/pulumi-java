// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.NetworkPolicyPeer;
import io.pulumi.kubernetes.networking.k8s.io_v1.outputs.NetworkPolicyPort;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkPolicyIngressRule {
    /**
     * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    private final @Nullable List<NetworkPolicyPeer> from;
    /**
     * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    private final @Nullable List<NetworkPolicyPort> ports;

    @OutputCustomType.Constructor({"from","ports"})
    private NetworkPolicyIngressRule(
        @Nullable List<NetworkPolicyPeer> from,
        @Nullable List<NetworkPolicyPort> ports) {
        this.from = from;
        this.ports = ports;
    }

    /**
     * List of sources which should be able to access the pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all sources (traffic not restricted by source). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the from list.
     * 
     */
    public List<NetworkPolicyPeer> getFrom() {
        return this.from == null ? List.of() : this.from;
    }
    /**
     * List of ports which should be made accessible on the pods selected for this rule. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
     * 
     */
    public List<NetworkPolicyPort> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyIngressRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NetworkPolicyPeer> from;
        private @Nullable List<NetworkPolicyPort> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyIngressRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.ports = defaults.ports;
        }

        public Builder setFrom(@Nullable List<NetworkPolicyPeer> from) {
            this.from = from;
            return this;
        }

        public Builder setPorts(@Nullable List<NetworkPolicyPort> ports) {
            this.ports = ports;
            return this;
        }
        public NetworkPolicyIngressRule build() {
            return new NetworkPolicyIngressRule(from, ports);
        }
    }
}
