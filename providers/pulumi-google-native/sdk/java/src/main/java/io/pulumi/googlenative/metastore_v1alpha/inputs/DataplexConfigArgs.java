// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies how metastore metadata should be integrated with the Dataplex service.
 * 
 */
public final class DataplexConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataplexConfigArgs Empty = new DataplexConfigArgs();

    /**
     * A reference to the Lake resources that this metastore service is attached to. The key is the lake resource name. Example: projects/{project_number}/locations/{location_id}/lakes/{lake_id}.
     * 
     */
    @InputImport(name="lakeResources")
      private final @Nullable Input<Map<String,String>> lakeResources;

    public Input<Map<String,String>> getLakeResources() {
        return this.lakeResources == null ? Input.empty() : this.lakeResources;
    }

    public DataplexConfigArgs(@Nullable Input<Map<String,String>> lakeResources) {
        this.lakeResources = lakeResources;
    }

    private DataplexConfigArgs() {
        this.lakeResources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataplexConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> lakeResources;

        public Builder() {
    	      // Empty
        }

        public Builder(DataplexConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lakeResources = defaults.lakeResources;
        }

        public Builder setLakeResources(@Nullable Input<Map<String,String>> lakeResources) {
            this.lakeResources = lakeResources;
            return this;
        }

        public Builder setLakeResources(@Nullable Map<String,String> lakeResources) {
            this.lakeResources = Input.ofNullable(lakeResources);
            return this;
        }
        public DataplexConfigArgs build() {
            return new DataplexConfigArgs(lakeResources);
        }
    }
}
