// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLForwardedIPConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebACLGeoMatchStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLGeoMatchStatement Empty = new WebACLGeoMatchStatement();

    @InputImport(name="countryCodes")
        private final @Nullable List<String> countryCodes;

    public List<String> getCountryCodes() {
        return this.countryCodes == null ? List.of() : this.countryCodes;
    }

    @InputImport(name="forwardedIPConfig")
        private final @Nullable WebACLForwardedIPConfiguration forwardedIPConfig;

    public Optional<WebACLForwardedIPConfiguration> getForwardedIPConfig() {
        return this.forwardedIPConfig == null ? Optional.empty() : Optional.ofNullable(this.forwardedIPConfig);
    }

    public WebACLGeoMatchStatement(
        @Nullable List<String> countryCodes,
        @Nullable WebACLForwardedIPConfiguration forwardedIPConfig) {
        this.countryCodes = countryCodes;
        this.forwardedIPConfig = forwardedIPConfig;
    }

    private WebACLGeoMatchStatement() {
        this.countryCodes = List.of();
        this.forwardedIPConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLGeoMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> countryCodes;
        private @Nullable WebACLForwardedIPConfiguration forwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLGeoMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
        }

        public Builder setCountryCodes(@Nullable List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        public Builder setForwardedIPConfig(@Nullable WebACLForwardedIPConfiguration forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }
        public WebACLGeoMatchStatement build() {
            return new WebACLGeoMatchStatement(countryCodes, forwardedIPConfig);
        }
    }
}
