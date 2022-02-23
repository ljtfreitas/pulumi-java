// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStaticIpResult {
    /**
     * The instance where the static IP is attached.
     * 
     */
    private final @Nullable String attachedTo;
    /**
     * The static IP address.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * A Boolean value indicating whether the static IP is attached.
     * 
     */
    private final @Nullable Boolean isAttached;
    private final @Nullable String staticIpArn;

    @OutputCustomType.Constructor({"attachedTo","ipAddress","isAttached","staticIpArn"})
    private GetStaticIpResult(
        @Nullable String attachedTo,
        @Nullable String ipAddress,
        @Nullable Boolean isAttached,
        @Nullable String staticIpArn) {
        this.attachedTo = attachedTo;
        this.ipAddress = ipAddress;
        this.isAttached = isAttached;
        this.staticIpArn = staticIpArn;
    }

    /**
     * The instance where the static IP is attached.
     * 
     */
    public Optional<String> getAttachedTo() {
        return Optional.ofNullable(this.attachedTo);
    }
    /**
     * The static IP address.
     * 
     */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * A Boolean value indicating whether the static IP is attached.
     * 
     */
    public Optional<Boolean> getIsAttached() {
        return Optional.ofNullable(this.isAttached);
    }
    public Optional<String> getStaticIpArn() {
        return Optional.ofNullable(this.staticIpArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticIpResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String attachedTo;
        private @Nullable String ipAddress;
        private @Nullable Boolean isAttached;
        private @Nullable String staticIpArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticIpResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedTo = defaults.attachedTo;
    	      this.ipAddress = defaults.ipAddress;
    	      this.isAttached = defaults.isAttached;
    	      this.staticIpArn = defaults.staticIpArn;
        }

        public Builder setAttachedTo(@Nullable String attachedTo) {
            this.attachedTo = attachedTo;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIsAttached(@Nullable Boolean isAttached) {
            this.isAttached = isAttached;
            return this;
        }

        public Builder setStaticIpArn(@Nullable String staticIpArn) {
            this.staticIpArn = staticIpArn;
            return this;
        }
        public GetStaticIpResult build() {
            return new GetStaticIpResult(attachedTo, ipAddress, isAttached, staticIpArn);
        }
    }
}
