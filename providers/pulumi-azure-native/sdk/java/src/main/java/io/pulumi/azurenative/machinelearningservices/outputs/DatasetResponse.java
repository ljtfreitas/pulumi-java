// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.DatasetResponseLatest;
import io.pulumi.azurenative.machinelearningservices.outputs.DatasetStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetResponse {
    /**
     * The dataset creation time (UTC).
     * 
     */
    private final String createdTime;
    /**
     * Unique Dataset identifier.
     * 
     */
    private final String datasetId;
    /**
     * Dataset state
     * 
     */
    private final @Nullable DatasetStateResponse datasetState;
    /**
     * Dataset Type.
     * 
     */
    private final String datasetType;
    /**
     * Name of the default compute to be used for any Dataset actions (such as Profile, Write).
     * 
     */
    private final String defaultCompute;
    /**
     * Description about this dataset version.
     * 
     */
    private final String description;
    /**
     * eTag description
     * 
     */
    private final String etag;
    /**
     * Flag to hide Dataset in UI
     * 
     */
    private final Boolean isVisible;
    /**
     * Last created Dataset definition.
     * 
     */
    private final @Nullable DatasetResponseLatest latest;
    /**
     * The dataset last modified time (UTC).
     * 
     */
    private final String modifiedTime;
    /**
     * Unique dataset name
     * 
     */
    private final String name;
    /**
     * Tags for this dataset version.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"createdTime","datasetId","datasetState","datasetType","defaultCompute","description","etag","isVisible","latest","modifiedTime","name","tags"})
    private DatasetResponse(
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
        this.createdTime = Objects.requireNonNull(createdTime);
        this.datasetId = Objects.requireNonNull(datasetId);
        this.datasetState = datasetState;
        this.datasetType = Objects.requireNonNull(datasetType);
        this.defaultCompute = Objects.requireNonNull(defaultCompute);
        this.description = Objects.requireNonNull(description);
        this.etag = Objects.requireNonNull(etag);
        this.isVisible = Objects.requireNonNull(isVisible);
        this.latest = latest;
        this.modifiedTime = Objects.requireNonNull(modifiedTime);
        this.name = Objects.requireNonNull(name);
        this.tags = Objects.requireNonNull(tags);
    }

    /**
     * The dataset creation time (UTC).
     * 
     */
    public String getCreatedTime() {
        return this.createdTime;
    }
    /**
     * Unique Dataset identifier.
     * 
     */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * Dataset state
     * 
     */
    public Optional<DatasetStateResponse> getDatasetState() {
        return Optional.ofNullable(this.datasetState);
    }
    /**
     * Dataset Type.
     * 
     */
    public String getDatasetType() {
        return this.datasetType;
    }
    /**
     * Name of the default compute to be used for any Dataset actions (such as Profile, Write).
     * 
     */
    public String getDefaultCompute() {
        return this.defaultCompute;
    }
    /**
     * Description about this dataset version.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * eTag description
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Flag to hide Dataset in UI
     * 
     */
    public Boolean getIsVisible() {
        return this.isVisible;
    }
    /**
     * Last created Dataset definition.
     * 
     */
    public Optional<DatasetResponseLatest> getLatest() {
        return Optional.ofNullable(this.latest);
    }
    /**
     * The dataset last modified time (UTC).
     * 
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }
    /**
     * Unique dataset name
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Tags for this dataset version.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
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

        public Builder setCreatedTime(String createdTime) {
            this.createdTime = Objects.requireNonNull(createdTime);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetState(@Nullable DatasetStateResponse datasetState) {
            this.datasetState = datasetState;
            return this;
        }

        public Builder setDatasetType(String datasetType) {
            this.datasetType = Objects.requireNonNull(datasetType);
            return this;
        }

        public Builder setDefaultCompute(String defaultCompute) {
            this.defaultCompute = Objects.requireNonNull(defaultCompute);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setIsVisible(Boolean isVisible) {
            this.isVisible = Objects.requireNonNull(isVisible);
            return this;
        }

        public Builder setLatest(@Nullable DatasetResponseLatest latest) {
            this.latest = latest;
            return this;
        }

        public Builder setModifiedTime(String modifiedTime) {
            this.modifiedTime = Objects.requireNonNull(modifiedTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public DatasetResponse build() {
            return new DatasetResponse(createdTime, datasetId, datasetState, datasetType, defaultCompute, description, etag, isVisible, latest, modifiedTime, name, tags);
        }
    }
}
