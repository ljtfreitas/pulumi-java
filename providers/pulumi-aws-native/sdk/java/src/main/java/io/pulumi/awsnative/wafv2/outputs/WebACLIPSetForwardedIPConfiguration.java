// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.WebACLIPSetForwardedIPConfigurationFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.WebACLIPSetForwardedIPConfigurationPosition;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class WebACLIPSetForwardedIPConfiguration {
    private final WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior;
    private final String headerName;
    private final WebACLIPSetForwardedIPConfigurationPosition position;

    @OutputCustomType.Constructor
    private WebACLIPSetForwardedIPConfiguration(
        @OutputCustomType.Parameter("fallbackBehavior") WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior,
        @OutputCustomType.Parameter("headerName") String headerName,
        @OutputCustomType.Parameter("position") WebACLIPSetForwardedIPConfigurationPosition position) {
        this.fallbackBehavior = fallbackBehavior;
        this.headerName = headerName;
        this.position = position;
    }

    public WebACLIPSetForwardedIPConfigurationFallbackBehavior getFallbackBehavior() {
        return this.fallbackBehavior;
    }
    public String getHeaderName() {
        return this.headerName;
    }
    public WebACLIPSetForwardedIPConfigurationPosition getPosition() {
        return this.position;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLIPSetForwardedIPConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior;
        private String headerName;
        private WebACLIPSetForwardedIPConfigurationPosition position;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLIPSetForwardedIPConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
    	      this.position = defaults.position;
        }

        public Builder setFallbackBehavior(WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setPosition(WebACLIPSetForwardedIPConfigurationPosition position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public WebACLIPSetForwardedIPConfiguration build() {
            return new WebACLIPSetForwardedIPConfiguration(fallbackBehavior, headerName, position);
        }
    }
}
