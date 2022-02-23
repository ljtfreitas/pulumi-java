// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProvider;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Common Media Application Format (CMAF) encryption configuration.
 * 
 */
public final class OriginEndpointCmafEncryption extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointCmafEncryption Empty = new OriginEndpointCmafEncryption();

    /**
     * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for encrypting blocks. If you don't specify a value, then MediaPackage creates the constant initialization vector (IV).
     * 
     */
    @InputImport(name="constantInitializationVector")
        private final @Nullable String constantInitializationVector;

    public Optional<String> getConstantInitializationVector() {
        return this.constantInitializationVector == null ? Optional.empty() : Optional.ofNullable(this.constantInitializationVector);
    }

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     */
    @InputImport(name="keyRotationIntervalSeconds")
        private final @Nullable Integer keyRotationIntervalSeconds;

    public Optional<Integer> getKeyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.keyRotationIntervalSeconds);
    }

    @InputImport(name="spekeKeyProvider", required=true)
        private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    public OriginEndpointSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public OriginEndpointCmafEncryption(
        @Nullable String constantInitializationVector,
        @Nullable Integer keyRotationIntervalSeconds,
        OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.constantInitializationVector = constantInitializationVector;
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private OriginEndpointCmafEncryption() {
        this.constantInitializationVector = null;
        this.keyRotationIntervalSeconds = null;
        this.spekeKeyProvider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointCmafEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String constantInitializationVector;
        private @Nullable Integer keyRotationIntervalSeconds;
        private OriginEndpointSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointCmafEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setConstantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder setKeyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder setSpekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }
        public OriginEndpointCmafEncryption build() {
            return new OriginEndpointCmafEncryption(constantInitializationVector, keyRotationIntervalSeconds, spekeKeyProvider);
        }
    }
}
