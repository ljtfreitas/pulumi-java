// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizationActionMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizationActionMappingArgs Empty = new AuthorizationActionMappingArgs();

    @InputImport(name="desired")
    private final @Nullable Input<String> desired;

    public Input<String> getDesired() {
        return this.desired == null ? Input.empty() : this.desired;
    }

    @InputImport(name="original")
    private final @Nullable Input<String> original;

    public Input<String> getOriginal() {
        return this.original == null ? Input.empty() : this.original;
    }

    public AuthorizationActionMappingArgs(
        @Nullable Input<String> desired,
        @Nullable Input<String> original) {
        this.desired = desired;
        this.original = original;
    }

    private AuthorizationActionMappingArgs() {
        this.desired = Input.empty();
        this.original = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationActionMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> desired;
        private @Nullable Input<String> original;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationActionMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desired = defaults.desired;
    	      this.original = defaults.original;
        }

        public Builder setDesired(@Nullable Input<String> desired) {
            this.desired = desired;
            return this;
        }

        public Builder setDesired(@Nullable String desired) {
            this.desired = Input.ofNullable(desired);
            return this;
        }

        public Builder setOriginal(@Nullable Input<String> original) {
            this.original = original;
            return this;
        }

        public Builder setOriginal(@Nullable String original) {
            this.original = Input.ofNullable(original);
            return this;
        }

        public AuthorizationActionMappingArgs build() {
            return new AuthorizationActionMappingArgs(desired, original);
        }
    }
}
