// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of Storage Account.
 * 
 */
public final class StorageAccountPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountPropertiesArgs Empty = new StorageAccountPropertiesArgs();

    /**
     * ARM resource ID of the Azure Storage Account to store CLI specific files. If not provided one will be created. This cannot be changed once the cluster is created.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    public StorageAccountPropertiesArgs(@Nullable Output<String> resourceId) {
        this.resourceId = resourceId;
    }

    private StorageAccountPropertiesArgs() {
        this.resourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public StorageAccountPropertiesArgs build() {
            return new StorageAccountPropertiesArgs(resourceId);
        }
    }
}
