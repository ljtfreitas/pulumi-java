// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example.inputs;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Map;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import io.pulumi.core.*;
import io.pulumi.core.internal.annotations.*;
import io.pulumi.example.Utilities;
import io.pulumi.example.inputs.*;
import io.pulumi.example.outputs.*;


public final class ArgFunctionArgs extends io.pulumi.resources.InvokeArgs {

    public static final ArgFunctionArgs Empty = new ArgFunctionArgs();

    @InputImport(name="arg1")
    private final @Nullable io.pulumi.example.Resource arg1;

    public Optional<io.pulumi.example.Resource> getArg1() {
        return this.arg1 == null ? Optional.empty() : Optional.ofNullable(this.arg1);
    }

    public ArgFunctionArgs(@Nullable io.pulumi.example.Resource arg1) {
        this.arg1 = arg1;
    }

    private ArgFunctionArgs() {
        this.arg1 = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArgFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable io.pulumi.example.Resource arg1;

        public Builder() {
    	      // Empty
        }

        public Builder(ArgFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arg1 = defaults.arg1;
        }

        public Builder setArg1(@Nullable io.pulumi.example.Resource arg1) {
            this.arg1 = arg1;
            return this;
        }

        public ArgFunctionArgs build() {
            return new ArgFunctionArgs(arg1);
        }
    }
}