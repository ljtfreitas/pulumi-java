// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SpotFleetInstanceIpv6Address {
    private final String ipv6Address;

    @CustomType.Constructor
    private SpotFleetInstanceIpv6Address(@CustomType.Parameter("ipv6Address") String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetInstanceIpv6Address defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipv6Address;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetInstanceIpv6Address defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6Address = defaults.ipv6Address;
        }

        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }
        public SpotFleetInstanceIpv6Address build() {
            return new SpotFleetInstanceIpv6Address(ipv6Address);
        }
    }
}
