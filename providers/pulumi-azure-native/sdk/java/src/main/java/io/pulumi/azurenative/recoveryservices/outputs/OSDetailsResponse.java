// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OSDetailsResponse {
    /**
     * The OS Major Version.
     * 
     */
    private final @Nullable String oSMajorVersion;
    /**
     * The OS Minor Version.
     * 
     */
    private final @Nullable String oSMinorVersion;
    /**
     * The OS Version.
     * 
     */
    private final @Nullable String oSVersion;
    /**
     * The OSEdition.
     * 
     */
    private final @Nullable String osEdition;
    /**
     * VM Disk details.
     * 
     */
    private final @Nullable String osType;
    /**
     * Product type.
     * 
     */
    private final @Nullable String productType;

    @CustomType.Constructor
    private OSDetailsResponse(
        @CustomType.Parameter("oSMajorVersion") @Nullable String oSMajorVersion,
        @CustomType.Parameter("oSMinorVersion") @Nullable String oSMinorVersion,
        @CustomType.Parameter("oSVersion") @Nullable String oSVersion,
        @CustomType.Parameter("osEdition") @Nullable String osEdition,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("productType") @Nullable String productType) {
        this.oSMajorVersion = oSMajorVersion;
        this.oSMinorVersion = oSMinorVersion;
        this.oSVersion = oSVersion;
        this.osEdition = osEdition;
        this.osType = osType;
        this.productType = productType;
    }

    /**
     * The OS Major Version.
     * 
    */
    public Optional<String> getOSMajorVersion() {
        return Optional.ofNullable(this.oSMajorVersion);
    }
    /**
     * The OS Minor Version.
     * 
    */
    public Optional<String> getOSMinorVersion() {
        return Optional.ofNullable(this.oSMinorVersion);
    }
    /**
     * The OS Version.
     * 
    */
    public Optional<String> getOSVersion() {
        return Optional.ofNullable(this.oSVersion);
    }
    /**
     * The OSEdition.
     * 
    */
    public Optional<String> getOsEdition() {
        return Optional.ofNullable(this.osEdition);
    }
    /**
     * VM Disk details.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * Product type.
     * 
    */
    public Optional<String> getProductType() {
        return Optional.ofNullable(this.productType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oSMajorVersion;
        private @Nullable String oSMinorVersion;
        private @Nullable String oSVersion;
        private @Nullable String osEdition;
        private @Nullable String osType;
        private @Nullable String productType;

        public Builder() {
    	      // Empty
        }

        public Builder(OSDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oSMajorVersion = defaults.oSMajorVersion;
    	      this.oSMinorVersion = defaults.oSMinorVersion;
    	      this.oSVersion = defaults.oSVersion;
    	      this.osEdition = defaults.osEdition;
    	      this.osType = defaults.osType;
    	      this.productType = defaults.productType;
        }

        public Builder oSMajorVersion(@Nullable String oSMajorVersion) {
            this.oSMajorVersion = oSMajorVersion;
            return this;
        }

        public Builder oSMinorVersion(@Nullable String oSMinorVersion) {
            this.oSMinorVersion = oSMinorVersion;
            return this;
        }

        public Builder oSVersion(@Nullable String oSVersion) {
            this.oSVersion = oSVersion;
            return this;
        }

        public Builder osEdition(@Nullable String osEdition) {
            this.osEdition = osEdition;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder productType(@Nullable String productType) {
            this.productType = productType;
            return this;
        }
        public OSDetailsResponse build() {
            return new OSDetailsResponse(oSMajorVersion, oSMinorVersion, oSVersion, osEdition, osType, productType);
        }
    }
}
