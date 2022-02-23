// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs Empty = new InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs();

    /**
     * A finding's CIDR value.
     * 
     */
    @InputImport(name="cidr", required=true)
    private final Input<String> cidr;

    public Input<String> getCidr() {
        return this.cidr;
    }

    public InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs(Input<String> cidr) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
    }

    private InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs() {
        this.cidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
        }

        public Builder setCidr(Input<String> cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }

        public Builder setCidr(String cidr) {
            this.cidr = Input.of(Objects.requireNonNull(cidr));
            return this;
        }
        public InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs build() {
            return new InsightFiltersResourceAwsEc2InstanceIpv6AddressArgs(cidr);
        }
    }
}
