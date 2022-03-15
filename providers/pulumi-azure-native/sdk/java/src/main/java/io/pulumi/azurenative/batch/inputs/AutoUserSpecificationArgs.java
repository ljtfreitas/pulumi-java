// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.AutoUserScope;
import io.pulumi.azurenative.batch.enums.ElevationLevel;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoUserSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoUserSpecificationArgs Empty = new AutoUserSpecificationArgs();

    /**
     * The default value is nonAdmin.
     * 
     */
    @Import(name="elevationLevel")
      private final @Nullable Output<ElevationLevel> elevationLevel;

    public Output<ElevationLevel> getElevationLevel() {
        return this.elevationLevel == null ? Output.empty() : this.elevationLevel;
    }

    /**
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<AutoUserScope> scope;

    public Output<AutoUserScope> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    public AutoUserSpecificationArgs(
        @Nullable Output<ElevationLevel> elevationLevel,
        @Nullable Output<AutoUserScope> scope) {
        this.elevationLevel = elevationLevel;
        this.scope = scope;
    }

    private AutoUserSpecificationArgs() {
        this.elevationLevel = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoUserSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ElevationLevel> elevationLevel;
        private @Nullable Output<AutoUserScope> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoUserSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elevationLevel = defaults.elevationLevel;
    	      this.scope = defaults.scope;
        }

        public Builder elevationLevel(@Nullable Output<ElevationLevel> elevationLevel) {
            this.elevationLevel = elevationLevel;
            return this;
        }

        public Builder elevationLevel(@Nullable ElevationLevel elevationLevel) {
            this.elevationLevel = Output.ofNullable(elevationLevel);
            return this;
        }

        public Builder scope(@Nullable Output<AutoUserScope> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable AutoUserScope scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }
        public AutoUserSpecificationArgs build() {
            return new AutoUserSpecificationArgs(elevationLevel, scope);
        }
    }
}
