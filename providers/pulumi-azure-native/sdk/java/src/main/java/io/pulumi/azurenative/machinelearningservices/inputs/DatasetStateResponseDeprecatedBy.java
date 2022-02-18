// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to better Dataset or a Definition
 * 
 */
public final class DatasetStateResponseDeprecatedBy extends io.pulumi.resources.InvokeArgs {

    public static final DatasetStateResponseDeprecatedBy Empty = new DatasetStateResponseDeprecatedBy();

    /**
     * Unique Dataset identifier.
     * 
     */
    @InputImport(name="datasetId", required=true)
    private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * Definition Version
     * 
     */
    @InputImport(name="definitionVersion")
    private final @Nullable String definitionVersion;

    public Optional<String> getDefinitionVersion() {
        return this.definitionVersion == null ? Optional.empty() : Optional.ofNullable(this.definitionVersion);
    }

    public DatasetStateResponseDeprecatedBy(
        String datasetId,
        @Nullable String definitionVersion) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.definitionVersion = definitionVersion;
    }

    private DatasetStateResponseDeprecatedBy() {
        this.datasetId = null;
        this.definitionVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetStateResponseDeprecatedBy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private @Nullable String definitionVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetStateResponseDeprecatedBy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.definitionVersion = defaults.definitionVersion;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDefinitionVersion(@Nullable String definitionVersion) {
            this.definitionVersion = definitionVersion;
            return this;
        }

        public DatasetStateResponseDeprecatedBy build() {
            return new DatasetStateResponseDeprecatedBy(datasetId, definitionVersion);
        }
    }
}
