// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpotFleetClassicLoadBalancer {
    private final String name;

    @CustomType.Constructor
    private SpotFleetClassicLoadBalancer(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
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
