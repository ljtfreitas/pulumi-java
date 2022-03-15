// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiDatasetArgs Empty = new AiDatasetArgs();

    /**
     * The user-defined name of the Dataset. The name can be up to 128 characters long and can be consist of any UTF-8 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     * Structure is documented below.
     * 
     */
    @Import(name="encryptionSpec")
      private final @Nullable Output<AiDatasetEncryptionSpecArgs> encryptionSpec;

    public Output<AiDatasetEncryptionSpecArgs> getEncryptionSpec() {
        return this.encryptionSpec == null ? Output.empty() : this.encryptionSpec;
    }

    /**
     * A set of key/value label pairs to assign to this Workflow.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
     * 
     */
    @Import(name="metadataSchemaUri", required=true)
      private final Output<String> metadataSchemaUri;

    public Output<String> getMetadataSchemaUri() {
        return this.metadataSchemaUri;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region of the dataset. eg us-central1
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    public AiDatasetArgs(
        Output<String> displayName,
        @Nullable Output<AiDatasetEncryptionSpecArgs> encryptionSpec,
        @Nullable Output<Map<String,String>> labels,
        Output<String> metadataSchemaUri,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.encryptionSpec = encryptionSpec;
        this.labels = labels;
        this.metadataSchemaUri = Objects.requireNonNull(metadataSchemaUri, "expected parameter 'metadataSchemaUri' to be non-null");
        this.project = project;
        this.region = region;
    }

    private AiDatasetArgs() {
        this.displayName = Output.empty();
        this.encryptionSpec = Output.empty();
        this.labels = Output.empty();
        this.metadataSchemaUri = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> displayName;
        private @Nullable Output<AiDatasetEncryptionSpecArgs> encryptionSpec;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> metadataSchemaUri;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(AiDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.encryptionSpec = defaults.encryptionSpec;
    	      this.labels = defaults.labels;
    	      this.metadataSchemaUri = defaults.metadataSchemaUri;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder encryptionSpec(@Nullable Output<AiDatasetEncryptionSpecArgs> encryptionSpec) {
            this.encryptionSpec = encryptionSpec;
            return this;
        }

        public Builder encryptionSpec(@Nullable AiDatasetEncryptionSpecArgs encryptionSpec) {
            this.encryptionSpec = Output.ofNullable(encryptionSpec);
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

        public Builder metadataSchemaUri(Output<String> metadataSchemaUri) {
            this.metadataSchemaUri = Objects.requireNonNull(metadataSchemaUri);
            return this;
        }

        public Builder metadataSchemaUri(String metadataSchemaUri) {
            this.metadataSchemaUri = Output.of(Objects.requireNonNull(metadataSchemaUri));
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

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public AiDatasetArgs build() {
            return new AiDatasetArgs(displayName, encryptionSpec, labels, metadataSchemaUri, project, region);
        }
    }
}
