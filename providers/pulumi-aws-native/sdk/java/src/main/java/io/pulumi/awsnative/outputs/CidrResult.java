// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CidrResult {
    private final List<String> subnets;

    @OutputCustomType.Constructor({"subnets"})
    private CidrResult(List<String> subnets) {
        this.subnets = Objects.requireNonNull(subnets);
    }

    public List<String> getSubnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CidrResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(CidrResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnets = defaults.subnets;
        }

        public Builder setSubnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public CidrResult build() {
            return new CidrResult(subnets);
        }
    }
}
