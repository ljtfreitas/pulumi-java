// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AadAuthenticationParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final AadAuthenticationParametersArgs Empty = new AadAuthenticationParametersArgs();

    @InputImport(name="aadAudience")
    private final @Nullable Input<String> aadAudience;

    public Input<String> getAadAudience() {
        return this.aadAudience == null ? Input.empty() : this.aadAudience;
    }

    @InputImport(name="aadIssuer")
    private final @Nullable Input<String> aadIssuer;

    public Input<String> getAadIssuer() {
        return this.aadIssuer == null ? Input.empty() : this.aadIssuer;
    }

    @InputImport(name="aadTenant")
    private final @Nullable Input<String> aadTenant;

    public Input<String> getAadTenant() {
        return this.aadTenant == null ? Input.empty() : this.aadTenant;
    }

    public AadAuthenticationParametersArgs(
        @Nullable Input<String> aadAudience,
        @Nullable Input<String> aadIssuer,
        @Nullable Input<String> aadTenant) {
        this.aadAudience = aadAudience;
        this.aadIssuer = aadIssuer;
        this.aadTenant = aadTenant;
    }

    private AadAuthenticationParametersArgs() {
        this.aadAudience = Input.empty();
        this.aadIssuer = Input.empty();
        this.aadTenant = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AadAuthenticationParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aadAudience;
        private @Nullable Input<String> aadIssuer;
        private @Nullable Input<String> aadTenant;

        public Builder() {
    	      // Empty
        }

        public Builder(AadAuthenticationParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAudience = defaults.aadAudience;
    	      this.aadIssuer = defaults.aadIssuer;
    	      this.aadTenant = defaults.aadTenant;
        }

        public Builder setAadAudience(@Nullable Input<String> aadAudience) {
            this.aadAudience = aadAudience;
            return this;
        }

        public Builder setAadAudience(@Nullable String aadAudience) {
            this.aadAudience = Input.ofNullable(aadAudience);
            return this;
        }

        public Builder setAadIssuer(@Nullable Input<String> aadIssuer) {
            this.aadIssuer = aadIssuer;
            return this;
        }

        public Builder setAadIssuer(@Nullable String aadIssuer) {
            this.aadIssuer = Input.ofNullable(aadIssuer);
            return this;
        }

        public Builder setAadTenant(@Nullable Input<String> aadTenant) {
            this.aadTenant = aadTenant;
            return this;
        }

        public Builder setAadTenant(@Nullable String aadTenant) {
            this.aadTenant = Input.ofNullable(aadTenant);
            return this;
        }

        public AadAuthenticationParametersArgs build() {
            return new AadAuthenticationParametersArgs(aadAudience, aadIssuer, aadTenant);
        }
    }
}