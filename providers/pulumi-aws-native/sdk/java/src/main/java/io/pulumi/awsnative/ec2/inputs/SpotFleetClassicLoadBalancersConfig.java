// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetClassicLoadBalancer;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class SpotFleetClassicLoadBalancersConfig extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetClassicLoadBalancersConfig Empty = new SpotFleetClassicLoadBalancersConfig();

    @InputImport(name="classicLoadBalancers", required=true)
        private final List<SpotFleetClassicLoadBalancer> classicLoadBalancers;

    public List<SpotFleetClassicLoadBalancer> getClassicLoadBalancers() {
        return this.classicLoadBalancers;
    }

    public SpotFleetClassicLoadBalancersConfig(List<SpotFleetClassicLoadBalancer> classicLoadBalancers) {
        this.classicLoadBalancers = Objects.requireNonNull(classicLoadBalancers, "expected parameter 'classicLoadBalancers' to be non-null");
    }

    private SpotFleetClassicLoadBalancersConfig() {
        this.classicLoadBalancers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetClassicLoadBalancersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<SpotFleetClassicLoadBalancer> classicLoadBalancers;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetClassicLoadBalancersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classicLoadBalancers = defaults.classicLoadBalancers;
        }

        public Builder setClassicLoadBalancers(List<SpotFleetClassicLoadBalancer> classicLoadBalancers) {
            this.classicLoadBalancers = Objects.requireNonNull(classicLoadBalancers);
            return this;
        }
        public SpotFleetClassicLoadBalancersConfig build() {
            return new SpotFleetClassicLoadBalancersConfig(classicLoadBalancers);
        }
    }
}
