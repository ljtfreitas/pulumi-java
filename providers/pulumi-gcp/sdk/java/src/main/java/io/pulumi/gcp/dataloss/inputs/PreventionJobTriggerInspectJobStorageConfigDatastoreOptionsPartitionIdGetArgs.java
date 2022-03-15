// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs();

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
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId;
    }

    public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs(
        @Nullable Output<String> namespaceId,
        Output<String> projectId) {
        this.namespaceId = namespaceId;
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs() {
        this.namespaceId = Output.empty();
        this.projectId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> namespaceId;
        private Output<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceId = defaults.namespaceId;
    	      this.projectId = defaults.projectId;
        }

        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(@Nullable String namespaceId) {
            this.namespaceId = Output.ofNullable(namespaceId);
            return this;
        }

        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionIdGetArgs(namespaceId, projectId);
        }
    }
}
