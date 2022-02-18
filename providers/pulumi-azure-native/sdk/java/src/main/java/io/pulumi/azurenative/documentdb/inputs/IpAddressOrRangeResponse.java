// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IpAddressOrRange object
 * 
 */
public final class IpAddressOrRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpAddressOrRangeResponse Empty = new IpAddressOrRangeResponse();

    /**
     * A single IPv4 address or a single IPv4 address range in CIDR format. Provided IPs must be well-formatted and cannot be contained in one of the following ranges: 10.0.0.0/8, 100.64.0.0/10, 172.16.0.0/12, 192.168.0.0/16, since these are not enforceable by the IP address filter. Example of valid inputs: “23.40.210.245” or “23.40.210.0/8”.
     * 
     */
    @InputImport(name="ipAddressOrRange")
    private final @Nullable String ipAddressOrRange;

    public Optional<String> getIpAddressOrRange() {
        return this.ipAddressOrRange == null ? Optional.empty() : Optional.ofNullable(this.ipAddressOrRange);
    }

    public IpAddressOrRangeResponse(@Nullable String ipAddressOrRange) {
        this.ipAddressOrRange = ipAddressOrRange;
    }

    private IpAddressOrRangeResponse() {
        this.ipAddressOrRange = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressOrRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddressOrRange;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressOrRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddressOrRange = defaults.ipAddressOrRange;
        }

        public Builder setIpAddressOrRange(@Nullable String ipAddressOrRange) {
            this.ipAddressOrRange = ipAddressOrRange;
            return this;
        }

        public IpAddressOrRangeResponse build() {
            return new IpAddressOrRangeResponse(ipAddressOrRange);
        }
    }
}
