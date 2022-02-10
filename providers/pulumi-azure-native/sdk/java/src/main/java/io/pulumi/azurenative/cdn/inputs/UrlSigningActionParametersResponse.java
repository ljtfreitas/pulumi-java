// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlSigningParamIdentifierResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UrlSigningActionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlSigningActionParametersResponse Empty = new UrlSigningActionParametersResponse();

    @InputImport(name="algorithm")
    private final @Nullable String algorithm;

    public Optional<String> getAlgorithm() {
        return this.algorithm == null ? Optional.empty() : Optional.ofNullable(this.algorithm);
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="parameterNameOverride")
    private final @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride;

    public List<UrlSigningParamIdentifierResponse> getParameterNameOverride() {
        return this.parameterNameOverride == null ? List.of() : this.parameterNameOverride;
    }

    public UrlSigningActionParametersResponse(
        @Nullable String algorithm,
        String odataType,
        @Nullable List<UrlSigningParamIdentifierResponse> parameterNameOverride) {
        this.algorithm = algorithm;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.parameterNameOverride = parameterNameOverride;
    }

    private UrlSigningActionParametersResponse() {
        this.algorithm = null;
        this.odataType = null;
        this.parameterNameOverride = List.of();
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