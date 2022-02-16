// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.RuleGroupForwardedIPConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupGeoMatchStatement {
    private final @Nullable List<String> countryCodes;
    private final @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig;

    @OutputCustomType.Constructor({"countryCodes","forwardedIPConfig"})
    private RuleGroupGeoMatchStatement(
        @Nullable List<String> countryCodes,
        @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig) {
        this.countryCodes = countryCodes;
        this.forwardedIPConfig = forwardedIPConfig;
    }

    public List<String> getCountryCodes() {
        return this.countryCodes == null ? List.of() : this.countryCodes;
    }
    public Optional<RuleGroupForwardedIPConfiguration> getForwardedIPConfig() {
        return Optional.ofNullable(this.forwardedIPConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupGeoMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> countryCodes;
        private @Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupGeoMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.countryCodes = defaults.countryCodes;
    	      this.forwardedIPConfig = defaults.forwardedIPConfig;
        }

        public Builder setCountryCodes(@Nullable List<String> countryCodes) {
            this.countryCodes = countryCodes;
            return this;
        }

        public Builder setForwardedIPConfig(@Nullable RuleGroupForwardedIPConfiguration forwardedIPConfig) {
            this.forwardedIPConfig = forwardedIPConfig;
            return this;
        }

        public RuleGroupGeoMatchStatement build() {
            return new RuleGroupGeoMatchStatement(countryCodes, forwardedIPConfig);
        }
    }
}