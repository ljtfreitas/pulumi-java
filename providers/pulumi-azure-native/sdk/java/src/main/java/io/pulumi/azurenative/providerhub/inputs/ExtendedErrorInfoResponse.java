// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.TypedErrorInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtendedErrorInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExtendedErrorInfoResponse Empty = new ExtendedErrorInfoResponse();

    @Import(name="additionalInfo")
      private final @Nullable List<TypedErrorInfoResponse> additionalInfo;

    public List<TypedErrorInfoResponse> getAdditionalInfo() {
        return this.additionalInfo == null ? List.of() : this.additionalInfo;
    }

    @Import(name="code")
      private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    @Import(name="details")
      private final @Nullable List<ExtendedErrorInfoResponse> details;

    public List<ExtendedErrorInfoResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }

    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @Import(name="target")
      private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    public ExtendedErrorInfoResponse(
        @Nullable List<TypedErrorInfoResponse> additionalInfo,
        @Nullable String code,
        @Nullable List<ExtendedErrorInfoResponse> details,
        @Nullable String message,
        @Nullable String target) {
        this.additionalInfo = additionalInfo;
        this.code = code;
        this.details = details;
        this.message = message;
        this.target = target;
    }

    private ExtendedErrorInfoResponse() {
        this.additionalInfo = List.of();
        this.code = null;
        this.details = List.of();
        this.message = null;
        this.target = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedErrorInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TypedErrorInfoResponse> additionalInfo;
        private @Nullable String code;
        private @Nullable List<ExtendedErrorInfoResponse> details;
        private @Nullable String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedErrorInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalInfo = defaults.additionalInfo;
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder additionalInfo(@Nullable List<TypedErrorInfoResponse> additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder details(@Nullable List<ExtendedErrorInfoResponse> details) {
            this.details = details;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ExtendedErrorInfoResponse build() {
            return new ExtendedErrorInfoResponse(additionalInfo, code, details, message, target);
        }
    }
}
