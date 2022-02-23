// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.aws.elasticloadbalancing.inputs.SslNegotiationPolicyAttributeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslNegotiationPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final SslNegotiationPolicyState Empty = new SslNegotiationPolicyState();

    /**
     * An SSL Negotiation policy attribute. Each has two properties:
     * 
     */
    @InputImport(name="attributes")
    private final @Nullable Input<List<SslNegotiationPolicyAttributeGetArgs>> attributes;

    public Input<List<SslNegotiationPolicyAttributeGetArgs>> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * The load balancer port to which the policy
     * should be applied. This must be an active listener on the load
     * balancer.
     * 
     */
    @InputImport(name="lbPort")
    private final @Nullable Input<Integer> lbPort;

    public Input<Integer> getLbPort() {
        return this.lbPort == null ? Input.empty() : this.lbPort;
    }

    /**
     * The load balancer to which the policy
     * should be attached.
     * 
     */
    @InputImport(name="loadBalancer")
    private final @Nullable Input<String> loadBalancer;

    public Input<String> getLoadBalancer() {
        return this.loadBalancer == null ? Input.empty() : this.loadBalancer;
    }

    /**
     * The name of the attribute
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public SslNegotiationPolicyState(
        @Nullable Input<List<SslNegotiationPolicyAttributeGetArgs>> attributes,
        @Nullable Input<Integer> lbPort,
        @Nullable Input<String> loadBalancer,
        @Nullable Input<String> name) {
        this.attributes = attributes;
        this.lbPort = lbPort;
        this.loadBalancer = loadBalancer;
        this.name = name;
    }

    private SslNegotiationPolicyState() {
        this.attributes = Input.empty();
        this.lbPort = Input.empty();
        this.loadBalancer = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslNegotiationPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SslNegotiationPolicyAttributeGetArgs>> attributes;
        private @Nullable Input<Integer> lbPort;
        private @Nullable Input<String> loadBalancer;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SslNegotiationPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.lbPort = defaults.lbPort;
    	      this.loadBalancer = defaults.loadBalancer;
    	      this.name = defaults.name;
        }

        public Builder setAttributes(@Nullable Input<List<SslNegotiationPolicyAttributeGetArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable List<SslNegotiationPolicyAttributeGetArgs> attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setLbPort(@Nullable Input<Integer> lbPort) {
            this.lbPort = lbPort;
            return this;
        }

        public Builder setLbPort(@Nullable Integer lbPort) {
            this.lbPort = Input.ofNullable(lbPort);
            return this;
        }

        public Builder setLoadBalancer(@Nullable Input<String> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        public Builder setLoadBalancer(@Nullable String loadBalancer) {
            this.loadBalancer = Input.ofNullable(loadBalancer);
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
        public SslNegotiationPolicyState build() {
            return new SslNegotiationPolicyState(attributes, lbPort, loadBalancer, name);
        }
    }
}
