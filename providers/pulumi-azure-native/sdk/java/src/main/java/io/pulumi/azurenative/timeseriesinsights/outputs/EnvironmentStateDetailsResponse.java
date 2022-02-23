// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentStateDetailsResponse {
    /**
     * Contains the code that represents the reason of an environment being in a particular state. Can be used to programmatically handle specific cases.
     * 
     */
    private final @Nullable String code;
    /**
     * A message that describes the state in detail.
     * 
     */
    private final @Nullable String message;

    @OutputCustomType.Constructor({"code","message"})
    private EnvironmentStateDetailsResponse(
        @Nullable String code,
        @Nullable String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Contains the code that represents the reason of an environment being in a particular state. Can be used to programmatically handle specific cases.
     * 
     */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * A message that describes the state in detail.
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentStateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentStateDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }
        public EnvironmentStateDetailsResponse build() {
            return new EnvironmentStateDetailsResponse(code, message);
        }
    }
}
