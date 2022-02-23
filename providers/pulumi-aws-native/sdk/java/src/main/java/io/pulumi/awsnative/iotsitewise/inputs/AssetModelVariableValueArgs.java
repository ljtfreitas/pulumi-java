// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetModelVariableValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelVariableValueArgs Empty = new AssetModelVariableValueArgs();

    @InputImport(name="hierarchyLogicalId")
        private final @Nullable Input<String> hierarchyLogicalId;

    public Input<String> getHierarchyLogicalId() {
        return this.hierarchyLogicalId == null ? Input.empty() : this.hierarchyLogicalId;
    }

    @InputImport(name="propertyLogicalId", required=true)
        private final Input<String> propertyLogicalId;

    public Input<String> getPropertyLogicalId() {
        return this.propertyLogicalId;
    }

    public AssetModelVariableValueArgs(
        @Nullable Input<String> hierarchyLogicalId,
        Input<String> propertyLogicalId) {
        this.hierarchyLogicalId = hierarchyLogicalId;
        this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId, "expected parameter 'propertyLogicalId' to be non-null");
    }

    private AssetModelVariableValueArgs() {
        this.hierarchyLogicalId = Input.empty();
        this.propertyLogicalId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelVariableValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> hierarchyLogicalId;
        private Input<String> propertyLogicalId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelVariableValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hierarchyLogicalId = defaults.hierarchyLogicalId;
    	      this.propertyLogicalId = defaults.propertyLogicalId;
        }

        public Builder setHierarchyLogicalId(@Nullable Input<String> hierarchyLogicalId) {
            this.hierarchyLogicalId = hierarchyLogicalId;
            return this;
        }

        public Builder setHierarchyLogicalId(@Nullable String hierarchyLogicalId) {
            this.hierarchyLogicalId = Input.ofNullable(hierarchyLogicalId);
            return this;
        }

        public Builder setPropertyLogicalId(Input<String> propertyLogicalId) {
            this.propertyLogicalId = Objects.requireNonNull(propertyLogicalId);
            return this;
        }

        public Builder setPropertyLogicalId(String propertyLogicalId) {
            this.propertyLogicalId = Input.of(Objects.requireNonNull(propertyLogicalId));
            return this;
        }
        public AssetModelVariableValueArgs build() {
            return new AssetModelVariableValueArgs(hierarchyLogicalId, propertyLogicalId);
        }
    }
}
