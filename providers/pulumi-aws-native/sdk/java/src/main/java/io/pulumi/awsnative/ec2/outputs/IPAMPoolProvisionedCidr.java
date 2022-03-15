// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IPAMPoolProvisionedCidr {
    private final String cidr;

    @CustomType.Constructor
    private IPAMPoolProvisionedCidr(@CustomType.Parameter("cidr") String cidr) {
        this.cidr = cidr;
    }

    public String getCidr() {
        return this.cidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMPoolProvisionedCidr defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMPoolProvisionedCidr defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
        }

        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        public IPAMPoolProvisionedCidr build() {
            return new IPAMPoolProvisionedCidr(cidr);
        }
    }
}
