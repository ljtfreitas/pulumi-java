// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetModelVariableValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelVariableValueArgs Empty = new AssetModelVariableValueArgs();

    @Import(name="hierarchyLogicalId")
      private final @Nullable Output<String> hierarchyLogicalId;

    public Output<String> getHierarchyLogicalId() {
        return this.hierarchyLogicalId == null ? Output.empty() : this.hierarchyLogicalId;
    }

    @Import(name="propertyLogicalId", required=true)
      private final Output<String> propertyLogicalId;

    public Output<String> getPropertyLogicalId() {
        return this.propertyLogicalId;
    }

    public AssetModelVariableValueArgs(
        @Nullable Output<String> hierarchyLogicalId,
        Output<String> propertyLogicalId) {
        this.hierarchyLogicalId = hierarchyLogicalId;
        this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId, "expected parameter 'propertyLogicalId' to be non-null");
    }

    private AssetModelVariableValueArgs() {
        this.hierarchyLogicalId = Output.empty();
        this.propertyLogicalId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelVariableValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hierarchyLogicalId;
        private Output<String> propertyLogicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelVariableValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hierarchyLogicalId = defaults.hierarchyLogicalId;
    	      this.propertyLogicalId = defaults.propertyLogicalId;
        }

        public Builder hierarchyLogicalId(@Nullable Output<String> hierarchyLogicalId) {
            this.hierarchyLogicalId = hierarchyLogicalId;
            return this;
        }

        public Builder hierarchyLogicalId(@Nullable String hierarchyLogicalId) {
            this.hierarchyLogicalId = Output.ofNullable(hierarchyLogicalId);
            return this;
        }

        public Builder propertyLogicalId(Output<String> propertyLogicalId) {
            this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId);
            return this;
        }

        public Builder propertyLogicalId(String propertyLogicalId) {
            this.propertyLogicalId = Output.of(Objects.requireNonNull(propertyLogicalId));
            return this;
        }
        public AssetModelVariableValueArgs build() {
            return new AssetModelVariableValueArgs(hierarchyLogicalId, propertyLogicalId);
        }
    }
}
