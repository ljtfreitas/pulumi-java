// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionPreferencesResponse {
    /**
     * Double encryption status as entered by the customer. It is compulsory to give this parameter if the 'Deny' or 'Disabled' policy is configured.
     * 
     */
    private final @Nullable String doubleEncryptionStatus;

    @OutputCustomType.Constructor({"doubleEncryptionStatus"})
    private EncryptionPreferencesResponse(@Nullable String doubleEncryptionStatus) {
        this.doubleEncryptionStatus = doubleEncryptionStatus;
    }

    /**
     * Double encryption status as entered by the customer. It is compulsory to give this parameter if the 'Deny' or 'Disabled' policy is configured.
     * 
     */
    public Optional<String> getDoubleEncryptionStatus() {
        return Optional.ofNullable(this.doubleEncryptionStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String doubleEncryptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doubleEncryptionStatus = defaults.doubleEncryptionStatus;
        }

        public Builder setDoubleEncryptionStatus(@Nullable String doubleEncryptionStatus) {
            this.doubleEncryptionStatus = doubleEncryptionStatus;
            return this;
        }
        public EncryptionPreferencesResponse build() {
            return new EncryptionPreferencesResponse(doubleEncryptionStatus);
        }
    }
}
