// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.clouddeploy.v1.outputs.BuildArtifactResponse;
import com.pulumi.googlenative.clouddeploy.v1.outputs.DeliveryPipelineResponse;
import com.pulumi.googlenative.clouddeploy.v1.outputs.TargetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetReleaseResult {
    /**
     * @return Indicates whether this is an abandoned release.
     * 
     */
    private final Boolean abandoned;
    /**
     * @return User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    private final Map<String,String> annotations;
    /**
     * @return List of artifacts to pass through to Skaffold command.
     * 
     */
    private final List<BuildArtifactResponse> buildArtifacts;
    /**
     * @return Time at which the `Release` was created.
     * 
     */
    private final String createTime;
    /**
     * @return Snapshot of the parent pipeline taken at release creation time.
     * 
     */
    private final DeliveryPipelineResponse deliveryPipelineSnapshot;
    /**
     * @return Description of the `Release`. Max length is 255 characters.
     * 
     */
    private final String description;
    /**
     * @return This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    private final String etag;
    /**
     * @return Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Optional. Name of the `Release`. Format is projects/{project}/ locations/{location}/deliveryPipelines/{deliveryPipeline}/ releases/a-z{0,62}.
     * 
     */
    private final String name;
    /**
     * @return Time at which the render completed.
     * 
     */
    private final String renderEndTime;
    /**
     * @return Time at which the render began.
     * 
     */
    private final String renderStartTime;
    /**
     * @return Current state of the render operation.
     * 
     */
    private final String renderState;
    /**
     * @return Filepath of the Skaffold config inside of the config URI.
     * 
     */
    private final String skaffoldConfigPath;
    /**
     * @return Cloud Storage URI of tar.gz archive containing Skaffold configuration.
     * 
     */
    private final String skaffoldConfigUri;
    /**
     * @return The Skaffold version to use when operating on this release, such as &#34;1.20.0&#34;. Not all versions are valid; Google Cloud Deploy supports a specific set of versions. If unset, the most recent supported Skaffold version will be used.
     * 
     */
    private final String skaffoldVersion;
    /**
     * @return Map from target ID to the target artifacts created during the render operation.
     * 
     */
    private final Map<String,String> targetArtifacts;
    /**
     * @return Map from target ID to details of the render operation for that target.
     * 
     */
    private final Map<String,String> targetRenders;
    /**
     * @return Snapshot of the targets taken at release creation time.
     * 
     */
    private final List<TargetResponse> targetSnapshots;
    /**
     * @return Unique identifier of the `Release`.
     * 
     */
    private final String uid;

    @CustomType.Constructor
    private GetReleaseResult(
        @CustomType.Parameter("abandoned") Boolean abandoned,
        @CustomType.Parameter("annotations") Map<String,String> annotations,
        @CustomType.Parameter("buildArtifacts") List<BuildArtifactResponse> buildArtifacts,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deliveryPipelineSnapshot") DeliveryPipelineResponse deliveryPipelineSnapshot,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("renderEndTime") String renderEndTime,
        @CustomType.Parameter("renderStartTime") String renderStartTime,
        @CustomType.Parameter("renderState") String renderState,
        @CustomType.Parameter("skaffoldConfigPath") String skaffoldConfigPath,
        @CustomType.Parameter("skaffoldConfigUri") String skaffoldConfigUri,
        @CustomType.Parameter("skaffoldVersion") String skaffoldVersion,
        @CustomType.Parameter("targetArtifacts") Map<String,String> targetArtifacts,
        @CustomType.Parameter("targetRenders") Map<String,String> targetRenders,
        @CustomType.Parameter("targetSnapshots") List<TargetResponse> targetSnapshots,
        @CustomType.Parameter("uid") String uid) {
        this.abandoned = abandoned;
        this.annotations = annotations;
        this.buildArtifacts = buildArtifacts;
        this.createTime = createTime;
        this.deliveryPipelineSnapshot = deliveryPipelineSnapshot;
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.name = name;
        this.renderEndTime = renderEndTime;
        this.renderStartTime = renderStartTime;
        this.renderState = renderState;
        this.skaffoldConfigPath = skaffoldConfigPath;
        this.skaffoldConfigUri = skaffoldConfigUri;
        this.skaffoldVersion = skaffoldVersion;
        this.targetArtifacts = targetArtifacts;
        this.targetRenders = targetRenders;
        this.targetSnapshots = targetSnapshots;
        this.uid = uid;
    }

    /**
     * @return Indicates whether this is an abandoned release.
     * 
     */
    public Boolean abandoned() {
        return this.abandoned;
    }
    /**
     * @return User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    public Map<String,String> annotations() {
        return this.annotations;
    }
    /**
     * @return List of artifacts to pass through to Skaffold command.
     * 
     */
    public List<BuildArtifactResponse> buildArtifacts() {
        return this.buildArtifacts;
    }
    /**
     * @return Time at which the `Release` was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Snapshot of the parent pipeline taken at release creation time.
     * 
     */
    public DeliveryPipelineResponse deliveryPipelineSnapshot() {
        return this.deliveryPipelineSnapshot;
    }
    /**
     * @return Description of the `Release`. Max length is 255 characters.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be &lt;= 128 bytes.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Optional. Name of the `Release`. Format is projects/{project}/ locations/{location}/deliveryPipelines/{deliveryPipeline}/ releases/a-z{0,62}.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Time at which the render completed.
     * 
     */
    public String renderEndTime() {
        return this.renderEndTime;
    }
    /**
     * @return Time at which the render began.
     * 
     */
    public String renderStartTime() {
        return this.renderStartTime;
    }
    /**
     * @return Current state of the render operation.
     * 
     */
    public String renderState() {
        return this.renderState;
    }
    /**
     * @return Filepath of the Skaffold config inside of the config URI.
     * 
     */
    public String skaffoldConfigPath() {
        return this.skaffoldConfigPath;
    }
    /**
     * @return Cloud Storage URI of tar.gz archive containing Skaffold configuration.
     * 
     */
    public String skaffoldConfigUri() {
        return this.skaffoldConfigUri;
    }
    /**
     * @return The Skaffold version to use when operating on this release, such as &#34;1.20.0&#34;. Not all versions are valid; Google Cloud Deploy supports a specific set of versions. If unset, the most recent supported Skaffold version will be used.
     * 
     */
    public String skaffoldVersion() {
        return this.skaffoldVersion;
    }
    /**
     * @return Map from target ID to the target artifacts created during the render operation.
     * 
     */
    public Map<String,String> targetArtifacts() {
        return this.targetArtifacts;
    }
    /**
     * @return Map from target ID to details of the render operation for that target.
     * 
     */
    public Map<String,String> targetRenders() {
        return this.targetRenders;
    }
    /**
     * @return Snapshot of the targets taken at release creation time.
     * 
     */
    public List<TargetResponse> targetSnapshots() {
        return this.targetSnapshots;
    }
    /**
     * @return Unique identifier of the `Release`.
     * 
     */
    public String uid() {
        return this.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReleaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean abandoned;
        private Map<String,String> annotations;
        private List<BuildArtifactResponse> buildArtifacts;
        private String createTime;
        private DeliveryPipelineResponse deliveryPipelineSnapshot;
        private String description;
        private String etag;
        private Map<String,String> labels;
        private String name;
        private String renderEndTime;
        private String renderStartTime;
        private String renderState;
        private String skaffoldConfigPath;
        private String skaffoldConfigUri;
        private String skaffoldVersion;
        private Map<String,String> targetArtifacts;
        private Map<String,String> targetRenders;
        private List<TargetResponse> targetSnapshots;
        private String uid;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReleaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abandoned = defaults.abandoned;
    	      this.annotations = defaults.annotations;
    	      this.buildArtifacts = defaults.buildArtifacts;
    	      this.createTime = defaults.createTime;
    	      this.deliveryPipelineSnapshot = defaults.deliveryPipelineSnapshot;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.renderEndTime = defaults.renderEndTime;
    	      this.renderStartTime = defaults.renderStartTime;
    	      this.renderState = defaults.renderState;
    	      this.skaffoldConfigPath = defaults.skaffoldConfigPath;
    	      this.skaffoldConfigUri = defaults.skaffoldConfigUri;
    	      this.skaffoldVersion = defaults.skaffoldVersion;
    	      this.targetArtifacts = defaults.targetArtifacts;
    	      this.targetRenders = defaults.targetRenders;
    	      this.targetSnapshots = defaults.targetSnapshots;
    	      this.uid = defaults.uid;
        }

        public Builder abandoned(Boolean abandoned) {
            this.abandoned = Objects.requireNonNull(abandoned);
            return this;
        }
        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        public Builder buildArtifacts(List<BuildArtifactResponse> buildArtifacts) {
            this.buildArtifacts = Objects.requireNonNull(buildArtifacts);
            return this;
        }
        public Builder buildArtifacts(BuildArtifactResponse... buildArtifacts) {
            return buildArtifacts(List.of(buildArtifacts));
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deliveryPipelineSnapshot(DeliveryPipelineResponse deliveryPipelineSnapshot) {
            this.deliveryPipelineSnapshot = Objects.requireNonNull(deliveryPipelineSnapshot);
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
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder renderEndTime(String renderEndTime) {
            this.renderEndTime = Objects.requireNonNull(renderEndTime);
            return this;
        }
        public Builder renderStartTime(String renderStartTime) {
            this.renderStartTime = Objects.requireNonNull(renderStartTime);
            return this;
        }
        public Builder renderState(String renderState) {
            this.renderState = Objects.requireNonNull(renderState);
            return this;
        }
        public Builder skaffoldConfigPath(String skaffoldConfigPath) {
            this.skaffoldConfigPath = Objects.requireNonNull(skaffoldConfigPath);
            return this;
        }
        public Builder skaffoldConfigUri(String skaffoldConfigUri) {
            this.skaffoldConfigUri = Objects.requireNonNull(skaffoldConfigUri);
            return this;
        }
        public Builder skaffoldVersion(String skaffoldVersion) {
            this.skaffoldVersion = Objects.requireNonNull(skaffoldVersion);
            return this;
        }
        public Builder targetArtifacts(Map<String,String> targetArtifacts) {
            this.targetArtifacts = Objects.requireNonNull(targetArtifacts);
            return this;
        }
        public Builder targetRenders(Map<String,String> targetRenders) {
            this.targetRenders = Objects.requireNonNull(targetRenders);
            return this;
        }
        public Builder targetSnapshots(List<TargetResponse> targetSnapshots) {
            this.targetSnapshots = Objects.requireNonNull(targetSnapshots);
            return this;
        }
        public Builder targetSnapshots(TargetResponse... targetSnapshots) {
            return targetSnapshots(List.of(targetSnapshots));
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }        public GetReleaseResult build() {
            return new GetReleaseResult(abandoned, annotations, buildArtifacts, createTime, deliveryPipelineSnapshot, description, etag, labels, name, renderEndTime, renderStartTime, renderState, skaffoldConfigPath, skaffoldConfigUri, skaffoldVersion, targetArtifacts, targetRenders, targetSnapshots, uid);
        }
    }
}
