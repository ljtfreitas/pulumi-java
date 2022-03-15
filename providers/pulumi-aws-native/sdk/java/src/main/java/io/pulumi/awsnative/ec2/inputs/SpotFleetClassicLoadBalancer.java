// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetClassicLoadBalancer extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetClassicLoadBalancer Empty = new SpotFleetClassicLoadBalancer();

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public SpotFleetClassicLoadBalancer(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SpotFleetClassicLoadBalancer() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetClassicLoadBalancer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetClassicLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public SpotFleetClassicLoadBalancer build() {
            return new SpotFleetClassicLoadBalancer(name);
        }
    }
}
