// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetStateResponseDeprecatedBy {
    /**
     * Unique Dataset identifier.
     * 
     */
    private final String datasetId;
    /**
     * Definition Version
     * 
     */
    private final @Nullable String definitionVersion;

    @OutputCustomType.Constructor({"datasetId","definitionVersion"})
    private DatasetStateResponseDeprecatedBy(
        String datasetId,
        @Nullable String definitionVersion) {
        this.datasetId = Objects.requireNonNull(datasetId);
        this.definitionVersion = definitionVersion;
    }

    /**
     * Unique Dataset identifier.
     * 
     */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * Definition Version
     * 
     */
    public Optional<String> getDefinitionVersion() {
        return Optional.ofNullable(this.definitionVersion);
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
