// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.DdosSettingsProtectionCoverage;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains the DDoS protection settings of the public IP.
 * 
 */
public final class DdosSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DdosSettingsArgs Empty = new DdosSettingsArgs();

    /**
     * The DDoS custom policy associated with the public IP.
     * 
     */
    @InputImport(name="ddosCustomPolicy")
    private final @Nullable Input<SubResourceArgs> ddosCustomPolicy;

    public Input<SubResourceArgs> getDdosCustomPolicy() {
        return this.ddosCustomPolicy == null ? Input.empty() : this.ddosCustomPolicy;
    }

    /**
     * Enables DDoS protection on the public IP.
     * 
     */
    @InputImport(name="protectedIP")
    private final @Nullable Input<Boolean> protectedIP;

    public Input<Boolean> getProtectedIP() {
        return this.protectedIP == null ? Input.empty() : this.protectedIP;
    }

    /**
     * The DDoS protection policy customizability of the public IP. Only standard coverage will have the ability to be customized.
     * 
     */
    @InputImport(name="protectionCoverage")
    private final @Nullable Input<Either<String,DdosSettingsProtectionCoverage>> protectionCoverage;

    public Input<Either<String,DdosSettingsProtectionCoverage>> getProtectionCoverage() {
        return this.protectionCoverage == null ? Input.empty() : this.protectionCoverage;
    }

    public DdosSettingsArgs(
        @Nullable Input<SubResourceArgs> ddosCustomPolicy,
        @Nullable Input<Boolean> protectedIP,
        @Nullable Input<Either<String,DdosSettingsProtectionCoverage>> protectionCoverage) {
        this.ddosCustomPolicy = ddosCustomPolicy;
        this.protectedIP = protectedIP;
        this.protectionCoverage = protectionCoverage;
    }

    private DdosSettingsArgs() {
        this.ddosCustomPolicy = Input.empty();
        this.protectedIP = Input.empty();
        this.protectionCoverage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DdosSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> ddosCustomPolicy;
        private @Nullable Input<Boolean> protectedIP;
        private @Nullable Input<Either<String,DdosSettingsProtectionCoverage>> protectionCoverage;

        public Builder() {
    	      // Empty
        }

        public Builder(DdosSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ddosCustomPolicy = defaults.ddosCustomPolicy;
    	      this.protectedIP = defaults.protectedIP;
    	      this.protectionCoverage = defaults.protectionCoverage;
        }

        public Builder setDdosCustomPolicy(@Nullable Input<SubResourceArgs> ddosCustomPolicy) {
            this.ddosCustomPolicy = ddosCustomPolicy;
            return this;
        }

        public Builder setDdosCustomPolicy(@Nullable SubResourceArgs ddosCustomPolicy) {
            this.ddosCustomPolicy = Input.ofNullable(ddosCustomPolicy);
            return this;
        }

        public Builder setProtectedIP(@Nullable Input<Boolean> protectedIP) {
            this.protectedIP = protectedIP;
            return this;
        }

        public Builder setProtectedIP(@Nullable Boolean protectedIP) {
            this.protectedIP = Input.ofNullable(protectedIP);
            return this;
        }

        public Builder setProtectionCoverage(@Nullable Input<Either<String,DdosSettingsProtectionCoverage>> protectionCoverage) {
            this.protectionCoverage = protectionCoverage;
            return this;
        }

        public Builder setProtectionCoverage(@Nullable Either<String,DdosSettingsProtectionCoverage> protectionCoverage) {
            this.protectionCoverage = Input.ofNullable(protectionCoverage);
            return this;
        }

        public DdosSettingsArgs build() {
            return new DdosSettingsArgs(ddosCustomPolicy, protectedIP, protectionCoverage);
        }
    }
}
