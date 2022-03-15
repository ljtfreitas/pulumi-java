// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.notebooks_v1.enums.RuntimeAccessConfigAccessType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the login configuration for Runtime
 * 
 */
public final class RuntimeAccessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeAccessConfigArgs Empty = new RuntimeAccessConfigArgs();

    /**
     * The type of access mode this instance.
     * 
     */
    @Import(name="accessType")
      private final @Nullable Output<RuntimeAccessConfigAccessType> accessType;

    public Output<RuntimeAccessConfigAccessType> getAccessType() {
        return this.accessType == null ? Output.empty() : this.accessType;
    }

    /**
     * The owner of this runtime after creation. Format: `alias@example.com` Currently supports one owner only.
     * 
     */
    @Import(name="runtimeOwner")
      private final @Nullable Output<String> runtimeOwner;

    public Output<String> getRuntimeOwner() {
        return this.runtimeOwner == null ? Output.empty() : this.runtimeOwner;
    }

    public RuntimeAccessConfigArgs(
        @Nullable Output<RuntimeAccessConfigAccessType> accessType,
        @Nullable Output<String> runtimeOwner) {
        this.accessType = accessType;
        this.runtimeOwner = runtimeOwner;
    }

    private RuntimeAccessConfigArgs() {
        this.accessType = Output.empty();
        this.runtimeOwner = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuntimeAccessConfigAccessType> accessType;
        private @Nullable Output<String> runtimeOwner;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeAccessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.runtimeOwner = defaults.runtimeOwner;
        }

        public Builder accessType(@Nullable Output<RuntimeAccessConfigAccessType> accessType) {
            this.accessType = accessType;
            return this;
        }

        public Builder accessType(@Nullable RuntimeAccessConfigAccessType accessType) {
            this.accessType = Output.ofNullable(accessType);
            return this;
        }

        public Builder runtimeOwner(@Nullable Output<String> runtimeOwner) {
            this.runtimeOwner = runtimeOwner;
            return this;
        }

        public Builder runtimeOwner(@Nullable String runtimeOwner) {
            this.runtimeOwner = Output.ofNullable(runtimeOwner);
            return this;
        }
        public RuntimeAccessConfigArgs build() {
            return new RuntimeAccessConfigArgs(accessType, runtimeOwner);
        }
    }
}
