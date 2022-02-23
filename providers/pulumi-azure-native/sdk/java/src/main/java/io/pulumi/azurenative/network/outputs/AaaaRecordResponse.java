// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AaaaRecordResponse {
    /**
     * The IPv6 address of this AAAA record.
     * 
     */
    private final @Nullable String ipv6Address;

    @OutputCustomType.Constructor({"ipv6Address"})
    private AaaaRecordResponse(@Nullable String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    /**
     * The IPv6 address of this AAAA record.
     * 
     */
    public Optional<String> getIpv6Address() {
        return Optional.ofNullable(this.ipv6Address);
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

        public Builder setIpv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public AaaaRecordResponse build() {
            return new AaaaRecordResponse(ipv6Address);
        }
    }
}
