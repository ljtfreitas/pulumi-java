// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IpAddressOrRange object
 * 
 */
public final class IpAddressOrRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpAddressOrRangeArgs Empty = new IpAddressOrRangeArgs();

    /**
     * A single IPv4 address or a single IPv4 address range in CIDR format. Provided IPs must be well-formatted and cannot be contained in one of the following ranges: 10.0.0.0/8, 100.64.0.0/10, 172.16.0.0/12, 192.168.0.0/16, since these are not enforceable by the IP address filter. Example of valid inputs: “23.40.210.245” or “23.40.210.0/8”.
     * 
     */
    @Import(name="ipAddressOrRange")
      private final @Nullable Output<String> ipAddressOrRange;

    public Output<String> getIpAddressOrRange() {
        return this.ipAddressOrRange == null ? Output.empty() : this.ipAddressOrRange;
    }

    public IpAddressOrRangeArgs(@Nullable Output<String> ipAddressOrRange) {
        this.ipAddressOrRange = ipAddressOrRange;
    }

    private IpAddressOrRangeArgs() {
        this.ipAddressOrRange = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressOrRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddressOrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressOrRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddressOrRange = defaults.ipAddressOrRange;
        }

        public Builder ipAddressOrRange(@Nullable Output<String> ipAddressOrRange) {
            this.ipAddressOrRange = ipAddressOrRange;
            return this;
        }

        public Builder ipAddressOrRange(@Nullable String ipAddressOrRange) {
            this.ipAddressOrRange = Output.ofNullable(ipAddressOrRange);
            return this;
        }
        public IpAddressOrRangeArgs build() {
            return new IpAddressOrRangeArgs(ipAddressOrRange);
        }
    }
}
