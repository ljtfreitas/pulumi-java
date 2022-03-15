// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Datastore partition ID. A partition ID identifies a grouping of entities. The grouping is always by project and namespace, however the namespace ID may be empty. A partition ID contains several dimensions: project ID and namespace ID.
 * 
 */
public final class GooglePrivacyDlpV2PartitionIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2PartitionIdArgs Empty = new GooglePrivacyDlpV2PartitionIdArgs();

    /**
     * If not empty, the ID of the namespace to which the entities belong.
     * 
     */
    @Import(name="namespaceId")
      private final @Nullable Output<String> namespaceId;

    public Output<String> getNamespaceId() {
        return this.namespaceId == null ? Output.empty() : this.namespaceId;
    }

    /**
     * The ID of the project to which the entities belong.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public GooglePrivacyDlpV2PartitionIdArgs(
        @Nullable Output<String> namespaceId,
        @Nullable Output<String> project) {
        this.namespaceId = namespaceId;
        this.project = project;
    }

    private GooglePrivacyDlpV2PartitionIdArgs() {
        this.namespaceId = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2PartitionIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> namespaceId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2PartitionIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceId = defaults.namespaceId;
    	      this.project = defaults.project;
        }

        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = Output.ofNullable(namespaceId);
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
        public GooglePrivacyDlpV2PartitionIdArgs build() {
            return new GooglePrivacyDlpV2PartitionIdArgs(namespaceId, project);
        }
    }
}
