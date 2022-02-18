// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.UrlSigningParamIdentifierResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UrlSigningActionParametersResponse {
    /**
     * Algorithm to use for URL signing
     * 
     */
    private final @Nullable String algorithm;
    private final String odataType;
    /**
     * Defines which query string parameters in the url to be considered for expires, key id etc.
     * 
     */
    private final @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride;

    @OutputCustomType.Constructor({"algorithm","odataType","parameterNameOverride"})
    private UrlSigningActionParametersResponse(
        @Nullable String algorithm,
        String odataType,
        @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride) {
        this.algorithm = algorithm;
        this.odataType = Objects.requireNonNull(odataType);
        this.parameterNameOverride = parameterNameOverride;
    }

    /**
     * Algorithm to use for URL signing
     * 
     */
    public Optional<String> getAlgorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Defines which query string parameters in the url to be considered for expires, key id etc.
     * 
     */
    public List<UrlSigningParamIdentifierResponse> getParameterNameOverride() {
        return this.parameterNameOverride == null ? List.of() : this.parameterNameOverride;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String algorithm;
        private String odataType;
        private @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.odataType = defaults.odataType;
    	      this.parameterNameOverride = defaults.parameterNameOverride;
        }

        public Builder setAlgorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setParameterNameOverride(@Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride) {
            this.parameterNameOverride = parameterNameOverride;
            return this;
        }

        public UrlSigningActionParametersResponse build() {
            return new UrlSigningActionParametersResponse(algorithm, odataType, parameterNameOverride);
        }
    }
}
