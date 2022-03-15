// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.DatasetResponseLatest;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetStateResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Machine Learning dataset object.
 * 
 */
public final class DatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatasetResponse Empty = new DatasetResponse();

    /**
     * The dataset creation time (UTC).
     * 
     */
    @Import(name="createdTime", required=true)
      private final String createdTime;

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Unique Dataset identifier.
     * 
     */
    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * Dataset state
     * 
     */
    @Import(name="datasetState")
      private final @Nullable DatasetStateResponse datasetState;

    public Optional<DatasetStateResponse> getDatasetState() {
        return this.datasetState == null ? Optional.empty() : Optional.ofNullable(this.datasetState);
    }

    /**
     * Dataset Type.
     * 
     */
    @Import(name="datasetType", required=true)
      private final String datasetType;

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * Name of the default compute to be used for any Dataset actions (such as Profile, Write).
     * 
     */
    @Import(name="defaultCompute", required=true)
      private final String defaultCompute;

    public String getDefaultCompute() {
        return this.defaultCompute;
    }

    /**
     * Description about this dataset version.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * eTag description
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Flag to hide Dataset in UI
     * 
     */
    @Import(name="isVisible", required=true)
      private final Boolean isVisible;

    public Boolean getIsVisible() {
        return this.isVisible;
    }

    /**
     * Last created Dataset definition.
     * 
     */
    @Import(name="latest")
      private final @Nullable DatasetResponseLatest latest;

    public Optional<DatasetResponseLatest> getLatest() {
        return this.latest == null ? Optional.empty() : Optional.ofNullable(this.latest);
    }

    /**
     * The dataset last modified time (UTC).
     * 
     */
    @Import(name="modifiedTime", required=true)
      private final String modifiedTime;

    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Unique dataset name
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Tags for this dataset version.
     * 
     */
    @Import(name="tags", required=true)
      private final Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags;
    }

    public DatasetResponse(
        String createdTime,
        String datasetId,
        @Nullable DatasetStateResponse datasetState,
        String datasetType,
        String defaultCompute,
        String description,
        String etag,
        Boolean isVisible,
        @Nullable DatasetResponseLatest latest,
        String modifiedTime,
        String name,
        Map<String,String> tags) {
        this.createdTime = Objects.requireNonNull(createdTime, "expected parameter 'createdTime' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.datasetState = datasetState;
        this.datasetType = Objects.requireNonNull(datasetType, "expected parameter 'datasetType' to be non-null");
        this.defaultCompute = Objects.requireNonNull(defaultCompute, "expected parameter 'defaultCompute' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.isVisible = Objects.requireNonNull(isVisible, "expected parameter 'isVisible' to be non-null");
        this.latest = latest;
        this.modifiedTime = Objects.requireNonNull(modifiedTime, "expected parameter 'modifiedTime' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
    }

    private DatasetResponse() {
        this.createdTime = null;
        this.datasetId = null;
        this.datasetState = null;
        this.datasetType = null;
        this.defaultCompute = null;
        this.description = null;
        this.etag = null;
        this.isVisible = null;
        this.latest = null;
        this.modifiedTime = null;
        this.name = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdTime;
        private String datasetId;
        private @Nullable DatasetStateResponse datasetState;
        private String datasetType;
        private String defaultCompute;
        private String description;
        private String etag;
        private Boolean isVisible;
        private @Nullable DatasetResponseLatest latest;
        private String modifiedTime;
        private String name;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.datasetId = defaults.datasetId;
    	      this.datasetState = defaults.datasetState;
    	      this.datasetType = defaults.datasetType;
    	      this.defaultCompute = defaults.defaultCompute;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.isVisible = defaults.isVisible;
    	      this.latest = defaults.latest;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder createdTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetState(@Nullable DatasetStateResponse datasetState) {
            this.datasetState = datasetState;
            return this;
        }

        public Builder datasetType(String datasetType) {
            this.datasetType = Objects.requireNonNull(datasetType);
            return this;
        }

        public Builder defaultCompute(String defaultCompute) {
            this.defaultCompute = Objects.requireNonNull(defaultCompute);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder isVisible(Boolean isVisible) {
            this.isVisible = Objects.requireNonNull(isVisible);
            return this;
        }

        public Builder latest(@Nullable DatasetResponseLatest latest) {
            this.latest = latest;
            return this;
        }

        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public DatasetResponse build() {
            return new DatasetResponse(createdTime, datasetId, datasetState, datasetType, defaultCompute, description, etag, isVisible, latest, modifiedTime, name, tags);
        }
    }
}
