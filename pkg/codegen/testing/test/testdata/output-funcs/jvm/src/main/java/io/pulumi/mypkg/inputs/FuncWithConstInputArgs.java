// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.mypkg.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FuncWithConstInputArgs extends io.pulumi.resources.InvokeArgs {

    public static final FuncWithConstInputArgs Empty = new FuncWithConstInputArgs();

    @InputImport(name="plainInput")
    private final @Nullable String plainInput;

    public Optional<String> getPlainInput() {
        return this.plainInput == null ? Optional.empty() : Optional.ofNullable(this.plainInput);
    }

    public FuncWithConstInputArgs(@Nullable String plainInput) {
        this.plainInput = plainInput;
    }

    private FuncWithConstInputArgs() {
        this.plainInput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FuncWithConstInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String plainInput;

        public Builder() {
    	      // Empty
        }

        public Builder(FuncWithConstInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.plainInput = defaults.plainInput;
        }

        public Builder setPlainInput(@Nullable String plainInput) {
            this.plainInput = plainInput;
            return this;
        }

        public FuncWithConstInputArgs build() {
            return new FuncWithConstInputArgs(plainInput);
        }
    }
}