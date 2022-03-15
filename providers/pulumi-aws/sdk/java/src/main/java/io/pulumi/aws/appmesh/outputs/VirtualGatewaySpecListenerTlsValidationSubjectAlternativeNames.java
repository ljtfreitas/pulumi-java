// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames {
    /**
     * The criteria for determining a SAN's match.
     * 
     */
    private final VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch match;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames(@CustomType.Parameter("match") VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch match) {
        this.match = match;
    }

    /**
     * The criteria for determining a SAN's match.
     * 
    */
    public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch getMatch() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder match(VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames build() {
            return new VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNames(match);
        }
    }
}
