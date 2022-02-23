// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An address space to be inserted into this pool. All allocations must be made from this address space.
 * 
 */
public final class IPAMPoolProvisionedCidrArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAMPoolProvisionedCidrArgs Empty = new IPAMPoolProvisionedCidrArgs();

    @InputImport(name="cidr", required=true)
        private final Input<String> cidr;

    public Input<String> getCidr() {
        return this.cidr;
    }

    public IPAMPoolProvisionedCidrArgs(Input<String> cidr) {
        this.cidr = Objects.requireNonNull(cidr, "expected parameter 'cidr' to be non-null");
    }

    private IPAMPoolProvisionedCidrArgs() {
        this.cidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMPoolProvisionedCidrArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cidr;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMPoolProvisionedCidrArgs defaults) {
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
        public IPAMPoolProvisionedCidrArgs build() {
            return new IPAMPoolProvisionedCidrArgs(cidr);
        }
    }
}
