// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.example.Resource;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ArgFunctionResult {
    private final @Nullable Resource result;

    @CustomType.Constructor
    private ArgFunctionResult(@CustomType.Parameter("result") @Nullable Resource result) {
        this.result = result;
    }

    public Optional<Resource> getResult() {
        return Optional.ofNullable(this.result);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArgFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Resource result;

        public Builder() {
    	      // Empty
        }

        public Builder(ArgFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.result = defaults.result;
        }

        public Builder result(@Nullable Resource result) {
            this.result = result;
            return this;
        }
        public ArgFunctionResult build() {
            return new ArgFunctionResult(result);
        }
    }
}
