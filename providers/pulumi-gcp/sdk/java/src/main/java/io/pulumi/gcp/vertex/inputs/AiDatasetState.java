// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.vertex.inputs.AiDatasetEncryptionSpecGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiDatasetState extends io.pulumi.resources.ResourceArgs {

    public static final AiDatasetState Empty = new AiDatasetState();

    /**
     * The timestamp of when the dataset was created in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine
     * fractional digits.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * The user-defined name of the Dataset. The name can be up to 128 characters long and can be consist of any UTF-8 characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Customer-managed encryption key spec for a Dataset. If set, this Dataset and all sub-resources of this Dataset will be secured by this key.
     * Structure is documented below.
     * 
     */
    @Import(name="encryptionSpec")
      private final @Nullable Output<AiDatasetEncryptionSpecGetArgs> encryptionSpec;

    public Output<AiDatasetEncryptionSpecGetArgs> encryptionSpec() {
        return this.encryptionSpec == null ? Codegen.empty() : this.encryptionSpec;
    }

    /**
     * A set of key/value label pairs to assign to this Workflow.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Points to a YAML file stored on Google Cloud Storage describing additional information about the Dataset. The schema is defined as an OpenAPI 3.0.2 Schema Object. The schema files that can be used here are found in gs://google-cloud-aiplatform/schema/dataset/metadata/.
     * 
     */
    @Import(name="metadataSchemaUri")
      private final @Nullable Output<String> metadataSchemaUri;

    public Output<String> metadataSchemaUri() {
        return this.metadataSchemaUri == null ? Codegen.empty() : this.metadataSchemaUri;
    }

    /**
     * The resource name of the Dataset. This value is set by Google.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region of the dataset. eg us-central1
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The timestamp of when the dataset was last updated in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to
     * nine fractional digits.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    public AiDatasetState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> displayName,
        @Nullable Output<AiDatasetEncryptionSpecGetArgs> encryptionSpec,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> metadataSchemaUri,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.displayName = displayName;
        this.encryptionSpec = encryptionSpec;
        this.labels = labels;
        this.metadataSchemaUri = metadataSchemaUri;
        this.name = name;
        this.project = project;
        this.region = region;
        this.updateTime = updateTime;
    }

    private AiDatasetState() {
        this.createTime = Codegen.empty();
        this.displayName = Codegen.empty();
        this.encryptionSpec = Codegen.empty();
        this.labels = Codegen.empty();
        this.metadataSchemaUri = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.updateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiDatasetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> displayName;
        private @Nullable Output<AiDatasetEncryptionSpecGetArgs> encryptionSpec;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> metadataSchemaUri;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AiDatasetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.displayName = defaults.displayName;
    	      this.encryptionSpec = defaults.encryptionSpec;
    	      this.labels = defaults.labels;
    	      this.metadataSchemaUri = defaults.metadataSchemaUri;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder encryptionSpec(@Nullable Output<AiDatasetEncryptionSpecGetArgs> encryptionSpec) {
            this.encryptionSpec = encryptionSpec;
            return this;
        }
        public Builder encryptionSpec(@Nullable AiDatasetEncryptionSpecGetArgs encryptionSpec) {
            this.encryptionSpec = Codegen.ofNullable(encryptionSpec);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder metadataSchemaUri(@Nullable Output<String> metadataSchemaUri) {
            this.metadataSchemaUri = metadataSchemaUri;
            return this;
        }
        public Builder metadataSchemaUri(@Nullable String metadataSchemaUri) {
            this.metadataSchemaUri = Codegen.ofNullable(metadataSchemaUri);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }        public AiDatasetState build() {
            return new AiDatasetState(createTime, displayName, encryptionSpec, labels, metadataSchemaUri, name, project, region, updateTime);
        }
    }
}
