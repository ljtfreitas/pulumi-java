// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.clouddeploy_v1.inputs.BuildArtifactArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReleaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReleaseArgs Empty = new ReleaseArgs();

    /**
     * User annotations. These attributes can only be set and used by the user, and not by Google Cloud Deploy. See https://google.aip.dev/128#annotations for more details such as format and size limitations.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<Map<String,String>> annotations;

    public Output<Map<String,String>> getAnnotations() {
        return this.annotations == null ? Output.empty() : this.annotations;
    }

    /**
     * List of artifacts to pass through to Skaffold command.
     * 
     */
    @Import(name="buildArtifacts")
      private final @Nullable Output<List<BuildArtifactArgs>> buildArtifacts;

    public Output<List<BuildArtifactArgs>> getBuildArtifacts() {
        return this.buildArtifacts == null ? Output.empty() : this.buildArtifacts;
    }

    @Import(name="deliveryPipelineId", required=true)
      private final Output<String> deliveryPipelineId;

    public Output<String> getDeliveryPipelineId() {
        return this.deliveryPipelineId;
    }

    /**
     * Description of the `Release`. Max length is 255 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * Labels are attributes that can be set and used by both the user and by Google Cloud Deploy. Labels must meet the following constraints: * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. * All characters must use UTF-8 encoding, and international characters are allowed. * Keys must start with a lowercase letter or international character. * Each resource is limited to a maximum of 64 labels. Both keys and values are additionally constrained to be <= 128 bytes.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. Name of the `Release`. Format is projects/{project}/ locations/{location}/deliveryPipelines/{deliveryPipeline}/ releases/a-z{0,62}.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="releaseId", required=true)
      private final Output<String> releaseId;

    public Output<String> getReleaseId() {
        return this.releaseId;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Filepath of the Skaffold config inside of the config URI.
     * 
     */
    @Import(name="skaffoldConfigPath")
      private final @Nullable Output<String> skaffoldConfigPath;

    public Output<String> getSkaffoldConfigPath() {
        return this.skaffoldConfigPath == null ? Output.empty() : this.skaffoldConfigPath;
    }

    /**
     * Cloud Storage URI of tar.gz archive containing Skaffold configuration.
     * 
     */
    @Import(name="skaffoldConfigUri")
      private final @Nullable Output<String> skaffoldConfigUri;

    public Output<String> getSkaffoldConfigUri() {
        return this.skaffoldConfigUri == null ? Output.empty() : this.skaffoldConfigUri;
    }

    /**
     * The Skaffold version to use when operating on this release, such as "1.20.0". Not all versions are valid; Google Cloud Deploy supports a specific set of versions. If unset, the most recent supported Skaffold version will be used.
     * 
     */
    @Import(name="skaffoldVersion")
      private final @Nullable Output<String> skaffoldVersion;

    public Output<String> getSkaffoldVersion() {
        return this.skaffoldVersion == null ? Output.empty() : this.skaffoldVersion;
    }

    @Import(name="validateOnly")
      private final @Nullable Output<String> validateOnly;

    public Output<String> getValidateOnly() {
        return this.validateOnly == null ? Output.empty() : this.validateOnly;
    }

    public ReleaseArgs(
        @Nullable Output<Map<String,String>> annotations,
        @Nullable Output<List<BuildArtifactArgs>> buildArtifacts,
        Output<String> deliveryPipelineId,
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> releaseId,
        @Nullable Output<String> requestId,
        @Nullable Output<String> skaffoldConfigPath,
        @Nullable Output<String> skaffoldConfigUri,
        @Nullable Output<String> skaffoldVersion,
        @Nullable Output<String> validateOnly) {
        this.annotations = annotations;
        this.buildArtifacts = buildArtifacts;
        this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId, "expected parameter 'deliveryPipelineId' to be non-null");
        this.description = description;
        this.etag = etag;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.releaseId = Objects.requireNonNull(releaseId, "expected parameter 'releaseId' to be non-null");
        this.requestId = requestId;
        this.skaffoldConfigPath = skaffoldConfigPath;
        this.skaffoldConfigUri = skaffoldConfigUri;
        this.skaffoldVersion = skaffoldVersion;
        this.validateOnly = validateOnly;
    }

    private ReleaseArgs() {
        this.annotations = Output.empty();
        this.buildArtifacts = Output.empty();
        this.deliveryPipelineId = Output.empty();
        this.description = Output.empty();
        this.etag = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.releaseId = Output.empty();
        this.requestId = Output.empty();
        this.skaffoldConfigPath = Output.empty();
        this.skaffoldConfigUri = Output.empty();
        this.skaffoldVersion = Output.empty();
        this.validateOnly = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> annotations;
        private @Nullable Output<List<BuildArtifactArgs>> buildArtifacts;
        private Output<String> deliveryPipelineId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> releaseId;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> skaffoldConfigPath;
        private @Nullable Output<String> skaffoldConfigUri;
        private @Nullable Output<String> skaffoldVersion;
        private @Nullable Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(ReleaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.buildArtifacts = defaults.buildArtifacts;
    	      this.deliveryPipelineId = defaults.deliveryPipelineId;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.releaseId = defaults.releaseId;
    	      this.requestId = defaults.requestId;
    	      this.skaffoldConfigPath = defaults.skaffoldConfigPath;
    	      this.skaffoldConfigUri = defaults.skaffoldConfigUri;
    	      this.skaffoldVersion = defaults.skaffoldVersion;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder annotations(@Nullable Output<Map<String,String>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = Output.ofNullable(annotations);
            return this;
        }

        public Builder buildArtifacts(@Nullable Output<List<BuildArtifactArgs>> buildArtifacts) {
            this.buildArtifacts = buildArtifacts;
            return this;
        }

        public Builder buildArtifacts(@Nullable List<BuildArtifactArgs> buildArtifacts) {
            this.buildArtifacts = Output.ofNullable(buildArtifacts);
            return this;
        }

        public Builder deliveryPipelineId(Output<String> deliveryPipelineId) {
            this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId);
            return this;
        }

        public Builder deliveryPipelineId(String deliveryPipelineId) {
            this.deliveryPipelineId = Output.of(Objects.requireNonNull(deliveryPipelineId));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder releaseId(Output<String> releaseId) {
            this.releaseId = Objects.requireNonNull(releaseId);
            return this;
        }

        public Builder releaseId(String releaseId) {
            this.releaseId = Output.of(Objects.requireNonNull(releaseId));
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder skaffoldConfigPath(@Nullable Output<String> skaffoldConfigPath) {
            this.skaffoldConfigPath = skaffoldConfigPath;
            return this;
        }

        public Builder skaffoldConfigPath(@Nullable String skaffoldConfigPath) {
            this.skaffoldConfigPath = Output.ofNullable(skaffoldConfigPath);
            return this;
        }

        public Builder skaffoldConfigUri(@Nullable Output<String> skaffoldConfigUri) {
            this.skaffoldConfigUri = skaffoldConfigUri;
            return this;
        }

        public Builder skaffoldConfigUri(@Nullable String skaffoldConfigUri) {
            this.skaffoldConfigUri = Output.ofNullable(skaffoldConfigUri);
            return this;
        }

        public Builder skaffoldVersion(@Nullable Output<String> skaffoldVersion) {
            this.skaffoldVersion = skaffoldVersion;
            return this;
        }

        public Builder skaffoldVersion(@Nullable String skaffoldVersion) {
            this.skaffoldVersion = Output.ofNullable(skaffoldVersion);
            return this;
        }

        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }

        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Output.ofNullable(validateOnly);
            return this;
        }
        public ReleaseArgs build() {
            return new ReleaseArgs(annotations, buildArtifacts, deliveryPipelineId, description, etag, labels, location, name, project, releaseId, requestId, skaffoldConfigPath, skaffoldConfigUri, skaffoldVersion, validateOnly);
        }
    }
}
