// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An AAAA record.
 * 
 */
public final class AaaaRecordResponse extends io.pulumi.resources.InvokeArgs {

    public static final AaaaRecordResponse Empty = new AaaaRecordResponse();

    /**
     * The IPv6 address of this AAAA record.
     * 
     */
    @Import(name="ipv6Address")
      private final @Nullable String ipv6Address;

    public Optional<String> getIpv6Address() {
        return this.ipv6Address == null ? Optional.empty() : Optional.ofNullable(this.ipv6Address);
    }

    public AaaaRecordResponse(@Nullable String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    private AaaaRecordResponse() {
        this.ipv6Address = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AaaaRecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipv6Address;

        public Builder() {
    	      // Empty
        }

        public Builder(AaaaRecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv6Address = defaults.ipv6Address;
        }

        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public AaaaRecordResponse build() {
            return new AaaaRecordResponse(ipv6Address);
        }
    }
}
