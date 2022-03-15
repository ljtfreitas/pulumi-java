// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption-in-transit properties.
 * 
 */
public final class EncryptionInTransitPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionInTransitPropertiesResponse Empty = new EncryptionInTransitPropertiesResponse();

    /**
     * Indicates whether or not inter cluster node communication is encrypted in transit.
     * 
     */
    @Import(name="isEncryptionInTransitEnabled")
      private final @Nullable Boolean isEncryptionInTransitEnabled;

    public Optional<Boolean> getIsEncryptionInTransitEnabled() {
        return this.isEncryptionInTransitEnabled == null ? Optional.empty() : Optional.ofNullable(this.isEncryptionInTransitEnabled);
    }

    public EncryptionInTransitPropertiesResponse(@Nullable Boolean isEncryptionInTransitEnabled) {
        this.isEncryptionInTransitEnabled = isEncryptionInTransitEnabled == null ? false : isEncryptionInTransitEnabled;
    }

    private EncryptionInTransitPropertiesResponse() {
        this.isEncryptionInTransitEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionInTransitPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isEncryptionInTransitEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionInTransitPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEncryptionInTransitEnabled = defaults.isEncryptionInTransitEnabled;
        }

        public Builder isEncryptionInTransitEnabled(@Nullable Boolean isEncryptionInTransitEnabled) {
            this.isEncryptionInTransitEnabled = isEncryptionInTransitEnabled;
            return this;
        }
        public EncryptionInTransitPropertiesResponse build() {
            return new EncryptionInTransitPropertiesResponse(isEncryptionInTransitEnabled);
        }
    }
}
