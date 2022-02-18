// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ARecordResponse {
    /**
     * The IPv4 address of this A record.
     * 
     */
    private final @Nullable String ipv4Address;

    @OutputCustomType.Constructor({"ipv4Address"})
    private ARecordResponse(@Nullable String ipv4Address) {
        this.ipv4Address = ipv4Address;
    }

    /**
     * The IPv4 address of this A record.
     * 
     */
    public Optional<String> getIpv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ARecordResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipv4Address;

        public Builder() {
    	      // Empty
        }

        public Builder(ARecordResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipv4Address = defaults.ipv4Address;
        }

        public Builder setIpv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }

        public ARecordResponse build() {
            return new ARecordResponse(ipv4Address);
        }
    }
}
