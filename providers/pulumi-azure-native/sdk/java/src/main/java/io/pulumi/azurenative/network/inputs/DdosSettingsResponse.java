// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the DDoS protection settings of the public IP.
 * 
 */
public final class DdosSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DdosSettingsResponse Empty = new DdosSettingsResponse();

    /**
     * The DDoS custom policy associated with the public IP.
     * 
     */
    @InputImport(name="ddosCustomPolicy")
    private final @Nullable SubResourceResponse ddosCustomPolicy;

    public Optional<SubResourceResponse> getDdosCustomPolicy() {
        return this.ddosCustomPolicy == null ? Optional.empty() : Optional.ofNullable(this.ddosCustomPolicy);
    }

    /**
     * Enables DDoS protection on the public IP.
     * 
     */
    @InputImport(name="protectedIP")
    private final @Nullable Boolean protectedIP;

    public Optional<Boolean> getProtectedIP() {
        return this.protectedIP == null ? Optional.empty() : Optional.ofNullable(this.protectedIP);
    }

    /**
     * The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized.
     * 
     */
    @InputImport(name="protectionCoverage")
    private final @Nullable String protectionCoverage;

    public Optional<String> getProtectionCoverage() {
        return this.protectionCoverage == null ? Optional.empty() : Optional.ofNullable(this.protectionCoverage);
    }

    public DdosSettingsResponse(
        @Nullable SubResourceResponse ddosCustomPolicy,
        @Nullable Boolean protectedIP,
        @Nullable String protectionCoverage) {
        this.ddosCustomPolicy = ddosCustomPolicy;
        this.protectedIP = protectedIP;
        this.protectionCoverage = protectionCoverage;
    }

    private DdosSettingsResponse() {
        this.ddosCustomPolicy = null;
        this.protectedIP = null;
        this.protectionCoverage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DdosSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse ddosCustomPolicy;
        private @Nullable Boolean protectedIP;
        private @Nullable String protectionCoverage;

        public Builder() {
    	      // Empty
        }

        public Builder(DdosSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosCustomPolicy = defaults.ddosCustomPolicy;
    	      this.protectedIP = defaults.protectedIP;
    	      this.protectionCoverage = defaults.protectionCoverage;
        }

        public Builder setDdosCustomPolicy(@Nullable SubResourceResponse ddosCustomPolicy) {
            this.ddosCustomPolicy = ddosCustomPolicy;
            return this;
        }

        public Builder setProtectedIP(@Nullable Boolean protectedIP) {
            this.protectedIP = protectedIP;
            return this;
        }

        public Builder setProtectionCoverage(@Nullable String protectionCoverage) {
            this.protectionCoverage = protectionCoverage;
            return this;
        }

        public DdosSettingsResponse build() {
            return new DdosSettingsResponse(ddosCustomPolicy, protectedIP, protectionCoverage);
        }
    }
}
