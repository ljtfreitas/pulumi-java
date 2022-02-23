// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1EntityMetadataResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetApiResult {
    /**
     * User labels applied to this API Proxy.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The id of the most recently created revision for this api proxy.
     * 
     */
    private final String latestRevisionId;
    /**
     * Metadata describing the API proxy.
     * 
     */
    private final GoogleCloudApigeeV1EntityMetadataResponse metaData;
    /**
     * Name of the API proxy.
     * 
     */
    private final String name;
    /**
     * List of revisons defined for the API proxy.
     * 
     */
    private final List<String> revision;

    @OutputCustomType.Constructor({"labels","latestRevisionId","metaData","name","revision"})
    private GetApiResult(
        Map<String,String> labels,
        String latestRevisionId,
        GoogleCloudApigeeV1EntityMetadataResponse metaData,
        String name,
        List<String> revision) {
        this.labels = Objects.requireNonNull(labels);
        this.latestRevisionId = Objects.requireNonNull(latestRevisionId);
        this.metaData = Objects.requireNonNull(metaData);
        this.name = Objects.requireNonNull(name);
        this.revision = Objects.requireNonNull(revision);
    }

    /**
     * User labels applied to this API Proxy.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The id of the most recently created revision for this api proxy.
     * 
     */
    public String getLatestRevisionId() {
        return this.latestRevisionId;
    }
    /**
     * Metadata describing the API proxy.
     * 
     */
    public GoogleCloudApigeeV1EntityMetadataResponse getMetaData() {
        return this.metaData;
    }
    /**
     * Name of the API proxy.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * List of revisons defined for the API proxy.
     * 
     */
    public List<String> getRevision() {
        return this.revision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> labels;
        private String latestRevisionId;
        private GoogleCloudApigeeV1EntityMetadataResponse metaData;
        private String name;
        private List<String> revision;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
    	      this.latestRevisionId = defaults.latestRevisionId;
    	      this.metaData = defaults.metaData;
    	      this.name = defaults.name;
    	      this.revision = defaults.revision;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setLatestRevisionId(String latestRevisionId) {
            this.latestRevisionId = Objects.requireNonNull(latestRevisionId);
            return this;
        }

        public Builder setMetaData(GoogleCloudApigeeV1EntityMetadataResponse metaData) {
            this.metaData = Objects.requireNonNull(metaData);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRevision(List<String> revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public GetApiResult build() {
            return new GetApiResult(labels, latestRevisionId, metaData, name, revision);
        }
    }
}
