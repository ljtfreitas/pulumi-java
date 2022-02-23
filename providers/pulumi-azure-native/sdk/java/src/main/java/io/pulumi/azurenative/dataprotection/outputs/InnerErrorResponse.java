// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InnerErrorResponse {
    /**
     * Any Key value pairs that can be provided to the client for additional  verbose information.
     * 
     */
    private final @Nullable Map<String,String> additionalInfo;
    /**
     * Unique code for this error
     * 
     */
    private final @Nullable String code;
    /**
     * Child Inner Error, to allow Nesting.
     * 
     */
    private final @Nullable InnerErrorResponse embeddedInnerError;

    @OutputCustomType.Constructor({"additionalInfo","code","embeddedInnerError"})
    private InnerErrorResponse(
        @Nullable Map<String,String> additionalInfo,
        @Nullable String code,
        @Nullable InnerErrorResponse embeddedInnerError) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.embeddedInnerError = embeddedInnerError;
    }

    /**
     * Any Key value pairs that can be provided to the client for additional  verbose information.
     * 
     */
    public Map<String,String> getAdditionalInfo() {
        return this.additionalInfo == null ? Map.of() : this.additionalInfo;
    }
    /**
     * Unique code for this error
     * 
     */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * Child Inner Error, to allow Nesting.
     * 
     */
    public Optional<InnerErrorResponse> getEmbeddedInnerError() {
        return Optional.ofNullable(this.embeddedInnerError);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InnerErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> additionalInfo;
        private @Nullable String code;
        private @Nullable InnerErrorResponse embeddedInnerError;

        public Builder() {
    	      // Empty
        }

        public Builder(InnerErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.embeddedInnerError = defaults.embeddedInnerError;
        }

        public Builder setAdditionalInfo(@Nullable Map<String,String> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setEmbeddedInnerError(@Nullable InnerErrorResponse embeddedInnerError) {
            this.embeddedInnerError = embeddedInnerError;
            return this;
        }
        public InnerErrorResponse build() {
            return new InnerErrorResponse(additionalInfo, code, embeddedInnerError);
        }
    }
}
